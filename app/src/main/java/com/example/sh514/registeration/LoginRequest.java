package com.example.sh514.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SH514 on 2017-01-26.
 */

public class LoginRequest extends StringRequest{


        final static private String URL = "http://kimc159.cafe24.com/UserLogin.php";
        private Map<String, String> parameters;

        public LoginRequest(String userID, String userPassword, Response.Listener<String> listener){
            super(Method.POST, URL, listener,null);
            parameters = new HashMap<>();
            parameters.put("userID", userID);
            parameters.put("userPassword", userPassword);
        }
        @Override
        public Map<String, String> getParams(){
            return parameters;
        }

    }