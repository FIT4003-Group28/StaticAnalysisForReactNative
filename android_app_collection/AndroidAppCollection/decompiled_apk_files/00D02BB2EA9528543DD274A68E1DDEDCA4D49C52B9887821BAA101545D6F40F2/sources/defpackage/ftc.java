package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ftc  reason: default package */
/* loaded from: classes6.dex */
public final class ftc<T> implements dzsj<T> {
    final /* synthetic */ ftd a;
    private final int b;

    public ftc(ftd ftdVar, int i) {
        this.a = ftdVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        int i = this.b;
        if (i == 0) {
            ftd ftdVar = this.a;
            T t = (T) dcdc.h(new apmt(ftdVar.a()), new apmu(ftdVar.a()), new apmv(ftdVar.a()));
            dxjg.f(t);
            return t;
        } else if (i != 1) {
            ftd ftdVar2 = this.a;
            apmw apmwVar = new apmw(ftdVar2.b.dO());
            apmx apmxVar = new apmx(ftdVar2.b.aW(), ftdVar2.b.wk());
            gga wk = ftdVar2.b.wk();
            bwqv rD = ftdVar2.b.eW.a.rD();
            dxjg.e(rD);
            apmy apmyVar = new apmy(wk, rD);
            apmz apmzVar = new apmz(ftdVar2.b.wk(), ftdVar2.b.eW.fw());
            apna apnaVar = new apna(ftdVar2.b.aW());
            apnb apnbVar = new apnb(dxjc.c(ftdVar2.b.bh()));
            ftdVar2.c();
            ftdVar2.b.ap();
            ftdVar2.a();
            Object obj2 = ftdVar2.a;
            if (obj2 instanceof dxjf) {
                synchronized (obj2) {
                    obj = ftdVar2.a;
                    if (obj instanceof dxjf) {
                        dxjg.e(ftdVar2.b.eW.a.rz());
                        ftdVar2.b.eW.sr();
                        obj = dbpy.a;
                        dxjc.d(ftdVar2.a, obj);
                        ftdVar2.a = obj;
                    }
                }
                obj2 = obj;
            }
            dbsg dbsgVar = (dbsg) obj2;
            dccx F = dcdc.F();
            F.h(apmwVar, apmxVar, apmyVar, apmzVar, apnaVar, apnbVar);
            T t2 = (T) F.f();
            dxjg.f(t2);
            return t2;
        } else {
            bvrj.UI_THREAD.c();
            T t3 = (T) ((bwbb) this.a.b()).b;
            dxjg.f(t3);
            return t3;
        }
    }
}
