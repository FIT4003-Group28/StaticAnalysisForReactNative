package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhzw  reason: default package */
/* loaded from: classes3.dex */
public class bhzw implements bhzt {
    private final amfi a;
    private final gga b;
    private final bwqv c;
    @dzsi
    private bwrs<ilo> d;

    public bhzw(gga ggaVar, amfi amfiVar, bwqv bwqvVar) {
        this.b = ggaVar;
        this.a = amfiVar;
        this.c = bwqvVar;
    }

    private final Boolean b() {
        ilo iloVar = (ilo) bwrs.b(this.d);
        boolean z = false;
        if (iloVar != null && iloVar.bg()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnif
    public Boolean a() {
        return w();
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        cqtd cqtdVar = null;
        if (!b().booleanValue()) {
            return null;
        }
        bwrs<ilo> bwrsVar = this.d;
        dbsk.s(bwrsVar);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        String a = bhzs.a(c.bm());
        if (!a.isEmpty()) {
            amfu h = this.a.h(a, bhzw.class.getName(), null);
            if (h != null) {
                cqtdVar = h.j();
            }
            if (cqtdVar != null) {
                return cqtdVar;
            }
        }
        bwrs<ilo> bwrsVar2 = this.d;
        dbsk.s(bwrsVar2);
        ilo c2 = bwrsVar2.c();
        dbsk.s(c2);
        if (c2.bj() == dndr.HOME) {
            return cqrt.g(2131231654, ibm.x());
        }
        return cqrt.g(2131231777, ibm.x());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        bwqv bwqvVar = this.c;
        bwrs<ilo> bwrsVar = this.d;
        dbsk.s(bwrsVar);
        this.b.D(bhzy.g(bwqvVar, bwrsVar));
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return cjtd.a(dtxy.eV);
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        if (!b().booleanValue()) {
            return "";
        }
        bwrs<ilo> bwrsVar = this.d;
        dbsk.s(bwrsVar);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        dndr bj = c.bj();
        if (dndr.HOME == bj) {
            return this.b.getString(R.string.ALIAS_STICKER_HOME_PLACE_PAGE_CARD_TEXT);
        }
        return dndr.WORK == bj ? this.b.getString(R.string.ALIAS_STICKER_WORK_PLACE_PAGE_CARD_TEXT) : "";
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.d = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.d = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return b();
    }
}
