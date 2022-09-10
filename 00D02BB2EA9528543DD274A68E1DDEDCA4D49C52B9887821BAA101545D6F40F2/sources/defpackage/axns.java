package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axns  reason: default package */
/* loaded from: classes3.dex */
public class axns implements axnn {
    public final diyq b;
    private final axjh c;
    private final axog d;
    private final mw<axns> e;
    private final axnr f;
    @dzsi
    private final String g;
    private final cjta h;
    private final View.AccessibilityDelegate i;
    private axne j;

    public axns(gga ggaVar, axjh axjhVar, axoi axoiVar, cqhu cqhuVar, diyq diyqVar, dfqc dfqcVar, mw<axns> mwVar, cjta cjtaVar) {
        String str;
        this.c = axjhVar;
        this.e = mwVar;
        this.b = diyqVar;
        this.h = cjtaVar;
        dqau dqauVar = diyqVar.b;
        dqauVar = dqauVar == null ? dqau.e : dqauVar;
        this.d = axoiVar.a(dqauVar);
        if (dfqcVar == dfqc.STREAM_RECOMMENDATION_CARD) {
            dqkn dqknVar = dqauVar.b;
            String str2 = (dqknVar == null ? dqkn.e : dqknVar).d;
            dqkn dqknVar2 = dqauVar.b;
            this.j = axjhVar.o(str2, (dqknVar2 == null ? dqkn.e : dqknVar2).b, dfqcVar);
        }
        axne axneVar = this.j;
        if (axneVar == null || axneVar.l().booleanValue()) {
            dqkn dqknVar3 = dqauVar.b;
            String str3 = (dqknVar3 == null ? dqkn.e : dqknVar3).d;
            dqkn dqknVar4 = dqauVar.b;
            String str4 = (dqknVar4 == null ? dqkn.e : dqknVar4).b;
            dqaw dqawVar = dqauVar.c;
            this.j = axjhVar.p(str3, str4, dqawVar == null ? dqaw.d : dqawVar, dfqcVar);
        }
        this.f = new axnr(diyqVar.c);
        if (axjhVar.i()) {
            Object[] objArr = new Object[1];
            dqkn dqknVar5 = dqauVar.b;
            objArr[0] = (dqknVar5 == null ? dqkn.e : dqknVar5).b;
            str = ggaVar.getString(R.string.REJECT_RECOMMENDATION_CONTENT_DESCRIPTION, objArr);
        } else {
            str = null;
        }
        this.g = str;
        this.i = new axnp();
    }

    @Override // defpackage.axnn
    public axog a() {
        return this.d;
    }

    @Override // defpackage.axnn
    public axne b() {
        return this.j;
    }

    @Override // defpackage.axnn
    @dzsi
    public cjtd c(ddho ddhoVar) {
        return this.h.b(ddhoVar);
    }

    @Override // defpackage.axnn
    public Boolean d() {
        return Boolean.valueOf(this.c.i());
    }

    @Override // defpackage.axnn
    public cqkl e() {
        if (this.c.i()) {
            this.e.a(this);
            axjh axjhVar = this.c;
            dqau dqauVar = this.b.b;
            if (dqauVar == null) {
                dqauVar = dqau.e;
            }
            dqkn dqknVar = dqauVar.b;
            if (dqknVar == null) {
                dqknVar = dqkn.e;
            }
            axjhVar.Q(dqknVar.d);
        }
        return cqkl.a;
    }

    @Override // defpackage.axnn
    @dzsi
    public String f() {
        return this.g;
    }

    @Override // defpackage.axnn
    public cqkl g() {
        return this.d.d();
    }

    @Override // defpackage.axnn
    public View.AccessibilityDelegate h() {
        return this.i;
    }

    @Override // defpackage.axnn
    @dzsi
    public axnm i() {
        return this.f;
    }
}
