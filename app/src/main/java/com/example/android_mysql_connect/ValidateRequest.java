package com.example.android_mysql_connect;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class ValidateRequest extends StringRequest{
    final static private String URL = "http://10.0.2.2/UserValidat.php";
    private Map<String, String> parameters;

    public ValidateRequest(String UserEmail, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("UserEmail", UserEmail);
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}
