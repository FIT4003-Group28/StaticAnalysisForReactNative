package defpackage;
/* compiled from: PG */
/* renamed from: duwg  reason: default package */
/* loaded from: classes.dex */
public final class duwg extends dsqw<duwg, duwf> implements dssk {
    public static final duwg b;
    private static volatile dssr<duwg> d;
    public int a;
    private int c;

    static {
        duwg duwgVar = new duwg();
        b = duwgVar;
        dsqw.cc(duwg.class, duwgVar);
    }

    private duwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005င\u0004", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new duwg();
            }
            if (i2 == 4) {
                return new duwf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duwg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duwg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
