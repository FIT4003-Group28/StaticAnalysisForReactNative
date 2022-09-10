package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: asxz  reason: default package */
/* loaded from: classes2.dex */
public final class asxz extends bxdu implements nxd, bxeq {
    public ges a;
    public asxy b;
    public asya c;

    @Override // defpackage.bxel
    protected final egf ON() {
        dtjv dtjvVar = this.ax.F().b;
        if (dtjvVar == null) {
            dtjvVar = dtjv.d;
        }
        dqvj c = dqvj.c(dtjvVar.b);
        if (c == null) {
            c = dqvj.DRIVE;
        }
        return egf.e(c, false, null);
    }

    @Override // defpackage.bxdu
    protected final nxd PC() {
        return this;
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.bxel
    protected final bxeq aJ() {
        return this;
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.nxd
    @dzsi
    public final nxe d(dthb dthbVar) {
        asxy asxyVar = this.b;
        ges gesVar = this.a;
        Activity activity = (Activity) ((dxjd) asxyVar.a).a;
        asxy.a(activity, 1);
        asxy.a(gesVar, 2);
        asya a = asxyVar.b.a();
        asxy.a(a, 3);
        asxx asxxVar = new asxx(activity, gesVar, a);
        if (asxxVar.a(dthbVar)) {
            return asxxVar;
        }
        return null;
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        if (this.aD) {
            dwjj dwjjVar = bxmhVar.b;
            if (dwjjVar == null) {
                dwjjVar = dwjj.k;
            }
            if ((dwjjVar.a & 128) == 0) {
                asya asyaVar = this.c;
                dxbp dxbpVar = dwjjVar.b;
                if (dxbpVar == null) {
                    dxbpVar = dxbp.x;
                }
                asyaVar.b(dxbpVar.b);
                return;
            }
            asya asyaVar2 = this.c;
            ges gesVar = this.a;
            dpjx dpjxVar = dwjjVar.h;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            asyaVar2.a(gesVar, dpjxVar);
        }
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
        if (!this.aD) {
            return;
        }
        this.c.b(str);
    }

    @Override // defpackage.bxdu, defpackage.bxel, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            this.a = (ges) this.A.o(bundle, "parent_fragment");
        }
    }

    @Override // defpackage.bxel, defpackage.ges
    public final ddho p() {
        return dtxp.ay;
    }

    @Override // defpackage.bxdu, defpackage.bxel, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.A.n(bundle, "parent_fragment", this.a);
    }
}
