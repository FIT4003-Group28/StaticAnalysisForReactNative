package defpackage;
/* compiled from: PG */
/* renamed from: dqlw  reason: default package */
/* loaded from: classes.dex */
public final class dqlw extends dsqw<dqlw, dqlv> implements dssk {
    public static final dqlw i;
    private static volatile dssr<dqlw> j;
    public int a;
    public int b;
    public String c = "";
    public dspd d = dspd.b;
    public int e;
    public boolean f;
    public dpum g;
    public dpuq h;

    static {
        dqlw dqlwVar = new dqlw();
        i = dqlwVar;
        dsqw.cc(dqlw.class, dqlwVar);
    }

    private dqlw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0005\u0004ဉ\u0006\u0005ဇ\u0004\u0006ည\u0002\u0007ဌ\u0003", new Object[]{"a", "b", "c", "g", "h", "f", "d", "e", dqmf.a});
            }
            if (i3 == 3) {
                return new dqlw();
            }
            if (i3 == 4) {
                return new dqlv();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqlw> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dqlw.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
