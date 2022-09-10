package defpackage;
/* compiled from: PG */
/* renamed from: dcwj  reason: default package */
/* loaded from: classes5.dex */
public final class dcwj {
    public static int a(dcwa dcwaVar, dcwa dcwaVar2, dcwa dcwaVar3) {
        double d;
        double sqrt;
        dcwa dcwaVar4 = dcwaVar;
        dcwa dcwaVar5 = dcwaVar3;
        int i = 0;
        if (dcwaVar.p(dcwaVar2) || dcwaVar2.p(dcwaVar3) || dcwaVar5.p(dcwaVar4)) {
            return 0;
        }
        dcwa b = dcwa.b(dcwaVar2, dcwaVar4);
        dcwa b2 = dcwa.b(dcwaVar5, dcwaVar2);
        dcwa b3 = dcwa.b(dcwaVar4, dcwaVar5);
        double i2 = b.i();
        double i3 = b2.i();
        double i4 = b3.i();
        double d2 = dcvc.c * 3.2321d;
        if (i2 >= i3 && i2 >= i4) {
            d = -dcwa.j(dcwaVar5, b3, b2);
            sqrt = Math.sqrt(i4 * i3);
        } else if (i3 >= i4) {
            d = -dcwa.j(dcwaVar4, b, b3);
            sqrt = Math.sqrt(i2 * i4);
        } else {
            d = -dcwa.j(dcwaVar2, b2, b);
            sqrt = Math.sqrt(i3 * i2);
        }
        int c = dcwk.c(d, d2 * sqrt);
        if (c != 0) {
            return c;
        }
        dcux a = dcux.a(dcwaVar2.i, dcwaVar5.j);
        dcux a2 = dcux.a(dcwaVar2.j, dcwaVar5.i);
        dcux a3 = dcux.a(dcwaVar2.j, dcwaVar5.h);
        dcux a4 = dcux.a(dcwaVar2.h, dcwaVar5.j);
        dcux a5 = dcux.a(dcwaVar2.h, dcwaVar5.i);
        dcux a6 = dcux.a(dcwaVar2.i, dcwaVar5.h);
        double[] dArr = a.c(a2).d(dcwaVar4.h).b(a3.c(a4).d(dcwaVar4.i)).b(a5.c(a6).d(dcwaVar4.j)).a;
        int i5 = -1;
        double d3 = dArr[dArr.length - 1];
        int i6 = 1;
        if (d3 > dcyn.a) {
            i = 1;
        } else if (d3 < dcyn.a) {
            i = -1;
        }
        if (i != 0) {
            return i;
        }
        int compareTo = dcwaVar.compareTo(dcwaVar2);
        if (compareTo <= 0) {
            i5 = 1;
        }
        dcwa dcwaVar6 = compareTo > 0 ? dcwaVar4 : dcwaVar2;
        if (compareTo > 0) {
            dcwaVar4 = dcwaVar2;
        }
        if (dcwaVar6.compareTo(dcwaVar5) > 0) {
            i5 = -i5;
        } else {
            dcwa dcwaVar7 = dcwaVar6;
            dcwaVar6 = dcwaVar5;
            dcwaVar5 = dcwaVar7;
        }
        if (dcwaVar4.compareTo(dcwaVar5) > 0) {
            i5 = -i5;
            dcwa dcwaVar8 = dcwaVar5;
            dcwaVar5 = dcwaVar4;
            dcwaVar4 = dcwaVar8;
        }
        if (!dcwaVar4.p(dcwaVar4) || !dcwaVar5.p(dcwaVar5) || !dcwaVar6.p(dcwaVar6)) {
            return -i5;
        }
        dcun d4 = dcwk.d(dcwaVar4);
        dcun d5 = dcwk.d(dcwaVar5);
        dcun d6 = dcwk.d(dcwaVar6);
        dcun dcunVar = new dcun(d5.b.multiply(d6.c).subtract(d5.c.multiply(d6.b)), d5.c.multiply(d6.a).subtract(d5.a.multiply(d6.c)), d5.a.multiply(d6.b).subtract(d5.b.multiply(d6.a)));
        int signum = dcunVar.a.multiply(d4.a).add(dcunVar.b.multiply(d4.b)).add(dcunVar.c.multiply(d4.c)).signum();
        if (signum != 0) {
            return i5 * signum;
        }
        int signum2 = dcunVar.c.signum();
        if (signum2 == 0 && (signum2 = dcunVar.b.signum()) == 0) {
            int signum3 = dcunVar.a.signum();
            if (signum3 == 0 && (signum3 = d6.a.multiply(d4.b).subtract(d6.b.multiply(d4.a)).signum()) == 0 && (signum3 = d6.a.signum()) == 0 && (signum3 = -d6.b.signum()) == 0 && (signum3 = d6.c.multiply(d4.a).subtract(d6.a.multiply(d4.c)).signum()) == 0) {
                int signum4 = d6.c.signum();
                if (signum4 == 0 && (signum4 = d4.a.multiply(d5.b).subtract(d4.b.multiply(d5.a)).signum()) == 0 && (signum4 = -d5.a.signum()) == 0) {
                    int signum5 = d5.b.signum();
                    if (signum5 != 0) {
                        i6 = signum5;
                    } else {
                        int signum6 = d4.a.signum();
                        if (signum6 != 0) {
                            i6 = signum6;
                        }
                    }
                } else {
                    i6 = signum4;
                }
            } else {
                i6 = signum3;
            }
        } else {
            i6 = signum2;
        }
        return i5 * i6;
    }
}
