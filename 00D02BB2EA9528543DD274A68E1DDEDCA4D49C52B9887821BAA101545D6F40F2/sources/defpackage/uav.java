package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uav  reason: default package */
/* loaded from: classes7.dex */
public class uav implements uag {
    private final tur a;
    private final Runnable b;
    private final twb c;
    private final twa d;
    private final sun e;
    private final tvy f;
    private final CharSequence g;
    private final cjtd h;
    private final tlv i;
    private final amve j;

    public uav(Activity activity, vtn vtnVar, twk twkVar, twf twfVar, tur turVar, final sux suxVar, cqat cqatVar, final tlv tlvVar, amve amveVar, boolean z) {
        CharSequence i;
        boolean z2;
        this.a = turVar;
        this.b = new Runnable(suxVar, tlvVar) { // from class: uau
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
        this.c = new twl(activity, amveVar);
        this.d = new twi(activity, amveVar);
        this.e = twkVar.a(tlvVar, amveVar, dtxn.bh, dtxn.bg, z);
        if (tlvVar.d().a()) {
            i = stf.d(activity);
        } else {
            i = stf.i(activity, cqatVar, amveVar, tlvVar.d().j());
        }
        if (i == null) {
            i = stf.h(activity, vtnVar, amveVar);
            z2 = false;
        } else {
            z2 = true;
        }
        this.g = i;
        this.f = twfVar.a(tlvVar, amveVar, z2);
        this.h = vyb.u(amveVar, dtxn.bf);
        this.i = tlvVar;
        this.j = amveVar;
    }

    @Override // defpackage.uag
    public twb a() {
        return this.c;
    }

    @Override // defpackage.uag
    public twa b() {
        return this.d;
    }

    @Override // defpackage.uag
    public sun c() {
        return this.e;
    }

    @Override // defpackage.uag
    public tvy d() {
        return this.f;
    }

    @Override // defpackage.uag
    public CharSequence e() {
        return this.g;
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
        return uak.b();
    }

    @Override // defpackage.ual
    public cqkl n() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.ual
    public cjtd o() {
        return this.a.c(this.h, this.i, this.j);
    }
}
