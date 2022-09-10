package defpackage;
/* compiled from: PG */
/* renamed from: dhkb  reason: default package */
/* loaded from: classes.dex */
public final class dhkb extends dsqw<dhkb, dhka> implements dssk {
    public static final dhkb e;
    private static volatile dssr<dhkb> f;
    public int a;
    public float b;
    public float c;
    public float d;

    static {
        dhkb dhkbVar = new dhkb();
        e = dhkbVar;
        dsqw.cc(dhkb.class, dhkbVar);
    }

    private dhkb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dhkb();
            }
            if (i2 == 4) {
                return new dhka();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhkb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhkb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
