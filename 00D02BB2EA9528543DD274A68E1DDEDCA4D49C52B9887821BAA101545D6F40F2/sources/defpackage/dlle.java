package defpackage;
/* compiled from: PG */
/* renamed from: dlle  reason: default package */
/* loaded from: classes6.dex */
public final class dlle extends dsqw<dlle, dlld> implements dssk {
    public static final dlle c;
    private static volatile dssr<dlle> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dlle dlleVar = new dlle();
        c = dlleVar;
        dsqw.cc(dlle.class, dlleVar);
    }

    private dlle() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlle();
            }
            if (i2 == 4) {
                return new dlld();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlle> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlle.class) {
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
