package defpackage;

import android.app.Activity;
import android.text.Html;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: uml  reason: default package */
/* loaded from: classes7.dex */
public final class uml extends umg implements umd {
    private static final cqtd d = iut.a(iup.c(R.raw.ic_mod_walk, ibm.t()));
    private static final cqtd e = cqtt.h(cqrt.h(2131231715, ibm.V()), 1.2f);
    private final Activity f;
    private final dpdy g;
    private final String h;

    public uml(Activity activity, cqhn cqhnVar, dxio<bwsh> dxioVar, vtn vtnVar, qbv qbvVar, dpdy dpdyVar, boolean z, boolean z2, String str) {
        super(cqhnVar, dxioVar, vtnVar, qbvVar, z, z2);
        this.f = activity;
        this.g = dpdyVar;
        this.h = str;
        dpec dpecVar = dpdyVar.c;
        if ((dpecVar == null ? dpec.o : dpecVar).n.size() > 0) {
            dpec dpecVar2 = dpdyVar.c;
            douj doujVar = (dpecVar2 == null ? dpec.o : dpecVar2).n.get(0).d;
            if ((doujVar == null ? douj.h : doujVar).d.size() > 0) {
                dpec dpecVar3 = dpdyVar.c;
                douj doujVar2 = (dpecVar3 == null ? dpec.o : dpecVar3).n.get(0).d;
                if (((doujVar2 == null ? douj.h : doujVar2).d.get(0).a & 1) != 0) {
                    dpec dpecVar4 = dpdyVar.c;
                    douj doujVar3 = (dpecVar4 == null ? dpec.o : dpecVar4).n.get(0).d;
                    B((doujVar3 == null ? douj.h : doujVar3).d.get(0).b, true);
                    return;
                }
            }
        }
        this.c = d;
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ Boolean a() {
        return super.a();
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ Boolean b() {
        return super.b();
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ void c(dwfl dwflVar) {
        super.c(dwflVar);
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ Boolean d() {
        return super.d();
    }

    @Override // defpackage.umg, defpackage.umc
    @dzsi
    public /* bridge */ /* synthetic */ jic e() {
        return super.e();
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ cqkl f() {
        return super.f();
    }

    @Override // defpackage.umc
    public CharSequence g() {
        return this.f.getString(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_STREETVIEW, new Object[]{this.h});
    }

    @Override // defpackage.umc
    @dzsi
    public cqtd h() {
        cqtd cqtdVar = this.c;
        return this.a.booleanValue() ? e : cqtdVar != null ? cqtdVar : d;
    }

    @Override // defpackage.umg, defpackage.umc
    public /* bridge */ /* synthetic */ Boolean i() {
        return super.i();
    }

    @Override // defpackage.umd
    public CharSequence j() {
        dpdv dpdvVar = this.g.m;
        if (dpdvVar == null) {
            dpdvVar = dpdv.e;
        }
        return Html.fromHtml(dpdvVar.a);
    }
}
