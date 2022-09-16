package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avzz  reason: default package */
/* loaded from: classes3.dex */
public final class avzz implements avzs {
    public final awar a;
    public final crzm<avzg> b;
    public final avij c;
    public final Executor d;
    public final Executor e;
    public final avjm f;
    private final crzm<avkc> g;
    @dzsi
    private avzy h = null;
    @dzsi
    private avze i = null;
    private boolean j = false;

    public avzz(crzm<avkc> crzmVar, awar awarVar, Executor executor, Executor executor2, avjm avjmVar, avij avijVar, crzm<avzg> crzmVar2) {
        this.g = crzmVar;
        this.a = awarVar;
        this.b = crzmVar2;
        this.d = executor;
        this.e = executor2;
        this.f = avjmVar;
        this.c = avijVar;
    }

    private final void h() {
        this.a.c();
        this.a.d();
    }

    @Override // defpackage.avzs
    @dzsi
    public final auhk a() {
        h();
        auhk d = d();
        return d != null ? d : this.a.e();
    }

    public final synchronized void b(crzm<avzg> crzmVar) {
        avzg l = crzmVar.l();
        if (l == null) {
            return;
        }
        avze b = l.b();
        if (b.equals(this.i)) {
            return;
        }
        this.i = b;
        h();
        this.a.g();
    }

    public final synchronized void c() {
        this.j = false;
    }

    @dzsi
    public final synchronized auhk d() {
        this.h = null;
        c();
        return e();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009e A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0012, B:10:0x0018, B:13:0x001f, B:17:0x002b, B:19:0x003d, B:40:0x0099, B:42:0x009e, B:47:0x00a5, B:51:0x00ab, B:59:0x00c6, B:72:0x00f4, B:74:0x00fa, B:63:0x00d1, B:65:0x00e7, B:66:0x00e9, B:69:0x00ee, B:56:0x00bb, B:23:0x004e, B:29:0x0072, B:30:0x0076, B:32:0x007d, B:34:0x0083, B:36:0x0089, B:38:0x0093, B:39:0x0096, B:28:0x006d), top: B:82:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab A[Catch: all -> 0x0101, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0012, B:10:0x0018, B:13:0x001f, B:17:0x002b, B:19:0x003d, B:40:0x0099, B:42:0x009e, B:47:0x00a5, B:51:0x00ab, B:59:0x00c6, B:72:0x00f4, B:74:0x00fa, B:63:0x00d1, B:65:0x00e7, B:66:0x00e9, B:69:0x00ee, B:56:0x00bb, B:23:0x004e, B:29:0x0072, B:30:0x0076, B:32:0x007d, B:34:0x0083, B:36:0x0089, B:38:0x0093, B:39:0x0096, B:28:0x006d), top: B:82:0x0001 }] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.auhk e() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzz.e():auhk");
    }

    public final synchronized void f() {
        this.j = true;
    }

    public final synchronized void g(dlpt dlptVar) {
        if (this.j) {
            return;
        }
        this.a.g();
        int a = dlpr.a(dlptVar.g);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        int i = dlptVar.f;
        if (i > 0) {
            if (a == 1) {
                awar awarVar = this.a;
                if (i <= 1) {
                    z = false;
                }
                awarVar.I(z);
            } else if (a == 2) {
                this.a.b();
            }
        }
    }
}
