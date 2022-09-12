package defpackage;
/* compiled from: PG */
/* renamed from: droe  reason: default package */
/* loaded from: classes6.dex */
public final class droe extends dsqw<droe, drod> implements dssk {
    public static final droe c;
    private static volatile dssr<droe> d;
    public int a;
    public droc b;

    static {
        droe droeVar = new droe();
        c = droeVar;
        dsqw.cc(droe.class, droeVar);
    }

    private droe() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new droe();
            }
            if (i2 == 4) {
                return new drod();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<droe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (droe.class) {
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
