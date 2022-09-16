package defpackage;
/* compiled from: PG */
/* renamed from: dkwi  reason: default package */
/* loaded from: classes.dex */
public final class dkwi extends dsqw<dkwi, dkwf> implements dssk {
    public static final dkwi c;
    private static volatile dssr<dkwi> e;
    public boolean a;
    public int b;
    private int d;

    static {
        dkwi dkwiVar = new dkwi();
        c = dkwiVar;
        dsqw.cc(dkwi.class, dkwiVar);
    }

    private dkwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဌ\u0001", new Object[]{"d", "a", "b", dkwg.a});
            }
            if (i2 == 3) {
                return new dkwi();
            }
            if (i2 == 4) {
                return new dkwf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkwi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkwi.class) {
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
