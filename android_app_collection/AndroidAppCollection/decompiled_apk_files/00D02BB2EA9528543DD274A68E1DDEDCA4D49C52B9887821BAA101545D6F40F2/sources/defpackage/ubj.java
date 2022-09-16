package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ubj  reason: default package */
/* loaded from: classes7.dex */
public class ubj implements uam {
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

    public ubj(Activity activity, twk twkVar, twf twfVar, vtn vtnVar, tur turVar, final sux suxVar, cqat cqatVar, final tlv tlvVar, amve amveVar, boolean z) {
        CharSequence i;
        boolean z2;
        this.a = turVar;
        this.b = new Runnable(suxVar, tlvVar) { // from class: ubi
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
        this.e = twkVar.a(tlvVar, amveVar, dtxn.ec, dtxn.eb, z);
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
        this.h = vyb.u(amveVar, dtxn.ea);
        this.i = tlvVar;
        this.j = amveVar;
    }

    @Override // defpackage.uam
    public twb a() {
        return this.c;
    }

    @Override // defpackage.uam
    public twa b() {
        return this.d;
    }

    @Override // defpackage.uam
    public sun c() {
        return this.e;
    }

    @Override // defpackage.uam
    public CharSequence d() {
        return this.g;
    }

    @Override // defpackage.uam
    public tvy e() {
        return this.f;
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
        return this.a.c(this.h, this.i, this.j);
    }
}
