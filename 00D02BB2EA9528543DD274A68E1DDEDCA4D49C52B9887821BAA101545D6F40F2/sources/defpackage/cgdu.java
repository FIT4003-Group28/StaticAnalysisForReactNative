package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgdu  reason: default package */
/* loaded from: classes4.dex */
public final class cgdu implements begr {
    public final cgwi a;
    public final String b;
    final /* synthetic */ cgdv c;

    public cgdu(cgdv cgdvVar, cgwi cgwiVar, String str) {
        this.c = cgdvVar;
        this.a = cgwiVar;
        this.b = str;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        this.a.q(iloVar);
        cqkx.p(this.a);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        String str = cgdv.a;
        cgwi H = this.c.e.H();
        if (H == null || H.z().ai().equals(iloVar.ai())) {
            String string = this.c.am.getString(R.string.DATA_REQUEST_ERROR);
            cztr cztrVar = cztr.LONG;
            cztq a = cztt.a(this.c.bk);
            a.d(cztrVar);
            a.c = string;
            a.g = new cgdt(this, cgdv.a, iloVar);
            a.f(this.c.am.getString(R.string.TRY_AGAIN), new cgds(this));
            a.b().b();
        }
    }

    public final void c() {
        ily ilyVar = new ily();
        ilyVar.k(this.b);
        ilo d = ilyVar.d();
        befu p = befv.p();
        p.j(bwrs.a(d));
        p.h(true);
        ((bdvy) this.c.as).f(this, p.m());
    }
}
