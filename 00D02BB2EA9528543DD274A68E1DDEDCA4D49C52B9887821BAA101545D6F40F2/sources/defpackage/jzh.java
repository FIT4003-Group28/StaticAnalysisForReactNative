package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jzh  reason: default package */
/* loaded from: classes7.dex */
public final class jzh<T> implements dzsj<T> {
    final /* synthetic */ jzi a;
    private final int b;

    public jzh(jzi jziVar, int i) {
        this.a = jziVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bvsl, T] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                T t = (T) this.a.a.a();
                dxjg.e(t);
                return t;
            case 1:
                jzi jziVar = this.a;
                T t2 = (T) jziVar.c;
                if (t2 != null) {
                    return t2;
                }
                Application a = jziVar.a.a();
                dxjg.e(a);
                bvjj rB = jziVar.a.rB();
                dxjg.e(rB);
                ?? r2 = (T) new bvsl(a, rB);
                jziVar.c = r2;
                return r2;
            case 2:
                T t3 = (T) this.a.b.qp();
                dxjg.e(t3);
                return t3;
            case 3:
                T t4 = (T) this.a.a.rR();
                dxjg.e(t4);
                return t4;
            case 4:
                T t5 = (T) this.a.a.sV();
                dxjg.e(t5);
                return t5;
            case 5:
                T t6 = (T) this.a.b.wf();
                dxjg.e(t6);
                return t6;
            case 6:
                T t7 = (T) this.a.a.rp();
                dxjg.e(t7);
                return t7;
            case 7:
                T t8 = (T) this.a.b.qn();
                dxjg.e(t8);
                return t8;
            case 8:
                T t9 = (T) this.a.a.C();
                dxjg.e(t9);
                return t9;
            case 9:
                T t10 = (T) this.a.a.e();
                dxjg.e(t10);
                return t10;
            case 10:
                T t11 = (T) this.a.b.qo();
                dxjg.e(t11);
                return t11;
            case 11:
                T t12 = (T) this.a.a.tr();
                dxjg.e(t12);
                return t12;
            case 12:
                T t13 = (T) this.a.a.tp();
                dxjg.e(t13);
                return t13;
            case 13:
                T t14 = (T) this.a.b.qF();
                dxjg.e(t14);
                return t14;
            case 14:
                T t15 = (T) this.a.b.qv();
                dxjg.e(t15);
                return t15;
            case 15:
                T t16 = (T) this.a.b.qG();
                dxjg.e(t16);
                return t16;
            case 16:
                T t17 = (T) this.a.b.rn();
                dxjg.e(t17);
                return t17;
            case 17:
                T t18 = (T) this.a.a.rz();
                dxjg.e(t18);
                return t18;
            case 18:
                T t19 = (T) this.a.a.rB();
                dxjg.e(t19);
                return t19;
            case 19:
                T t20 = (T) this.a.a.tn();
                dxjg.e(t20);
                return t20;
            case 20:
                jzi jziVar2 = this.a;
                Application a2 = jziVar2.a.a();
                dxjg.e(a2);
                dzsj dzsjVar = jziVar2.d;
                if (dzsjVar == null) {
                    dzsjVar = new jzh(jziVar2, 21);
                    jziVar2.d = dzsjVar;
                }
                dxio c = dxjc.c(dzsjVar);
                ckcw rU = jziVar2.a.rU();
                dxjg.e(rU);
                bvsf qQ = jziVar2.b.qQ();
                dxjg.e(qQ);
                cqat rR = jziVar2.a.rR();
                dxjg.e(rR);
                btpc sz = jziVar2.a.sz();
                dxjg.e(sz);
                vtn qa = jziVar2.b.qa();
                dxjg.e(qa);
                buow qx = jziVar2.b.qx();
                dxjg.e(qx);
                btpc sz2 = jziVar2.a.sz();
                dxjg.e(sz2);
                bvrb tn = jziVar2.a.tn();
                dxjg.e(tn);
                vly vlyVar = new vly(sz2, tn);
                Executor sV = jziVar2.a.sV();
                dxjg.e(sV);
                vmy vmyVar = new vmy(qx, vlyVar, sV);
                avnt qI = jziVar2.b.qI();
                dxjg.e(qI);
                dxjg.e(jziVar2.a.C());
                dbsg<dzsj<qbl>> qb = jziVar2.b.qb();
                dxjg.e(qb);
                vmg vmgVar = new vmg(qb);
                btrm rz = jziVar2.a.rz();
                dxjg.e(rz);
                ahjq wf = jziVar2.b.wf();
                dxjg.e(wf);
                dxio c2 = dxjc.c(jziVar2.c());
                bvrb tn2 = jziVar2.a.tn();
                dxjg.e(tn2);
                cjqy tr = jziVar2.a.tr();
                dxjg.e(tr);
                vwv qw = jziVar2.b.qw();
                dxjg.e(qw);
                Executor sV2 = jziVar2.a.sV();
                dxjg.e(sV2);
                vva d = jziVar2.d();
                dzsj dzsjVar2 = jziVar2.e;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new jzh(jziVar2, 23);
                    jziVar2.e = dzsjVar2;
                }
                return (T) new srv(a2, c, rU, qQ, rR, sz, qa, vmyVar, qI, vmgVar, rz, wf, c2, tn2, tr, qw, sV2, d, dxjc.c(dzsjVar2));
            case 21:
                T t21 = (T) this.a.b.pX();
                dxjg.e(t21);
                return t21;
            case 22:
                T t22 = (T) this.a.b.ve();
                dxjg.e(t22);
                return t22;
            case 23:
                T t23 = (T) this.a.b.vi();
                dxjg.e(t23);
                return t23;
            case 24:
                T t24 = (T) this.a.b.qQ();
                dxjg.e(t24);
                return t24;
            case 25:
                return (T) this.a.d();
            case 26:
                T t25 = (T) this.a.b.vr();
                dxjg.e(t25);
                return t25;
            case 27:
                T t26 = (T) this.a.b.rl();
                dxjg.e(t26);
                return t26;
            default:
                T t27 = (T) this.a.b.vs();
                dxjg.e(t27);
                return t27;
        }
    }
}
