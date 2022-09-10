package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aoso  reason: default package */
/* loaded from: classes2.dex */
public class aoso implements baeg {
    private final CharSequence a;
    private final CharSequence b;
    private final CharSequence c;
    private final CharSequence f;
    private final bzqa h;
    private final cjqp i;
    private final cjqy j;
    private final baje k;
    private final cjtd d = cjtd.a(dtxy.ar);
    private final cqtd e = iva.e(iup.e(R.raw.location_history), iup.e(R.raw.location_history_darkmode));
    private final cjtd g = cjtd.a(dtxy.aq);

    public aoso(gga ggaVar, bzqa bzqaVar, cjqy cjqyVar, baje bajeVar, cjqp cjqpVar) {
        this.k = bajeVar;
        this.h = bzqaVar;
        this.j = cjqyVar;
        this.i = cjqpVar;
        this.a = ggaVar.getString(R.string.LOCATION_HISTORY_PROMO_TITLE_V2);
        this.b = ggaVar.getString(R.string.LOCATION_HISTORY_PROMO_DESCRIPTION_V2);
        this.c = ggaVar.getString(R.string.LOCATION_HISTORY_PROMO_ENABLE_LOCATION_HISTORY_BUTTON_LABEL);
        this.f = ggaVar.getString(R.string.LOCATION_HISTORY_PROMO_DISMISS_LOCATION_HISTORY_PROMO_BUTTON_LABEL);
    }

    @Override // defpackage.baeg
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.baeg
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.baeg
    public CharSequence c() {
        return this.c;
    }

    @Override // defpackage.baeg
    public cqkl d() {
        aosn aosnVar = new aosn(this.j, this.i, this.k);
        aosnVar.b = aosnVar.a.d(cjtd.a(dtyc.ao));
        aosnVar.c = aosnVar.a.d(cjtd.a(dtyc.an));
        this.h.a(new int[]{bzqb.LOCATION_HISTORY.d, bzqb.LOCATION_REPORTING.d}, aosnVar, "timeline");
        return cqkl.a;
    }

    @Override // defpackage.baeg
    public cjtd e() {
        return this.d;
    }

    @Override // defpackage.baeg
    public cqtd f() {
        return this.e;
    }

    @Override // defpackage.baeg
    public CharSequence g() {
        return this.f;
    }

    @Override // defpackage.baeg
    public cqkl h() {
        this.k.a();
        return cqkl.a;
    }

    @Override // defpackage.baeg
    public cjtd i() {
        return this.g;
    }
}
