package defpackage;
/* compiled from: PG */
/* renamed from: tqz  reason: default package */
/* loaded from: classes7.dex */
public final class tqz extends dsqw<tqz, tqv> implements dssk {
    public static final tqz b;
    private static volatile dssr<tqz> c;
    public dsrj<tqy> a = dssu.b;

    static {
        tqz tqzVar = new tqz();
        b = tqzVar;
        dsqw.cc(tqz.class, tqzVar);
    }

    private tqz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", tqy.class});
            }
            if (i2 == 3) {
                return new tqz();
            }
            if (i2 == 4) {
                return new tqv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tqz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (tqz.class) {
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
