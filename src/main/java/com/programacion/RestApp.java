package com.programacion;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

//esta clase es similar a un servlet debido, a que no usamos servlets y lo mapeamos directamente a la raíz
@ApplicationPath("/")
public class RestApp extends Application {
}
