package defpackage;
/* compiled from: PG */
/* renamed from: dwac  reason: default package */
/* loaded from: classes6.dex */
public final class dwac extends dsqw<dwac, dwab> implements dssk {
    public static final dwac e;
    private static volatile dssr<dwac> f;
    public int a;
    public int b;
    public boolean c;
    public ddgg d;

    static {
        dwac dwacVar = new dwac();
        e = dwacVar;
        dsqw.cc(dwac.class, dwacVar);
    }

    private dwac() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0002\u0003ဇ\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dwac();
            }
            if (i2 == 4) {
                return new dwab();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwac> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwac.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
