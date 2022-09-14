package defpackage;

import com.google.geo.imagery.viewer.api.PhotoHandle;
/* compiled from: PG */
/* renamed from: dfun  reason: default package */
/* loaded from: classes6.dex */
public final class dfun {
    @dzsi
    private PhotoHandle a = null;
    @dzsi
    private PhotoHandle b = null;
    @dzsi
    private Runnable c = null;
    @dzsi
    private PhotoHandle d = null;
    @dzsi
    private Runnable e = null;
    private int f = -1;

    private final void i() {
        this.b = null;
        this.c = null;
    }

    private final void j() {
        this.d = null;
        this.e = null;
    }

    public final synchronized void a(PhotoHandle photoHandle) {
        i();
        j();
        this.a = photoHandle;
    }

    @dzsi
    public final synchronized PhotoHandle b() {
        return this.a;
    }

    public final synchronized boolean c() {
        return this.a != null;
    }

    public final synchronized void d(PhotoHandle photoHandle, @dzsi Runnable runnable) {
        i();
        j();
        this.b = photoHandle;
        this.c = runnable;
    }

    @dzsi
    public final synchronized PhotoHandle e() {
        return this.b;
    }

    public final synchronized boolean f() {
        return this.b != null;
    }

    public final synchronized boolean g(PhotoHandle photoHandle, @dzsi Runnable runnable, int i) {
        if (i < this.f) {
            return false;
        }
        this.f = i;
        PhotoHandle photoHandle2 = this.a;
        if (photoHandle2 == null) {
            this.a = photoHandle;
            i();
            j();
        } else if (this.b != null || photoHandle.equals(photoHandle2)) {
            this.e = runnable;
            this.d = photoHandle;
        } else {
            this.c = runnable;
            this.b = photoHandle;
            j();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
        r1 = r2.c;
        r2.a = r0;
        r2.c = r2.e;
        r2.b = r2.d;
        j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        return r1;
     */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.Runnable h() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.geo.imagery.viewer.api.PhotoHandle r0 = r2.b     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L13
            com.google.geo.imagery.viewer.api.PhotoHandle r1 = r2.d     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto La
            goto L13
        La:
            r2.i()     // Catch: java.lang.Throwable -> L34
            r2.j()     // Catch: java.lang.Throwable -> L34
            r0 = 0
            monitor-exit(r2)
            return r0
        L13:
            if (r0 == 0) goto L26
            java.lang.Runnable r1 = r2.c     // Catch: java.lang.Throwable -> L34
            r2.a = r0     // Catch: java.lang.Throwable -> L34
            java.lang.Runnable r0 = r2.e     // Catch: java.lang.Throwable -> L34
            r2.c = r0     // Catch: java.lang.Throwable -> L34
            com.google.geo.imagery.viewer.api.PhotoHandle r0 = r2.d     // Catch: java.lang.Throwable -> L34
            r2.b = r0     // Catch: java.lang.Throwable -> L34
            r2.j()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)
            return r1
        L26:
            java.lang.Runnable r0 = r2.e     // Catch: java.lang.Throwable -> L34
            com.google.geo.imagery.viewer.api.PhotoHandle r1 = r2.d     // Catch: java.lang.Throwable -> L34
            r2.a = r1     // Catch: java.lang.Throwable -> L34
            r2.i()     // Catch: java.lang.Throwable -> L34
            r2.j()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)
            return r0
        L34:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfun.h():java.lang.Runnable");
    }
}
