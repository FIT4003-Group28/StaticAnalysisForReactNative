package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uas  reason: default package */
/* loaded from: classes7.dex */
public class uas implements uaf {
    private final tur a;
    private final Runnable b;
    private final twb c;
    private final twa d;
    private final sun e;
    private final zfo f;
    private final cjtd g;
    private final tlv h;
    private final amve i;
    @dzsi
    private final CharSequence j;
    @dzsi
    private final String k;

    public uas(Activity activity, twk twkVar, tur turVar, final sux suxVar, cqat cqatVar, final tlv tlvVar, amve amveVar, boolean z) {
        this.a = turVar;
        zqx zqxVar = new zqx(activity, amveVar);
        this.f = zqxVar;
        this.b = new Runnable(suxVar, tlvVar) { // from class: uar
            private final sux a;
            private final tlv b;

            {
                this.a = suxVar;
                this.b = tlvVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aR(this.b);
            }
        };
        this.c = new twl(activity, amveVar, zqxVar);
        this.d = new twi(activity, amveVar);
        this.e = twkVar.a(tlvVar, amveVar, dtxn.H, dtxn.G, z);
        this.g = vyb.u(amveVar, dtxn.F);
        this.j = stf.b(activity, zqxVar.d(), stf.e(activity, amveVar));
        dbsg<dosz> j = tlvVar.d().j();
        this.k = j.a() ? stf.g(activity, amveVar, cqatVar, j.b()) : null;
        this.h = tlvVar;
        this.i = amveVar;
    }

    @Override // defpackage.uaf
    public twb a() {
        return this.c;
    }

    @Override // defpackage.uaf
    public twa b() {
        return this.d;
    }

    @Override // defpackage.uaf
    public sun c() {
        return this.e;
    }

    @Override // defpackage.uaf
    @dzsi
    public CharSequence d() {
        return this.j;
    }

    @Override // defpackage.uaf
    @dzsi
    public String e() {
        return this.k;
    }

    @Override // defpackage.ual
    public Boolean k() {
        return uak.a();
    }

    @Override // defpackage.ual
    public Boolean l() {
        return true;
    }

    @Override // defpackage.ual
    public Boolean m() {
        return uak.b();
    }

    @Override // defpackage.ual
    public cqkl n() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.ual
    public cjtd o() {
        return this.a.c(this.g, this.h, this.i);
    }
}
