package com.facebook.react.uimanager.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ReactProp.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface a {
    String a();

    String b() default "__default_type__";

    double c() default 0.0d;

    float d() default 0.0f;

    int e() default 0;

    boolean f() default false;
}
