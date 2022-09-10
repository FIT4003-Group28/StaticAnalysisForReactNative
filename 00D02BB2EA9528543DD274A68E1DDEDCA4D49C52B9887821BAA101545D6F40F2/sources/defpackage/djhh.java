package defpackage;
/* compiled from: PG */
/* renamed from: djhh  reason: default package */
/* loaded from: classes6.dex */
public final class djhh extends dsqw<djhh, djhg> implements dssk {
    public static final djhh b;
    private static volatile dssr<djhh> c;
    public dsrj<djhd> a = dssu.b;

    static {
        djhh djhhVar = new djhh();
        b = djhhVar;
        dsqw.cc(djhh.class, djhhVar);
    }

    private djhh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djhd.class});
            }
            if (i2 == 3) {
                return new djhh();
            }
            if (i2 == 4) {
                return new djhg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djhh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djhh.class) {
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
