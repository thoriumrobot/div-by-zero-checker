package org.checkerframework.checker.dividebyzero.qual;

import org.checkerframework.framework.qual.SubtypeOf;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@SubtypeOf({Z.class, NZ.class})

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface ZB {}

