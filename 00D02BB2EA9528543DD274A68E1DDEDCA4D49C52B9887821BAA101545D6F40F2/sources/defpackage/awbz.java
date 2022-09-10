package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: awbz  reason: default package */
/* loaded from: classes3.dex */
public final class awbz implements avib, amcm {
    private final alyx a;
    private final dxio<ambz> b;
    private final akqs c;
    private final float d;
    private final btvo e;
    @dzsi
    private avia f;
    private final boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l = 5;
    private Set<alyh> m = new HashSet();

    public awbz(alyx alyxVar, dxio<ambz> dxioVar, akqs akqsVar, float f, btvo btvoVar, @dzsi avia aviaVar, boolean z) {
        this.a = alyxVar;
        this.b = dxioVar;
        this.c = akqsVar;
        this.d = f;
        this.e = btvoVar;
        this.f = aviaVar;
        this.g = z;
    }

    private final synchronized void h() {
        dbsk.t(this.f, "A listener must be set on an OfflineAreaValidation before startingvalidation, either during creation, or through an explicit call to setListener");
        amco c = this.b.a().c(akry.BASE);
        alyv b = this.a.b(akqg.a(this.c.c()), akry.BASE);
        float f = this.d;
        int b2 = ((double) f) > 6.0d ? b.b(f) : 7;
        HashSet d = dcnm.d(alyh.c(b2, akqg.a(this.c.j())), alyh.c(b2, akqg.a(this.c.b)), alyh.c(b2, akqg.a(this.c.a)), alyh.c(b2, akqg.a(this.c.k())), alyh.c(b2, akqg.a(this.c.c())));
        this.m = d;
        this.l = 5;
        d.size();
        for (alyh alyhVar : this.m) {
            c.a(alyhVar, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r4.k == false) goto L13;
     */
    @Override // defpackage.avib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.i     // Catch: java.lang.Throwable -> L20
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r4.c()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            boolean r3 = r4.g     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L1d
            if (r0 == 0) goto L1b
            boolean r0 = r4.k     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L1b
            goto L1e
        L1b:
            r1 = 0
            goto L1e
        L1d:
            r1 = r0
        L1e:
            monitor-exit(r4)
            return r1
        L20:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awbz.b():boolean");
    }

    @Override // defpackage.avib
    public final synchronized boolean c() {
        return this.l < 5;
    }

    @Override // defpackage.avib
    public final synchronized int d() {
        return this.l;
    }

    @Override // defpackage.avib
    public final synchronized void e(avia aviaVar) {
        this.f = aviaVar;
    }

    @Override // defpackage.avib
    public final synchronized void f() {
        this.j = true;
    }

    @Override // defpackage.avib
    public final synchronized void g() {
        dbsk.t(this.f, "A listener must be set on an OfflineAreaValidation before startingvalidation, either during creation, or through an explicit call to setListener");
        if (this.h) {
            return;
        }
        if (!this.a.c()) {
            return;
        }
        boolean z = true;
        this.h = true;
        akqs akqsVar = this.c;
        long j = this.e.getOfflineMapsParameters().r;
        double g = akqsVar.g();
        double d = j * 1000000;
        Double.isNaN(d);
        if (g / (d / 4.0589755678081E13d) < 1.003d) {
            z = false;
        }
        this.k = z;
        h();
    }

    public final synchronized String toString() {
        dbsb b;
        b = dbsc.b(this);
        b.b("viewport", this.c);
        b.e("zoom", this.d);
        b.h("validationStarted", this.h);
        b.h("validationFinished", this.i);
        b.h("validationCanceled", this.j);
        b.h("viewportTooLarge", this.k);
        b.h("containsUnofflineableArea", c());
        b.f("numberOfOfflineablePoints", this.l);
        b.f("requestedTiles", this.m.size());
        return b.toString();
    }

    @Override // defpackage.amcm
    public final synchronized void a(alyh alyhVar, int i, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
        if (this.j) {
            return;
        }
        if (i == 0) {
            throw null;
        }
        if (i == 4) {
            return;
        }
        if (i != 1) {
            f();
            dbsk.t(this.f, "A listener must be set on an OfflineAreaValidation before startingvalidation, either during creation, or through an explicit call to setListener");
            this.f.c();
            return;
        }
        this.m.remove(alyhVar);
        this.m.size();
        dbsk.s(alygVar);
        if (!alym.d(alygVar.c().i, this.e.getVectorMapsParameters().d)) {
            this.l--;
        }
        if (!this.m.isEmpty()) {
            return;
        }
        dbsk.t(this.f, "A listener must be set on an OfflineAreaValidation before startingvalidation, either during creation, or through an explicit call to setListener");
        this.i = true;
        this.f.b();
    }
}
