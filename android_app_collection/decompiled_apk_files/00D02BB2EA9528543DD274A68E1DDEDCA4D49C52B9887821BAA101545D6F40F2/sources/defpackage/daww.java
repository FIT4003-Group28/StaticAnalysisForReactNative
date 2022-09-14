package defpackage;
/* compiled from: PG */
/* renamed from: daww  reason: default package */
/* loaded from: classes5.dex */
public final class daww extends dsqw<daww, dawv> implements dssk {
    public static final daww e;
    private static volatile dssr<daww> g;
    public int a;
    public daws b;
    public dawu c;
    public dawq d;
    private byte f = 2;

    static {
        daww dawwVar = new daww();
        e = dawwVar;
        dsqw.cc(daww.class, dawwVar);
    }

    private daww() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0006ᐉ\u0005", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new daww();
            }
            if (i2 == 4) {
                return new dawv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<daww> dssrVar = g;
            if (dssrVar == null) {
                synchronized (daww.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
