package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: PG */
/* renamed from: anpc  reason: default package */
/* loaded from: classes.dex */
public final class anpc {
    @Deprecated
    public static final anrm a;

    static {
        new anpb();
        new anoz();
        a = anrm.a;
        try {
            annh.g(new anpd());
            annh.g(new ansi(1));
            annj.a();
            if (anoq.b()) {
                return;
            }
            annh.i(new anoz(), new anpb());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
