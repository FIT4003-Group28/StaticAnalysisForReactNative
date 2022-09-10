package defpackage;
/* compiled from: PG */
/* renamed from: drwl  reason: default package */
/* loaded from: classes6.dex */
public final class drwl extends dsqw<drwl, drwj> implements dssk {
    public static final drwl c;
    private static volatile dssr<drwl> d;
    public int a;
    public int b;

    static {
        drwl drwlVar = new drwl();
        c = drwlVar;
        dsqw.cc(drwl.class, drwlVar);
    }

    private drwl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drwk.a});
            }
            if (i2 == 3) {
                return new drwl();
            }
            if (i2 == 4) {
                return new drwj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drwl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drwl.class) {
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
