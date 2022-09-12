package defpackage;

import android.text.Html;
import android.text.Spanned;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahcc  reason: default package */
/* loaded from: classes2.dex */
public class ahcc implements agyy {
    public static final /* synthetic */ int g = 0;
    private static final cqtd h = cqrt.g(2131232726, cqrt.c(R.color.quantum_grey600));
    private static final Html.ImageGetter i = ahby.a;
    public final ahbk a;
    public final ahcr b;
    public final dxio<anhg> c;
    public final btlu d;
    public agyu e;
    public agyu f;
    private final agwa j;
    private final gga k;
    private final afzs l;
    private final bvrb m;
    private final boolean n;
    private agyx o = agyx.LOADING;

    public ahcc(cqhn cqhnVar, ahbk ahbkVar, agwa agwaVar, ahcs ahcsVar, gga ggaVar, dxio<anhg> dxioVar, afzs afzsVar, bvrb bvrbVar, btlu btluVar, boolean z) {
        this.a = ahbkVar;
        this.j = agwaVar;
        agwa a = ahcsVar.a.a();
        ahcs.a(a, 1);
        ahco a2 = ahcsVar.b.a();
        ahcs.a(a2, 2);
        bvrb a3 = ahcsVar.c.a();
        ahcs.a(a3, 3);
        ahcs.a(btluVar, 4);
        this.b = new ahcr(a, a2, a3, btluVar);
        this.k = ggaVar;
        this.c = dxioVar;
        this.l = afzsVar;
        this.m = bvrbVar;
        this.d = btluVar;
        this.n = z;
        this.e = ahbkVar.a(btluVar, dkzq.POSITIVE, dcdc.e());
        this.f = ahbkVar.a(btluVar, dkzq.NEGATIVE, dcdc.e());
    }

    @Override // defpackage.agyy
    public agzd a() {
        return this.b;
    }

    @Override // defpackage.agyy
    public agyu b() {
        return this.e;
    }

    @Override // defpackage.agyy
    public agyu c() {
        return this.f;
    }

    @Override // defpackage.agyy
    public Boolean d() {
        boolean z = false;
        if (this.l.c() && this.b.c().booleanValue() && this.n) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.agyy
    public Boolean e(agyx agyxVar) {
        return Boolean.valueOf(this.o.equals(agyxVar));
    }

    @Override // defpackage.agyy
    public cqkl f() {
        i(agyx.LOADING);
        h();
        return cqkl.a;
    }

    @Override // defpackage.agyy
    public acpa g() {
        Spanned fromHtml = Html.fromHtml(this.k.getString(R.string.LOCALSTREAM_FOLLOW_MANAGEMENT_FOLLOWED_AREAS_HELP_TEXT), i, new ahcb(new ahbz(this)));
        return new acpc(fromHtml, fromHtml, h);
    }

    public void h() {
        this.b.b();
        deha.q(this.j.i(this.d), new ahca(this), this.m.h());
    }

    public final void i(agyx agyxVar) {
        this.o = agyxVar;
        cqkx.p(this);
    }
}
