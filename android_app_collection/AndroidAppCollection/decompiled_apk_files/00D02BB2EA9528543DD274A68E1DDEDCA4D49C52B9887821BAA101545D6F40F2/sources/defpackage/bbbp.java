package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbbp  reason: default package */
/* loaded from: classes3.dex */
public class bbbp extends bbal {
    public final dwxj a;
    public final bbbv c;
    public final cjqy d;
    public final cjqq e;
    public final angp f;
    public final anhg g;
    private final bmdv h;

    public bbbp(gga ggaVar, bwqv bwqvVar, ania aniaVar, bmdv bmdvVar, angp angpVar, anhg anhgVar, cjqy cjqyVar, cjqq cjqqVar, batz batzVar, dwxj dwxjVar, bbbv bbbvVar) {
        super(ggaVar, bwqvVar, aniaVar, batzVar);
        this.a = dwxjVar;
        this.h = bmdvVar;
        this.f = angpVar;
        this.g = anhgVar;
        this.d = cjqyVar;
        this.e = cjqqVar;
        this.c = bbbvVar;
    }

    @Override // defpackage.bayj
    public String a() {
        dvyw dvywVar = this.a.d;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        return dvywVar.i;
    }

    @Override // defpackage.bayj
    public jic c() {
        dvyw dvywVar = this.a.d;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        return new jic(dvywVar.am, ckqc.FULLY_QUALIFIED, (cqtd) null, 0);
    }

    @Override // defpackage.bayj
    public String d() {
        return this.t.getString(R.string.YOUR_PLACES_VISITED_PLACES);
    }

    @Override // defpackage.bayj
    @dzsi
    public ilo f() {
        if ((this.a.a & 1) != 0) {
            ily ilyVar = new ily();
            dvyw dvywVar = this.a.d;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            ilyVar.E(dvywVar);
            return ilyVar.d();
        }
        return null;
    }

    @Override // defpackage.bayj
    public cjtd g() {
        return cjtd.a(dtyi.cL);
    }

    @Override // defpackage.bayj
    public jht h() {
        jhu h = jhv.h();
        gga ggaVar = this.t;
        Object[] objArr = new Object[1];
        dvyw dvywVar = this.a.d;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        objArr[0] = dvywVar.i;
        String string = ggaVar.getString(R.string.YOUR_PLACES_PLACE_ITEM_OVERFLOW_MENU_CONTENT_DESCRIPTION_FORMAT, objArr);
        jhi jhiVar = (jhi) h;
        jhiVar.e = string;
        if (this.a.b == 4) {
            jhm jhmVar = new jhm();
            jhmVar.l = R.string.YOUR_PLACES_ITEM_OVERFLOW_MENU_VIEW_IN_TIMELINE;
            jhmVar.a = this.t.getString(R.string.YOUR_PLACES_ITEM_OVERFLOW_MENU_VIEW_IN_TIMELINE);
            jhmVar.f = cjtd.a(dtyg.O);
            jhmVar.d(new View.OnClickListener(this) { // from class: bbbl
                private final bbbp a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bbbp bbbpVar = this.a;
                    dwxj dwxjVar = bbbpVar.a;
                    bbbpVar.g.D(anhy.m(new eapg(dwxjVar.b == 4 ? ((Long) dwxjVar.c).longValue() : 0L)));
                }
            });
            h.d(jhmVar.c());
        } else {
            jhm jhmVar2 = new jhm();
            jhmVar2.l = R.string.YOUR_PLACES_ITEM_OVERFLOW_MENU_REMOVE_PLACE;
            jhmVar2.a = this.t.getString(R.string.REMOVE);
            jhmVar2.f = cjtd.a(dtyg.N);
            jhmVar2.d(new View.OnClickListener(this) { // from class: bbbm
                private final bbbp a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bbbp bbbpVar = this.a;
                    bbbpVar.e.g().d(cjtd.a(dtyg.P));
                    cjtd a = cjtd.a(dtyg.Q);
                    cjql d = bbbpVar.e.g().d(a);
                    cjtd a2 = cjtd.a(dtyg.R);
                    new AlertDialog.Builder(bbbpVar.t).setMessage(bbbpVar.t.getString(R.string.REMOVE_PLACE_FROM_VISITED_PLACES_MESSAGE)).setPositiveButton(R.string.YES_BUTTON, new bbbo(bbbpVar, d, a)).setNegativeButton(R.string.NO_BUTTON, new bbbn(bbbpVar, bbbpVar.e.g().d(a2), a2)).show();
                }
            });
            h.d(jhmVar2.c());
        }
        return jhiVar.b();
    }

    @Override // defpackage.bayj
    /* renamed from: i */
    public String b() {
        dwxj dwxjVar = this.a;
        if (dwxjVar.b != 4) {
            return this.t.getString(R.string.VISITED_PLACES_TIMELESS_BEEN_HERE_TEXT);
        }
        bmdv bmdvVar = this.h;
        long longValue = ((Long) dwxjVar.c).longValue();
        dvyw dvywVar = this.a.d;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        return bmdvVar.c(longValue, dvywVar.ad);
    }
}
