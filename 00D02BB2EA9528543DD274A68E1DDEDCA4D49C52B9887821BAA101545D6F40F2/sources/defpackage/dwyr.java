package defpackage;
/* compiled from: PG */
/* renamed from: dwyr  reason: default package */
/* loaded from: classes6.dex */
public final class dwyr extends dsqw<dwyr, dwyq> implements dssk {
    public static final dwyr f;
    private static volatile dssr<dwyr> g;
    public int a;
    public dwyp b;
    public dsrj<dwyv> c = dssu.b;
    public String d = "";
    public int e = 2687400;

    static {
        dwyr dwyrVar = new dwyr();
        f = dwyrVar;
        dsqw.cc(dwyr.class, dwyrVar);
    }

    private dwyr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဈ\u0001\u0004င\u0002", new Object[]{"a", "b", "c", dwyv.class, "d", "e"});
            }
            if (i2 == 3) {
                return new dwyr();
            }
            if (i2 == 4) {
                return new dwyq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwyr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwyr.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
