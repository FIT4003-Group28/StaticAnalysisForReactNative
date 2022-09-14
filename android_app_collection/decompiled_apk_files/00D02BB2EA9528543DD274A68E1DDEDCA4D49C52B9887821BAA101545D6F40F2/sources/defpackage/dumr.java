package defpackage;
/* compiled from: PG */
/* renamed from: dumr  reason: default package */
/* loaded from: classes6.dex */
public final class dumr extends dsqw<dumr, dumq> implements dssk {
    public static final dumr c;
    private static volatile dssr<dumr> d;
    public int a;
    public boolean b;

    static {
        dumr dumrVar = new dumr();
        c = dumrVar;
        dsqw.cc(dumr.class, dumrVar);
    }

    private dumr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dumr();
            }
            if (i2 == 4) {
                return new dumq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dumr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dumr.class) {
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
