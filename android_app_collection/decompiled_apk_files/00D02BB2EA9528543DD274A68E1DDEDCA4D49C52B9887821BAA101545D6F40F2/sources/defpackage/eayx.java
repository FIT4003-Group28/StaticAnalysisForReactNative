package defpackage;
/* compiled from: PG */
/* renamed from: eayx  reason: default package */
/* loaded from: classes6.dex */
public final class eayx extends dsqw<eayx, eayw> implements dssk {
    public static final eayx e;
    private static volatile dssr<eayx> f;
    public int a;
    public eazo b;
    public eaze c;
    public eayu d;

    static {
        eayx eayxVar = new eayx();
        e = eayxVar;
        dsqw.cc(eayx.class, eayxVar);
    }

    private eayx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new eayx();
            }
            if (i2 == 4) {
                return new eayw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eayx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (eayx.class) {
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
