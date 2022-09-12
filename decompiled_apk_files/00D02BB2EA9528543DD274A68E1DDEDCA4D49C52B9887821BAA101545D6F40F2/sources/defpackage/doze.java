package defpackage;
/* compiled from: PG */
/* renamed from: doze  reason: default package */
/* loaded from: classes6.dex */
public final class doze extends dsqw<doze, dozd> implements dssk {
    public static final doze d;
    private static volatile dssr<doze> e;
    public int a;
    public int b;
    public int c;

    static {
        doze dozeVar = new doze();
        d = dozeVar;
        dsqw.cc(doze.class, dozeVar);
    }

    private doze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new doze();
            }
            if (i2 == 4) {
                return new dozd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doze> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doze.class) {
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
