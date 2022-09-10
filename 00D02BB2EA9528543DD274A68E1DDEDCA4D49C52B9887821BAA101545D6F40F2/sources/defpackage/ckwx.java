package defpackage;
/* compiled from: PG */
/* renamed from: ckwx  reason: default package */
/* loaded from: classes5.dex */
public final class ckwx extends dsqw<ckwx, ckww> implements dssk {
    public static final ckwx d;
    private static volatile dssr<ckwx> e;
    public int a;
    public float b;
    public float c;

    static {
        ckwx ckwxVar = new ckwx();
        d = ckwxVar;
        dsqw.cc(ckwx.class, ckwxVar);
    }

    private ckwx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ckwx();
            }
            if (i2 == 4) {
                return new ckww();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckwx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
