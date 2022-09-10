package defpackage;
/* compiled from: PG */
/* renamed from: dwxr  reason: default package */
/* loaded from: classes6.dex */
public final class dwxr extends dsqw<dwxr, dwxq> implements dssk {
    public static final dwxr e;
    private static volatile dssr<dwxr> f;
    public int a;
    public int b;
    public int c = 1;
    public long d;

    static {
        dwxr dwxrVar = new dwxr();
        e = dwxrVar;
        dsqw.cc(dwxr.class, dwxrVar);
    }

    private dwxr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", dqun.a, "c", dqup.a, "d"});
            }
            if (i2 == 3) {
                return new dwxr();
            }
            if (i2 == 4) {
                return new dwxq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwxr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwxr.class) {
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
