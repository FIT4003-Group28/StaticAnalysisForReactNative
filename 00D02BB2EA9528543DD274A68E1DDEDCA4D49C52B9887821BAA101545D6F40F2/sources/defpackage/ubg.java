package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ubg  reason: default package */
/* loaded from: classes7.dex */
public class ubg implements uaj {
    private final tur a;
    private final Runnable b;
    private final twb c;
    private final twc d;
    private final zpc e;
    @dzsi
    private final CharSequence f;
    @dzsi
    private final cqtd g;
    @dzsi
    private final String h;
    @dzsi
    private final cqss i;
    private final cjtd j;
    private final tlv k;
    private final amve l;
    private final twd m;

    public ubg(Activity activity, twn twnVar, cqat cqatVar, vxw vxwVar, vxv vxvVar, zuz zuzVar, tur turVar, final sux suxVar, final tlv tlvVar, final amve amveVar) {
        this.a = turVar;
        this.b = new Runnable(suxVar, tlvVar, amveVar) { // from class: ubf
            private final sux a;
            private final tlv b;
            private final amve c;

            {
                this.a = suxVar;
                this.b = tlvVar;
                this.c = amveVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aS(this.b, this.c);
            }
        };
        this.c = new twl(activity, amveVar);
        this.m = new two(amveVar);
        Activity activity2 = (Activity) ((dxjd) twnVar.a).a;
        twn.b(activity2, 1);
        btvo a = twnVar.b.a();
        twn.b(a, 2);
        twn.b(amveVar, 3);
        this.d = new twm(activity2, a, amveVar);
        this.f = vyb.I(activity, amveVar, cqatVar.b(), true);
        zpd zpdVar = new zpd(amveVar, vxwVar, zuzVar, vxvVar, null);
        this.e = zpdVar;
        zpdVar.a(activity);
        dbsg<dozz> p = p(amveVar);
        cqss cqssVar = null;
        this.g = p.a() ? cqrt.f(alca.b(vyb.R(p.b()))) : null;
        dbsg<dozz> p2 = p(amveVar);
        this.h = p2.a() ? vyb.S(p2.b()) : null;
        dbsg<dozz> p3 = p(amveVar);
        this.i = p3.a() ? alca.f(vyb.R(p3.b())) : cqssVar;
        this.j = vyb.u(amveVar, dtxn.dP);
        this.k = tlvVar;
        this.l = amveVar;
    }

    private static dbsg<dozz> p(amve amveVar) {
        dozz Q = vyb.Q(amveVar, dcep.B(dozy.BETA));
        if (Q != null) {
            doza b = doza.b(Q.e);
            if (b == null) {
                b = doza.INFORMATION;
            }
            if (!b.equals(doza.INFORMATION)) {
                return dbsg.i(Q);
            }
        }
        return dbpy.a;
    }

    @Override // defpackage.uaj
    public twb a() {
        return this.c;
    }

    @Override // defpackage.uaj
    public twd b() {
        return this.m;
    }

    @Override // defpackage.uaj
    public twc c() {
        return this.d;
    }

    @Override // defpackage.uaj
    @dzsi
    public CharSequence d() {
        return this.f;
    }

    @Override // defpackage.uaj
    @dzsi
    public CharSequence e() {
        return ((zpd) this.e).c;
    }

    @Override // defpackage.uaj
    @dzsi
    public cqtd f() {
        return ((zpd) this.e).b;
    }

    @Override // defpackage.uaj
    public Boolean g() {
        boolean z = false;
        if (this.g != null && this.i != null && this.h != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.uaj
    @dzsi
    public cqtd h() {
        return this.g;
    }

    @Override // defpackage.uaj
    @dzsi
    public cqss i() {
        return this.i;
    }

    @Override // defpackage.uaj
    @dzsi
    public CharSequence j() {
        return this.h;
    }

    @Override // defpackage.ual
    public Boolean k() {
        return true;
    }

    @Override // defpackage.ual
    public Boolean l() {
        return true;
    }

    @Override // defpackage.ual
    public Boolean m() {
        return Boolean.valueOf(this.l.b().i);
    }

    @Override // defpackage.ual
    public cqkl n() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.ual
    public cjtd o() {
        return this.a.c(this.j, this.k, this.l);
    }
}
