package defpackage;
/* compiled from: PG */
/* renamed from: dsmn  reason: default package */
/* loaded from: classes6.dex */
public final class dsmn extends dsqw<dsmn, dsmm> implements dssk {
    public static final dsmn b;
    private static volatile dssr<dsmn> d;
    public dslt a;
    private int c;

    static {
        dsmn dsmnVar = new dsmn();
        b = dsmnVar;
        dsqw.cc(dsmn.class, dsmnVar);
    }

    private dsmn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dsmn();
            }
            if (i2 == 4) {
                return new dsmm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsmn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsmn.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
