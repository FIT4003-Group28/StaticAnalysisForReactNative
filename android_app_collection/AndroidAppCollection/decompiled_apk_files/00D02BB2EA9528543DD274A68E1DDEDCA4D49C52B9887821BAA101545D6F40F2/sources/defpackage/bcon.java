package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcon  reason: default package */
/* loaded from: classes3.dex */
class bcon implements bcmg {
    final /* synthetic */ bcop a;

    public bcon(bcop bcopVar) {
        this.a = bcopVar;
    }

    @Override // defpackage.bcmg
    public Boolean a() {
        ilo iloVar = this.a.m;
        boolean z = false;
        if (iloVar != null && iloVar.bf().r && this.a.r().b() == 0) {
            bcop bcopVar = this.a;
            if (bcop.L(bcopVar.m, bcopVar.e)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bcmg
    @dzsi
    public cqtd b() {
        ilo iloVar = this.a.m;
        if (iloVar != null) {
            if (iloVar.bG()) {
                return iup.e(R.raw.by_owner_dining_zero_state);
            }
            if (this.a.m.bH()) {
                return iup.e(R.raw.from_hotel_zero_state);
            }
        }
        return iup.e(R.raw.by_owner_generic_zero_state);
    }

    @Override // defpackage.bcmg
    @dzsi
    public jic c() {
        return null;
    }

    @Override // defpackage.bcmg
    public String d() {
        ilo iloVar = this.a.m;
        if (iloVar != null) {
            if (iloVar.bG()) {
                return this.a.c.getString(R.string.GALLERY_BY_OWNER_ZERO_STATE_HEADLINE);
            }
            if (this.a.m.bH()) {
                return this.a.c.getString(R.string.GALLERY_FROM_HOTEL_ZERO_STATE_HEADLINE);
            }
        }
        return this.a.c.getString(R.string.GALLERY_BY_OWNER_GENERIC_ZERO_STATE_HEADLINE);
    }

    @Override // defpackage.bcmg
    public String e() {
        ilo iloVar = this.a.m;
        if (iloVar != null) {
            if (iloVar.bG()) {
                return this.a.c.getString(R.string.GALLERY_BY_OWNER_ZERO_STATE_BODY);
            }
            if (this.a.m.bH()) {
                return this.a.c.getString(R.string.GALLERY_FROM_HOTEL_ZERO_STATE_BODY);
            }
        }
        return this.a.c.getString(R.string.GALLERY_BY_OWNER_GENERIC_ZERO_STATE_BODY);
    }

    @Override // defpackage.bcmg
    public cqkl f() {
        bbut bbutVar = this.a.g;
        bbuz m = bbve.m();
        m.b(bbuy.SHOW_FULLY_EXPANDED_PLACESHEET);
        m.e(dwyd.GALLERY);
        ((bbsu) m).b = this.a.m;
        bbutVar.j(m.a());
        return cqkl.a;
    }

    @Override // defpackage.bcmg
    @dzsi
    public cjtd g() {
        ilo iloVar = this.a.m;
        if (iloVar != null) {
            if (iloVar.bG()) {
                return cjtd.a(dtxy.bP);
            }
            if (this.a.m.bH()) {
                return cjtd.a(dtxy.bT);
            }
        }
        return cjtd.a(dtxy.bO);
    }
}
