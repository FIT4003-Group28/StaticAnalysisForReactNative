package defpackage;
/* compiled from: PG */
/* renamed from: doqs  reason: default package */
/* loaded from: classes6.dex */
public final class doqs extends dsqw<doqs, doqr> implements dssk {
    public static final doqs d;
    private static volatile dssr<doqs> e;
    public int a;
    public dowb b;
    public dgas c;

    static {
        doqs doqsVar = new doqs();
        d = doqsVar;
        dsqw.cc(doqs.class, doqsVar);
    }

    private doqs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new doqs();
            }
            if (i2 == 4) {
                return new doqr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doqs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doqs.class) {
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
