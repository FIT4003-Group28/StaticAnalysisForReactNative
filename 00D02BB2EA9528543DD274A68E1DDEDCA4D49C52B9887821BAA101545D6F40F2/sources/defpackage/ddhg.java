package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ddhg  reason: default package */
/* loaded from: classes5.dex */
public final class ddhg extends dsqw<ddhg, ddhf> implements dssk {
    public static final ddhg a;
    public static final dsqv<ddhk, List<Integer>> b;
    private static volatile dssr<ddhg> c;

    static {
        ddhg ddhgVar = new ddhg();
        a = ddhgVar;
        dsqw.cc(ddhg.class, ddhgVar);
        b = dsqw.newRepeatedGeneratedExtension(ddhk.k, null, null, 330, dsur.INT32, false, Integer.class);
    }

    private ddhg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddhg();
            }
            if (i2 == 4) {
                return new ddhf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddhg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddhg.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
