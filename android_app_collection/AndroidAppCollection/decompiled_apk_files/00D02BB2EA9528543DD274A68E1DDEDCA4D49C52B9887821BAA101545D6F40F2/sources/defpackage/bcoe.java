package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcoe  reason: default package */
/* loaded from: classes3.dex */
public class bcoe implements bcmg {
    private final bbut a;
    private final bckv b;
    private final dwet c;
    private final dbsg<String> d;

    public bcoe(bbut bbutVar, bckv bckvVar, dwet dwetVar, dbsg<String> dbsgVar) {
        this.a = bbutVar;
        this.b = bckvVar;
        this.c = dwetVar;
        this.d = dbsgVar;
    }

    @Override // defpackage.bcmg
    public Boolean a() {
        return true;
    }

    @Override // defpackage.bcmg
    @dzsi
    public cqtd b() {
        if (!this.c.c.isEmpty()) {
            return null;
        }
        return iup.e(R.raw.from_menu_zero_state);
    }

    @Override // defpackage.bcmg
    @dzsi
    public jic c() {
        if (this.c.c.isEmpty()) {
            return null;
        }
        ckql ckqlVar = new ckql();
        ckqlVar.e = false;
        return new jic(this.c.c, ckqc.FIFE, null, 250, null, ckqlVar);
    }

    @Override // defpackage.bcmg
    public String d() {
        return this.c.a;
    }

    @Override // defpackage.bcmg
    public String e() {
        return this.c.b;
    }

    @Override // defpackage.bcmg
    public cqkl f() {
        ilo iloVar = (ilo) bwrs.b(this.b.d());
        if (iloVar == null) {
            return cqkl.a;
        }
        bbut bbutVar = this.a;
        bbuz m = bbve.m();
        m.b(bbuy.SHOW_FULLY_EXPANDED_PLACESHEET);
        m.e(dwyd.GALLERY);
        ((bbsu) m).b = iloVar;
        bbutVar.j(m.a());
        return cqkl.a;
    }

    @Override // defpackage.bcmg
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtxy.bK;
        b.g((String) ((dbsu) this.d).a);
        ilo iloVar = (ilo) bwrs.b(this.b.d());
        if (iloVar != null) {
            b.g = decs.a(iloVar.ai().c);
        }
        return b.a();
    }
}
