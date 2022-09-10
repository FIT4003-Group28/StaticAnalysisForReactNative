package defpackage;
/* compiled from: PG */
/* renamed from: pas  reason: default package */
/* loaded from: classes7.dex */
public final class pas extends dsqw<pas, pan> implements dssk {
    public static final pas d;
    private static volatile dssr<pas> e;
    public int a;
    public pap b;
    public par c;

    static {
        pas pasVar = new pas();
        d = pasVar;
        dsqw.cc(pas.class, pasVar);
    }

    private pas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new pas();
            }
            if (i2 == 4) {
                return new pan();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<pas> dssrVar = e;
            if (dssrVar == null) {
                synchronized (pas.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
