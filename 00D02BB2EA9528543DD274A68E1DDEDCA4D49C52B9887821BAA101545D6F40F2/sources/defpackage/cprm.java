package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cprm  reason: default package */
/* loaded from: classes5.dex */
public final class cprm implements cprx<Double> {
    private static final float[] b = {0.01f, 0.02f, 0.025f, 0.03f, 0.04f, 0.05f, 0.06f, 0.07f, 0.08f, 0.09f, 0.1f, 0.2f, 0.25f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f, 2.0f, 2.5f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f};
    private int e;
    private int f;
    private Double[] g;
    private List<cprt<Double>> i;
    private double j;
    private double k;
    private int l;
    private int m;
    private boolean n;
    public boolean a = true;
    private Integer c = null;
    private Integer d = null;
    private int h = 0;

    private static final double c(double d) {
        double pow = Math.pow(10.0d, Math.ceil(Math.log10(Math.abs(d))));
        double d2 = d < dcyn.a ? -1 : 1;
        Double.isNaN(d2);
        return pow * d2;
    }

    private static final double d(double d) {
        if (d > 100.0d) {
            return Math.round(d);
        }
        double round = Math.round(d * 100000.0d);
        Double.isNaN(round);
        return round / 100000.0d;
    }

    public final void a(Integer num) {
        if (num.intValue() <= 1) {
            num = null;
        }
        this.d = num;
        this.c = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
        if (r36.i == null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [cprg] */
    @Override // defpackage.cprx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<defpackage.cprt<java.lang.Double>> b(java.util.List<java.lang.Double> r37, defpackage.cpsf<java.lang.Double> r38, int r39, defpackage.cppz r40, defpackage.cpru<java.lang.Double> r41, defpackage.cprg<java.lang.Double> r42, defpackage.cpso<java.lang.Double> r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cprm.b(java.util.List, cpsf, int, cppz, cpru, cprg, cpso, boolean):java.util.List");
    }
}
