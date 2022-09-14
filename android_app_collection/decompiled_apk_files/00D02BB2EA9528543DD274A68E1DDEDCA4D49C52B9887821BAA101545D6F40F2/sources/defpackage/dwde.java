package defpackage;
/* compiled from: PG */
/* renamed from: dwde  reason: default package */
/* loaded from: classes6.dex */
public final class dwde extends dsqw<dwde, dwdd> implements dssk {
    public static final dwde b;
    private static volatile dssr<dwde> c;
    public dsrj<dqyf> a = dssu.b;

    static {
        dwde dwdeVar = new dwde();
        b = dwdeVar;
        dsqw.cc(dwde.class, dwdeVar);
    }

    private dwde() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqyf.class});
            }
            if (i2 == 3) {
                return new dwde();
            }
            if (i2 == 4) {
                return new dwdd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwde> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwde.class) {
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
