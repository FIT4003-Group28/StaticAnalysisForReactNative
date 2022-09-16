package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import defpackage.asta;
import defpackage.astc;
import java.util.List;
/* compiled from: PG */
/* renamed from: aslq  reason: default package */
/* loaded from: classes2.dex */
public abstract class aslq<S extends astc, T extends asta<S, T>> implements asmo, asmp {
    private static final dcqe e = dcqe.c("aslq");
    public final T a;
    protected final btvo b;
    @dzsi
    public S c;
    public boolean d;
    private boolean f;
    private boolean g;

    public aslq(T t, btvo btvoVar) {
        dbsk.s(t);
        this.a = t;
        this.b = btvoVar;
    }

    @Override // defpackage.asmo
    public final void NZ(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
    }

    @Override // defpackage.asmo
    public void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public void b() {
        this.d = true;
    }

    @Override // defpackage.asmo
    public void c() {
        this.c = null;
        this.d = false;
    }

    @Override // defpackage.asmp
    public final boolean h(aste asteVar) {
        if (t() == null || t().e() == null || !vxx.d(t().e(), this.b)) {
            this.a.e = null;
            return false;
        }
        if (dbsd.a(asteVar, t().e)) {
            j();
        }
        if (asteVar == null) {
            j();
        } else {
            this.a.e = asteVar;
        }
        u();
        return true;
    }

    @Override // defpackage.asmp
    public final void i(dbsg<Long> dbsgVar) {
        this.a.f = dbsgVar;
        u();
    }

    @Override // defpackage.asmp
    public final void j() {
        this.a.e = null;
        u();
    }

    @Override // defpackage.asmp
    public final void k(astb astbVar) {
        this.a.g = astbVar;
        u();
    }

    @Override // defpackage.asmp
    public final void l(@dzsi aryr aryrVar) {
        this.a.h = aryrVar;
        u();
    }

    @Override // defpackage.asmp
    public final void m(@dzsi List<aryr> list) {
        if (list == null || list.isEmpty() || t().g == astb.SEARCH_NOT_AUTOREFRESHING || t().g == astb.SEARCH_AUTOREFRESHING) {
            this.a.i = list;
            u();
            return;
        }
        bvoo.h("Trying to set search results when there is no completed search.", new Object[0]);
    }

    @Override // defpackage.asmp
    public final boolean n() {
        return t().g != astb.NO_SEARCH;
    }

    @Override // defpackage.asmp
    public final void o(boolean z) {
        this.a.j = z;
        u();
    }

    @Override // defpackage.asmp
    public final void p(List<akra> list, boolean z, boolean z2, int i, boolean z3) {
        asld asldVar;
        this.f = true;
        if (z3) {
            asldVar = asld.INSPECT_RESULTS_ON_MAP_WITH_LOCATION;
        } else {
            asldVar = asld.INSPECT_RESULTS_ON_MAP_WITHOUT_LOCATION;
        }
        T t = this.a;
        aslf aslfVar = t.c;
        if (z2) {
            if (aslfVar.a != asldVar) {
                return;
            }
            asll asllVar = new asll(aslfVar);
            asllVar.e(list);
            asllVar.g = z;
            asllVar.h = i;
            t.b(asllVar.a());
            u();
            return;
        }
        asll asllVar2 = new asll(aslfVar);
        asllVar2.a = asldVar;
        asllVar2.e(list);
        asllVar2.g = z;
        asllVar2.h = i;
        asllVar2.e = aslfVar;
        t.b(asllVar2.a());
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r0.a != defpackage.asld.INSPECT_ROUTE_SECTION) goto L12;
     */
    @Override // defpackage.asmp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            r4 = this;
            boolean r0 = r4.f
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r4.f = r0
            T extends asta<S, T> r0 = r4.a
            aslf r0 = r0.c
            asle r1 = new asle
            r1.<init>()
            asld r2 = defpackage.asld.FOLLOWING
            r1.a = r2
            aslf r1 = r1.a()
            boolean r2 = r0 instanceof defpackage.aslm
            if (r2 == 0) goto L2a
            aslm r0 = (defpackage.aslm) r0
            aslf r2 = r0.h
            asld r2 = r2.a
            asld r3 = defpackage.asld.OVERVIEW
            if (r2 != r3) goto L36
            aslf r0 = r0.h
            goto L37
        L2a:
            asld r2 = r0.a
            asld r3 = defpackage.asld.OVERVIEW
            if (r2 == r3) goto L37
            asld r2 = r0.a
            asld r3 = defpackage.asld.INSPECT_ROUTE_SECTION
            if (r2 == r3) goto L37
        L36:
            r0 = r1
        L37:
            T extends asta<S, T> r1 = r4.a
            r1.b(r0)
            r4.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aslq.q():void");
    }

    @Override // defpackage.asmp
    public final void r(akra akraVar) {
        this.g = true;
        T t = this.a;
        aslf aslfVar = t.c;
        aslh aslhVar = new aslh(aslfVar);
        aslhVar.a = asld.INSPECT_POINT_ON_MAP;
        aslhVar.f = akraVar;
        aslhVar.e = aslfVar;
        t.b(aslhVar.a());
        u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0.a != defpackage.asld.OVERVIEW) goto L12;
     */
    @Override // defpackage.asmp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r4 = this;
            boolean r0 = r4.g
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r4.g = r0
            T extends asta<S, T> r0 = r4.a
            aslf r0 = r0.c
            asle r1 = new asle
            r1.<init>()
            asld r2 = defpackage.asld.FOLLOWING
            r1.a = r2
            aslf r1 = r1.a()
            boolean r2 = r0 instanceof defpackage.asli
            if (r2 == 0) goto L2a
            asli r0 = (defpackage.asli) r0
            aslf r2 = r0.g
            asld r2 = r2.a
            asld r3 = defpackage.asld.OVERVIEW
            if (r2 != r3) goto L30
            aslf r0 = r0.g
            goto L31
        L2a:
            asld r2 = r0.a
            asld r3 = defpackage.asld.OVERVIEW
            if (r2 == r3) goto L31
        L30:
            r0 = r1
        L31:
            T extends asta<S, T> r1 = r4.a
            r1.b(r0)
            r4.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aslq.s():void");
    }

    @Override // defpackage.asmp
    public final S t() {
        S s = this.c;
        return s != null ? s : (S) this.a.a();
    }

    protected abstract void u();
}
