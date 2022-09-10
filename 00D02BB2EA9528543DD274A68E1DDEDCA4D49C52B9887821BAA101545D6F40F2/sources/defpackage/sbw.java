package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sbw  reason: default package */
/* loaded from: classes7.dex */
public abstract class sbw implements sap {
    private final domy a;
    private final CharSequence b;
    @dzsi
    private final cqtd c;
    @dzsi
    private final cqkn<sap> d;
    private final boolean e;
    private final CharSequence f;
    private boolean g;
    @dzsi
    private final cqkn<sap> h;
    @dzsi
    private sao i;
    private int j;
    private final Context k;

    public sbw(Application application, domy domyVar, CharSequence charSequence, @dzsi cqtd cqtdVar, @dzsi cqkn<sap> cqknVar, boolean z, CharSequence charSequence2, boolean z2, @dzsi cqkn<sap> cqknVar2) {
        this.k = application;
        this.a = domyVar;
        this.b = charSequence;
        this.c = cqtdVar;
        this.d = cqknVar;
        this.e = z;
        this.f = charSequence2;
        this.g = z2;
        this.h = cqknVar2;
    }

    public void A(Boolean bool) {
        this.g = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final CharSequence B(CharSequence charSequence) {
        Resources resources = this.k.getResources();
        bvsi bvsiVar = new bvsi(this.k);
        bvsiVar.c(charSequence);
        bvsiVar.c(resources.getString(R.string.COMMUTE_SETUP_LEG_INDEX_ACCESSIBILITY_DESCRIPTION, Integer.valueOf(this.j + 1)));
        return bvsiVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C() {
        sao saoVar = this.i;
        if (saoVar != null) {
            saoVar.j();
        }
    }

    @dzsi
    public abstract rzk D();

    @Override // defpackage.sap
    public CharSequence c() {
        return this.b;
    }

    @Override // defpackage.sap
    public CharSequence d() {
        return B(c().toString());
    }

    @Override // defpackage.sap
    @dzsi
    public cqtd e() {
        return this.c;
    }

    @Override // defpackage.sap
    @dzsi
    public cqkn<sap> f() {
        return this.d;
    }

    @Override // defpackage.sap
    public Boolean g() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.sap
    public void i(@dzsi sao saoVar) {
        this.i = saoVar;
    }

    @Override // defpackage.sap
    public Boolean j() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.sap
    public CharSequence l() {
        return this.f;
    }

    @Override // defpackage.sap
    @dzsi
    public cqkn<sap> m() {
        return this.h;
    }

    @Override // defpackage.sap
    public cjtd n() {
        return cjtd.a(dtxl.cK);
    }

    @Override // defpackage.sap
    public cjtd o() {
        return cjtd.a(dtxl.cM);
    }

    @Override // defpackage.sap
    public CharSequence p() {
        return B(this.k.getResources().getString(R.string.COMMUTE_SETUP_DELETE_LEG));
    }

    @Override // defpackage.sap
    public void q(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        cqkx.p(this);
    }

    public domy z() {
        return this.a;
    }
}
