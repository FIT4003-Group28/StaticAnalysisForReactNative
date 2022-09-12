package defpackage;
/* compiled from: PG */
/* renamed from: eavs  reason: default package */
/* loaded from: classes6.dex */
public final class eavs extends dsqw<eavs, eavr> implements dssk {
    public static final eavs c;
    private static volatile dssr<eavs> d;
    public int a = 0;
    public Object b;

    static {
        eavs eavsVar = new eavs();
        c = eavsVar;
        dsqw.cc(eavs.class, eavsVar);
    }

    private eavs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", eavo.class, eavx.class, eavz.class});
            }
            if (i2 == 3) {
                return new eavs();
            }
            if (i2 == 4) {
                return new eavr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eavs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (eavs.class) {
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
