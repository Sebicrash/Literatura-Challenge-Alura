package com.literatura.challenge.Literatura.Challenge.service;


public interface IConvierteDatos {

    <T> T obtenerDatos(String Json, Class<T> clase);
}