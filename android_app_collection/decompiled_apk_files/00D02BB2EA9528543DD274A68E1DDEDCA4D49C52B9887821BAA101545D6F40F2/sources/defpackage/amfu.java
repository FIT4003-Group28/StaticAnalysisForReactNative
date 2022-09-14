package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: amfu  reason: default package */
/* loaded from: classes.dex */
public class amfu {
    @dzsi
    public Bitmap[] a;
    public int b;
    public boolean c;
    public byte[] d;
    @dzsi
    public amfp<?> e;
    public long f;
    public final Object g;
    private final ArrayList<amfq> h;
    private boolean i;
    private long j;

    public amfu() {
        this(new Object());
    }

    public final synchronized boolean a() {
        int i = this.b;
        return (i == 0 || i == 1 || i == 2) ? false : true;
    }

    public final synchronized int b() {
        return this.b;
    }

    public final synchronized void c(int i) {
        this.b = i;
    }

    public final synchronized boolean d() {
        return this.i;
    }

    public final synchronized void e(boolean z) {
        this.i = z;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amfu)) {
            return false;
        }
        return dbsd.a(this.g, ((amfu) obj).g);
    }

    public final synchronized void f(Bitmap[] bitmapArr) {
        this.a = bitmapArr;
    }

    public final synchronized void g() {
        this.b = 1;
        this.d = null;
        this.e = null;
    }

    @dzsi
    public final Bitmap h() {
        amfp<?> amfpVar;
        if (this.b != 3 || (amfpVar = this.e) == null) {
            return null;
        }
        Bitmap bitmap = (Bitmap) amfpVar.c();
        if (bitmap == null) {
            g();
        }
        return bitmap;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @dzsi
    public final cqtd i(bvlw bvlwVar) {
        amfp<?> amfpVar = this.e;
        cqtd cqtdVar = null;
        if (amfpVar == null) {
            return null;
        }
        synchronized (amfpVar) {
            dbrn<bvlw, cqtd> dbrnVar = (dbrn) amfp.d(amfpVar.b);
            if (dbrnVar == null) {
                Object c = amfpVar.c();
                dbrnVar = c == 0 ? null : amfpVar.a(c);
                amfpVar.b = dbrnVar == null ? null : new SoftReference(dbrnVar);
            }
            if (dbrnVar == null) {
                amfpVar.c.g();
            } else {
                cqtdVar = dbrnVar.a(bvlwVar);
            }
        }
        return cqtdVar;
    }

    @dzsi
    public final cqtd j() {
        return i(bvlw.a);
    }

    @dzsi
    public final Drawable k(Context context) {
        cqtd j = j();
        if (j == null) {
            return null;
        }
        return j.a(context);
    }

    public final synchronized void l(long j) {
        this.j = j;
    }

    public final synchronized long m() {
        return this.j;
    }

    public final synchronized void n(@dzsi amfq amfqVar) {
        if (amfqVar != null) {
            this.h.add(amfqVar);
        }
    }

    public final synchronized void o(Bitmap bitmap) {
        this.i = false;
        this.b = 3;
        this.e = new amfo(this, bitmap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r1 == 304) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean p(defpackage.dxal r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r6.i = r0     // Catch: java.lang.Throwable -> Laa
            int r1 = r7.c     // Catch: java.lang.Throwable -> Laa
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 1
            if (r1 != r2) goto La1
            int r1 = r7.a     // Catch: java.lang.Throwable -> Laa
            r1 = r1 & 16
            if (r1 == 0) goto La6
            java.lang.String r1 = r7.f     // Catch: java.lang.Throwable -> Laa
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = r1.toLowerCase(r2)     // Catch: java.lang.Throwable -> Laa
            long r4 = r7.d     // Catch: java.lang.Throwable -> Laa
            r6.f = r4     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = "image/svg"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L3a
            dspd r7 = r7.e     // Catch: java.lang.Throwable -> Laa
            byte[] r7 = r7.G()     // Catch: java.lang.Throwable -> Laa
            r6.d = r7     // Catch: java.lang.Throwable -> Laa
            r7 = 6
            r6.b = r7     // Catch: java.lang.Throwable -> Laa
            amft r7 = new amft     // Catch: java.lang.Throwable -> Laa
            byte[] r1 = r6.d     // Catch: java.lang.Throwable -> Laa
            r7.<init>(r6, r1)     // Catch: java.lang.Throwable -> Laa
            r6.e = r7     // Catch: java.lang.Throwable -> Laa
            goto L9a
        L3a:
            java.lang.String r2 = "image/"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L57
            dspd r7 = r7.e     // Catch: java.lang.Throwable -> Laa
            byte[] r7 = r7.G()     // Catch: java.lang.Throwable -> Laa
            r6.d = r7     // Catch: java.lang.Throwable -> Laa
            r7 = 3
            r6.b = r7     // Catch: java.lang.Throwable -> Laa
            amfn r7 = new amfn     // Catch: java.lang.Throwable -> Laa
            byte[] r1 = r6.d     // Catch: java.lang.Throwable -> Laa
            r7.<init>(r6, r1)     // Catch: java.lang.Throwable -> Laa
            r6.e = r7     // Catch: java.lang.Throwable -> Laa
            goto L9a
        L57:
            java.lang.String r2 = "application/binary"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto L8f
            java.lang.String r2 = "application/octet-stream"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto L8f
            java.lang.String r2 = "application/zip"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Laa
            if (r2 != 0) goto L8f
            java.lang.String r2 = "application/vnd.google.octet-stream-compressible"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L78
            goto L8f
        L78:
            java.lang.String r2 = "text/html"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto L8c
            dspd r7 = r7.e     // Catch: java.lang.Throwable -> Laa
            byte[] r7 = r7.G()     // Catch: java.lang.Throwable -> Laa
            r6.d = r7     // Catch: java.lang.Throwable -> Laa
            r7 = 5
            r6.b = r7     // Catch: java.lang.Throwable -> Laa
            goto L9a
        L8c:
            r6.b = r3     // Catch: java.lang.Throwable -> Laa
            goto L9a
        L8f:
            dspd r7 = r7.e     // Catch: java.lang.Throwable -> Laa
            byte[] r7 = r7.G()     // Catch: java.lang.Throwable -> Laa
            r6.d = r7     // Catch: java.lang.Throwable -> Laa
            r7 = 4
            r6.b = r7     // Catch: java.lang.Throwable -> Laa
        L9a:
            int r7 = r6.b     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r6)
            if (r7 == r3) goto La0
            return r3
        La0:
            return r0
        La1:
            r7 = 304(0x130, float:4.26E-43)
            if (r1 != r7) goto La6
            goto La8
        La6:
            r6.b = r3     // Catch: java.lang.Throwable -> Laa
        La8:
            monitor-exit(r6)
            return r0
        Laa:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amfu.p(dxal):boolean");
    }

    public final synchronized void q() {
        for (int i = 0; i < this.h.size(); i++) {
            this.h.get(i).a(this);
        }
        this.h.clear();
    }

    public amfu(Object obj) {
        this.g = obj;
        this.b = 0;
        this.h = new ArrayList<>();
        this.a = null;
        this.j = -1L;
    }
}
