package defpackage;
/* compiled from: PG */
/* renamed from: druu  reason: default package */
/* loaded from: classes6.dex */
public final class druu extends dsqw<druu, drut> implements dssk {
    public static final druu f;
    private static volatile dssr<druu> g;
    public int a;
    public long c;
    public long e;
    public String b = "";
    public String d = "";

    static {
        druu druuVar = new druu();
        f = druuVar;
        dsqw.cc(druu.class, druuVar);
    }

    private druu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004", new Object[]{"a", "b", "d", "c", "e"});
            }
            if (i2 == 3) {
                return new druu();
            }
            if (i2 == 4) {
                return new drut();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<druu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (druu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
