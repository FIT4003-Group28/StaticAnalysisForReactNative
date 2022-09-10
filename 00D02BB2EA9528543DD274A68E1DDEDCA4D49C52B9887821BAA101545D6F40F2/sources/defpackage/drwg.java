package defpackage;
/* compiled from: PG */
/* renamed from: drwg  reason: default package */
/* loaded from: classes6.dex */
public final class drwg extends dsqw<drwg, drwd> implements dssk {
    public static final drwg c;
    private static volatile dssr<drwg> d;
    public int a;
    public int b;

    static {
        drwg drwgVar = new drwg();
        c = drwgVar;
        dsqw.cc(drwg.class, drwgVar);
    }

    private drwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drwe.a});
            }
            if (i2 == 3) {
                return new drwg();
            }
            if (i2 == 4) {
                return new drwd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drwg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drwg.class) {
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
