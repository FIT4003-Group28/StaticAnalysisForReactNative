package defpackage;
/* compiled from: PG */
/* renamed from: difx  reason: default package */
/* loaded from: classes6.dex */
public final class difx extends dsqw<difx, difw> implements dssk {
    public static final difx e;
    private static volatile dssr<difx> g;
    public dsrj<difv> a = dssu.b;
    public dvzn b;
    public difv c;
    public difv d;
    private int f;

    static {
        difx difxVar = new difx();
        e = difxVar;
        dsqw.cc(difx.class, difxVar);
    }

    private difx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"f", "a", difv.class, "b", "c", "d"});
            }
            if (i2 == 3) {
                return new difx();
            }
            if (i2 == 4) {
                return new difw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<difx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (difx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
