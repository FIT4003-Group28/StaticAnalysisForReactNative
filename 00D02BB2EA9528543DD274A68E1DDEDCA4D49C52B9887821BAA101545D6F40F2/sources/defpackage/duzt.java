package defpackage;
/* compiled from: PG */
/* renamed from: duzt  reason: default package */
/* loaded from: classes6.dex */
public final class duzt extends dsqw<duzt, duzs> implements dssk {
    public static final duzt c;
    private static volatile dssr<duzt> d;
    public int a;
    public long b;

    static {
        duzt duztVar = new duzt();
        c = duztVar;
        dsqw.cc(duzt.class, duztVar);
    }

    private duzt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new duzt();
            }
            if (i2 == 4) {
                return new duzs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duzt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duzt.class) {
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
