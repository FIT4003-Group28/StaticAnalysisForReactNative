package defpackage;
/* compiled from: PG */
/* renamed from: cylg  reason: default package */
/* loaded from: classes5.dex */
public final class cylg extends dsqw<cylg, cylf> implements dssk {
    public static final cylg d;
    private static volatile dssr<cylg> e;
    public long a;
    public long b;
    public long c;

    static {
        cylg cylgVar = new cylg();
        d = cylgVar;
        dsqw.cc(cylg.class, cylgVar);
    }

    private cylg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cylg();
            }
            if (i2 == 4) {
                return new cylf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cylg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cylg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
