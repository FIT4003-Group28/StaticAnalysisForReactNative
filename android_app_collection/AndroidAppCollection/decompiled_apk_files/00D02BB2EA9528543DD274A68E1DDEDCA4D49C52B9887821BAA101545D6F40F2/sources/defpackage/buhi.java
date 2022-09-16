package defpackage;

import defpackage.dssj;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: buhi  reason: default package */
/* loaded from: classes4.dex */
public final class buhi<S extends dssj> implements buir<S> {
    public static final dcep<Integer> a = dcep.D(200, 202, 204);
    public final buad b;
    private final dssj c;
    private final CronetEngine d;
    private final buid e;
    private final Executor f;

    public buhi(dssj dssjVar, buad buadVar, CronetEngine cronetEngine, buid buidVar, Executor executor) {
        this.c = dssjVar;
        this.b = buadVar;
        this.d = cronetEngine;
        this.e = buidVar;
        this.f = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd A[Catch: IllegalArgumentException -> 0x0135, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0135, blocks: (B:6:0x0025, B:8:0x0034, B:12:0x003f, B:17:0x0055, B:19:0x0067, B:29:0x00a0, B:40:0x00c7, B:42:0x00cd, B:43:0x00d9, B:49:0x00e7, B:50:0x00ed, B:52:0x00fb, B:54:0x0105, B:55:0x0108, B:53:0x0100, B:56:0x0109, B:20:0x0070, B:24:0x0079, B:25:0x0080, B:27:0x0086, B:28:0x0096, B:30:0x00a5, B:32:0x00ab, B:34:0x00b3), top: B:70:0x0025, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buhi.b(java.lang.String):boolean");
    }

    @Override // defpackage.buir
    public final dehn<S> a(buic buicVar, btzu btzuVar) {
        int a2;
        deig d = deig.d();
        dssj dssjVar = this.c;
        if (!(dssjVar instanceof buff)) {
            d.k(new IllegalArgumentException("Expected request type HttpRequest"));
            return d;
        }
        debv a3 = debv.a(this.b.d.b);
        for (bufe bufeVar : ((buff) dssjVar).a) {
            a3.d(bufeVar.b, bufeVar.c);
        }
        String debvVar = a3.toString();
        UrlRequest.Builder mo42allowDirectExecutor = this.d.mo29newUrlRequestBuilder(debvVar, new buhh(this, d), this.f).mo42allowDirectExecutor();
        btyo btyoVar = this.b.d;
        String str = "GET";
        if ((btyoVar.a & 2) != 0 && ((a2 = btyn.a(btyoVar.c)) == 0 || a2 == 1)) {
            str = "DEFAULT";
        }
        UrlRequest.Builder mo45setHttpMethod = mo42allowDirectExecutor.mo45setHttpMethod(str);
        this.e.c(buicVar);
        boolean z = this.b.a.b;
        buab<String> b = buicVar.b("Authorization");
        if (z && b(debvVar) && b != null) {
            String a4 = b.a();
            String valueOf = String.valueOf(b.b());
            mo45setHttpMethod.mo41addHeader(a4, valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
        }
        buab<String> b2 = buicVar.b("ZwiebackCookie");
        if (z && b(debvVar) && b2 != null) {
            mo45setHttpMethod.mo41addHeader(b2.a(), b2.b());
        }
        mo45setHttpMethod.mo43build().start();
        return d;
    }
}
