package defpackage;
/* compiled from: PG */
/* renamed from: diuw  reason: default package */
/* loaded from: classes6.dex */
public final class diuw extends dsqw<diuw, diun> implements dssk {
    public static final diuw e;
    private static volatile dssr<diuw> f;
    public int a;
    public diup b;
    public diuv c;
    public boolean d;

    static {
        diuw diuwVar = new diuw();
        e = diuwVar;
        dsqw.cc(diuw.class, diuwVar);
    }

    private diuw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new diuw();
            }
            if (i2 == 4) {
                return new diun();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diuw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diuw.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
