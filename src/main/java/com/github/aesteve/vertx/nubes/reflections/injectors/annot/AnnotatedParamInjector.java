package com.github.aesteve.vertx.nubes.reflections.injectors.annot;

import com.github.aesteve.vertx.nubes.exceptions.params.WrongParameterException;
import io.vertx.ext.web.RoutingContext;

import java.lang.annotation.Annotation;

@FunctionalInterface
public interface AnnotatedParamInjector<T extends Annotation> {
  Object resolve(RoutingContext context, T annotation, String paramName, Class<?> resultClass) throws WrongParameterException;
}
