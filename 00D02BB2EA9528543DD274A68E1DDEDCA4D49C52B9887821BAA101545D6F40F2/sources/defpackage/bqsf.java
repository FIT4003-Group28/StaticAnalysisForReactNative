package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bqsf  reason: default package */
/* loaded from: classes4.dex */
public final class bqsf {
    public static final eaou a = eaou.b;

    public static bbtm a(dwfl dwflVar) {
        dfxs l = cknv.l(dwflVar);
        bbtl v = bbtm.v(dwflVar.h);
        v.b(dwflVar.g);
        v.u(l);
        dizh dizhVar = dwflVar.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dggg dgggVar = dizhVar.b;
        if (dgggVar == null) {
            dgggVar = dggg.d;
        }
        if ((dgggVar.a & 2) != 0) {
            dizh dizhVar2 = dwflVar.p;
            if (dizhVar2 == null) {
                dizhVar2 = dizh.j;
            }
            dggg dgggVar2 = dizhVar2.b;
            if (dgggVar2 == null) {
                dgggVar2 = dggg.d;
            }
            dgge b = dgge.b(dgggVar2.b);
            if (b == null) {
                b = dgge.IMAGE_UNKNOWN;
            }
            if (b.equals(dgge.MEDIA_GUESSABLE_FIFE)) {
                dizh dizhVar3 = dwflVar.p;
                if (dizhVar3 == null) {
                    dizhVar3 = dizh.j;
                }
                dggg dgggVar3 = dizhVar3.b;
                if (dgggVar3 == null) {
                    dgggVar3 = dggg.d;
                }
                v.k(dgggVar3.c);
            }
        }
        Long d = d(l);
        if (d == null && (dwflVar.a & 16384) != 0) {
            d = Long.valueOf(dwflVar.o);
        }
        v.c(d);
        return v.a();
    }

    public static bbtm b(dnwl dnwlVar) {
        dnwr dnwrVar = dnwlVar.e;
        if (dnwrVar == null) {
            dnwrVar = dnwr.c;
        }
        bbtl v = bbtm.v(dnwrVar.b);
        dfxs dfxsVar = dnwlVar.c;
        if (dfxsVar == null) {
            dfxsVar = dfxs.h;
        }
        dfwg dfwgVar = dfxsVar.d;
        if (dfwgVar == null) {
            dfwgVar = dfwg.g;
        }
        dszq dszqVar = dfwgVar.d;
        if (dszqVar == null) {
            dszqVar = dszq.c;
        }
        v.b(dszqVar.b);
        dfxs dfxsVar2 = dnwlVar.c;
        if (dfxsVar2 == null) {
            dfxsVar2 = dfxs.h;
        }
        v.c(d(dfxsVar2));
        dfxs dfxsVar3 = dnwlVar.c;
        if (dfxsVar3 == null) {
            dfxsVar3 = dfxs.h;
        }
        v.u(dfxsVar3);
        dfxs dfxsVar4 = dnwlVar.c;
        if (dfxsVar4 == null) {
            dfxsVar4 = dfxs.h;
        }
        dfwp dfwpVar = dfxsVar4.b;
        if (dfwpVar == null) {
            dfwpVar = dfwp.d;
        }
        if ((dfwpVar.a & 2) != 0) {
            dfxs dfxsVar5 = dnwlVar.c;
            if (dfxsVar5 == null) {
                dfxsVar5 = dfxs.h;
            }
            dfwp dfwpVar2 = dfxsVar5.b;
            if (dfwpVar2 == null) {
                dfwpVar2 = dfwp.d;
            }
            v.k(dfwpVar2.c);
        }
        dfxs dfxsVar6 = dnwlVar.c;
        if (dfxsVar6 == null) {
            dfxsVar6 = dfxs.h;
        }
        dfxw dfxwVar = dfxsVar6.c;
        if (dfxwVar == null) {
            dfxwVar = dfxw.f;
        }
        dfwr dfwrVar = dfxwVar.c;
        if (dfwrVar == null) {
            dfwrVar = dfwr.d;
        }
        if ((dfwrVar.a & 2) != 0) {
            v.q(Integer.valueOf(dfwrVar.c));
        }
        if ((dfwrVar.a & 1) != 0) {
            v.p(Integer.valueOf(dfwrVar.b));
        }
        v.n(0);
        return v.a();
    }

