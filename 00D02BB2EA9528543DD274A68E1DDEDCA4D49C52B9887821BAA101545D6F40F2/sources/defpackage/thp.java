package defpackage;

import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: thp  reason: default package */
/* loaded from: classes7.dex */
public final class thp implements tgn {
    public final crzo<dwao> a;
    public final tia b;
    public boolean c;
    public boolean d;
    public dwal e;
    private final toh f;
    private final Executor g;
    @dzsi
    private crzp<tog> h;
    private dbsg<btlu> i;

    public thp(vxa vxaVar, toh tohVar, tia tiaVar, Executor executor) {
        this.f = tohVar;
        this.b = tiaVar;
        this.g = executor;
        dwao b = vxaVar.b(dqvj.MIXED, 1, vul.DIRECTIONS_UI);
        dsqp dsqpVar = (dsqp) b.cu(5);
        dsqpVar.bC(b);
        this.e = (dwal) dsqpVar;
        this.a = new crzo<>(this.e.bK());
        this.h = null;
        this.c = false;
        this.d = false;
        this.i = dbpy.a;
    }

    @Override // defpackage.tgn
    public final crzm<dwao> a() {
        return this.a.a;
    }

    @Override // defpackage.tgn
    public final void b(dosz doszVar) {
        dwal dwalVar = this.e;
        if (dwalVar.c) {
            dwalVar.bF();
            dwalVar.c = false;
        }
        dwao dwaoVar = (dwao) dwalVar.b;
        dwao dwaoVar2 = dwao.R;
        doszVar.getClass();
        dwaoVar.B = doszVar;
        dwaoVar.a |= 1073741824;
        dwal dwalVar2 = this.e;
        dwbk dwbkVar = ((dwao) dwalVar2.b).f;
        if (dwbkVar == null) {
            dwbkVar = dwbk.s;
        }
        dsqp dsqpVar = (dsqp) dwbkVar.cu(5);
        dsqpVar.bC(dwbkVar);
        dwbd dwbdVar = (dwbd) dsqpVar;
        vux vuxVar = vux.GOOD_TO_GO;
        vxr vxrVar = vxr.DEPARTURE_TIME;
        int a = dquo.a(doszVar.b);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            if (dwbdVar.c) {
                dwbdVar.bF();
                dwbdVar.c = false;
            }
            dwbk dwbkVar2 = (dwbk) dwbdVar.b;
            dwbkVar2.k = 6;
            dwbkVar2.a |= 2048;
        } else {
            if (dwbdVar.c) {
                dwbdVar.bF();
                dwbdVar.c = false;
            }
            dwbk dwbkVar3 = (dwbk) dwbdVar.b;
            dwbkVar3.k = 1;
            dwbkVar3.a |= 2048;
        }
        if (dwalVar2.c) {
            dwalVar2.bF();
            dwalVar2.c = false;
        }
        dwao dwaoVar3 = (dwao) dwalVar2.b;
        dwbk bK = dwbdVar.bK();
        bK.getClass();
        dwaoVar3.f = bK;
        dwaoVar3.a |= 2;
        this.a.b(this.e.bK());
    }

    @Override // defpackage.tgn
    public final boolean c() {
        dwao bK = this.e.bK();
        if ((bK.a & 1073741824) != 0) {
            dosz doszVar = bK.B;
            if (doszVar == null) {
                doszVar = dosz.e;
            }
            if ((doszVar.a & 4) != 0) {
                return true;
            }
            dosz doszVar2 = bK.B;
            if (doszVar2 == null) {
                doszVar2 = dosz.e;
            }
            int a = dquo.a(doszVar2.b);
            if (a != 0 && a != 1) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tgn
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.tgn
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.tgn
    public final void f(Bundle bundle) {
        bvrs.k(bundle, "bundle_key_options", this.e.bK());
    }

    @Override // defpackage.tgn
    public final void g(Bundle bundle) {
        dwao dwaoVar = (dwao) bvrs.f(bundle, "bundle_key_options", (dssr) dwao.R.cu(7));
        if (dwaoVar != null) {
            dsqp dsqpVar = (dsqp) dwaoVar.cu(5);
            dsqpVar.bC(dwaoVar);
            dwal dwalVar = (dwal) dsqpVar;
            this.e = dwalVar;
            this.a.b(dwalVar.bK());
        }
    }

    @Override // defpackage.tgn
    public final void h(btlu btluVar) {
        this.i = dbsg.i(btluVar);
        this.h = new crzp(this) { // from class: tho
            private final thp a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                thp thpVar = this.a;
                if (!crzmVar.k()) {
                    thpVar.c = false;
                    return;
                }
                tog togVar = (tog) crzmVar.l();
                dbsk.s(togVar);
                thpVar.c = true;
                thpVar.d = togVar.e();
                thpVar.b.a(thpVar.e, togVar);
                thpVar.a.b(thpVar.e.bK());
            }
        };
        crzm<tog> a = this.f.a(btluVar);
        crzp<tog> crzpVar = this.h;
        dbsk.s(crzpVar);
        a.d(crzpVar, this.g);
    }

    @Override // defpackage.tgn
    public final void i() {
        toh tohVar = this.f;
        btlu b = this.i.b();
        dbsk.s(b);
        crzm<tog> a = tohVar.a(b);
        crzp<tog> crzpVar = this.h;
        dbsk.s(crzpVar);
        a.c(crzpVar);
        this.h = null;
        this.i = dbpy.a;
    }
}
