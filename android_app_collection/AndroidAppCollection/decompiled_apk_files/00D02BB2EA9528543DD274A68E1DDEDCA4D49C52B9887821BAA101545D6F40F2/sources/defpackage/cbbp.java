package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbbp  reason: default package */
/* loaded from: classes4.dex */
class cbbp implements bsgz {
    final /* synthetic */ cbbq a;
    private final dcdc<String> b;
    private final dcdc<Integer> c;
    private int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public cbbp(cbbq cbbqVar) {
        this.a = cbbqVar;
        dcdc<Integer> h = dcdc.h(1, 2, 3);
        this.c = h;
        this.d = h.indexOf(Integer.valueOf(cbbqVar.c.c.get(0).b));
        this.b = dcdc.h(cbbqVar.b.getString(R.string.ONE_WEEK), cbbqVar.b.getString(R.string.TWO_WEEKS), cbbqVar.b.getString(R.string.THREE_WEEKS));
    }

    @Override // defpackage.bsgz
    public Boolean Rg(int i) {
        return Boolean.valueOf(i < c().intValue());
    }

    @Override // defpackage.jab
    public Integer c() {
        return 3;
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        return Boolean.valueOf(i == this.d);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        return i < c().intValue() ? this.b.get(i) : "";
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        this.d = i;
        dqmn dqmnVar = this.a.c.c.get(0);
        dsqp dsqpVar = (dsqp) dqmnVar.cu(5);
        dsqpVar.bC(dqmnVar);
        dqmm dqmmVar = (dqmm) dsqpVar;
        int intValue = this.c.get(i).intValue();
        if (dqmmVar.c) {
            dqmmVar.bF();
            dqmmVar.c = false;
        }
        dqmn dqmnVar2 = (dqmn) dqmmVar.b;
        dsrg<Integer, dpol> dsrgVar = dqmn.d;
        dqmnVar2.a |= 1;
        dqmnVar2.b = intValue;
        dqmn bK = dqmmVar.bK();
        cbbq cbbqVar = this.a;
        dpsd dpsdVar = cbbqVar.c;
        dsqp dsqpVar2 = (dsqp) dpsdVar.cu(5);
        dsqpVar2.bC(dpsdVar);
        dpsc dpscVar = (dpsc) dsqpVar2;
        if (dpscVar.c) {
            dpscVar.bF();
            dpscVar.c = false;
        }
        ((dpsd) dpscVar.b).c = dpsd.ck();
        dpscVar.d(bK);
        cbbqVar.c = dpscVar.bK();
        cbbq cbbqVar2 = this.a;
        cbbqVar2.a.d(cbbqVar2.c);
        cqkx.p(this.a);
        return cqkl.a;
    }

    @Override // defpackage.jab
    public cjtd g(int i) {
        return cjtd.b;
    }

    @Override // defpackage.bsgz
    public CharSequence h() {
        return this.a.b.getString(R.string.WEEKLY_REPEATING_EVENT_CADENCE_INPUT_TITLE);
    }

    @Override // defpackage.bsgz
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.bsgz
    public CharSequence j(int i) {
        return d(i).booleanValue() ? this.a.b.getString(R.string.ACCESSIBILITY_SELECTED_TOGGLE, new Object[]{e(i)}) : e(i);
    }

    @Override // defpackage.bsgz
    public Boolean k(int i) {
        return false;
    }
}
