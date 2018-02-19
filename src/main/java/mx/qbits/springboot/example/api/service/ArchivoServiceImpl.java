/*
 * Licencia:    Este código se encuentra bajo la protección
 *              que otorga el contrato establecido entre
 *              Interware SA de CV y su cliente, Salud Cercana por lo
 *              que queda estrictamente prohibido copiar, donar
 *              vender y/o distribuir el presente código por
 *              cualquier medio electrónico o impreso sin el
 *              permiso explícito y por escrito del cliente.
 *
 * Proyecto:    SaludCercana
 * Paquete:     com.sc.api.service
 * Modulo:      ArchivoServiceImpl
 * Tipo:        interfaz
 * Autor:       Alvaro Salas
 * Fecha:       30/09/2016
 * Version:     0.0.1
 *
 */
package mx.qbits.springboot.example.api.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import mx.qbits.springboot.example.api.model.archivo.ArchivoPojo;
/**
 * <h1>ArchivoService.</h1>
 * <p>Servicio para operacion de Archivos</p>
 *
 * @author alvaro.salas
 */
@Service
public class ArchivoServiceImpl implements ArchivoService {
    @Autowired
    private Environment env;

    /**
     * <h1>validaTamanioArchivo.</h1>
     * <p>Valida tamaño de archivo dado el número de bits permitidos</p>
     *
     * @param archivo          Archivo para recuperar su tamaño
     * @param tamanioPermitido Número de bits permitidos
     *
     * @return Si el tamaño de bits de archivo es menor o igual al permitido regresa <code>true</code>, si es mayor regresa <code>false</code>
     */
    @Override
    public boolean validaTamanioArchivo(MultipartFile archivo, long tamanioPermitido) {
        return archivo.getSize() <= tamanioPermitido;
    }
    /**
     * <h1>validaTipoArchivo.</h1>
     * <p>Valida tipo de archivo dado un arreglo de tipos</p>
     *
     * @param archivo Archivo para recuperar sus tipo
     * @param tipos   Arreglo de tipos
     *
     * @return Si el tipo de se encuentra en el arreglo regresa <code>true</code>, si no regresa <code>false</code>
     */
    @Override
    public boolean validaTipoArchivo(MultipartFile archivo, String[] tipos) {
        return true;
    }
    /**
     * <h1>createFileByMultipartFile.</h1>
     * <p>Crea y regresa un archivo(<code>File</code>) dado un <code>MultipartFile</code>, un nombre y una ruta</p>
     *
     * @param multipartFile <code>MultipartFile</code> base para generar <code>File</code>
     * @param nombreArchivo Nombre de archivo con el cual se creará
     * @param path          Ruta donde se guardará
     *
     * @return File crea archivo
     */
    @Override
    public File createFileByMultipartFile(MultipartFile multipartFile, String nombreArchivo, String path) {
        return null;
    }
    /**
     * <h1>getBytesByFile.</h1>
     * <p>Dado un archivo(<code>File</code>) lo transforma a un arreglo de <code>byte</code></p>
     *
     * @param file Archivo para transformar
     *
     * @return Arreglo de <code>byte</code>
     */
    @Override
    public byte[] getBytesByFile(File file) {
        return null;
    }
    /**
     * <h1>getFileByUrl</h1>
     * <p>Dado una url recupera un Archivo<code>File</code>.</p>
     *
     * @param url URL de archivo
     *
     * @return Regregresa un Archivo<code>File</code>
     */
    @Override
    public File getFileByUrl(String url) {
        return null;
    }
    /**
     * <h1>generaNombreArchivo.</h1>
     * <p>Genrera nombre de archivo</p>
     *
     * @param tipo Tipo de archivo para determinar su extención
     *
     * @return Regresa un nombre generado.
     */
    @Override
    public String generaNombreArchivo(String tipo) {
        return null;
    }
    /**
     * <h1>saveByMultipartFile.</h1>
     * <p>Guarda un Archivo en base de Datos y fisicamente</p>
     *
     * @param multipartFile Archivo para guardar en base de datos
     *
     * @return Regresa <code>Archivo</code> con id guardado
     */
    @Override
    public ArchivoPojo saveByMultipartFile(MultipartFile multipartFile) {
        return null;
    }
}
