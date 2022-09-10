package defpackage;
/* compiled from: PG */
/* renamed from: dwae  reason: default package */
/* loaded from: classes6.dex */
public final class dwae extends dsqw<dwae, dwad> implements dssk {
    public static final dwae d;
    private static volatile dssr<dwae> f;
    public int a;
    public dvzn b;
    private byte e = 2;
    public dsrj<dpgw> c = dssu.b;

    static {
        dwae dwaeVar = new dwae();
        d = dwaeVar;
        dsqw.cc(dwae.class, dwaeVar);
    }

    private dwae() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"a", "b", "c", dpgw.class});
            }
            if (i2 == 3) {
                return new dwae();
            }
            if (i2 == 4) {
                return new dwad();
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
            dssr<dwae> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwae.class) {
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
