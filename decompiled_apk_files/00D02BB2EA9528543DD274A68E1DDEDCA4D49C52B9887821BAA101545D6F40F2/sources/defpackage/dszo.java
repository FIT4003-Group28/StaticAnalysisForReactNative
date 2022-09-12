package defpackage;
/* compiled from: PG */
/* renamed from: dszo  reason: default package */
/* loaded from: classes6.dex */
public final class dszo extends dsqw<dszo, dszn> implements dssk {
    public static final dszo b;
    private static volatile dssr<dszo> c;
    public long a;

    static {
        dszo dszoVar = new dszo();
        b = dszoVar;
        dsqw.cc(dszo.class, dszoVar);
    }

    private dszo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dszo();
            }
            if (i2 == 4) {
                return new dszn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dszo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dszo.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
