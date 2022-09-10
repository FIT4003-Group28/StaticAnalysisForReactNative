package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aerf  reason: default package */
/* loaded from: classes2.dex */
public class aerf extends gen implements achd, aerz {
    private static final dcqe ag = dcqe.c("aerf");
    public bwqv a;
    protected cqkf<aeyn> ad;
    protected aeui ae = aeui.b;
    public int af;
    @dzsi
    private akqq ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    public aern b;
    public anhp c;
    public cqkj d;
    public dxio<aesb> e;
    aeyn g;

    private final void bn() {
        anhp anhpVar = this.c;
        dwjc bZ = dwjd.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjd dwjdVar = (dwjd) bZ.b;
        int i = dwjdVar.a | 2;
        dwjdVar.a = i;
        dwjdVar.b = 10;
        dwjdVar.a = i | 4;
        dwjdVar.c = 5;
        dwjd.c(dwjdVar);
        anhpVar.a(bZ.bK(), this.ah, 2, new aere(this));
    }

    private final void w(aeui aeuiVar) {
        this.ae = aeuiVar;
        aern aernVar = this.b;
        boolean z = this.ai;
        boolean z2 = this.ak;
        Activity activity = (Activity) ((dxjd) aernVar.a).a;
        aern.a(activity, 1);
        eeu a = aernVar.b.a();
        aern.a(a, 2);
        bvjj a2 = aernVar.c.a();
        aern.a(a2, 3);
        dzsj<ache> dzsjVar = aernVar.d;
        dzsj<araj> dzsjVar2 = aernVar.e;
        dzsj<arag> dzsjVar3 = aernVar.f;
        dzsj<aesb> dzsjVar4 = aernVar.g;
        dzsj<begg> dzsjVar5 = aernVar.h;
        dzsj<cqg> dzsjVar6 = aernVar.i;
        btvo a3 = aernVar.j.a();
        aern.a(a3, 10);
        aern.a(this, 11);
        aern.a(aeuiVar, 12);
        this.g = new aerm(activity, a, a2, dzsjVar, dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5, dzsjVar6, a3, this, aeuiVar, z, z2);
    }

    @Override // defpackage.aerz
    public final void a(aeui aeuiVar) {
        if (this.af == 2) {
            if (this.ae.f != aeuh.NEUTRAL) {
                dwjf e = this.ae.e();
                dwjf e2 = aeuiVar.e();
                dspd dspdVar = null;
                dspd bR = e == null ? null : e.bR();
                if (e2 != null) {
                    dspdVar = e2.bR();
                }
                if (!dbsd.a(bR, dspdVar)) {
                    return;
                }
            }
            q(aeuiVar);
        }
    }

    @Override // defpackage.ges
    public final achc bk() {
        return achc.PLACE_PICKER;
    }

    @Override // defpackage.ges, defpackage.achd
    public final achc bl(@dzsi achc achcVar) {
        return achcVar == null ? achc.PLACE_PICKER : achcVar;
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        aezc aezdVar;
        cqkj cqkjVar = this.d;
        if (this.aj) {
            aezdVar = new aezc();
        } else {
            aezdVar = new aezd();
        }
        cqkf<aeyn> c = cqkjVar.c(aezdVar, null);
        this.ad = c;
        c.e(this.g);
        gdf gdfVar = new gdf((Context) J(), false);
        gdfVar.getWindow().requestFeature(1);
        gdfVar.setContentView(this.ad.c());
        return gdfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r1 != defpackage.aeui.b) goto L12;
     */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@defpackage.dzsi android.os.Bundle r5) {
        /*
            r4 = this;
            super.l(r5)
            if (r5 != 0) goto L7
            android.os.Bundle r5 = r4.o
        L7:
            r0 = 1
            if (r5 == 0) goto L46
            bwqv r1 = r4.a     // Catch: java.io.IOException -> L19
            java.lang.Class<aeui> r2 = defpackage.aeui.class
            java.lang.String r3 = "iah_state"
            java.io.Serializable r1 = r1.d(r2, r5, r3)     // Catch: java.io.IOException -> L19
            aeui r1 = (defpackage.aeui) r1     // Catch: java.io.IOException -> L19
            r4.ae = r1     // Catch: java.io.IOException -> L19
            goto L24
        L19:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "Exception reading storage: %s"
            defpackage.bvoo.h(r1, r2)
        L24:
            java.lang.String r1 = "latlng"
            java.io.Serializable r1 = r5.getSerializable(r1)
            akqq r1 = (defpackage.akqq) r1
            r4.ah = r1
            java.lang.String r1 = "move_to_place_sheet_after_choose"
            boolean r1 = r5.getBoolean(r1, r0)
            r4.ai = r1
            java.lang.String r1 = "show_not_here"
            boolean r1 = r5.getBoolean(r1, r0)
            r4.aj = r1
            java.lang.String r1 = "is_current_location"
            boolean r5 = r5.getBoolean(r1, r0)
            r4.ak = r5
        L46:
            aeui r5 = r4.ae
            if (r5 != 0) goto L4e
            aeui r5 = defpackage.aeui.b
            r4.ae = r5
        L4e:
            boolean r5 = r4.ak
            aeui r1 = r4.ae
            r2 = 2
            if (r5 == 0) goto L57
        L55:
            r0 = 2
            goto L61
        L57:
            akqq r5 = r4.ah
            if (r5 == 0) goto L5d
            r0 = 3
            goto L61
        L5d:
            aeui r5 = defpackage.aeui.b
            if (r1 == r5) goto L55
        L61:
            r4.af = r0
            aeui r5 = r4.ae
            r4.w(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aerf.l(android.os.Bundle):void");
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q(this.ae);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.fv;
    }

    public final synchronized void q(aeui aeuiVar) {
        if (this.aD) {
            w(aeuiVar);
            J().runOnUiThread(new aerd(this));
        }
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        q(this.ae);
        int i = this.af;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                this.e.a().o(this);
                return;
            } else if (i2 != 2) {
                return;
            } else {
                bn();
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final synchronized void t(Bundle bundle) {
        super.t(bundle);
        this.a.c(bundle, "iah_state", this.ae);
        bundle.putSerializable("latlng", this.ah);
        bundle.putBoolean("move_to_place_sheet_after_choose", this.ai);
        bundle.putBoolean("show_not_here", this.aj);
        bundle.putBoolean("is_current_location", this.ak);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        if (this.af == 2) {
            this.e.a().p(this);
        }
        super.u();
    }

    public final synchronized void g() {
        if (this.aD) {
            int i = this.af;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 1) {
                this.ae = aeui.b;
                this.e.a().t(6);
            } else if (i2 == 2) {
                aeui aeuiVar = aeui.b;
                this.ae = aeuiVar;
                q(aeuiVar);
                bn();
            }
        }
    }
}
