package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: bzrf  reason: default package */
/* loaded from: classes4.dex */
public final class bzrf extends itb implements SharedPreferences.OnSharedPreferenceChangeListener, bzrh {
    public final dxio<akfa> a;
    public btlu b;
    private final btrm c;
    private final cdgo d;
    private final btvo e;
    private final bvjj f;
    private final auhi g;
    private aufs i;
    private aufs j;
    private aufs k;
    private final bzre h = new bzre(this);
    private final crzp<btlu> o = new bzrd(this);

    public bzrf(btrm btrmVar, dxio<akfa> dxioVar, cdgo cdgoVar, btvo btvoVar, bvjj bvjjVar, auhi auhiVar) {
        this.c = btrmVar;
        this.a = dxioVar;
        this.d = cdgoVar;
        this.e = btvoVar;
        this.f = bvjjVar;
        this.g = auhiVar;
        this.i = auhiVar.t(dpyv.PHOTO_TAKEN.dm);
        this.j = auhiVar.t(dpyv.REVIEW_AT_A_PLACE.dm);
        this.k = auhiVar.t(dpyv.UGC_TASKS_NEARBY_NEED.dm);
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.f.f(this);
        btrm btrmVar = this.c;
        bzre bzreVar = this.h;
        dceq a = dcet.a();
        a.b(cjnw.class, new bzrg(cjnw.class, bzreVar, bvrj.UI_THREAD));
        btrmVar.g(bzreVar, a.a());
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.a.a().C().d(this.o, dege.a);
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.c.a(this.h);
        this.f.g(this);
        super.Nu();
    }

    @Override // defpackage.itb
    public final void Po() {
        this.a.a().C().c(this.o);
        super.Po();
    }

    @Override // defpackage.bzrh
    public final void e(btlu btluVar) {
        i(btluVar);
    }

    @Override // defpackage.bzrh
    public final dwvd f() {
        dwvc bZ = dwvd.l.bZ();
        dkvn dkvnVar = this.e.getNotificationsParameters().n;
        if (dkvnVar == null) {
            dkvnVar = dkvn.e;
        }
        dkhd dkhdVar = dkvnVar.b;
        if (dkhdVar == null) {
            dkhdVar = dkhd.h;
        }
        boolean z = dkhdVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwvd dwvdVar = (dwvd) bZ.b;
        dwvdVar.a |= 2048;
        dwvdVar.f = z;
        return bZ.bK();
    }

    public final void i(btlu btluVar) {
        this.d.c(btluVar, true);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (bvjk.gd.toString().equals(str)) {
            if (this.i != this.g.t(dpyv.PHOTO_TAKEN.dm)) {
                this.d.c(this.a.a().j(), false);
                this.i = this.g.t(dpyv.PHOTO_TAKEN.dm);
            }
            if (this.j != this.g.t(dpyv.REVIEW_AT_A_PLACE.dm)) {
                this.j = this.g.t(dpyv.REVIEW_AT_A_PLACE.dm);
            }
            if (this.k == this.g.t(dpyv.UGC_TASKS_NEARBY_NEED.dm)) {
                return;
            }
            this.f.S(bvjk.hw, true);
            this.k = this.g.t(dpyv.UGC_TASKS_NEARBY_NEED.dm);
        }
    }
}
