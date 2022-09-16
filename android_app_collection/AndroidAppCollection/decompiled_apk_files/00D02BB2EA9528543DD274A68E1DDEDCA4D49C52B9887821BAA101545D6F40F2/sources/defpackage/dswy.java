package defpackage;
/* compiled from: PG */
/* renamed from: dswy  reason: default package */
/* loaded from: classes6.dex */
public final class dswy extends dsqw<dswy, dswx> implements dssk {
    public static final dswy a;
    private static volatile dssr<dswy> e;
    private int b;
    private dsxf c;
    private byte d = 2;

    static {
        dswy dswyVar = new dswy();
        a = dswyVar;
        dsqw.cc(dswy.class, dswyVar);
    }

    private dswy() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dswy();
            }
            if (i2 == 4) {
                return new dswx();
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
            dssr<dswy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dswy.class) {
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
