package defpackage;
/* compiled from: PG */
/* renamed from: djub  reason: default package */
/* loaded from: classes6.dex */
public final class djub extends dsqw<djub, djts> implements dssk {
    public static final djub b;
    private static volatile dssr<djub> c;
    public dsrj<djua> a = dssu.b;

    static {
        djub djubVar = new djub();
        b = djubVar;
        dsqw.cc(djub.class, djubVar);
    }

    private djub() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djua.class});
            }
            if (i2 == 3) {
                return new djub();
            }
            if (i2 == 4) {
                return new djts();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djub> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djub.class) {
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
