package defpackage;
/* compiled from: PG */
/* renamed from: cbul  reason: default package */
/* loaded from: classes4.dex */
public final class cbul extends dsqw<cbul, cbuk> implements dssk {
    public static final cbul b;
    private static volatile dssr<cbul> c;
    public dsrj<cbts> a = dssu.b;

    static {
        cbul cbulVar = new cbul();
        b = cbulVar;
        dsqw.cc(cbul.class, cbulVar);
    }

    private cbul() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbts.class});
            }
            if (i2 == 3) {
                return new cbul();
            }
            if (i2 == 4) {
                return new cbuk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbul> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cbul.class) {
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
