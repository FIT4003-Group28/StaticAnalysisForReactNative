package defpackage;
/* compiled from: PG */
/* renamed from: dubh  reason: default package */
/* loaded from: classes6.dex */
public final class dubh extends dsqw<dubh, dubg> implements dssk {
    public static final dubh c;
    private static volatile dssr<dubh> d;
    public boolean a;
    public boolean b;

    static {
        dubh dubhVar = new dubh();
        c = dubhVar;
        dsqw.cc(dubh.class, dubhVar);
    }

    private dubh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dubh();
            }
            if (i2 == 4) {
                return new dubg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dubh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dubh.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
