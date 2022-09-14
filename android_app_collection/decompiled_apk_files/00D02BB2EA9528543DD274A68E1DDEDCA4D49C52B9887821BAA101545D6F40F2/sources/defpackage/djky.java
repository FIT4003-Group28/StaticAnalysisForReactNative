package defpackage;
/* compiled from: PG */
/* renamed from: djky  reason: default package */
/* loaded from: classes6.dex */
public final class djky extends dsqw<djky, djkw> implements dssk {
    public static final djky c;
    private static volatile dssr<djky> d;
    public int a;
    public int b;

    static {
        djky djkyVar = new djky();
        c = djkyVar;
        dsqw.cc(djky.class, djkyVar);
    }

    private djky() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", djkx.a});
            }
            if (i2 == 3) {
                return new djky();
            }
            if (i2 == 4) {
                return new djkw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djky> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djky.class) {
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
