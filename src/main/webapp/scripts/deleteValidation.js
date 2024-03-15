function validateChoice() {
    return confirm("Are you sure you want to go ahead with the delete process ?")
}

function validateID(){

    let employeeId = document.getElementById("employeeId").value;
    if(employeeId.value == null || employeeId.value == "" || isNaN(employeeId.value) || employeeId.value < 0){
        alert("Please give proper input");
        return false;
    }
}