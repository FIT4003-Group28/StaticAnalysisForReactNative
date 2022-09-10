package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcoj  reason: default package */
/* loaded from: classes3.dex */
class bcoj implements bcmg {
    final /* synthetic */ bcok a;

    public bcoj(bcok bcokVar) {
        this.a = bcokVar;
    }

    @Override // defpackage.bcmg
    public Boolean a() {
        ilo iloVar = this.a.m;
        boolean z = false;
        if (iloVar != null && iloVar.bI() && this.a.l.b() == 0) {
            bcok bcokVar = this.a;
            if (bcok.L(bcokVar.m, bcokVar.e)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bcmg
    @dzsi
    public cqtd b() {
        return cqrt.f(2131231836);
    }

    @Override // defpackage.bcmg
    @dzsi
    public jic c() {
        return null;
    }

    @Override // defpackage.bcmg
    public String d() {
        return this.a.c.getString(R.string.GALLERY_IN_STORE_ZERO_STATE_HEADLINE);
    }

    @Override // defpackage.bcmg
    public String e() {
        return this.a.c.getString(R.string.GALLERY_IN_STORE_ZERO_STATE_BODY);
    }

    @Override // defpackage.bcmg
    public cqkl f() {
        bbut bbutVar = this.a.g;
        bbuz m = bbve.m();
        m.b(bbuy.SHOW_FULLY_EXPANDED_PLACESHEET);
        m.e(dwyd.GALLERY_TAB_ZERO_STATE);
        ((bbsu) m).b = this.a.m;
        bbutVar.j(m.a());
        return cqkl.a;
    }

    @Override // defpackage.bcmg
    @dzsi
    public cjtd g() {
        return cjtd.a(dtxy.ca);
    }
}
