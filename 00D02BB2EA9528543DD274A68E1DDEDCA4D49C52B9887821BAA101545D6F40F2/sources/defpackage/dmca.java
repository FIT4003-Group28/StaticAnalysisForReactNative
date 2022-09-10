package defpackage;
/* compiled from: PG */
/* renamed from: dmca  reason: default package */
/* loaded from: classes6.dex */
public final class dmca extends dsqw<dmca, dmbz> implements dssk {
    public static final dmca c;
    private static volatile dssr<dmca> d;
    public int a;
    public int b;

    static {
        dmca dmcaVar = new dmca();
        c = dmcaVar;
        dsqw.cc(dmca.class, dmcaVar);
    }

    private dmca() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmca();
            }
            if (i2 == 4) {
                return new dmbz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmca> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmca.class) {
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
