package defpackage;
/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* compiled from: PG */
/* renamed from: dcwz  reason: default package */
/* loaded from: classes5.dex */
public enum dcwz {
    S2_LINEAR_PROJECTION(4.0d / (r1 * 3.0d), 4.0d, 1.0d, 2.0d, r11, 1.4114593458444569d, (r5 + r5) / 3.0d, 1.4400341929556038d, (r7 + r7) / 3.0d, r9 + r9, 2.0318178664188125d),
    S2_TAN_PROJECTION(9.869604401089358d / (r1 * 4.0d), 2.4674011002723395d, 1.5707963267948966d, 1.5707963267948966d, 3.141592653589793d / (r3 + r3), 1.4373186389251609d, 3.141592653589793d / (r5 + r5), 1.4616670325467394d, (Math.sqrt(2.0d) * 3.141592653589793d) / 3.0d, Math.sqrt(0.6666666666666666d) * 3.141592653589793d, 2.0636231971956356d),
    S2_QUADRATIC_PROJECTION((r2 * 8.0d) / 9.0d, 2.6357992569631614d, 1.3333333333333333d, 1.7048971791992185d, (r4 + r4) / 3.0d, 1.4345236728860995d, (r6 + r6) / 3.0d, 1.4592137463861061d, (Math.sqrt(2.0d) * 8.0d) / 9.0d, 2.438654594434021d, 2.0604227389984717d);
    
    public static final dcwz f;
    private static final dcwa[][] g;
    private static final dcwx[] h;
    private static final dcwy[] i;
    public final dcvb d;
    public final dcvb e;

