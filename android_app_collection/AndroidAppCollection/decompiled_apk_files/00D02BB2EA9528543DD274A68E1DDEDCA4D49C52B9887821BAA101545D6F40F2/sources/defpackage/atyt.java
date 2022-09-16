package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atyt  reason: default package */
/* loaded from: classes2.dex */
public final class atyt extends ges {
    public btrm a;
    private cqkf<auak> ad;
    private atys ae;
    private final atyr af = new atyr(this);
    public efg b;
    public cqkj c;
    public cqhn d;
    private String e;
    private String f;
    private auak g;

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        if (this.g == null) {
            return null;
        }
        cqkf<auak> c = this.c.c(new auag(), null);
        this.ad = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        this.e = bundle.getString("nextDestinationText");
        String string = bundle.getString("nextDestinationSpokenText");
        this.f = string;
        if (string == null) {
            this.f = J().getString(R.string.MENU_REMOVE_NEXT_STOP_ACTION);
        }
        this.ae = new atys(this);
        this.g = new auai(this.d, this.e, this.ae, this.f);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.e(this.g);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egf a = egf.a();
        a.t = true;
        egjVar.A(a);
        egjVar.e(this);
        this.b.a(egjVar.a());
        btrm btrmVar = this.a;
        atyr atyrVar = this.af;
        dceq a2 = dcet.a();
        a2.b(crhp.class, new atyu(crhp.class, atyrVar, bvrj.UI_THREAD));
        btrmVar.g(atyrVar, a2.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("nextDestinationText", this.e);
        bundle.putString("nextDestinationSpokenText", this.f);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.a.a(this.af);
        this.ad.e(null);
        super.u();
    }
}
