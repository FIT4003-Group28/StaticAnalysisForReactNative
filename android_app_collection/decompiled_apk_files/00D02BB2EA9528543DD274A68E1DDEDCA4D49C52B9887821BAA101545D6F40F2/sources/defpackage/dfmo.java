package defpackage;
/* compiled from: PG */
/* renamed from: dfmo  reason: default package */
/* loaded from: classes6.dex */
public final class dfmo extends dsqw<dfmo, dfmn> implements dssk {
    public static final dfmo d;
    private static volatile dssr<dfmo> f;
    public int a;
    public int b;
    private byte e = 2;
    public dsrj<dfnb> c = dssu.b;

    static {
        dfmo dfmoVar = new dfmo();
        d = dfmoVar;
        dsqw.cc(dfmo.class, dfmoVar);
    }

    private dfmo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л", new Object[]{"a", "b", dfml.a, "c", dfnb.class});
            }
            if (i2 == 3) {
                return new dfmo();
            }
            if (i2 == 4) {
                return new dfmn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dfmo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfmo.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
