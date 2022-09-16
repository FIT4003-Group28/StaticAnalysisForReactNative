package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abdi  reason: default package */
/* loaded from: classes2.dex */
public final class abdi implements abdb {
    private final btpc a;
    private final Executor b;
    private final buoi c;

    public abdi(btpc btpcVar, Executor executor, buoi buoiVar) {
        this.a = btpcVar;
        this.b = executor;
        this.c = buoiVar;
    }

    @Override // defpackage.abdb
    public final dehn<dhpd> a(String str, abcx abcxVar) {
        final deig d = deig.d();
        dhow bZ = dhoz.c.bZ();
        dhox bZ2 = dhoy.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhoy dhoyVar = (dhoy) bZ2.b;
        dhoyVar.b = 1;
        dhoyVar.a |= 1;
        dqpi bZ3 = dqpj.f.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dqpj dqpjVar = (dqpj) bZ3.b;
        str.getClass();
        int i = dqpjVar.a | 2;
        dqpjVar.a = i;
        dqpjVar.c = str;
        String str2 = abcxVar.f;
        str2.getClass();
        int i2 = 1 | i;
        dqpjVar.a = i2;
        dqpjVar.b = str2;
        String str3 = abcxVar.h;
        str3.getClass();
        int i3 = i2 | 8;
        dqpjVar.a = i3;
        dqpjVar.e = str3;
        String str4 = abcxVar.g;
        str4.getClass();
        dqpjVar.a = i3 | 4;
        dqpjVar.d = str4;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhoy dhoyVar2 = (dhoy) bZ2.b;
        dqpj bK = bZ3.bK();
        bK.getClass();
        dhoyVar2.c = bK;
        dhoyVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhoz dhozVar = (dhoz) bZ.b;
        dhoy bK2 = bZ2.bK();
        bK2.getClass();
        dhozVar.b = bK2;
        dhozVar.a |= 2;
        dhoz bK3 = bZ.bK();
        if (!this.a.i()) {
            d.k(new btzz(btzy.k));
            return d;
        }
        final btzc b = this.c.b(bK3, new abdh(d), this.b);
        d.Pk(new Runnable(d, b) { // from class: abdg
            private final deig a;
            private final btzc b;

            {
                this.a = d;
                this.b = b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                deig deigVar = this.a;
                btzc btzcVar = this.b;
                if (deigVar.isCancelled()) {
                    btzcVar.a();
                }
            }
        }, this.b);
        return d;
    }
}
