package defpackage;
/* compiled from: PG */
/* renamed from: diwg  reason: default package */
/* loaded from: classes6.dex */
public final class diwg extends dsqw<diwg, diwf> implements dssk {
    public static final diwg c;
    private static volatile dssr<diwg> e;
    public diwi a;
    public diwi b;
    private int d;

    static {
        diwg diwgVar = new diwg();
        c = diwgVar;
        dsqw.cc(diwg.class, diwgVar);
    }

    private diwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new diwg();
            }
            if (i2 == 4) {
                return new diwf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diwg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diwg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
