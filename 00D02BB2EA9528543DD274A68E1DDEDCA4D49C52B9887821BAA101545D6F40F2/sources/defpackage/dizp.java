package defpackage;
/* compiled from: PG */
/* renamed from: dizp  reason: default package */
/* loaded from: classes.dex */
public final class dizp extends dsqw<dizp, dizo> implements dssk {
    public static final dizp c;
    private static volatile dssr<dizp> d;
    public int a;
    public long b;

    static {
        dizp dizpVar = new dizp();
        c = dizpVar;
        dsqw.cc(dizp.class, dizpVar);
    }

    private dizp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dizp();
            }
            if (i2 == 4) {
                return new dizo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dizp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dizp.class) {
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
