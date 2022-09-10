package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alty  reason: default package */
/* loaded from: classes.dex */
public final class alty<T> implements dzsj<T> {
    final /* synthetic */ altz a;
    private final int b;

    public alty(altz altzVar, int i) {
        this.a = altzVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                T t = (T) this.a.a.sg();
                dxjg.e(t);
                return t;
            case 1:
                return (T) this.a.i();
            case 2:
                T t2 = (T) this.a.a.si();
                dxjg.e(t2);
                return t2;
            case 3:
                T t3 = (T) this.a.a.sd();
                dxjg.e(t3);
                return t3;
            case 4:
                return (T) this.a.b();
            case 5:
                altz altzVar = this.a;
                Resources rI = altzVar.a.rI();
                dxjg.e(rI);
                Context context = altzVar.b;
                cqat rR = altzVar.a.rR();
                dxjg.e(rR);
                bvnx rS = altzVar.a.rS();
                dxjg.e(rS);
                bnsn b = altzVar.b();
                dxjg.e(altzVar.a.rY());
                alyx g = altzVar.d.g();
                dxjg.e(g);
                cjvm j = altzVar.j();
                amqu rT = altzVar.a.rT();
                dxjg.e(rT);
                dehq tf = altzVar.a.tf();
                dxjg.e(tf);
                btrm rL = altzVar.a.rL();
                dxjg.e(rL);
                ckcw rU = altzVar.a.rU();
                dxjg.e(rU);
                return (T) new amyd(rI, context, rR, rS, b, g, j, rT, tf, rL, rU, dxjc.c(altzVar.p()));
            case 6:
                return (T) this.a.a();
            case 7:
                T t4 = (T) this.a.a.sD();
                dxjg.e(t4);
                return t4;
            case 8:
                return (T) this.a.q();
            case 9:
                T t5 = (T) this.a.d.g();
                dxjg.e(t5);
                return t5;
            default:
                T t6 = (T) this.a.c.c();
                dxjg.e(t6);
                return t6;
        }
    }
}
