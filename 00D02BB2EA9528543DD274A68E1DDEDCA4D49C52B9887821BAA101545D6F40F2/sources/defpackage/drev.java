package defpackage;
/* compiled from: PG */
/* renamed from: drev  reason: default package */
/* loaded from: classes6.dex */
public final class drev extends dsqw<drev, dreu> implements dssk {
    public static final drev c;
    private static volatile dssr<drev> d;
    public int a;
    public drdm b;

    static {
        drev drevVar = new drev();
        c = drevVar;
        dsqw.cc(drev.class, drevVar);
    }

    private drev() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drev();
            }
            if (i2 == 4) {
                return new dreu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drev> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drev.class) {
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
