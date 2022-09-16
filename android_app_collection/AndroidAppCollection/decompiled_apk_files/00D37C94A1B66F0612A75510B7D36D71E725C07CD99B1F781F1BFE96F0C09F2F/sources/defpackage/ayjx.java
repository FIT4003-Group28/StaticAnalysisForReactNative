package defpackage;

import java.io.Closeable;
/* compiled from: PG */
/* renamed from: ayjx  reason: default package */
/* loaded from: classes2.dex */
public final class ayjx implements Closeable, ayfc {
    public ayju a;
    public int b;
    public axyz c;
    public long e;
    private final aymk g;
    private final aymt h;
    private boolean j;
    private ayey k;
    private int n;
    private int p = 1;
    private int i = 5;
    public ayey d = new ayey();
    private boolean l = false;
    private int m = -1;
    public boolean f = false;
    private volatile boolean o = false;

    public ayjx(ayju ayjuVar, axyz axyzVar, int i, aymk aymkVar, aymt aymtVar) {
        this.a = ayjuVar;
        this.c = axyzVar;
        this.b = i;
        this.g = aymkVar;
        this.h = aymtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        if (r3 <= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
        r12.a.j(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r12.p != 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        r12.g.g(r3);
        r12.n += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        r3 = r12.p;
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        if (r3 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r4 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r4 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r3 == 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
        r0 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
        r0 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
        r4 = new java.lang.StringBuilder(r0.length() + 15);
        r4.append("Invalid state: ");
        r4.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
        throw new java.lang.AssertionError(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
        r12.g.e(r12.m, r12.n, -1);
        r12.n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
        if (r12.j == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
        if (r12.c == defpackage.axyp.a) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
        r3 = new defpackage.ayjw(r12.c.a(defpackage.aykp.c(r12.k)), r12.b, r12.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
        throw io.grpc.Status.n.withDescription("Can't decode compressed gRPC message as compression not configured").d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
        r12.g.f(r12.k.a);
        r3 = defpackage.aykp.c(r12.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f0, code lost:
        r12.k = null;
        r12.a.a(new defpackage.ayjv(r3));
        r12.p = 1;
        r12.i = 5;
        r12.e--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
        r3 = r12.k.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
        if ((r3 & 254) != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0116, code lost:
        if (1 == (r3 & 1)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0118, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011b, code lost:
        r12.j = r3;
        r3 = r12.k;
        r3.a(4);
        r3 = r3.e() | (((r3.e() << 24) | (r3.e() << 16)) | (r3.e() << 8));
        r12.i = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
        if (r3 < 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
        if (r3 > r12.b) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
        r3 = r12.m + 1;
        r12.m = r3;
        r12.g.d(r3);
        r3 = r12.h;
        r3.e.a();
        r3.f = r3.b.a();
        r12.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0183, code lost:
        throw io.grpc.Status.j.withDescription(java.lang.String.format("gRPC message exceeds maximum size %d: %d", java.lang.Integer.valueOf(r12.b), java.lang.Integer.valueOf(r12.i))).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0190, code lost:
        throw io.grpc.Status.n.withDescription("gRPC frame header malformed: reserved bits not zero").d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0191, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ad, code lost:
        if (r12.f == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
        if (c() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ba, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayjx.a():void");
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.ayfc
    public final void close() {
        if (b()) {
            return;
        }
        ayey ayeyVar = this.k;
        boolean z = false;
        if (ayeyVar != null && ayeyVar.a > 0) {
            z = true;
        }
        try {
            ayey ayeyVar2 = this.d;
            if (ayeyVar2 != null) {
                ayeyVar2.close();
            }
            ayey ayeyVar3 = this.k;
            if (ayeyVar3 != null) {
                ayeyVar3.close();
            }
            this.d = null;
            this.k = null;
            this.a.e(z);
        } catch (Throwable th) {
            this.d = null;
            this.k = null;
            throw th;
        }
    }
}
