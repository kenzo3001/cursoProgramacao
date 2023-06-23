const images = [
    "images/img 1.jpg",
    "images/img 2.png",
    "images/img 3.jpeg"
    
]

let currentIndex = 0

let imageElement = document.getElementById('image')
let buttonElement = document.getElementById('botao')

buttonElement.addEventListener('click', function() {
    currentIndex++
    if (currentIndex >= images.length) {
        currentIndex = 0
    }
    imageElement.src = images[currentIndex]

})