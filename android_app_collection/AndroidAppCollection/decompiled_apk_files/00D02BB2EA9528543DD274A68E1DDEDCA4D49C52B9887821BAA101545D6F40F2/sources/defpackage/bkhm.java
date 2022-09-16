package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkhm  reason: default package */
/* loaded from: classes3.dex */
public class bkhm implements bega {
    private static final dcdc<dqgh> a = dcdc.i(dqgh.PHONE_NUMBER, dqgh.BUSINESS_HOURS, dqgh.WEBSITE, dqgh.CATEGORY);
    private final Activity b;
    private final dkyr c;
    private final bkhl d;
    @dzsi
    private bkhk e;
    @dzsi
    private bkhk f;
    @dzsi
    private bkhk g;
    @dzsi
    private bkhk h;
    private boolean i;

    public bkhm(Activity activity, btvo btvoVar, bkhl bkhlVar) {
        this.b = activity;
        this.c = btvoVar.getUgcParameters();
        this.d = bkhlVar;
    }

    @dzsi
    public bkhk a() {
        return this.e;
    }

    @dzsi
    public bkhk b() {
        return this.f;
    }

    @dzsi
    public bkhk c() {
        return this.g;
    }

    @dzsi
    public bkhk d() {
        return this.h;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        int a2;
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
            return;
        }
        dobr cy = iloVar.cy();
        if (cy == null) {
            return;
        }
        aif aifVar = new aif();
        for (dobf dobfVar : cy.a) {
            dcdc<dqgh> dcdcVar = a;
            dqgh b = dqgh.b(dobfVar.b);
            if (b == null) {
                b = dqgh.UNDEFINED;
            }
            if (dcdcVar.contains(b) && !dobfVar.c) {
                dqgh b2 = dqgh.b(dobfVar.b);
                if (b2 == null) {
                    b2 = dqgh.UNDEFINED;
                }
                aifVar.put(b2, dobfVar);
            }
        }
        int i = aifVar.j;
        doav cx = iloVar.cx();
        boolean z = true;
        boolean z2 = (cx == null || (cx.a & 1) == 0 || (a2 = doau.a(cx.b)) == 0 || a2 != 2) ? false : true;
        if (i < this.c.l() || z2) {
            z = false;
        }
        this.i = z;
        if (!z) {
            return;
        }
        dobf dobfVar2 = (dobf) aifVar.get(dqgh.PHONE_NUMBER);
        if (dobfVar2 != null) {
            this.e = this.d.a(bwrsVar, dobfVar2, apum.PHONE_NUMBER, dtxy.hd, 2131231713, this.b.getText(R.string.PLACE_ADD_MISSING_PHONE_INFO));
        } else {
            this.e = null;
        }
        dobf dobfVar3 = (dobf) aifVar.get(dqgh.BUSINESS_HOURS);
        if (dobfVar3 != null) {
            this.f = this.d.a(bwrsVar, dobfVar3, apum.HOURS, dtxy.hb, 2131231600, this.b.getText(R.string.PLACE_ADD_MISSING_HOURS_INFO));
        } else {
            this.f = null;
        }
        dobf dobfVar4 = (dobf) aifVar.get(dqgh.WEBSITE);
        if (dobfVar4 != null) {
            this.g = this.d.a(bwrsVar, dobfVar4, apum.WEBSITE, dtxy.hi, 2131231775, this.b.getText(R.string.PLACE_ADD_MISSING_WEBSITE_INFO));
        } else {
            this.g = null;
        }
        dobf dobfVar5 = (dobf) aifVar.get(dqgh.CATEGORY);
        if (dobfVar5 != null) {
            this.h = this.d.a(bwrsVar, dobfVar5, apum.CATEGORY, dtxy.ha, 2131231599, this.b.getText(R.string.PLACE_ADD_MISSING_CATEGORY_INFO));
        } else {
            this.h = null;
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.i = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.i);
    }
}
