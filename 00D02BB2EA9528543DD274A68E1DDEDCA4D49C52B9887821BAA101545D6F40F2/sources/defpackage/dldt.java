package defpackage;
/* compiled from: PG */
/* renamed from: dldt  reason: default package */
/* loaded from: classes6.dex */
public final class dldt extends dsqw<dldt, dldq> implements dssk {
    public static final dldt e;
    private static volatile dssr<dldt> h;
    public dlcx c;
    private int f;
    private byte g = 2;
    public String a = "";
    public String b = "";
    public dsrj<dlds> d = dssu.b;

    static {
        dldt dldtVar = new dldt();
        e = dldtVar;
        dsqw.cc(dldt.class, dldtVar);
    }

    private dldt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004Л", new Object[]{"f", "a", "b", "c", "d", dlds.class});
            }
            if (i2 == 3) {
                return new dldt();
            }
            if (i2 == 4) {
                return new dldq();
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
            dssr<dldt> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dldt.class) {
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