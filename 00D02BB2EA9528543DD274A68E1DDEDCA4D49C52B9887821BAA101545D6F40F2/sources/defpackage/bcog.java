package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcog  reason: default package */
/* loaded from: classes3.dex */
class bcog implements bcmg {
    final /* synthetic */ bcoh a;

    public bcog(bcoh bcohVar) {
        this.a = bcohVar;
    }

    @Override // defpackage.bcmg
    public Boolean a() {
        ilo iloVar = this.a.m;
        boolean z = false;
        if (iloVar != null && iloVar.bG() && this.a.l.b() == 0) {
            bcoh bcohVar = this.a;
            if (bcoh.L(bcohVar.m, bcohVar.e)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bcmg
    @dzsi
    public cqtd b() {
        return iup.e(R.raw.from_menu_zero_state);
    }

    @Override // defpackage.bcmg
    @dzsi
    public jic c() {
        return null;
    }

    @Override // defpackage.bcmg
    public String d() {
        return this.a.c.getString(R.string.GALLERY_FROM_MENU_ZERO_STATE_HEADLINE);
    }

    @Override // defpackage.bcmg
    public String e() {
        return this.a.c.getString(R.string.GALLERY_FROM_MENU_ZERO_STATE_BODY);
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
        return cjtd.a(dtxy.bV);
    }
}
