package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: uap  reason: default package */
/* loaded from: classes7.dex */
public class uap implements uae {
    private final tur a;
    private final twb b;
    @dzsi
    private final twc c;
    private final twd d;
    @dzsi
    private final suo e;
    private final Runnable f;
    @dzsi
    private final CharSequence g;
    @dzsi
    private final CharSequence h;
    private final cjtd i;
    private final tlv j;
    private final amve k;

    public uap(Activity activity, qhn qhnVar, qho qhoVar, twn twnVar, tur turVar, final sux suxVar, suq suqVar, final tlv tlvVar, final amve amveVar) {
        this.a = turVar;
        zqx zqxVar = new zqx(activity, amveVar);
        this.b = new twl(activity, amveVar, zqxVar);
        this.d = new two(amveVar);
        boolean z = true;
        CharSequence charSequence = "";
        sup supVar = null;
        if (amsr.b(amveVar).equals(amsq.DOCKED_BIKESHARING)) {
            qhy b = qhoVar.b(amveVar);
            this.c = null;
            if (b != null) {
                int c = b.d().c();
                charSequence = activity.getResources().getQuantityString(R.plurals.BIKESHARING_BIKES_AVAILABLE_AT_DOCK, c, Integer.valueOf(c)).trim();
            }
            this.g = charSequence;
            this.h = stf.b(activity, zqxVar.d(), stf.e(activity, amveVar));
            this.i = vyb.u(amveVar, dtxn.bb);
        } else {
            qib a = qhoVar.a(amveVar);
            this.c = a != null ? twnVar.a(a) : null;
            this.g = a == null ? charSequence : stf.b(activity, a.c().e(), qhnVar.a(a.c().f(), activity));
            this.h = a != null ? stf.c(activity, zqxVar.d(), stf.e(activity, amveVar), a.f()) : charSequence;
            this.i = vyb.u(amveVar, dtxn.aX);
        }
        twc twcVar = this.c;
        this.e = tlvVar.d().j().a() ? suqVar.a((twcVar == null || cqjv.v(twcVar.b()).booleanValue()) ? false : z) : supVar;
        this.f = new Runnable(suxVar, tlvVar, amveVar) { // from class: uao
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
        this.j = tlvVar;
        this.k = amveVar;
    }

    private final boolean g() {
        return this.g == null;
    }

    @Override // defpackage.uae
    public twb a() {
        return this.b;
    }

    @Override // defpackage.uae
    @dzsi
    public twc b() {
        return this.c;
    }

    @Override // defpackage.uae
    public twd c() {
        return this.d;
    }

    @Override // defpackage.uae
    @dzsi
    public suo d() {
        return this.e;
    }

    @Override // defpackage.uae
    @dzsi
    public CharSequence e() {
        return g() ? this.h : this.g;
    }

    @Override // defpackage.uae
    @dzsi
    public CharSequence f() {
        if (g()) {
            return null;
        }
        return this.h;
    }

    @Override // defpackage.ual
    public Boolean k() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.ual
    public Boolean l() {
        return Boolean.valueOf(this.c != null);
    }

    @Override // defpackage.ual
    public Boolean m() {
        return Boolean.valueOf(this.k.b().i);
    }

    @Override // defpackage.ual
    public cqkl n() {
        this.f.run();
        return cqkl.a;
    }

    @Override // defpackage.ual
    @dzsi
    public cjtd o() {
        return this.a.c(this.i, this.j, this.k);
    }
}
