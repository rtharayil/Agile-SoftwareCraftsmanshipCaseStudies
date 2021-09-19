[HttpGet, ActionName("GetStatement")]
HttpResponseMessage GetStatement()
{
    String query = "SELECT account_balance FROM user_data WHERE user_name = @ID";
     customerID =getParameter("customerID");
    try
    {
        OleDbCommand command = new OleDbCommand(query, connection);
        command.Parameters.Add(new OleDbParameter(@ID,customerID));
        OleDbDataReader reader = command.ExecuteReader();
        // …
    }
    catch (OleDbException se)
    {
        // error handling
    }
}