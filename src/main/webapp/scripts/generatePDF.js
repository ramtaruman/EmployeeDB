$(document).ready(function()
{

    $("#saveAsPdf").click(function()
    {
        
        generatePDF();
    });
});

function generatePDF() 
{
    let doc = new jsPDF();

    doc.text("Employees Data", 10, 10);

    let pdfContent = doc.output("blob");
    let blobUrl = URL.createObjectURL(pdfContent);
    $("#downloadLink").attr("href", blobUrl).show();
}
