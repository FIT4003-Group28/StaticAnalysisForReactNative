package defpackage;
/* compiled from: PG */
/* renamed from: dufu  reason: default package */
/* loaded from: classes6.dex */
public final class dufu extends dsqw<dufu, duft> implements dssk {
    public static final dufu d;
    private static volatile dssr<dufu> f;
    public dsrj<duef> a;
    public duev b;
    public String c;
    private int e;

    static {
        dufu dufuVar = new dufu();
        d = dufuVar;
        dsqw.cc(dufu.class, dufuVar);
    }

    private dufu() {
        dssu<Object> dssuVar = dssu.b;
        dsrx dsrxVar = dsrx.b;
        this.a = dssu.b;
        this.c = "";
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0004\u0016\u0003\u0000\u0001\u0000\u0004ဈ\u0003\u0011\u001b\u0016ဉ\u0002", new Object[]{"e", "c", "a", duef.class, "b"});
            }
            if (i2 == 3) {
                return new dufu();
            }
            if (i2 == 4) {
                return new duft();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dufu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dufu.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
