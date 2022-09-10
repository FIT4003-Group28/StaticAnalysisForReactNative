package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: xki  reason: default package */
/* loaded from: classes7.dex */
public abstract class xki {
    public static xki c(amte amteVar, int i) {
        int n = amteVar.a.n();
        if (i < 0 || i >= n) {
            bvoo.f(new IllegalArgumentException(String.format(Locale.US, "tripIndex:%d,tripCount:%d", Integer.valueOf(i), Integer.valueOf(n))));
        }
        return new xkh(amteVar, i);
    }

    public abstract amte a();

    public abstract int b();

    @dzsi
    public final akrk d() {
        amsy amsyVar = a().a;
        return amsyVar.f(amsyVar.m(b()));
    }
}
