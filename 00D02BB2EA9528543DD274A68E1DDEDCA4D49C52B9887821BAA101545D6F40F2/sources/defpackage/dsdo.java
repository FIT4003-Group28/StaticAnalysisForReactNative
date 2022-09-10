package defpackage;
/* compiled from: PG */
/* renamed from: dsdo  reason: default package */
/* loaded from: classes6.dex */
public final class dsdo extends dsqw<dsdo, dsdn> implements dssk {
    public static final dsdo c;
    private static volatile dssr<dsdo> d;
    public int a;
    public boolean b;

    static {
        dsdo dsdoVar = new dsdo();
        c = dsdoVar;
        dsqw.cc(dsdo.class, dsdoVar);
    }

    private dsdo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dsdo();
            }
            if (i2 == 4) {
                return new dsdn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsdo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsdo.class) {
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
