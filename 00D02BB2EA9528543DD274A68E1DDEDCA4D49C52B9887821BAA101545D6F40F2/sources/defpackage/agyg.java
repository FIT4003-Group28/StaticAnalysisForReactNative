package defpackage;
/* compiled from: PG */
/* renamed from: agyg  reason: default package */
/* loaded from: classes2.dex */
public final class agyg extends dsqw<agyg, agyf> implements dssk {
    public static final agyg c;
    private static volatile dssr<agyg> d;
    public int a;
    public boolean b;

    static {
        agyg agygVar = new agyg();
        c = agygVar;
        dsqw.cc(agyg.class, agygVar);
    }

    private agyg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new agyg();
            }
            if (i2 == 4) {
                return new agyf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<agyg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (agyg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
