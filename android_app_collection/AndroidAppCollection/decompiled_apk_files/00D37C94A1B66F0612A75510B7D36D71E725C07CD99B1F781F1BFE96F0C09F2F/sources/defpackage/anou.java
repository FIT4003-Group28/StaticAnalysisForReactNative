package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anou  reason: default package */
/* loaded from: classes.dex */
public final class anou {
    public static final String a;

    static {
        new anot();
        a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        anrm anrmVar = anrm.a;
        try {
            annh.g(new anow());
            if (anoq.b()) {
                return;
            }
            annh.j(new anot());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
