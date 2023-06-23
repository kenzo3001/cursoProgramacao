const openModalButton = document.getElementById("openModal");
const modal = document.getElementById("modal");
const closeModalButton = document.getElementsByClassName("close")[0];

openModalButton.addEventListener("click", function() {
  modal.style.display = "block"; 
});

closeModalButton.addEventListener("click", function() {
  modal.style.display = "none"; 
});

window.addEventListener("click", function(event) {
  if (event.target == modal) {
    modal.style.display = "none"; 
  }
});