    public static dnwl c(bbtm bbtmVar) {
        dfxr dfxrVar;
        dnwk bZ = dnwl.f.bZ();
        dnwq bZ2 = dnwr.c.bZ();
        String a2 = bbtmVar.a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnwr dnwrVar = (dnwr) bZ2.b;
        a2.getClass();
        dnwrVar.a |= 1;
        dnwrVar.b = a2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnwl dnwlVar = (dnwl) bZ.b;
        dnwr bK = bZ2.bK();
        bK.getClass();
        dnwlVar.e = bK;
        dnwlVar.a |= 8192;
        String A = bbtmVar.A();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnwl dnwlVar2 = (dnwl) bZ.b;
        A.getClass();
        dnwlVar2.a |= 128;
        dnwlVar2.d = A;
        dfxs B = bbtmVar.B();
        if (B == null) {
            dfxrVar = dfxs.h.bZ();
        } else {
            dsqp dsqpVar = (dsqp) B.cu(5);
            dsqpVar.bC(B);
            dfxrVar = (dfxr) dsqpVar;
        }
        dbsg<String> l = bbtmVar.l();
        if (l.a()) {
            String b = l.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnwl dnwlVar3 = (dnwl) bZ.b;
            b.getClass();
            dnwlVar3.a |= 128;
            dnwlVar3.d = b;
            dfwo bZ3 = dfwp.d.bZ();
            dfwn dfwnVar = dfwn.MEDIA_GUESSABLE_FIFE;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dfwp dfwpVar = (dfwp) bZ3.b;
            dfwpVar.b = dfwnVar.l;
            dfwpVar.a |= 1;
            String b2 = l.b();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dfwp dfwpVar2 = (dfwp) bZ3.b;
            b2.getClass();
            dfwpVar2.a |= 2;
            dfwpVar2.c = b2;
            if (dfxrVar.c) {
                dfxrVar.bF();
                dfxrVar.c = false;
            }
            dfxs dfxsVar = (dfxs) dfxrVar.b;
            dfwp bK2 = bZ3.bK();
            bK2.getClass();
            dfxsVar.b = bK2;
            dfxsVar.a |= 2;
        }
        Long b3 = bbtmVar.b();
        if (b3 != null) {
            dfwj bZ4 = dfwk.d.bZ();
            eaou eaouVar = a;
            eaol d = new eaol(b3, eaouVar).d(eaouVar);
            dfwd bZ5 = dfwe.j.bZ();
            int d2 = d.b.O().d(d.a);
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dfwe dfweVar = (dfwe) bZ5.b;
            dfweVar.a |= 1;
            dfweVar.b = d2;
            int z = d.z();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dfwe dfweVar2 = (dfwe) bZ5.b;
            dfweVar2.a |= 2;
            dfweVar2.c = z;
            int A2 = d.A();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dfwe dfweVar3 = (dfwe) bZ5.b;
            dfweVar3.a |= 4;
            dfweVar3.d = A2;
            int C = d.C();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dfwe dfweVar4 = (dfwe) bZ5.b;
            dfweVar4.a |= 8;
            dfweVar4.e = C;
            int D = d.D();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dfwe dfweVar5 = (dfwe) bZ5.b;
            dfweVar5.a |= 16;
            dfweVar5.f = D;
            int micros = ((int) TimeUnit.SECONDS.toMicros(d.E())) + ((int) TimeUnit.MILLISECONDS.toMicros(d.b.m().d(d.a)));
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dfwe dfweVar6 = (dfwe) bZ5.b;
            int i = dfweVar6.a | 32;
            dfweVar6.a = i;
            dfweVar6.g = micros;
            dfweVar6.a = i | 64;
            dfweVar6.h = 0.001f;
            dfwe bK3 = bZ5.bK();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dfwk dfwkVar = (dfwk) bZ4.b;
            bK3.getClass();
            dfwkVar.b = bK3;
            dfwkVar.a |= 64;
            if (dfxrVar.c) {
                dfxrVar.bF();
                dfxrVar.c = false;
            }
            dfxs dfxsVar2 = (dfxs) dfxrVar.b;
            dfwk bK4 = bZ4.bK();
            bK4.getClass();
            dfxsVar2.g = bK4;
            dfxsVar2.a |= 32;
        }
        if (!dbsj.d(bbtmVar.e())) {
            dfwg dfwgVar = ((dfxs) dfxrVar.b).d;
            if (dfwgVar == null) {
                dfwgVar = dfwg.g;
            }
            dsqp dsqpVar2 = (dsqp) dfwgVar.cu(5);
            dsqpVar2.bC(dfwgVar);
            dfwf dfwfVar = (dfwf) dsqpVar2;
            dszp bZ6 = dszq.c.bZ();
            String e = bbtmVar.e();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dszq dszqVar = (dszq) bZ6.b;
            e.getClass();
            dszqVar.a |= 1;
            dszqVar.b = e;
            if (dfwfVar.c) {
                dfwfVar.bF();
                dfwfVar.c = false;
            }
            dfwg dfwgVar2 = (dfwg) dfwfVar.b;
            dszq bK5 = bZ6.bK();
            bK5.getClass();
            dfwgVar2.d = bK5;
            dfwgVar2.a |= 8;
            if (dfxrVar.c) {
                dfxrVar.bF();
                dfxrVar.c = false;
            }
            dfxs dfxsVar3 = (dfxs) dfxrVar.b;
            dfwg bK6 = dfwfVar.bK();
            bK6.getClass();
            dfxsVar3.d = bK6;
            dfxsVar3.a |= 8;
        }
        dbsg<Integer> C2 = bbtmVar.C();
        dbsg<Integer> D2 = bbtmVar.D();
        if (C2.a() || D2.a()) {
            dfwq bZ7 = dfwr.d.bZ();
            if (C2.a()) {
                int intValue = C2.b().intValue();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dfwr dfwrVar = (dfwr) bZ7.b;
                dfwrVar.a |= 2;
                dfwrVar.c = intValue;
            }
            if (D2.a()) {
                int intValue2 = D2.b().intValue();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dfwr dfwrVar2 = (dfwr) bZ7.b;
                dfwrVar2.a |= 1;
                dfwrVar2.b = intValue2;
            }
            dfxw dfxwVar = ((dfxs) dfxrVar.b).c;
            if (dfxwVar == null) {
                dfxwVar = dfxw.f;
            }
            dsqp dsqpVar3 = (dsqp) dfxwVar.cu(5);
            dsqpVar3.bC(dfxwVar);
            dfxv dfxvVar = (dfxv) dsqpVar3;
            if (dfxvVar.c) {
                dfxvVar.bF();
                dfxvVar.c = false;
            }
            dfxw dfxwVar2 = (dfxw) dfxvVar.b;
            dfwr bK7 = bZ7.bK();
            bK7.getClass();
            dfxwVar2.c = bK7;
            dfxwVar2.a |= 8;
            if (dfxrVar.c) {
                dfxrVar.bF();
                dfxrVar.c = false;
            }
            dfxs dfxsVar4 = (dfxs) dfxrVar.b;
            dfxw bK8 = dfxvVar.bK();
            bK8.getClass();
            dfxsVar4.c = bK8;
            dfxsVar4.a |= 4;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnwl dnwlVar4 = (dnwl) bZ.b;
        dfxs bK9 = dfxrVar.bK();
        bK9.getClass();
        dnwlVar4.c = bK9;
        dnwlVar4.a |= 8;
        return bZ.bK();
    }

    @dzsi
    private static Long d(dfxs dfxsVar) {
        eaol eaolVar;
        int i;
        dfwk dfwkVar = dfxsVar.g;
        if (dfwkVar == null) {
            dfwkVar = dfwk.d;
        }
        if ((dfwkVar.a & 64) != 0) {
            dfwk dfwkVar2 = dfxsVar.g;
            if (dfwkVar2 == null) {
                dfwkVar2 = dfwk.d;
            }
            dfwe dfweVar = dfwkVar2.b;
            if (dfweVar == null) {
                dfweVar = dfwe.j;
            }
            int i2 = dfweVar.c;
            if (i2 <= 0 || i2 > 12 || (i = dfweVar.d) <= 0 || i > 31 || dfweVar.e >= 24 || dfweVar.f >= 60) {
                eaolVar = null;
            } else {
                int seconds = (int) TimeUnit.MICROSECONDS.toSeconds(dfweVar.g);
                eaolVar = new eaol(dfweVar.b, dfweVar.c, dfweVar.d, dfweVar.e, dfweVar.f, seconds, ((int) TimeUnit.MICROSECONDS.toMillis(dfweVar.g)) - ((int) TimeUnit.SECONDS.toMillis(seconds)), a);
            }
            if (eaolVar != null) {
                return Long.valueOf(eaolVar.a);
            }
        }
        return null;
    }
}
