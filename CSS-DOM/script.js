const button1 = document.getElementById('button1');
const button2 = document.getElementById('button2');
const button3 = document.getElementById('button3');
const image1 = document.getElementById('image1');
const image2 = document.getElementById('image2');
const image3 = document.getElementById('image3');

// Remove the first image
button1.addEventListener('click', () => {
    image1.style.display = 'none';
});

// Hide the second image
button2.addEventListener('click', () => {
    image2.style.display = 'none';
});

// Reset all images to be visible
button3.addEventListener('click', () => {
    image1.style.display = 'block';
    image2.style.display = 'block';
    image3.style.display = 'block';
});