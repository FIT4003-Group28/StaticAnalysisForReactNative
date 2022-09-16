package defpackage;

import java.util.zip.Inflater;
/* compiled from: PG */
/* renamed from: eajh  reason: default package */
/* loaded from: classes6.dex */
public final class eajh implements eajy {
    private final eajb a;
    private final Inflater b;
    private int c;
    private boolean d;

    public eajh(eajb eajbVar, Inflater inflater) {
        this.a = eajbVar;
        this.b = inflater;
    }

    private final void c() {
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.b.getRemaining();
        this.c -= remaining;
        this.a.A(remaining);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r7.b != r7.c) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
        r6.a = r7.b();
        defpackage.eajv.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return -1;
     */
    @Override // defpackage.eajy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Te(defpackage.eaiz r6, long r7) {
        /*
            r5 = this;
            boolean r7 = r5.d
            if (r7 != 0) goto La2
        L4:
            java.util.zip.Inflater r7 = r5.b
            boolean r7 = r7.needsInput()
            r8 = 1
            r0 = 0
            if (r7 != 0) goto Lf
            goto L3a
        Lf:
            r5.c()
            java.util.zip.Inflater r7 = r5.b
            int r7 = r7.getRemaining()
            if (r7 != 0) goto L9a
            eajb r7 = r5.a
            boolean r7 = r7.c()
            if (r7 == 0) goto L24
            r0 = 1
            goto L3a
        L24:
            eajb r7 = r5.a
            eajt r7 = (defpackage.eajt) r7
            eaiz r7 = r7.a
            eaju r7 = r7.a
            int r1 = r7.c
            int r2 = r7.b
            int r1 = r1 - r2
            r5.c = r1
            java.util.zip.Inflater r3 = r5.b
            byte[] r7 = r7.a
            r3.setInput(r7, r2, r1)
        L3a:
            eaju r7 = r6.B(r8)     // Catch: java.util.zip.DataFormatException -> L93
            r1 = 8192(0x2000, double:4.0474E-320)
            int r8 = r7.c     // Catch: java.util.zip.DataFormatException -> L93
            int r8 = 8192 - r8
            long r3 = (long) r8     // Catch: java.util.zip.DataFormatException -> L93
            long r1 = java.lang.Math.min(r1, r3)     // Catch: java.util.zip.DataFormatException -> L93
            int r8 = (int) r1     // Catch: java.util.zip.DataFormatException -> L93
            java.util.zip.Inflater r1 = r5.b     // Catch: java.util.zip.DataFormatException -> L93
            byte[] r2 = r7.a     // Catch: java.util.zip.DataFormatException -> L93
            int r3 = r7.c     // Catch: java.util.zip.DataFormatException -> L93
            int r8 = r1.inflate(r2, r3, r8)     // Catch: java.util.zip.DataFormatException -> L93
            if (r8 <= 0) goto L62
            int r0 = r7.c     // Catch: java.util.zip.DataFormatException -> L93
            int r0 = r0 + r8
            r7.c = r0     // Catch: java.util.zip.DataFormatException -> L93
            long r0 = r6.b     // Catch: java.util.zip.DataFormatException -> L93
            long r7 = (long) r8     // Catch: java.util.zip.DataFormatException -> L93
            long r0 = r0 + r7
            r6.b = r0     // Catch: java.util.zip.DataFormatException -> L93
            return r7
        L62:
            java.util.zip.Inflater r8 = r5.b     // Catch: java.util.zip.DataFormatException -> L93
            boolean r8 = r8.finished()     // Catch: java.util.zip.DataFormatException -> L93
            if (r8 != 0) goto L7e
            java.util.zip.Inflater r8 = r5.b     // Catch: java.util.zip.DataFormatException -> L93
            boolean r8 = r8.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L93
            if (r8 == 0) goto L73
            goto L7e
        L73:
            if (r0 != 0) goto L76
            goto L4
        L76:
            java.io.EOFException r6 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L93
            java.lang.String r7 = "source exhausted prematurely"
            r6.<init>(r7)     // Catch: java.util.zip.DataFormatException -> L93
            throw r6     // Catch: java.util.zip.DataFormatException -> L93
        L7e:
            r5.c()     // Catch: java.util.zip.DataFormatException -> L93
            int r8 = r7.b     // Catch: java.util.zip.DataFormatException -> L93
            int r0 = r7.c     // Catch: java.util.zip.DataFormatException -> L93
            if (r8 != r0) goto L90
            eaju r8 = r7.b()     // Catch: java.util.zip.DataFormatException -> L93
            r6.a = r8     // Catch: java.util.zip.DataFormatException -> L93
            defpackage.eajv.b(r7)     // Catch: java.util.zip.DataFormatException -> L93
        L90:
            r6 = -1
            return r6
        L93:
            r6 = move-exception
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        L9a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "?"
            r6.<init>(r7)
            throw r6
        La2:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "closed"
            r6.<init>(r7)
            goto Lab
        Laa:
            throw r6
        Lab:
            goto Laa
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eajh.Te(eaiz, long):long");
    }

    @Override // defpackage.eajy
    public final eaka b() {
        return this.a.b();
    }

    @Override // defpackage.eajy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }
}
