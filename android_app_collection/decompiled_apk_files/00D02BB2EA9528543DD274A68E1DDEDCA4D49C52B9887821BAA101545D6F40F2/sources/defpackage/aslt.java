package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: aslt  reason: default package */
/* loaded from: classes2.dex */
public final class aslt extends gen implements DialogInterface.OnKeyListener {
    private static final dcqe ah = dcqe.c("aslt");
    public ff a;
    public bvrb ad;
    public cqkj ae;
    public asmm af;
    @dzsi
    public asur ag;
    @dzsi
    private cqkf<asur> ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private int an;
    public eeu b;
    public btrm c;
    public dxio<afwr> d;
    public dxio<bsvm> e;
    public crem g;

    public static void g(gga ggaVar, asmm asmmVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        aslt asltVar = new aslt();
        asltVar.af = asmmVar;
        asltVar.aj = z;
        boolean[] zArr = new boolean[3];
        boolean z5 = false;
        zArr[0] = z2;
        zArr[1] = z3;
        zArr[2] = i > 0;
        if (deby.b(zArr) <= 1) {
            z5 = true;
        }
        dbsk.a(z5);
        asltVar.ak = z2;
        asltVar.al = z3;
        asltVar.am = z4;
        asltVar.an = i;
        gei.a(ggaVar, asltVar);
        ggaVar.g().aq();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        cqkf<asur> cqkfVar = this.ai;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.ai = null;
        }
        super.am();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        if (bundle != null && bundle.containsKey("nav_fragment")) {
            this.af = (asmm) this.A.o(bundle, "nav_fragment");
        } else if (this.af == null) {
            bvoo.h("Could not retrieve nav fragment from saved bundle.", new Object[0]);
            return null;
        }
        if (bundle != null && bundle.containsKey("showTrafficButton")) {
            this.aj = bundle.getBoolean("showTrafficButton");
        }
        if (bundle != null && bundle.containsKey("showSearchButton")) {
            this.ak = bundle.getBoolean("showSearchButton");
        }
        if (bundle != null && bundle.containsKey("showClearSearchButton")) {
            this.al = bundle.getBoolean("showClearSearchButton");
        }
        if (bundle != null && bundle.containsKey("numberOfStops")) {
            this.an = bundle.getInt("numberOfStops");
        }
        if (bundle != null && bundle.containsKey("showSatelliteButton")) {
            this.am = bundle.getBoolean("showSatelliteButton");
        }
        this.ag = new astw(this.d.a().l(), this.g, new asls(this), false, this.aj, this.ak, this.al, this.am, this.an);
        cqkf<asur> c = this.ae.c(new asob(), null);
        this.ai = c;
        c.e(this.ag);
        gdf gdfVar = new gdf((Context) J(), false);
        gdfVar.getWindow().requestFeature(1);
        gdfVar.getWindow().addFlags(ImageMetadata.LENS_APERTURE);
        gdfVar.setOnKeyListener(this);
        gdfVar.setContentView(this.ai.c());
        return gdfVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (this.aD && keyEvent.getAction() == 1 && i == 82) {
            aT();
            return true;
        }
        return false;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxw.be;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.A.n(bundle, "nav_fragment", this.af.Ny());
        bundle.putBoolean("showTrafficButton", this.aj);
        bundle.putBoolean("showSearchButton", this.ak);
        bundle.putBoolean("showClearSearchButton", this.al);
        bundle.putBoolean("showSatelliteButton", this.am);
        bundle.putInt("numberOfStops", this.an);
    }
}
