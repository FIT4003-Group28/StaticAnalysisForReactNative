package defpackage;
/* compiled from: PG */
/* renamed from: dsyi  reason: default package */
/* loaded from: classes6.dex */
public final class dsyi extends dsqw<dsyi, dsyh> implements dssk {
    public static final dsyi e;
    private static volatile dssr<dsyi> h;
    public Object b;
    public int c;
    public dsyy d;
    private int f;
    public int a = 0;
    private byte g = 2;

    static {
        dsyi dsyiVar = new dsyi();
        e = dsyiVar;
        dsqw.cc(dsyi.class, dsyiVar);
    }

    private dsyi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000\u0003ဌ\u0000\u0004ဉ\u0003", new Object[]{"b", "a", "f", dtyp.class, dsyw.class, "c", dsyl.c(), "d"});
            }
            if (i2 == 3) {
                return new dsyi();
            }
            if (i2 == 4) {
                return new dsyh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dsyi> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dsyi.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