    static {
        Math.sqrt(3.0d);
        Math.sqrt(0.6666666666666666d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        Math.sqrt(2.0d);
        dcwz dcwzVar = S2_QUADRATIC_PROJECTION;
        g = new dcwa[][]{new dcwa[]{dcwa.d, dcwa.f, dcwa.b}, new dcwa[]{dcwa.c, dcwa.f, dcwa.d}, new dcwa[]{dcwa.c, dcwa.e, dcwa.f}, new dcwa[]{dcwa.g, dcwa.e, dcwa.c}, new dcwa[]{dcwa.g, dcwa.b, dcwa.e}, new dcwa[]{dcwa.d, dcwa.b, dcwa.g}};
        h = new dcwx[]{new dcwx() { // from class: dcwr
            @Override // defpackage.dcwx
            public final double a(double d, double d2, double d3) {
                return d2 / d;
            }

            @Override // defpackage.dcwx
            public final double b(double d, double d2, double d3) {
                return d3 / d;
            }
        }, new dcwx() { // from class: dcws
            @Override // defpackage.dcwx
            public final double a(double d, double d2, double d3) {
                return (-d) / d2;
            }

            @Override // defpackage.dcwx
            public final double b(double d, double d2, double d3) {
                return d3 / d2;
            }
        }, new dcwx() { // from class: dcwt
            @Override // defpackage.dcwx
            public final double a(double d, double d2, double d3) {
                return (-d) / d3;
            }

            @Override // defpackage.dcwx
            public final double b(double d, double d2, double d3) {
                return (-d2) / d3;
            }
        }, new dcwx() { // from class: dcwu
            @Override // defpackage.dcwx
            public final double a(double d, double d2, double d3) {
                return d3 / d;
            }

            @Override // defpackage.dcwx
            public final double b(double d, double d2, double d3) {
                return d2 / d;
            }
        }, new dcwx() { // from class: dcwv
            @Override // defpackage.dcwx
            public final double a(double d, double d2, double d3) {
                return d3 / d2;
            }

            @Override // defpackage.dcwx
            public final double b(double d, double d2, double d3) {
                return (-d) / d2;
            }
        }, new dcwx() { // from class: dcww
            @Override // defpackage.dcwx
            public final double a(double d, double d2, double d3) {
                return (-d2) / d3;
            }

            @Override // defpackage.dcwx
            public final double b(double d, double d2, double d3) {
                return (-d) / d3;
            }
        }};
        i = new dcwy[]{new dcwy() { // from class: dcwl
            @Override // defpackage.dcwy
            public final double a(double d, double d2) {
                return 1.0d;
            }

            @Override // defpackage.dcwy
            public final double b(double d, double d2) {
                return d;
            }

            @Override // defpackage.dcwy
            public final double c(double d, double d2) {
                return d2;
            }
        }, new dcwy() { // from class: dcwm
            @Override // defpackage.dcwy
            public final double a(double d, double d2) {
                return -d;
            }

            @Override // defpackage.dcwy
            public final double b(double d, double d2) {
                return 1.0d;
            }

            @Override // defpackage.dcwy
            public final double c(double d, double d2) {
                return d2;
            }
        }, new dcwy() { // from class: dcwn
            @Override // defpackage.dcwy
            public final double a(double d, double d2) {
                return -d;
            }

            @Override // defpackage.dcwy
            public final double b(double d, double d2) {
                return -d2;
            }

            @Override // defpackage.dcwy
            public final double c(double d, double d2) {
                return 1.0d;
            }
        }, new dcwy() { // from class: dcwo
            @Override // defpackage.dcwy
            public final double a(double d, double d2) {
                return -1.0d;
            }

            @Override // defpackage.dcwy
            public final double b(double d, double d2) {
                return -d2;
            }

            @Override // defpackage.dcwy
            public final double c(double d, double d2) {
                return -d;
            }
        }, new dcwy() { // from class: dcwp
            @Override // defpackage.dcwy
            public final double a(double d, double d2) {
                return d2;
            }

            @Override // defpackage.dcwy
            public final double b(double d, double d2) {
                return -1.0d;
            }

            @Override // defpackage.dcwy
            public final double c(double d, double d2) {
                return -d;
            }
        }, new dcwy() { // from class: dcwq
            @Override // defpackage.dcwy
            public final double a(double d, double d2) {
                return d2;
            }

            @Override // defpackage.dcwy
            public final double b(double d, double d2) {
                return d;
            }

            @Override // defpackage.dcwy
            public final double c(double d, double d2) {
                return -1.0d;
            }
        }};
        f = dcwzVar;
    }

    dcwz(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        new dcvb(2, d);
        new dcvb(2, d2);
        new dcvb(2, 2.0943951023931953d);
        new dcvb(1, d3);
        new dcvb(1, d4);
        new dcvb(1, 1.5707963267948966d);
        this.d = new dcvb(1, d5);
        new dcvb(1, d4);
        new dcvb(1, d6);
        new dcvb(1, d7);
        new dcvb(1, d4);
        this.e = new dcvb(1, d8);
        new dcvb(1, d9);
        new dcvb(1, d10);
        new dcvb(1, d11);
    }

    public static int b(double d) {
        return Math.max(0, Math.min(1073741823, (int) Math.round((d * 1.073741824E9d) - 0.5d)));
    }

    public static double d(long j2) {
        double d = j2;
        Double.isNaN(d);
        return d * 4.6566128730773926E-10d;
    }

    public static dcwa f(int i2, double d, double d2) {
        dcwy g2 = g(i2);
        return new dcwa(g2.a(d, d2), g2.b(d, d2), g2.c(d, d2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcwy g(int i2) {
        return i[Math.min(5, i2)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(int i2, dcwa dcwaVar, dcuw dcuwVar) {
        dcwx j2 = j(i2);
        dcuwVar.a(j2.a(dcwaVar.h, dcwaVar.i, dcwaVar.j), j2.b(dcwaVar.h, dcwaVar.i, dcwaVar.j));
    }

    public static dcwx j(int i2) {
        return h[i2];
    }

    public static int m(dcwa dcwaVar) {
        return n(dcwaVar.h, dcwaVar.i, dcwaVar.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(double d, double d2, double d3) {
        int m = dcwa.m(d, d2, d3);
        return m != 0 ? m != 1 ? d3 < dcyn.a ? 5 : 2 : d2 < dcyn.a ? 4 : 1 : d < dcyn.a ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcwa o(int i2, int i3) {
        return g[i2][i3];
    }

    public final double a(double d) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                double tan = Math.tan((d * 1.5707963267948966d) - 0.7853981633974483d);
                return tan + (1.1102230246251565E-16d * tan);
            } else if (ordinal != 2) {
                throw null;
            } else {
                if (d >= 0.5d) {
                    return (((4.0d * d) * d) - 1.0d) * 0.3333333333333333d;
                }
                double d2 = 1.0d - d;
                return (1.0d - ((4.0d * d2) * d2)) * 0.3333333333333333d;
            }
        }
        return (d + d) - 1.0d;
    }

    public final double c(int i2, int i3) {
        double d = i2 & (-i3);
        Double.isNaN(d);
        return a(d * 9.313225746154785E-10d);
    }

    public final double e(double d) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                throw null;
            }
            if (ordinal != 2) {
                throw null;
            }
            int i2 = (d > dcyn.a ? 1 : (d == dcyn.a ? 0 : -1));
            double d2 = d * 3.0d;
            return i2 >= 0 ? Math.sqrt(d2 + 1.0d) * 0.5d : 1.0d - (Math.sqrt(1.0d - d2) * 0.5d);
        }
        throw null;
    }

    public final dcwa l(int i2, long j2, long j3) {
        return f(i2, a(d(j2)), a(d(j3)));
    }

    public static dcuw h(int i2, dcwa dcwaVar) {
        if (i2 < 3) {
            if (dcwaVar.n(i2) <= dcyn.a) {
                return null;
            }
        } else if (dcwaVar.n(i2 - 3) >= dcyn.a) {
            return null;
        }
        dcuw dcuwVar = new dcuw();
        i(i2, dcwaVar, dcuwVar);
        return dcuwVar;
    }

    public static dcwa k(int i2, dcwa dcwaVar) {
        if (i2 != 0) {
            if (i2 == 1) {
                return new dcwa(-dcwaVar.h, dcwaVar.j, dcwaVar.i);
            }
            if (i2 == 2) {
                return new dcwa(-dcwaVar.h, -dcwaVar.i, dcwaVar.j);
            }
            if (i2 == 3) {
                return new dcwa(-dcwaVar.j, -dcwaVar.i, -dcwaVar.h);
            }
            if (i2 == 4) {
                return new dcwa(-dcwaVar.j, dcwaVar.h, -dcwaVar.i);
            }
            return new dcwa(dcwaVar.i, dcwaVar.h, -dcwaVar.j);
        }
        return new dcwa(dcwaVar.i, dcwaVar.j, dcwaVar.h);
    }
}
