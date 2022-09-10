package defpackage;
/* compiled from: PG */
/* renamed from: djcu  reason: default package */
/* loaded from: classes6.dex */
public final class djcu extends dsqw<djcu, djcr> implements dssk {
    public static final djcu f;
    private static volatile dssr<djcu> g;
    public int a;
    public dsrj<djct> b = dssu.b;
    public dsrj<djct> c = dssu.b;
    public dsrj<djct> d = dssu.b;
    public dspd e = dspd.b;

    static {
        djcu djcuVar = new djcu();
        f = djcuVar;
        dsqw.cc(djcu.class, djcuVar);
    }

    private djcu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0007ည\u0002", new Object[]{"a", "b", djct.class, "c", djct.class, "d", djct.class, "e"});
            }
            if (i2 == 3) {
                return new djcu();
            }
            if (i2 == 4) {
                return new djcr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djcu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djcu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
