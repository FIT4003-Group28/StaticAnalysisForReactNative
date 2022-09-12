package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: PG */
/* renamed from: clda  reason: default package */
/* loaded from: classes5.dex */
public final class clda implements clfo {
    final URL a;
    public final deqt b;
    private final clig c;
    private final clig d;

    public clda(Context context, clig cligVar, clig cligVar2) {
        deqv deqvVar = new deqv();
        deqvVar.b(cldw.class, cldf.a);
        deqvVar.b(cldm.class, cldf.a);
        deqvVar.b(cled.class, cldi.a);
        deqvVar.b(clds.class, cldi.a);
        deqvVar.b(cldz.class, cldg.a);
        deqvVar.b(cldo.class, cldg.a);
        deqvVar.b(cldd.class, clde.a);
        deqvVar.b(cldl.class, clde.a);
        deqvVar.b(cleb.class, cldh.a);
        deqvVar.b(cldq.class, cldh.a);
        deqvVar.b(clei.class, cldj.a);
        deqvVar.b(cldv.class, cldj.a);
        deqvVar.d = true;
        this.b = deqvVar.a();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = b(clcx.a);
        this.c = cligVar2;
        this.d = cligVar;
    }

    private static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid url: ".concat(valueOf) : new String("Invalid url: "), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0458, code lost:
        throw new java.io.IOException("Response is missing nextRequestWaitMillis field.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0273, code lost:
        r12.f = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0277, code lost:
        if (r12.a != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0279, code lost:
        r7 = " requestTimeMs";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027d, code lost:
        if (r12.b != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x027f, code lost:
        r7 = r7.concat(" requestUptimeMs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0289, code lost:
        if (r7.isEmpty() != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028b, code lost:
        r2 = java.lang.String.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0295, code lost:
        if (r2.length() == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0297, code lost:
        r2 = "Missing required properties:".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029c, code lost:
        r2 = new java.lang.String("Missing required properties:");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a4, code lost:
        throw new java.lang.IllegalStateException(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04b9 A[Catch: IOException -> 0x04fa, TryCatch #13 {IOException -> 0x04fa, blocks: (B:78:0x02fb, B:79:0x0302, B:81:0x034e, B:89:0x0377, B:91:0x03a0, B:92:0x03a5, B:94:0x03b8, B:95:0x03bd, B:103:0x03d0, B:174:0x04b5, B:176:0x04b9, B:179:0x04cc, B:183:0x04da, B:185:0x04de, B:192:0x04f0, B:194:0x04f5, B:105:0x03db, B:128:0x0449, B:154:0x047a, B:173:0x04a9, B:106:0x03df, B:108:0x03e9, B:126:0x0444, B:144:0x046b, B:143:0x0468, B:83:0x0355, B:88:0x0374), top: B:206:0x02fb }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04c9  */
    @Override // defpackage.clfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.clfh a(defpackage.clfg r28) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clda.a(clfg):clfh");
    }
}
