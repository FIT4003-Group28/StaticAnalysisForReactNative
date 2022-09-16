package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cvx  reason: default package */
/* loaded from: classes5.dex */
public final class cvx implements cvv {
    private final dxio<buws> a;
    private final Executor b;
    private final btvo c;
    private final dxio<ckcw> d;

    public cvx(btvo btvoVar, dxio dxioVar, dxio dxioVar2, Executor executor) {
        this.c = btvoVar;
        this.a = dxioVar;
        this.d = dxioVar2;
        this.b = executor;
    }

    private final btyo e(String str) {
        btyo btyoVar = this.a.a().a().a().d;
        dsqp dsqpVar = (dsqp) btyoVar.cu(5);
        dsqpVar.bC(btyoVar);
        btyl btylVar = (btyl) dsqpVar;
        if (btylVar.c) {
            btylVar.bF();
            btylVar.c = false;
        }
        btyo btyoVar2 = (btyo) btylVar.b;
        btyo btyoVar3 = btyo.e;
        str.getClass();
        btyoVar2.a |= 1;
        btyoVar2.b = str;
        return btylVar.bK();
    }

    private final btys f(int i) {
        btys btysVar = this.a.a().a().a().b;
        dsqp dsqpVar = (dsqp) btysVar.cu(5);
        dsqpVar.bC(btysVar);
        btyr btyrVar = (btyr) dsqpVar;
        if (btyrVar.c) {
            btyrVar.bF();
            btyrVar.c = false;
        }
        btys btysVar2 = (btys) btyrVar.b;
        btysVar2.a |= 2;
        btysVar2.c = i;
        return btyrVar.bK();
    }

    private final void g(buff buffVar, btyo btyoVar, btys btysVar, btzi<buff, bufh> btziVar) {
        buac a = this.a.a().a();
        a.d = btyoVar;
        a.c(btysVar);
        this.a.a().c().b(buffVar, btziVar, this.b);
    }

    @Override // defpackage.cvv
    public final void a(String str, @dzsi btzi<buff, bufh> btziVar) {
        g(buff.b, e(str), f(this.c.getAdsParameters().j), new cvw(this.d, btziVar));
    }

    @Override // defpackage.cvv
    public final void b(String str, btzi<buff, bufh> btziVar) {
        d(str, dbpy.a, dbpy.a, btziVar, f(this.c.getAdsParameters().i));
    }

    @Override // defpackage.cvv
    public final void c(String str, int i, int i2) {
        d(str, dbsg.i(Integer.valueOf(i)), dbsg.i(Integer.valueOf(i2)), null, f(this.c.getAdsParameters().i));
    }

    @Override // defpackage.cvv
    public final void d(String str, dbsg<Integer> dbsgVar, dbsg<Integer> dbsgVar2, @dzsi btzi<buff, bufh> btziVar, btys btysVar) {
        bufc bZ = buff.b.bZ();
        if (dbsgVar2.a()) {
            bufd bZ2 = bufe.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            bufe bufeVar = (bufe) bZ2.b;
            bufeVar.a |= 1;
            bufeVar.b = "ctype";
            String num = Integer.toString(dbsgVar2.b().intValue());
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            bufe bufeVar2 = (bufe) bZ2.b;
            num.getClass();
            bufeVar2.a |= 2;
            bufeVar2.c = num;
            bZ.a(bZ2);
        }
        if (dbsgVar.a()) {
            bufd bZ3 = bufe.d.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            bufe bufeVar3 = (bufe) bZ3.b;
            bufeVar3.a |= 1;
            bufeVar3.b = "ved";
            String a = cjrx.a(dbsgVar.b().intValue());
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            bufe bufeVar4 = (bufe) bZ3.b;
            a.getClass();
            bufeVar4.a |= 2;
            bufeVar4.c = a;
            bZ.a(bZ3);
        }
        g(bZ.bK(), e(str), btysVar, new cvw(this.d, btziVar));
    }
}
