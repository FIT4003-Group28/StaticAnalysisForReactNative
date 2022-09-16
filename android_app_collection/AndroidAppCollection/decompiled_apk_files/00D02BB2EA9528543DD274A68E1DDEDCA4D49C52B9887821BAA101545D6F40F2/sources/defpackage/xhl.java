package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xhl  reason: default package */
/* loaded from: classes7.dex */
public final class xhl extends gen implements crzp<xfc> {
    public cqkj a;
    private dice ad;
    public xho b;
    public xfc c;
    public Executor d;
    @dzsi
    private cqkf<xgt> e;
    @dzsi
    private xhn g;

    public static void g(Bundle bundle, dice diceVar) {
        bvrs.k(bundle, "transit_pass_data_key", diceVar);
    }

    @Override // defpackage.crzp
    public final void On(crzm<xfc> crzmVar) {
        xfb xfbVar;
        if (this.ad.k.isEmpty()) {
            aT();
            return;
        }
        String str = this.ad.k.get(0).f;
        xew xewVar = (xew) this.c;
        if (xewVar.a.containsKey(str)) {
            xfbVar = xewVar.a.get(str);
        } else {
            xfbVar = xfb.a;
        }
        if (xfbVar.g(xfb.a) || !xfbVar.c()) {
            aT();
            return;
        }
        dice diceVar = xfbVar.b;
        dbsk.s(diceVar);
        this.ad = diceVar;
        xhn xhnVar = this.g;
        dbsk.s(xhnVar);
        xhnVar.e(this.ad);
        xhn xhnVar2 = this.g;
        dbsk.s(xhnVar2);
        cqkx.p(xhnVar2);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<xgt> cqkfVar = this.e;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        dice diceVar = (dice) bvrs.g((Bundle) dbsc.a(bundle, this.o), "transit_pass_data_key", (dssr) dice.m.cu(7), dice.m);
        this.ad = diceVar;
        xho xhoVar = this.b;
        gga a = xhoVar.a.a();
        xho.a(a, 1);
        xhq a2 = xhoVar.b.a();
        xho.a(a2, 2);
        dxio a3 = ((dxjh) xhoVar.c).a();
        xho.a(a3, 3);
        btvo a4 = xhoVar.d.a();
        xho.a(a4, 4);
        ckcw a5 = xhoVar.e.a();
        xho.a(a5, 5);
        xho.a(diceVar, 6);
        this.g = new xhn(a, a2, a3, a4, a5, diceVar);
        cqkf<xgt> c = this.a.c(new xgd(), null);
        this.e = c;
        c.e(this.g);
        czwe czweVar = new czwe(J());
        cqkf<xgt> cqkfVar = this.e;
        dbsk.s(cqkfVar);
        czweVar.setContentView(cqkfVar.c());
        Window window = czweVar.getWindow();
        dbsk.s(window);
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.design_bottom_sheet);
        frameLayout.setBackground(ibk.b().a(H()));
        frameLayout.setImportantForAccessibility(2);
        return czweVar;
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtyc.dY;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.c.g().b(this, this.d);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        g(bundle, this.ad);
    }
}
