package defpackage;
/* compiled from: PG */
/* renamed from: dlvq  reason: default package */
/* loaded from: classes6.dex */
public final class dlvq extends dsqw<dlvq, dlvp> implements dssk {
    public static final dlvq b;
    private static volatile dssr<dlvq> c;
    public dsrj<dlvo> a = dssu.b;

    static {
        dlvq dlvqVar = new dlvq();
        b = dlvqVar;
        dsqw.cc(dlvq.class, dlvqVar);
    }

    private dlvq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dlvo.class});
            }
            if (i2 == 3) {
                return new dlvq();
            }
            if (i2 == 4) {
                return new dlvp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlvq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlvq.class) {
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
