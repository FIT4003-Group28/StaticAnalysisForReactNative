package defpackage;
/* compiled from: PG */
/* renamed from: duwr  reason: default package */
/* loaded from: classes.dex */
public final class duwr extends dsqw<duwr, duwq> implements dssk {
    public static final duwr c;
    private static volatile dssr<duwr> e;
    public int a = 7;
    public int b = 7;
    private int d;

    static {
        duwr duwrVar = new duwr();
        c = duwrVar;
        dsqw.cc(duwr.class, duwrVar);
    }

    private duwr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new duwr();
            }
            if (i2 == 4) {
                return new duwq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duwr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duwr.class) {
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
