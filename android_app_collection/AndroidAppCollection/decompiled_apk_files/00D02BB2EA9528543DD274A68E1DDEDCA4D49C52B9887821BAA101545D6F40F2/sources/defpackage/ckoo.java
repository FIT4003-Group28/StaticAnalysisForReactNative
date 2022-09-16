package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: PG */
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: ckoo  reason: default package */
/* loaded from: classes.dex */
public @interface ckoo {
    String a();

    String b() default "*NO_DEFAULT*";

    boolean c() default false;

    boolean d() default false;

    boolean e() default false;
}
