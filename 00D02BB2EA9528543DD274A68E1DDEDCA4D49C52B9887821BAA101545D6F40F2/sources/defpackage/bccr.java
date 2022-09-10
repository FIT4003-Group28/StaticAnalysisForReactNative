package defpackage;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bccr  reason: default package */
/* loaded from: classes3.dex */
final class bccr implements bckv {
    final /* synthetic */ bccs a;

    public bccr(bccs bccsVar) {
        this.a = bccsVar;
    }

    @Override // defpackage.bckv
    public final boolean a() {
        return this.a.V() && this.a.aD;
    }

    @Override // defpackage.bckv
    public final boolean b() {
        return this.a.b;
    }

    @Override // defpackage.bckv
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bckv
    @dzsi
    public final bwrs<ilo> d() {
        return this.a.c;
    }

    @Override // defpackage.bckv
    @dzsi
    public final RecyclerView e() {
        return null;
    }

    @Override // defpackage.bckv
    public final boolean f() {
        return false;
    }

    @Override // defpackage.bckv
    @dzsi
    public final RecyclerView g() {
        bccs bccsVar = this.a;
        if (!bccsVar.aD) {
            return null;
        }
        return bccsVar.aU();
    }

    @Override // defpackage.bckv
    @dzsi
    public final bclv h() {
        return this.a.d.f();
    }

    @Override // defpackage.bckv
    public final void i(int i, Bitmap bitmap) {
        bclv h;
        bccs bccsVar = this.a;
        gga ggaVar = bccsVar.aE;
        if (!bccsVar.aD || ggaVar == null || (h = h()) == null) {
            return;
        }
        bbuq r = h.r();
        bccs bccsVar2 = this.a;
        btvo btvoVar = bccsVar2.aj;
        bwqv bwqvVar = bccsVar2.ae;
        bwrs<ilo> bwrsVar = bccsVar2.c;
        bbtv v = bbty.v();
        v.k(true);
        v.o(true);
        ggaVar.D(bcrg.aS(btvoVar, bwqvVar, bwrsVar, r, v.a(), i, bitmap, null));
    }

    @Override // defpackage.bckv
    public final void j(int i) {
        bccs bccsVar = this.a;
        if (bccsVar.g == null || i < 0 || i >= bccsVar.aX().size()) {
            return;
        }
        bccs bccsVar2 = this.a;
        this.a.g.H(bccsVar2.aS(bccsVar2.aX().get(i)));
    }

    @Override // defpackage.bckv
    public final bcbn k() {
        return this.a.f;
    }

    @Override // defpackage.bckv
    @dzsi
    public final dwfl l() {
        return this.a.e;
    }
}
