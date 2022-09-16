package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: PG */
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: wwb  reason: default package */
/* loaded from: classes4.dex */
public @interface wwb {
    apcb a() default apcb.LAYOUT_TYPE_UNSPECIFIED;

    apcd b() default apcd.SLOT_TYPE_UNSPECIFIED;

    Class[] c() default {};

    Class[] d() default {};
}
