package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cedo  reason: default package */
/* loaded from: classes4.dex */
public final class cedo extends fd implements cezu {
    public Executor a;
    public bvax b;

    public static cedo g(dspd dspdVar) {
        cedo cedoVar = new cedo();
        Bundle bundle = new Bundle();
        bundle.putByteArray("notificationId", dspdVar.G());
        cedoVar.B(bundle);
        return cedoVar;
    }

    private final dspd h() {
        Bundle bundle = this.o;
        dbsk.s(bundle);
        return dspd.x(bundle.getByteArray("notificationId"));
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dbsk.t(h(), "Must call setNotificationId");
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.cezu
    public final void d(cfgf cfgfVar) {
        dlnm dlnmVar = cfgfVar.b;
        if (dlnmVar == null) {
            dlnmVar = dlnm.l;
        }
        dspd dspdVar = dlnmVar.f;
        dlnm dlnmVar2 = cfgfVar.b;
        if (dlnmVar2 == null) {
            dlnmVar2 = dlnm.l;
        }
        dspd dspdVar2 = dlnmVar2.k;
        cfgd cfgdVar = cfgfVar.c;
        if (cfgdVar == null) {
            cfgdVar = cfgd.h;
        }
        dkfc bZ = dkfh.k.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkfh dkfhVar = (dkfh) bZ.b;
        dspdVar.getClass();
        int i = dkfhVar.a | 1;
        dkfhVar.a = i;
        dkfhVar.b = dspdVar;
        boolean z = cfgdVar.c;
        int i2 = i | 8;
        dkfhVar.a = i2;
        dkfhVar.e = z;
        dspdVar2.getClass();
        dkfhVar.a = i2 | 64;
        dkfhVar.j = dspdVar2;
        dspd h = h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkfh dkfhVar2 = (dkfh) bZ.b;
        h.getClass();
        int i3 = dkfhVar2.a | 2;
        dkfhVar2.a = i3;
        dkfhVar2.c = h;
        if ((cfgdVar.a & 1) != 0) {
            dspd dspdVar3 = cfgdVar.b;
            dspdVar3.getClass();
            dkfhVar2.a = i3 | 4;
            dkfhVar2.d = dspdVar3;
        }
        if ((cfgdVar.a & 4) != 0) {
            dpum dpumVar = cfgdVar.e;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkfh dkfhVar3 = (dkfh) bZ.b;
            dpumVar.getClass();
            dkfhVar3.f = dpumVar;
            dkfhVar3.a |= 16;
        }
        dcdc z2 = dcbg.b(cfgdVar.f).o(cedm.a).s(cedn.a).z();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkfh dkfhVar4 = (dkfh) bZ.b;
        dsrj<dkfg> dsrjVar = dkfhVar4.g;
        if (!dsrjVar.a()) {
            dkfhVar4.g = dsqw.cl(dsrjVar);
        }
        dsod.bv(z2, dkfhVar4.g);
        if ((cfgdVar.a & 8) != 0) {
            String str = cfgdVar.g;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkfh dkfhVar5 = (dkfh) bZ.b;
            str.getClass();
            dkfhVar5.a |= 32;
            dkfhVar5.h = str;
        }
        for (dspd dspdVar4 : cfgdVar.d) {
            dkfd bZ2 = dkfe.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkfe dkfeVar = (dkfe) bZ2.b;
            dspdVar4.getClass();
            dkfeVar.a |= 1;
            dkfeVar.b = dspdVar4;
            dkfe bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkfh dkfhVar6 = (dkfh) bZ.b;
            bK.getClass();
            dsrj<dkfe> dsrjVar2 = dkfhVar6.i;
            if (!dsrjVar2.a()) {
                dkfhVar6.i = dsqw.cl(dsrjVar2);
            }
            dkfhVar6.i.add(bK);
        }
        this.b.b(bZ.bK(), cedl.b(), this.a);
    }

    @Override // defpackage.cezu
    public final cqmj e(dspd dspdVar) {
        throw new UnsupportedOperationException("If the question header is a CustomHeader you must implement this method");
    }

    @Override // defpackage.cezu
    public final cqtd f(String str) {
        throw new UnsupportedOperationException("If custom_icon_name is specified you must implement this method");
    }
}
