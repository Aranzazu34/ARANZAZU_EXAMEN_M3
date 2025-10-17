/**
 * @author: Aranzazu Pérez Ramos
 * @description: Funciones para trabajar con figuras geométricas
 * @version: 1.0
 * @since: 2025-10-17
 */

/**
 * Función que calcula el área de un triángulo
 * @param {float} base  - base del triángulo
 * @param {float} altura - altura del triángulo
 * @returns {float} área del triángulo
 */
function calcularArea(base, altura) {
  return (base * altura) / 2;
}

/**
 * Función que devuelve el nombre de una figura
 * @param {String} nombre
 * @returns {String} descripción de la figura
 */
function describir(nombre) {
  return "Esta es una figura llamada: " + nombre;
}

/**
 * Función que devuelve el parámetro nuevoNombre
 * @param {String} nombreActual - nombre actual de la figura
 * @param {String} nuevoNombre  - nuevo nombre de la figura
 * @returns {String} nuevoNombre
 */
function cambiarNombre(nombreActual, nuevoNombre) {
  return nuevoNombre;
}

/**
 * Función que te indica si la figura es un cuadrado
 * @param {float} lado1 - lado 1 del cuadrado
 * @param {float} lado2 - lado 2 del cuadrado
 * @returns {String} descripción para indicar si es un cuadrado o no
 */
function esCuadrado(lado1, lado2) {
  if (lado1 === lado2) {
    return "Es un cuadrado.";
  } else {
    return "No es un cuadrado.";
  }
}
