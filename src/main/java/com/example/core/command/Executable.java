package com.example.core.command;

import java.text.ParseException;

public interface Executable {

    String execute(String... params)throws ParseException;
}
