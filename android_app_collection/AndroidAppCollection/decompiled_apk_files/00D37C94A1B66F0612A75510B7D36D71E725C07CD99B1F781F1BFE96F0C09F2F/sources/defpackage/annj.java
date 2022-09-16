package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: annj  reason: default package */
/* loaded from: classes.dex */
public final class annj {
    public static final String a;
    public static final String b;

    static {
        new anno();
        a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new annx();
        b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new anoa();
        new annu();
        new anog();
        new anok();
        new anod();
        new anon();
        anrm anrmVar = anrm.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        annh.g(new annl());
        anpn.a();
        annh.j(new anno());
        annh.j(new annx());
        if (!anoq.b()) {
            annh.j(new annu());
            if (anoa.i()) {
                annh.j(new anoa());
            }
            annh.j(new anod());
            annh.j(new anog());
            annh.j(new anok());
            annh.j(new anon());
        }
    }
}
