package defpackage;
/* compiled from: PG */
/* renamed from: dfkv  reason: default package */
/* loaded from: classes6.dex */
public final class dfkv extends dsqw<dfkv, dfks> implements dssk {
    public static final dfkv c;
    private static volatile dssr<dfkv> d;
    public int a;
    public dfku b;

    static {
        dfkv dfkvVar = new dfkv();
        c = dfkvVar;
        dsqw.cc(dfkv.class, dfkvVar);
    }

    private dfkv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dfkv();
            }
            if (i2 == 4) {
                return new dfks();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfkv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfkv.class) {
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
