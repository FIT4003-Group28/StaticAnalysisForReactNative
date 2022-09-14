package defpackage;
/* compiled from: PG */
/* renamed from: disz  reason: default package */
/* loaded from: classes6.dex */
public final class disz extends dsqw<disz, disu> implements dssk {
    public static final disz b;
    private static volatile dssr<disz> c;
    public dsrj<disy> a = dssu.b;

    static {
        disz diszVar = new disz();
        b = diszVar;
        dsqw.cc(disz.class, diszVar);
    }

    private disz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", disy.class});
            }
            if (i2 == 3) {
                return new disz();
            }
            if (i2 == 4) {
                return new disu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<disz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (disz.class) {
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
