package defpackage;
/* compiled from: PG */
/* renamed from: drfs  reason: default package */
/* loaded from: classes6.dex */
public final class drfs extends dsqw<drfs, drfr> implements dssk {
    public static final drfs c;
    private static volatile dssr<drfs> d;
    public int a = 0;
    public Object b;

    static {
        drfs drfsVar = new drfs();
        c = drfsVar;
        dsqw.cc(drfs.class, drfsVar);
    }

    private drfs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ျ\u0000", new Object[]{"b", "a", drdk.class});
            }
            if (i2 == 3) {
                return new drfs();
            }
            if (i2 == 4) {
                return new drfr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drfs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drfs.class) {
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
