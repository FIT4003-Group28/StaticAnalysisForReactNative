package defpackage;
/* compiled from: PG */
/* renamed from: doni  reason: default package */
/* loaded from: classes6.dex */
public final class doni extends dsqw<doni, donh> implements dssk {
    public static final doni c;
    private static volatile dssr<doni> d;
    public int a;
    public boolean b;

    static {
        doni doniVar = new doni();
        c = doniVar;
        dsqw.cc(doni.class, doniVar);
    }

    private doni() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new doni();
            }
            if (i2 == 4) {
                return new donh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doni> dssrVar = d;
            if (dssrVar == null) {
                synchronized (doni.class) {
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
