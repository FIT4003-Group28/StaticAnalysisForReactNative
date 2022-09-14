package defpackage;
/* compiled from: PG */
/* renamed from: cylc  reason: default package */
/* loaded from: classes5.dex */
public final class cylc extends dsqw<cylc, cylb> implements dssk {
    public static final cylc d;
    private static volatile dssr<cylc> e;
    public dsrj<cymg> a = dssu.b;
    public cyla b;
    public cylg c;

    static {
        cylc cylcVar = new cylc();
        d = cylcVar;
        dsqw.cc(cylc.class, cylcVar);
    }

    private cylc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t", new Object[]{"a", cymg.class, "b", "c"});
            }
            if (i2 == 3) {
                return new cylc();
            }
            if (i2 == 4) {
                return new cylb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cylc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cylc.class) {
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
