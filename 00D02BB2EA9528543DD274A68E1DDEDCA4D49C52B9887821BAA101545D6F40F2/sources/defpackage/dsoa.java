package defpackage;
/* compiled from: PG */
/* renamed from: dsoa  reason: default package */
/* loaded from: classes6.dex */
public final class dsoa extends dsqw<dsoa, dsny> implements dssk {
    public static final dsoa e;
    private static volatile dssr<dsoa> f;
    public int a;
    public int b;
    public int c;
    public String d = "";

    static {
        dsoa dsoaVar = new dsoa();
        e = dsoaVar;
        dsqw.cc(dsoa.class, dsoaVar);
    }

    private dsoa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", dsnz.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dsoa();
            }
            if (i2 == 4) {
                return new dsny();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsoa> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsoa.class) {
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
