function validateForm_display() 
{
    let employeeId = $("#employeeId").val();

    if (employeeId == null || employeeId == "" || isNaN(employeeId) || employeeId < 0) 
    {
        console.log("Please give proper input");
        alert("Please give proper input");
        return false;
    }
}

function validateForm_create() 
{
    let employeeId = $("#id").val();
    let name = $("#name").val();
    let position = $("#position").val();
    let salary = $("#salary").val();

    let idCheck = (employeeId == null || employeeId == "" || isNaN(employeeId) || employeeId < 0);
    let nameCheck = (name == null || name == "" || !(isNaN(name)));
    let positionCheck = (position == null || position == "" || !(isNaN(position)));
    let salaryCheck = (salary == null || salary == "" || isNaN(salary) || salary < 0);

    if (idCheck || nameCheck || positionCheck || salaryCheck) 
    {
        console.log("Please give proper input");
        alert("Please give proper input");
        return false;
    }
}

function validateForm_update() 
{
    let employeeId = $("#id").val();
    let name = $("#name").val();
    let position = $("#position").val();
    let salary = $("#salary").val();

    let idCheck = (employeeId == null || employeeId == "" || isNaN(employeeId) || employeeId < 0);
    let nameCheck = (name == null || name == "" || !(isNaN(name)));
    let positionCheck = (position == null || position == "" || !(isNaN(position)));
    let salaryCheck = (salary == null || salary == "" || isNaN(salary) || salary < 0);

    if (idCheck || nameCheck || positionCheck || salaryCheck) 
    {
        console.log("Please give proper input");
        alert("Please give proper input");
        return false;
    }
}



