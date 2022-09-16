package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
/* compiled from: PG */
/* renamed from: bwuf  reason: default package */
/* loaded from: classes4.dex */
public final class bwuf extends bwtr {
    private double aV;
    private double aW;
    private String aU = "";
    private Boolean aX = false;

    @Override // defpackage.bwtr
    public final void aS(dwgl dwglVar) {
        dizh dizhVar = dwglVar.b.get(0).p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dggg dgggVar = dizhVar.b;
        if (dgggVar == null) {
            dgggVar = dggg.d;
        }
        String str = dgggVar.c;
        bxdn bxdnVar = this.e;
        if (bxdnVar != null && !str.equals(bxdnVar.aj())) {
            bxdnVar.ak();
        }
        super.aS(dwglVar);
        if (this.aU.length() == 0) {
            this.aU = str;
        }
        if (this.ay == null || !str.equals(this.aU) || !this.aX.booleanValue()) {
            return;
        }
        this.ay.setRouteArrow(this.aV, this.aW);
    }

    @Override // defpackage.bwtr, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        Bundle bundle2 = this.o;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        super.t(bundle);
    }

    @Override // defpackage.bwtr, defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        bxdn bxdnVar;
        Bundle bundle2 = bundle != null ? bundle : this.o;
        View ag = super.ag(layoutInflater, viewGroup, bundle);
        Maneuvers$Maneuver maneuvers$Maneuver = (Maneuvers$Maneuver) bundle2.getParcelable("maneuver");
        if (bundle2 != null && (bxdnVar = this.e) != null) {
            bxdnVar.ad(new bxch(bundle2.getCharSequence("arrowtext"), bundle2.getCharSequence("2ndtext"), bundle2.getCharSequence("disttext"), cqrt.j(vrt.a(maneuvers$Maneuver), ibm.c())));
            this.aU = "";
            this.aV = bundle2.getDouble("arrowIn");
            this.aW = bundle2.getDouble("arrowOut");
            this.aX = Boolean.valueOf(maneuvers$Maneuver.a != dgau.DESTINATION);
        }
        return ag;
    }
}
