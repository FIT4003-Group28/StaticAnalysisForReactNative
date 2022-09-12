package defpackage;
/* compiled from: PG */
/* renamed from: dump  reason: default package */
/* loaded from: classes6.dex */
public final class dump extends dsqw<dump, dumm> implements dssk {
    public static final dump e;
    private static volatile dssr<dump> f;
    public int a;
    public boolean b;
    public long c;
    public dumo d;

    static {
        dump dumpVar = new dump();
        e = dumpVar;
        dsqw.cc(dump.class, dumpVar);
    }

    private dump() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dump();
            }
            if (i2 == 4) {
                return new dumm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dump> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dump.class) {
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
