package defpackage;
/* compiled from: PG */
/* renamed from: dszu  reason: default package */
/* loaded from: classes6.dex */
public final class dszu extends dsqw<dszu, dszt> implements dssk {
    public static final dszu a;
    private static volatile dssr<dszu> e;
    private int b;
    private dszx c;
    private byte d = 2;

    static {
        dszu dszuVar = new dszu();
        a = dszuVar;
        dsqw.cc(dszu.class, dszuVar);
    }

    private dszu() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dszu();
            }
            if (i2 == 4) {
                return new dszt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dszu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dszu.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
