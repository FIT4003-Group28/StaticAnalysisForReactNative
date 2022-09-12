package defpackage;
/* compiled from: PG */
/* renamed from: dvil  reason: default package */
/* loaded from: classes.dex */
public final class dvil extends dsqw<dvil, dvik> implements dssk {
    public static final dvil c;
    private static volatile dssr<dvil> d;
    public int a;
    public int b;

    static {
        dvil dvilVar = new dvil();
        c = dvilVar;
        dsqw.cc(dvil.class, dvilVar);
    }

    private dvil() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvil();
            }
            if (i2 == 4) {
                return new dvik();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvil> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvil.class) {
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
