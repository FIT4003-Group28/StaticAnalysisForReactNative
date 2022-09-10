package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eagc  reason: default package */
/* loaded from: classes6.dex */
final class eagc extends eaga {
    final /* synthetic */ eagg e;
    private final eadz f;
    private long g;
    private boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eagc(eagg eaggVar, eadz eadzVar) {
        super(eaggVar);
        this.e = eaggVar;
        this.g = -1L;
        this.h = true;
        this.f = eadzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0134, code lost:
        r3.b -= r6;
        r22.g = r4;
        r0 = r22.e.c.s().trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014e, code lost:
        if (r22.g < 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0154, code lost:
        if (r0.isEmpty() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015c, code lost:
        if (r0.startsWith(";") == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0164, code lost:
        if (r22.g != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0166, code lost:
        r22.h = false;
        r0 = r22.e;
        defpackage.eaft.b(r0.a.j, r22.f, r0.i());
        c(true, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017f, code lost:
        if (r22.h == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a7, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ca, code lost:
        throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + r22.g + r0 + "\"");
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6 A[Catch: NumberFormatException -> 0x01d3, LOOP:2: B:34:0x0097->B:55:0x00e6, LOOP_END, TryCatch #0 {NumberFormatException -> 0x01d3, blocks: (B:14:0x0025, B:15:0x0032, B:17:0x004b, B:28:0x006b, B:29:0x007e, B:30:0x007f, B:33:0x008f, B:35:0x0099, B:38:0x009f, B:47:0x00b5, B:49:0x00bf, B:51:0x00d8, B:53:0x00e2, B:54:0x00e5, B:52:0x00dd, B:55:0x00e6, B:42:0x00a8, B:46:0x00b1, B:57:0x00f5, B:59:0x0107, B:61:0x0112, B:62:0x0115, B:60:0x010c, B:65:0x0119, B:68:0x0127, B:72:0x0134, B:74:0x0150, B:76:0x0156, B:91:0x01aa, B:92:0x01ca, B:66:0x0123, B:93:0x01cb, B:94:0x01d2), top: B:101:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119 A[Catch: NumberFormatException -> 0x01d3, TryCatch #0 {NumberFormatException -> 0x01d3, blocks: (B:14:0x0025, B:15:0x0032, B:17:0x004b, B:28:0x006b, B:29:0x007e, B:30:0x007f, B:33:0x008f, B:35:0x0099, B:38:0x009f, B:47:0x00b5, B:49:0x00bf, B:51:0x00d8, B:53:0x00e2, B:54:0x00e5, B:52:0x00dd, B:55:0x00e6, B:42:0x00a8, B:46:0x00b1, B:57:0x00f5, B:59:0x0107, B:61:0x0112, B:62:0x0115, B:60:0x010c, B:65:0x0119, B:68:0x0127, B:72:0x0134, B:74:0x0150, B:76:0x0156, B:91:0x01aa, B:92:0x01ca, B:66:0x0123, B:93:0x01cb, B:94:0x01d2), top: B:101:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0123 A[Catch: NumberFormatException -> 0x01d3, TryCatch #0 {NumberFormatException -> 0x01d3, blocks: (B:14:0x0025, B:15:0x0032, B:17:0x004b, B:28:0x006b, B:29:0x007e, B:30:0x007f, B:33:0x008f, B:35:0x0099, B:38:0x009f, B:47:0x00b5, B:49:0x00bf, B:51:0x00d8, B:53:0x00e2, B:54:0x00e5, B:52:0x00dd, B:55:0x00e6, B:42:0x00a8, B:46:0x00b1, B:57:0x00f5, B:59:0x0107, B:61:0x0112, B:62:0x0115, B:60:0x010c, B:65:0x0119, B:68:0x0127, B:72:0x0134, B:74:0x0150, B:76:0x0156, B:91:0x01aa, B:92:0x01ca, B:66:0x0123, B:93:0x01cb, B:94:0x01d2), top: B:101:0x0025 }] */
    @Override // defpackage.eaga, defpackage.eajy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Te(defpackage.eaiz r23, long r24) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eagc.Te(eaiz, long):long");
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (this.h && !eafa.C(this, TimeUnit.MILLISECONDS)) {
            c(false, null);
        }
        this.b = true;
    }
}
