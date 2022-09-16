package defpackage;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bccm  reason: default package */
/* loaded from: classes3.dex */
final class bccm implements bckv {
    final /* synthetic */ bccn a;

    public bccm(bccn bccnVar) {
        this.a = bccnVar;
    }

    @Override // defpackage.bckv
    public final boolean a() {
        return this.a.V() && this.a.aD;
    }

    @Override // defpackage.bckv
    public final boolean b() {
        return this.a.c;
    }

    @Override // defpackage.bckv
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bckv
    @dzsi
    public final bwrs<ilo> d() {
        return this.a.d;
    }

    @Override // defpackage.bckv
    @dzsi
    public final RecyclerView e() {
        View view;
        bccn bccnVar = this.a;
        if (bccnVar.aD && (view = bccnVar.P) != null) {
            return (RecyclerView) cqhu.a(view, bcfe.a);
        }
        return null;
    }

    @Override // defpackage.bckv
    public final boolean f() {
        dbsk.s(this.a.al);
        if (!this.a.al.k().booleanValue()) {
            return false;
        }
        return this.a.al.i().l().booleanValue();
    }

    @Override // defpackage.bckv
    @dzsi
    public final RecyclerView g() {
        bccn bccnVar = this.a;
        if (!bccnVar.aD) {
            return null;
        }
        return bccnVar.aS();
    }

    @Override // defpackage.bckv
    @dzsi
    public final bclv h() {
        return this.a.al.f();
    }

    @Override // defpackage.bckv
    public final void i(int i, Bitmap bitmap) {
        bclv h;
        bccn bccnVar = this.a;
        gga ggaVar = bccnVar.aE;
        if (!bccnVar.aD || ggaVar == null || (h = h()) == null) {
            return;
        }
        bbuq r = h.r();
        afyb I = h.I();
        bbtv v = bbty.v();
        v.k(true);
        v.o(true);
        v.d(true);
        if (I.e() != afyc.UNSPECIFIED) {
            v.p(I);
        }
        bbty a = v.a();
        bccn bccnVar2 = this.a;
        bcpq.q(bccnVar2.aj, bccnVar2.g, bccnVar2.d, r, a, i, bitmap).aJ(this.a.K());
    }

    @Override // defpackage.bckv
    public final void j(int i) {
    }

    @Override // defpackage.bckv
    public final bcbn k() {
        return this.a.b;
    }

    @Override // defpackage.bckv
    @dzsi
    public final dwfl l() {
        return this.a.e;
    }
}
