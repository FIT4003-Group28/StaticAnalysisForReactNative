package defpackage;

import android.os.Bundle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: bxdu  reason: default package */
/* loaded from: classes4.dex */
public class bxdu extends bxel implements egq, egs {
    private static final dcqe a = dcqe.c("bxdu");
    public eeu ag;
    public dxio<akfa> ah;
    public bvrb ai;
    public ahjq aj;
    public cjqy ak;
    @dzsi
    public akox al;
    public btvo am;
    public btrm an;
    public cjzo ao;
    public dxio<bwjz> ap;
    public dxio<nut> aq;
    public dxio<qbt> ar;
    public bwqv as;
    public bwpo at;
    public ckcw au;
    public gga av;
    public bwjy aw;
    public final bwnj ax = new bwnj();
    bwja ay;

    private final boolean aR(@dzsi Bundle bundle) {
        bwqv bwqvVar;
        bwnj bwnjVar;
        if (bundle == null || (bwqvVar = this.as) == null) {
            return false;
        }
        try {
            bwnjVar = (bwnj) bwqvVar.d(bwnj.class, bundle, "suggest_fragment_odelay_content_state");
        } catch (IOException e) {
            bvoo.h("Corrupt storage data: %s", e);
            bwnjVar = null;
        }
        if (bwnjVar == null) {
            return false;
        }
        this.ax.a(bwnjVar);
        return true;
    }

    @dzsi
    protected nxd PC() {
        if (!this.o.containsKey("cardui_action_delegate")) {
            return null;
        }
        gn gnVar = this.A;
        dbsk.s(gnVar);
        fd o = gnVar.o(this.o, "cardui_action_delegate");
        if (o == null || (o instanceof nxd)) {
            return (nxd) o;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.A.s("", null, new PrintWriter((OutputStream) byteArrayOutputStream, true), null);
        bvoo.h("Unknown fragment seems loaded: %s, stack-count=%d, fragmentIndex=%d, argument.keySet()=%s, FragmentManager.dump():\n%s", o, Integer.valueOf(this.A.j()), Integer.valueOf(this.o.getInt("cardui_action_delegate")), this.o.keySet(), byteArrayOutputStream);
        return null;
    }

    public final <C extends fd & nxd, S extends fd & bxeq> void aU(bwqv bwqvVar, bxko bxkoVar, @dzsi bwnj bwnjVar, @dzsi C c) {
        super.bu(bwqvVar, bxkoVar, null);
        this.ax.a(bwnjVar);
        Bundle bundle = this.o;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bwqvVar.c(bundle, "suggest_fragment_odelay_content_state", bwnjVar);
        if (c != null) {
            gn gnVar = c.A;
            dbsk.s(gnVar);
            gnVar.n(bundle, "cardui_action_delegate", c);
        }
        B(bundle);
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        if (!aR(bundle)) {
            aR(this.o);
        }
        bwpn a2 = this.at.a(this.ax);
        this.ay = new bwja(this.ax, this.av, a2, PC(), this.ao, this.ak, this.ap.a(), this.an, this.ah, this.ag, this.ai, this.aq.a(), this.ar.a(), this.aj, this.au, this.aw);
        super.l(bundle);
        bxpr bxprVar = this.bd;
        if (bxprVar != null) {
            bxprVar.e(new bxka(), a2);
        }
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public void s() {
        akox akoxVar = this.al;
        akqs a2 = akoxVar == null ? null : alao.a(akoxVar);
        if (a2 != null) {
            this.ax.A(a2);
        }
        bwja bwjaVar = this.ay;
        if (bwjaVar != null) {
            bwjaVar.d();
        }
        super.s();
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public void t(Bundle bundle) {
        super.t(bundle);
        bwqv bwqvVar = this.as;
        if (bwqvVar != null) {
            bwqvVar.c(bundle, "suggest_fragment_odelay_content_state", this.ax);
        }
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public void u() {
        bwja bwjaVar = this.ay;
        if (bwjaVar != null) {
            bwjaVar.e();
        }
        super.u();
    }
}
