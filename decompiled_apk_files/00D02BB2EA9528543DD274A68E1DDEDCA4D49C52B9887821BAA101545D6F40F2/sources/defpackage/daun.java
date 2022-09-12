package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: PG */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: daun  reason: default package */
/* loaded from: classes.dex */
public @interface daun {
    String a() default "##default";
}
