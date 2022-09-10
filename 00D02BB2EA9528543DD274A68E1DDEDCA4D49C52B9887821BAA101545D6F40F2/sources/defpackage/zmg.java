package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: zmg  reason: default package */
/* loaded from: classes7.dex */
public final class zmg implements zfo {
    private final Context a;
    private final amtr[] b;

    public zmg(Context context, amtr... amtrVarArr) {
        this.a = context;
        this.b = amtrVarArr;
    }

    @dzsi
    private final String f(bvsz bvszVar) {
        dgas W = vyb.W(this.b);
        if (W == null) {
            return null;
        }
        return bvtb.c(this.a.getResources(), W, bvszVar).toString();
    }

    @Override // defpackage.zfo
    @dzsi
    public final String a() {
        return f(bvsz.ABBREVIATED);
    }

    @Override // defpackage.zfo
    @dzsi
    public final String b() {
        return f(bvsz.EXTENDED);
    }

    @Override // defpackage.zfo
    @dzsi
    public final String c() {
        int i;
        bvsz bvszVar = bvsz.EXTENDED;
        int i2 = 0;
        for (amtr amtrVar : this.b) {
            dpec a = amtrVar.a();
            dqvj c = dqvj.c(a.b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            if (vxx.i(c)) {
                i = vxp.f(a);
                if (i < 0) {
                    return null;
                }
            } else {
                dgas dgasVar = a.e;
                if (dgasVar == null) {
                    dgasVar = dgas.e;
                }
                i = dgasVar.b;
            }
            i2 += i;
        }
        return vxp.g(this.a, i2, bvszVar);
    }

    @Override // defpackage.zfo
    @dzsi
    public final String d() {
        amtr[] amtrVarArr;
        int i = 0;
        for (amtr amtrVar : this.b) {
            dowb dowbVar = amtrVar.a().d;
            if (dowbVar == null) {
                dowbVar = dowb.d;
            }
            if ((dowbVar.a & 1) == 0) {
                return null;
            }
            dowb dowbVar2 = amtrVar.a().d;
            if (dowbVar2 == null) {
                dowbVar2 = dowb.d;
            }
            i += dowbVar2.b;
        }
        dowb dowbVar3 = this.b[0].a().d;
        if (dowbVar3 == null) {
            dowbVar3 = dowb.d;
        }
        dowa b = dowa.b(dowbVar3.c);
        if (b == null) {
            b = dowa.REGIONAL;
        }
        dovy bZ = dowb.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dowb dowbVar4 = (dowb) bZ.b;
        int i2 = dowbVar4.a | 1;
        dowbVar4.a = i2;
        dowbVar4.b = i;
        dowbVar4.c = b.e;
        dowbVar4.a = i2 | 4;
        return zba.c(bZ.bK());
    }

    @Override // defpackage.zfo
    public final Boolean e() {
        return Boolean.FALSE;
    }
}
