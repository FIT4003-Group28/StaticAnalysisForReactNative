package defpackage;
/* compiled from: PG */
/* renamed from: djwn  reason: default package */
/* loaded from: classes6.dex */
public final class djwn extends dsqw<djwn, djwm> implements dssk {
    public static final djwn c;
    private static volatile dssr<djwn> e;
    public int a;
    public int b;
    private int d;

    static {
        djwn djwnVar = new djwn();
        c = djwnVar;
        dsqw.cc(djwn.class, djwnVar);
    }

    private djwn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new djwn();
            }
            if (i2 == 4) {
                return new djwm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djwn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djwn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
