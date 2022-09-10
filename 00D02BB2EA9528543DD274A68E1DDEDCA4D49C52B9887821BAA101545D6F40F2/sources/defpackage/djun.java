package defpackage;
/* compiled from: PG */
/* renamed from: djun  reason: default package */
/* loaded from: classes.dex */
public final class djun extends dsqw<djun, djum> implements dssk {
    public static final djun b;
    private static volatile dssr<djun> c;
    public dsrj<diyh> a = dssu.b;

    static {
        djun djunVar = new djun();
        b = djunVar;
        dsqw.cc(djun.class, djunVar);
    }

    private djun() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0001\u0000\u0005\u001b", new Object[]{"a", diyh.class});
            }
            if (i2 == 3) {
                return new djun();
            }
            if (i2 == 4) {
                return new djum();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djun> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djun.class) {
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
