package defpackage;
/* compiled from: PG */
/* renamed from: djyh  reason: default package */
/* loaded from: classes6.dex */
public final class djyh extends dsqw<djyh, djyg> implements dssk {
    public static final djyh b;
    private static volatile dssr<djyh> c;
    public dsrj<djyf> a = dssu.b;

    static {
        djyh djyhVar = new djyh();
        b = djyhVar;
        dsqw.cc(djyh.class, djyhVar);
    }

    private djyh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djyf.class});
            }
            if (i2 == 3) {
                return new djyh();
            }
            if (i2 == 4) {
                return new djyg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djyh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djyh.class) {
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
