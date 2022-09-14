package c.d.j.i;

import c.d.d.d.i;
import c.d.d.d.n;
import java.io.IOException;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private int f3365a;

    /* renamed from: b  reason: collision with root package name */
    private int f3366b;

    /* renamed from: c  reason: collision with root package name */
    private int f3367c;

    /* renamed from: d  reason: collision with root package name */
    private int f3368d;

    /* renamed from: e  reason: collision with root package name */
    private int f3369e;

    /* renamed from: f  reason: collision with root package name */
    private int f3370f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3371g;

    /* renamed from: h  reason: collision with root package name */
    private final c.d.d.g.a f3372h;

    public f(c.d.d.g.a aVar) {
        i.a(aVar);
        this.f3372h = aVar;
        this.f3367c = 0;
        this.f3366b = 0;
        this.f3368d = 0;
        this.f3370f = 0;
        this.f3369e = 0;
        this.f3365a = 0;
    }

    private static boolean a(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0083, code lost:
        if (r9.f3365a == 6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:
        if (r9.f3369e == r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0089, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.InputStream r10) {
        /*
            r9 = this;
            int r0 = r9.f3369e
        L2:
            int r1 = r9.f3365a     // Catch: java.io.IOException -> L8b
            r2 = 0
            r3 = 1
            r4 = 6
            if (r1 == r4) goto L81
            int r1 = r10.read()     // Catch: java.io.IOException -> L8b
            r5 = -1
            if (r1 == r5) goto L81
            int r5 = r9.f3367c     // Catch: java.io.IOException -> L8b
            int r5 = r5 + r3
            r9.f3367c = r5     // Catch: java.io.IOException -> L8b
            boolean r5 = r9.f3371g     // Catch: java.io.IOException -> L8b
            if (r5 == 0) goto L1e
            r9.f3365a = r4     // Catch: java.io.IOException -> L8b
            r9.f3371g = r2     // Catch: java.io.IOException -> L8b
            return r2
        L1e:
            int r5 = r9.f3365a     // Catch: java.io.IOException -> L8b
            r6 = 255(0xff, float:3.57E-43)
            if (r5 == 0) goto L7b
            r7 = 2
            if (r5 == r3) goto L76
            r4 = 3
            if (r5 == r7) goto L73
            r8 = 4
            if (r5 == r4) goto L4b
            r3 = 5
            if (r5 == r8) goto L48
            if (r5 == r3) goto L36
            c.d.d.d.i.b(r2)     // Catch: java.io.IOException -> L8b
            goto L7e
        L36:
            int r2 = r9.f3366b     // Catch: java.io.IOException -> L8b
            int r2 = r2 << 8
            int r2 = r2 + r1
            int r2 = r2 - r7
            long r3 = (long) r2     // Catch: java.io.IOException -> L8b
            c.d.d.k.d.a(r10, r3)     // Catch: java.io.IOException -> L8b
            int r3 = r9.f3367c     // Catch: java.io.IOException -> L8b
            int r3 = r3 + r2
            r9.f3367c = r3     // Catch: java.io.IOException -> L8b
        L45:
            r9.f3365a = r7     // Catch: java.io.IOException -> L8b
            goto L7e
        L48:
            r9.f3365a = r3     // Catch: java.io.IOException -> L8b
            goto L7e
        L4b:
            if (r1 != r6) goto L50
        L4d:
            r9.f3365a = r4     // Catch: java.io.IOException -> L8b
            goto L7e
        L50:
            if (r1 != 0) goto L53
            goto L45
        L53:
            r2 = 217(0xd9, float:3.04E-43)
            if (r1 != r2) goto L60
            r9.f3371g = r3     // Catch: java.io.IOException -> L8b
            int r2 = r9.f3367c     // Catch: java.io.IOException -> L8b
            int r2 = r2 - r7
            r9.b(r2)     // Catch: java.io.IOException -> L8b
            goto L45
        L60:
            r2 = 218(0xda, float:3.05E-43)
            if (r1 != r2) goto L6a
            int r2 = r9.f3367c     // Catch: java.io.IOException -> L8b
            int r2 = r2 - r7
            r9.b(r2)     // Catch: java.io.IOException -> L8b
        L6a:
            boolean r2 = a(r1)     // Catch: java.io.IOException -> L8b
            if (r2 == 0) goto L45
            r9.f3365a = r8     // Catch: java.io.IOException -> L8b
            goto L7e
        L73:
            if (r1 != r6) goto L7e
            goto L4d
        L76:
            r2 = 216(0xd8, float:3.03E-43)
            if (r1 != r2) goto L4d
            goto L45
        L7b:
            if (r1 != r6) goto L4d
            goto L48
        L7e:
            r9.f3366b = r1     // Catch: java.io.IOException -> L8b
            goto L2
        L81:
            int r10 = r9.f3365a
            if (r10 == r4) goto L8a
            int r10 = r9.f3369e
            if (r10 == r0) goto L8a
            r2 = 1
        L8a:
            return r2
        L8b:
            r10 = move-exception
            c.d.d.d.n.a(r10)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.j.i.f.a(java.io.InputStream):boolean");
    }

    private void b(int i) {
        if (this.f3368d > 0) {
            this.f3370f = i;
        }
        int i2 = this.f3368d;
        this.f3368d = i2 + 1;
        this.f3369e = i2;
    }

    public int a() {
        return this.f3370f;
    }

    public boolean a(c.d.j.k.d dVar) {
        if (this.f3365a != 6 && dVar.z() > this.f3367c) {
            c.d.d.g.f fVar = new c.d.d.g.f(dVar.h(), this.f3372h.mo186get(16384), this.f3372h);
            try {
                try {
                    c.d.d.k.d.a(fVar, this.f3367c);
                    return a(fVar);
                } catch (IOException e2) {
                    n.a(e2);
                    throw null;
                }
            } finally {
                c.d.d.d.b.a(fVar);
            }
        }
        return false;
    }

    public int b() {
        return this.f3369e;
    }

    public boolean c() {
        return this.f3371g;
    }
}
