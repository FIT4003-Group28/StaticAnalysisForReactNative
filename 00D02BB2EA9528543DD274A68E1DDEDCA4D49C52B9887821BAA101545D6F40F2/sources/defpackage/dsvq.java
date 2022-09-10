package defpackage;
/* compiled from: PG */
/* renamed from: dsvq  reason: default package */
/* loaded from: classes6.dex */
public final class dsvq extends dsqw<dsvq, dsvn> implements dssk {
    public static final dsvq b;
    private static volatile dssr<dsvq> c;
    public dsrj<dsvp> a = dssu.b;

    static {
        dsvq dsvqVar = new dsvq();
        b = dsvqVar;
        dsqw.cc(dsvq.class, dsvqVar);
    }

    private dsvq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dsvp.class});
            }
            if (i2 == 3) {
                return new dsvq();
            }
            if (i2 == 4) {
                return new dsvn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsvq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsvq.class) {
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
