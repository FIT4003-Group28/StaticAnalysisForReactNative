package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: PG */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: dgtn  reason: default package */
/* loaded from: classes.dex */
public @interface dgtn {
    Class<?> a();

    boolean b() default true;
}
