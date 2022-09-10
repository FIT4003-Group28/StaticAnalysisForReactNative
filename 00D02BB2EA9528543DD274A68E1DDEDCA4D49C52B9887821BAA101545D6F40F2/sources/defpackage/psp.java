package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: psp  reason: default package */
/* loaded from: classes7.dex */
public final class psp {
    @dzsi
    public static amvq a(amsz amszVar, Context context) {
        if (!f(amszVar, context)) {
            return null;
        }
        amte amteVar = amszVar.a;
        dbsk.s(amteVar);
        amub b = amteVar.b(amszVar.b, context);
        dbsk.s(b);
        akqq S = b.x().get(amszVar.c - 1).b(0).S();
        return new amvq(S.a, S.b);
    }

    public static List<amvh> b(dcdc<amvh> dcdcVar) {
        ArrayList arrayList = new ArrayList();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            amvh amvhVar = dcdcVar.get(i);
            if (!amvhVar.a()) {
                arrayList.add(amvhVar);
            }
        }
        return arrayList;
    }

    public static boolean c(dwao dwaoVar, dwao dwaoVar2) {
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        boolean z = dowrVar.b;
        dowr dowrVar2 = dwaoVar2.g;
        if (dowrVar2 == null) {
            dowrVar2 = dowr.m;
        }
        if (z == dowrVar2.b) {
            dowr dowrVar3 = dwaoVar.g;
            if (dowrVar3 == null) {
                dowrVar3 = dowr.m;
            }
            boolean z2 = dowrVar3.c;
            dowr dowrVar4 = dwaoVar2.g;
            if (dowrVar4 == null) {
                dowrVar4 = dowr.m;
            }
            return z2 == dowrVar4.c && dwaoVar.o == dwaoVar2.o;
        }
        return false;
    }

    public static boolean d(List<amvh> list, List<amvh> list2) {
        if (list.size() == list2.size()) {
            for (int i = 0; i < list.size(); i++) {
                amvh amvhVar = list.get(i);
                amvh amvhVar2 = list2.get(i);
                if (amvhVar.b == amvhVar2.b && dbsd.a(amvhVar.d, amvhVar2.d)) {
                    akqq akqqVar = amvhVar.e;
                    akqq akqqVar2 = amvhVar2.e;
                    double d = amvhVar.b == dpjs.ENTITY_TYPE_MY_LOCATION ? 10.0d : 1.0d;
                    if (akqqVar != null && akqqVar2 != null && akqq.v(akqqVar, akqqVar2, d)) {
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @dzsi
    public static dodt e(amsz amszVar, Context context) {
        dpec b;
        if (f(amszVar, context)) {
            amte amteVar = amszVar.a;
            dbsk.s(amteVar);
            amub b2 = amteVar.b(amszVar.b, context);
            dbsk.s(b2);
            int i = amszVar.c - 1;
            akrk d = b2.x().get(i).d();
            akqq w = d.m(d.l() - 1).S().w(d.m(0).S());
            douc bZ = doud.c.bZ();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < d.l()) {
                akra m = d.m(i2);
                int j = m.j();
                int n = m.n();
                bZ.a(j - i3);
                bZ.b(n - i4);
                i2++;
                i4 = n;
                i3 = j;
            }
            doud bK = bZ.bK();
            dsqp dsqpVar = (dsqp) bK.cu(5);
            dsqpVar.bC(bK);
            douc doucVar = (douc) dsqpVar;
            doucVar.c();
            doucVar.d();
            doud bK2 = doucVar.bK();
            dodq bZ2 = dodr.i.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dodr dodrVar = (dodr) bZ2.b;
            bK2.getClass();
            dodrVar.b = bK2;
            dodrVar.a |= 1;
            dodo bZ3 = dodp.d.bZ();
            dnoh g = w.g();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dodp dodpVar = (dodp) bZ3.b;
            g.getClass();
            dodpVar.b = g;
            dodpVar.a |= 1;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dodr dodrVar2 = (dodr) bZ2.b;
            dodp bK3 = bZ3.bK();
            bK3.getClass();
            dodrVar2.b();
            dodrVar2.c.add(bK3);
            dnoh g2 = new akqq(dcyn.a, dcyn.a).g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dodr dodrVar3 = (dodr) bZ2.b;
            g2.getClass();
            dodrVar3.d = g2;
            dodrVar3.a |= 2;
            amsy amsyVar = amteVar.a;
            amve m2 = amsyVar.m(amszVar.b);
            if (m2.e() > 1) {
                b = m2.d(i).a();
            } else {
                b = m2.b();
            }
            if ((b.a & 8) != 0) {
                dgas dgasVar = b.e;
                if (dgasVar == null) {
                    dgasVar = dgas.e;
                }
                int i5 = dgasVar.b;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dodr dodrVar4 = (dodr) bZ2.b;
                dodrVar4.a |= 4;
                dodrVar4.e = i5;
            }
            if ((b.a & 256) != 0) {
                doxd doxdVar = b.k;
                if (doxdVar == null) {
                    doxdVar = doxd.l;
                }
                if ((doxdVar.a & 1) != 0) {
                    doxd doxdVar2 = b.k;
                    if (doxdVar2 == null) {
                        doxdVar2 = doxd.l;
                    }
                    dgas dgasVar2 = doxdVar2.b;
                    if (dgasVar2 == null) {
                        dgasVar2 = dgas.e;
                    }
                    int i6 = dgasVar2.b;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dodr dodrVar5 = (dodr) bZ2.b;
                    dodrVar5.a |= 8;
                    dodrVar5.f = i6;
                }
            }
            if ((b.a & 4) != 0) {
                dowb dowbVar = b.d;
                if (dowbVar == null) {
                    dowbVar = dowb.d;
                }
                if ((dowbVar.a & 1) != 0) {
                    dowb dowbVar2 = b.d;
                    if (dowbVar2 == null) {
                        dowbVar2 = dowb.d;
                    }
                    int i7 = dowbVar2.b;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dodr dodrVar6 = (dodr) bZ2.b;
                    dodrVar6.a |= 16;
                    dodrVar6.g = i7;
                }
            }
            if (amsyVar.r()) {
                dspd x = dspd.x(amsyVar.q());
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dodr dodrVar7 = (dodr) bZ2.b;
                x.getClass();
                dodrVar7.a |= 32;
                dodrVar7.h = x;
            }
            dodn bZ4 = dodt.h.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dodt dodtVar = (dodt) bZ4.b;
            dodr bK4 = bZ2.bK();
            bK4.getClass();
            dodtVar.c = bK4;
            dodtVar.b = 2;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dodt dodtVar2 = (dodt) bZ4.b;
            dodtVar2.a |= 4;
            dodtVar2.d = false;
            dodt dodtVar3 = (dodt) bZ4.b;
            dodtVar3.e = 2;
            dodtVar3.a |= 8;
            return bZ4.bK();
        }
        return null;
    }

    private static boolean f(amsz amszVar, Context context) {
        amte amteVar = amszVar.a;
        return amteVar != null && amszVar.c() && amszVar.d == amvi.INSERT && amteVar.b(amszVar.b, context) != null;
    }
}
