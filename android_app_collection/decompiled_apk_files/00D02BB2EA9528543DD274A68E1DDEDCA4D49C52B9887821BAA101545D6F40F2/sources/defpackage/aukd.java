package defpackage;
/* compiled from: PG */
/* renamed from: aukd  reason: default package */
/* loaded from: classes2.dex */
public final class aukd extends dsqw<aukd, aukc> implements dssk {
    public static final aukd e;
    private static volatile dssr<aukd> f;
    public int a;
    public int b;
    public long c;
    public String d = "";

    static {
        aukd aukdVar = new aukd();
        e = aukdVar;
        dsqw.cc(aukd.class, aukdVar);
    }

    private aukd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", aukb.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new aukd();
            }
            if (i2 == 4) {
                return new aukc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aukd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (aukd.class) {
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
