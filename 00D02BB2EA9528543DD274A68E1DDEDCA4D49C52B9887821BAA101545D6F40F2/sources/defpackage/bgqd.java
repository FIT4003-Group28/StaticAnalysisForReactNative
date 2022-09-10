package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgqd  reason: default package */
/* loaded from: classes3.dex */
public class bgqd implements bgob {
    public final cjqy a;
    public final gga b;
    public final dipk c;
    public final bgqb d;
    public final bgpw e;
    public final int f;
    public final boolean g;
    private final Activity j;
    private final diov k;
    private final acli l;
    private final bgqc m;
    private final View.OnClickListener n;
    @dzsi
    private final bgnp o;
    private final bgni p;
    private final int q;
    private final jbk i = new bgqa(this);
    public boolean h = true;

    public bgqd(Activity activity, cqhn cqhnVar, apqe apqeVar, cjqy cjqyVar, gga ggaVar, bgos bgosVar, bgnj bgnjVar, dipk dipkVar, diov diovVar, int i, boolean z, boolean z2, int i2, final bgpw bgpwVar, ilo iloVar) {
        this.j = activity;
        this.a = cjqyVar;
        this.b = ggaVar;
        this.c = dipkVar;
        this.k = diovVar;
        this.q = i;
        this.f = i2;
        this.g = z;
        this.e = bgpwVar;
        bgqc bgqcVar = new bgqc(this);
        this.m = bgqcVar;
        this.n = new View.OnClickListener(bgpwVar) { // from class: bgpy
            private final bgpw a;

            {
                this.a = bgpwVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d();
            }
        };
        bgqb bgqbVar = new bgqb(this, activity, cqhnVar, apqeVar, cjqyVar);
        this.d = bgqbVar;
        bgqbVar.C(bgqcVar);
        bgqbVar.G(true);
        bgqbVar.I(true);
        bgqbVar.E(z2);
        aclh aclhVar = new aclh();
        aclhVar.a = dtxu.aP;
        aclhVar.b = dipkVar.p;
        aclhVar.c = dipkVar.q;
        this.l = aclhVar.a();
        this.o = bgosVar.a(iloVar.n(), dipkVar, iloVar, -1, bgnk.PLACESHEET_VIDEO_FULL_SCREEN, true, null);
        this.p = bgnjVar.a(dipkVar, k(dipkVar, dtxu.bb), k(dipkVar, dtxu.aT));
    }

    private static cjtd k(dipk dipkVar, ddho ddhoVar) {
        cjta cjtaVar = new cjta();
        cjtaVar.d = ddhoVar;
        cjtaVar.g(dipkVar.q);
        return cjtaVar.a();
    }

    @Override // defpackage.bgob
    public String a() {
        return this.k.c;
    }

    @Override // defpackage.bgob
    public String b() {
        return this.k.b;
    }

    @Override // defpackage.bgob
    public Boolean c() {
        return true;
    }

    @Override // defpackage.bgob
    public appj d() {
        return this.d;
    }

    @Override // defpackage.bgob
    public acli e() {
        return this.l;
    }

    @Override // defpackage.bgob
    public View.OnClickListener f() {
        return this.n;
    }

    @Override // defpackage.bgob
    public jbk g() {
        return this.i;
    }

    @Override // defpackage.bgob
    @dzsi
    public bgnp h() {
        return this.o;
    }

    @Override // defpackage.bgob
    public CharSequence i() {
        return this.p.a(false);
    }

    @Override // defpackage.bgob
    public String j() {
        return this.j.getResources().getQuantityString(R.plurals.VIDEO_FOR_POST, this.c.m.size(), Integer.valueOf(this.q + 1), Integer.valueOf(this.c.m.indexOf(this.k) + 1));
    }
}
