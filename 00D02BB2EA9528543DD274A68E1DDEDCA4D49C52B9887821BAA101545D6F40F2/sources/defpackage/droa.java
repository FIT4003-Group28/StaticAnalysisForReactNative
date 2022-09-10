package defpackage;
/* compiled from: PG */
/* renamed from: droa  reason: default package */
/* loaded from: classes6.dex */
public final class droa extends dsqw<droa, drny> implements dssk {
    public static final droa c;
    private static volatile dssr<droa> d;
    public int a;
    public int b;

    static {
        droa droaVar = new droa();
        c = droaVar;
        dsqw.cc(droa.class, droaVar);
    }

    private droa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drnz.a});
            }
            if (i2 == 3) {
                return new droa();
            }
            if (i2 == 4) {
                return new drny();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<droa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (droa.class) {
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
