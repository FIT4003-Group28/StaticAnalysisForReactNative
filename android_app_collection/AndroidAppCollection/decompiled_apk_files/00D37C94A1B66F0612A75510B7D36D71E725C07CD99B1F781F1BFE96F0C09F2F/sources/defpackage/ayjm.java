package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ayjm  reason: default package */
/* loaded from: classes2.dex */
public final class ayjm extends ayam {
    public final List c;
    final aybk d;
    aybb e;
    final String f;
    public String g;
    public axzb h;
    public axys i;
    public long j;
    final axzn k;
    public boolean l;
    public boolean m;
    final aymj n;
    public final aymj o;
    private final ayjj s;
    private static final Logger p = Logger.getLogger(ayjm.class.getName());
    static final long a = TimeUnit.MINUTES.toMillis(30);
    public static final long b = TimeUnit.SECONDS.toMillis(1);
    private static final aymj t = aymj.a(ayhf.k);
    private static final axzb q = axzb.b;
    private static final axys r = axys.a;

    public ayjm(SocketAddress socketAddress, String str, ayjj ayjjVar) {
        aymj aymjVar = t;
        this.n = aymjVar;
        this.o = aymjVar;
        this.c = new ArrayList();
        aybk a2 = aybk.a();
        this.d = a2;
        this.e = a2.a;
        this.h = q;
        this.i = r;
        this.j = a;
        this.k = axzn.a;
        this.l = true;
        this.m = true;
        this.f = a(socketAddress);
        ayjjVar.getClass();
        this.s = ayjjVar;
        this.e = new ayjl(socketAddress, str);
    }

    static String a(SocketAddress socketAddress) {
        try {
            String valueOf = String.valueOf(socketAddress);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
            sb.append("/");
            sb.append(valueOf);
            return new URI("directaddress", "", sb.toString(), null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ayam
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ayal c() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayjm.c():ayal");
    }
}
