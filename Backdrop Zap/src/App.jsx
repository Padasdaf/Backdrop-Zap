import Menubar from "./components/Menubar.jsx";
import Home from "./pages/Home.jsx";
import Footer from "./components/Footer.jsx";
import {Route, Routes} from "react-router-dom";
import {Toaster} from "react-hot-toast";
import UserSyncHandler from "./components/UserSyncHandler.jsx";
import {RedirectToSignIn, SignedIn, SignedOut} from "@clerk/clerk-react";
import Result from "./pages/Result.jsx";
import BuyCredits from "./pages/BuyCredits.jsx";

const App = () => {
    return (
        <div>
            <UserSyncHandler />
            <Menubar />
            <Toaster />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/pricing" element={<BuyCredits />} />
                <Route path="/result" element={
                    <>
                        <SignedIn>
                            <Result />
                        </SignedIn>
                        <SignedOut>
                            <RedirectToSignIn />
                        </SignedOut>
                    </>
                }
            />
            </Routes>
            <Footer />
        </div>
    )
}

export default App;