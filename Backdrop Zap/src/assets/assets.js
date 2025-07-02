import logo from './logo.png';
import video_banner from './home-page-banner.mp4';
import people from './people.png';
import people_org from './people-org.png';
import credits from './credits.png';

export const assets = {
  logo,
  video_banner,
  people,
  people_org,
  credits,
}

export const steps = [
  {
    step: "Step 1",
    title: "Upload Your Image",
    description: 'Choose the image you want to edit by clicking on "Upload Your Image". We support both PNG and JPG at any resolution, so there is no need to resize or prepare your image.'
  },
  {
    step: "Step 2",
    title: "Watch the Background Disappear",
    description: 'Our backdrop zapping tool instantly removes the background. Once your subject is isolated, pick a new backdrop. Transparent or white are popular defaults, but you can choose any colour to match your design.'
  },
  {
    step: "Step 3",
    title: "Download Your Cutout",
    description: 'When you are satisfied with the result, click "Download" to save your high-quality cutout. Then sign in to your account to revisit your projects in your Photo Booth anytime.'
  },
];

export const categories = ["People", "Products", "Animals", "Cars", "Graphics"];

export const plans = [
    {
        id: "Basic",
        name: "Starter Plan",
        price: 4.99,
        credits: "Includes 100 credits",
        description: "Ideal for personal use",
        popular: false
    },
    {
        id: "Premium",
        name: "Professional Plan",
        price: 8.99,
        credits: "Includes 250 credits",
        description: "Perfect for small businesses",
        popular: true
    },
    {
        id: "Ultimate",
        name: "Enterprise Plan",
        price: 14.99,
        credits: "Includes 1000 credits",
        description: "Built for high-volume teams",
        popular: false
    }
];

export const testimonials = [
    {
        id: 1,
        quote: "I used to spend 10 minutes per image in Photoshop making manual selections. Now it takes just 15 seconds and my turnaround time has doubled!",
        author: "Anthony Walker",
        handle: "@webarchitect"
    },
    {
        id: 2,
        quote: "Finally found a tool that actually works with my product photos. Three other apps butchered my jewelry shots, but Backdrop Zap nails every detail perfectly!",
        author: "Sarah Johnson",
        handle: "@techlead_sarah"
    },
    {
        id: 3,
        quote: "The hair thing is real! Curly hair was always my nightmare for portraits, but this app keeps every flyaway intact while removing backgrounds cleanly.",
        author: "Michael Chen",
        handle: "@codingnewbie"
    }
];

export const FOOTER_CONSTANTS = [
    {
        url: "https://facebook.com",
        logo: "https://img.icons8.com/fluent/30/000000/facebook-new.png"
    },
    {
        url: "https://linkedin.com",
        logo: "https://img.icons8.com/fluent/30/000000/linkedin-2.png"
    },
    {
        url: "https://instagram.com",
        logo: "https://img.icons8.com/fluent/30/000000/instagram-new.png"
    },
    {
        url: "https://twitter.com",
        logo: "https://img.icons8.com/fluent/30/000000/twitter.png"
    }
]