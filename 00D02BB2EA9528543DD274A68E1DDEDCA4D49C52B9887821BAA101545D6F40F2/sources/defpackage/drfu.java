package defpackage;
/* compiled from: PG */
/* renamed from: drfu  reason: default package */
/* loaded from: classes6.dex */
public final class drfu extends dsqw<drfu, drft> implements dssk {
    public static final drfu c;
    private static volatile dssr<drfu> d;
    public int a;
    public dpoj b;

    static {
        drfu drfuVar = new drfu();
        c = drfuVar;
        dsqw.cc(drfu.class, drfuVar);
    }

    private drfu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drfu();
            }
            if (i2 == 4) {
                return new drft();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drfu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drfu.class) {
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
