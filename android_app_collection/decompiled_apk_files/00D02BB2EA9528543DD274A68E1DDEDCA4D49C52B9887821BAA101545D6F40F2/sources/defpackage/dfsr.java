package defpackage;

import com.google.geo.imagery.viewer.api.Text;
/* compiled from: PG */
/* renamed from: dfsr  reason: default package */
/* loaded from: classes6.dex */
public final class dfsr extends dsqw<dfsr, dfsq> implements dssk {
    public static final dfsr f;
    private static volatile dssr<dfsr> g;
    public int a;
    public Text b;
    public float c;
    public float d;
    public float e = 1.0f;

    static {
        dfsr dfsrVar = new dfsr();
        f = dfsrVar;
        dsqw.cc(dfsr.class, dfsrVar);
    }

    private dfsr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfsr();
            }
            if (i2 == 4) {
                return new dfsq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfsr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfsr.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
