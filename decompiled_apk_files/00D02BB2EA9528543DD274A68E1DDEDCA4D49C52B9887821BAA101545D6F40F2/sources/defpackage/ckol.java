package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: PG */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ckol  reason: default package */
/* loaded from: classes.dex */
public @interface ckol {
    String a();

    ckok b() default ckok.MEDIUM;

    String c() default "which";
}