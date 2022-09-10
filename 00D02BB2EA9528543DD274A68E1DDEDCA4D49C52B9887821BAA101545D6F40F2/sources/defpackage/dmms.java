package defpackage;
/* compiled from: PG */
/* renamed from: dmms  reason: default package */
/* loaded from: classes6.dex */
public final class dmms extends dsqw<dmms, dmmr> implements dssk {
    public static final dmms c;
    private static volatile dssr<dmms> d;
    public int a;
    public int b;

    static {
        dmms dmmsVar = new dmms();
        c = dmmsVar;
        dsqw.cc(dmms.class, dmmsVar);
    }

    private dmms() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmms();
            }
            if (i2 == 4) {
                return new dmmr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmms> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmms.class) {
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
