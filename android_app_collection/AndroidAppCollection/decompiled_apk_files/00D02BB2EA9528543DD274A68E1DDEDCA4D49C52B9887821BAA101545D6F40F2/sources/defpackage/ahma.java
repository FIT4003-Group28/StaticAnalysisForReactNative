package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahma  reason: default package */
/* loaded from: classes.dex */
public final class ahma<T> implements dzsj<T> {
    final /* synthetic */ ahmb a;
    private final int b;

    public ahma(ahmb ahmbVar, int i) {
        this.a = ahmbVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [T, buqb] */
    /* JADX WARN: Type inference failed for: r1v19, types: [buqh, T] */
    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        Object obj3;
        switch (this.b) {
            case 0:
                T t = (T) this.a.a.rx();
                dxjg.e(t);
                return t;
            case 1:
                ahmb ahmbVar = this.a;
                Object obj4 = ahmbVar.c;
                if (obj4 instanceof dxjf) {
                    synchronized (obj4) {
                        obj = ahmbVar.c;
                        if (obj instanceof dxjf) {
                            Context b = ahmbVar.a.b();
                            dxjg.e(b);
                            cqat rR = ahmbVar.a.rR();
                            dxjg.e(rR);
                            btrm rz = ahmbVar.a.rz();
                            dxjg.e(rz);
                            ahng ahngVar = new ahng(b, rR, rz);
                            dxjc.d(ahmbVar.c, ahngVar);
                            ahmbVar.c = ahngVar;
                            obj = ahngVar;
                        }
                    }
                    obj4 = obj;
                }
                return (T) ((ahng) obj4);
            case 2:
                ahmb ahmbVar2 = this.a;
                Object obj5 = ahmbVar2.d;
                if (obj5 instanceof dxjf) {
                    synchronized (obj5) {
                        obj2 = ahmbVar2.d;
                        if (obj2 instanceof dxjf) {
                            Context b2 = ahmbVar2.a.b();
                            dxjg.e(b2);
                            cqat rR2 = ahmbVar2.a.rR();
                            dxjg.e(rR2);
                            btrm rz2 = ahmbVar2.a.rz();
                            dxjg.e(rz2);
                            ahmf ahmfVar = new ahmf(b2, rR2, rz2);
                            dxjc.d(ahmbVar2.d, ahmfVar);
                            ahmbVar2.d = ahmfVar;
                            obj2 = ahmfVar;
                        }
                    }
                    obj5 = obj2;
                }
                return (T) ((ahmf) obj5);
            case 3:
                ahmb ahmbVar3 = this.a;
                Object obj6 = ahmbVar3.e;
                if (obj6 instanceof dxjf) {
                    synchronized (obj6) {
                        obj3 = ahmbVar3.e;
                        if (obj3 instanceof dxjf) {
                            Context b3 = ahmbVar3.a.b();
                            dxjg.e(b3);
                            cqat rR3 = ahmbVar3.a.rR();
                            dxjg.e(rR3);
                            btrm rz3 = ahmbVar3.a.rz();
                            dxjg.e(rz3);
                            ahmj ahmjVar = new ahmj(b3, rR3, rz3);
                            dxjc.d(ahmbVar3.e, ahmjVar);
                            ahmbVar3.e = ahmjVar;
                            obj3 = ahmjVar;
                        }
                    }
                    obj6 = obj3;
                }
                return (T) ((ahmj) obj6);
            case 4:
                T t2 = (T) this.a.a.rU();
                dxjg.e(t2);
                return t2;
            case 5:
                T t3 = (T) this.a.a.rK();
                dxjg.e(t3);
                return t3;
            case 6:
                T t4 = (T) this.a.a.b();
                dxjg.e(t4);
                return t4;
            case 7:
                T t5 = (T) this.a.a.rp();
                dxjg.e(t5);
                return t5;
            case 8:
                T t6 = (T) this.a.b.qh();
                dxjg.e(t6);
                return t6;
            case 9:
                T t7 = (T) this.a.a.rO();
                dxjg.e(t7);
                return t7;
            case 10:
                T t8 = (T) this.a.a.rz();
                dxjg.e(t8);
                return t8;
            case 11:
                T t9 = (T) this.a.a.rR();
                dxjg.e(t9);
                return t9;
            case 12:
                T t10 = (T) this.a.a.tn();
                dxjg.e(t10);
                return t10;
            case 13:
                T t11 = (T) this.a.a.ti();
                dxjg.e(t11);
                return t11;
            case 14:
                T t12 = (T) this.a.a.tr();
                dxjg.e(t12);
                return t12;
            case 15:
                ahmb ahmbVar4 = this.a;
                T t13 = (T) ahmbVar4.f;
                if (t13 != null) {
                    return t13;
                }
                dxio c = dxjc.c(ahmbVar4.e());
                bvrb tn = ahmbVar4.a.tn();
                dxjg.e(tn);
                ?? r1 = (T) new buqb(new buqa(c, tn));
                ahmbVar4.f = r1;
                return r1;
            case 16:
                T t14 = (T) this.a.a.rE();
                dxjg.e(t14);
                return t14;
            case 17:
                ahmb ahmbVar5 = this.a;
                T t15 = (T) ahmbVar5.g;
                if (t15 != null) {
                    return t15;
                }
                dxio c2 = dxjc.c(ahmbVar5.e());
                bvrb tn2 = ahmbVar5.a.tn();
                dxjg.e(tn2);
                ?? r12 = (T) new buqh(new buqg(c2, tn2));
                ahmbVar5.g = r12;
                return r12;
            case 18:
                T t16 = (T) this.a.a.rB();
                dxjg.e(t16);
                return t16;
            case 19:
                T t17 = (T) this.a.a.aL();
                dxjg.e(t17);
                return t17;
            case 20:
                T t18 = (T) this.a.a.C();
                dxjg.e(t18);
                return t18;
            case 21:
                return (T) this.a.d();
            default:
                return (T) this.a.f();
        }
    }
}
