package defpackage;
/* compiled from: PG */
/* renamed from: drwx  reason: default package */
/* loaded from: classes6.dex */
public final class drwx extends dsqw<drwx, drww> implements dssk {
    public static final drwx c;
    private static volatile dssr<drwx> d;
    public int a = 0;
    public Object b;

    static {
        drwx drwxVar = new drwx();
        c = drwxVar;
        dsqw.cc(drwx.class, drwxVar);
    }

    private drwx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", drwq.a});
            }
            if (i2 == 3) {
                return new drwx();
            }
            if (i2 == 4) {
                return new drww();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drwx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drwx.class) {
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
