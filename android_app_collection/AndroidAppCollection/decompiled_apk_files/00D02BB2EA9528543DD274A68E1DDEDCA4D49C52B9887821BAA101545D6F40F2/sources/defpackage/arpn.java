package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: arpn  reason: default package */
/* loaded from: classes2.dex */
public final class arpn {
    private final Context a;

    public arpn(Context context) {
        this.a = context;
    }

    @dzsi
    public final amuh a(dwbq dwbqVar, dwbo dwboVar, long j) {
        if ((dwboVar.a & 1) != 0) {
            dwaz dwazVar = (dwaz) dwbc.g.bZ();
            dvzz bZ = dwaa.g.bZ();
            dvzu dvzuVar = dwboVar.b;
            if (dvzuVar == null) {
                dvzuVar = dvzu.F;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwaa dwaaVar = (dwaa) bZ.b;
            dvzuVar.getClass();
            dwaaVar.b = dvzuVar;
            dwaaVar.a |= 1;
            if (dwazVar.c) {
                dwazVar.bF();
                dwazVar.c = false;
            }
            dwbc dwbcVar = (dwbc) dwazVar.b;
            dwaa bK = bZ.bK();
            bK.getClass();
            dwbcVar.b = bK;
            dwbcVar.a |= 1;
            amsy amsyVar = new amsy((dwbc) dwazVar.bK());
            if (amsyVar.n() == 0 || amsyVar.i() != 2) {
                return null;
            }
            amtd amtdVar = new amtd();
            dwao dwaoVar = dwbqVar.c;
            if (dwaoVar == null) {
                dwaoVar = dwao.R;
            }
            dphq dphqVar = dwaoVar.e;
            if (dphqVar == null) {
                dphqVar = dphq.m;
            }
            dqvj c = dqvj.c(dphqVar.b);
            if (c == null) {
                c = dqvj.MIXED;
            }
            amtdVar.b = c;
            amtdVar.a = amsyVar;
            amtdVar.e(amvj.e(amsyVar, this.a));
            amtdVar.g = j;
            dwao dwaoVar2 = dwbqVar.c;
            if (dwaoVar2 == null) {
                dwaoVar2 = dwao.R;
            }
            amtdVar.d(dwaoVar2);
            return amuh.g(amtdVar.a(), this.a, 0);
        }
        return null;
    }
}
