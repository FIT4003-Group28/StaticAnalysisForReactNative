package defpackage;
/* compiled from: PG */
/* renamed from: dhyt  reason: default package */
/* loaded from: classes6.dex */
public final class dhyt extends dsqw<dhyt, dhys> implements dssk {
    public static final dhyt d;
    private static volatile dssr<dhyt> e;
    public int a;
    public String b = "";
    public int c;

    static {
        dhyt dhytVar = new dhyt();
        d = dhytVar;
        dsqw.cc(dhyt.class, dhytVar);
    }

    private dhyt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dfqc.c()});
            }
            if (i2 == 3) {
                return new dhyt();
            }
            if (i2 == 4) {
                return new dhys();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhyt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhyt.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
