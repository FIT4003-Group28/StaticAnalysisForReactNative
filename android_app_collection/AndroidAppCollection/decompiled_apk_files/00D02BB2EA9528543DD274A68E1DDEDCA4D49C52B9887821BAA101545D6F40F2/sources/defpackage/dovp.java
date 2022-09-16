package defpackage;
/* compiled from: PG */
/* renamed from: dovp  reason: default package */
/* loaded from: classes6.dex */
public final class dovp extends dsqw<dovp, dovi> implements dssk {
    public static final dovp c;
    private static volatile dssr<dovp> f;
    private int d;
    private byte e = 2;
    public String a = "";
    public dsrj<dovo> b = dssu.b;

    static {
        dovp dovpVar = new dovp();
        c = dovpVar;
        dsqw.cc(dovp.class, dovpVar);
    }

    private dovp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002ဈ\u0001\u0003Л", new Object[]{"d", "a", "b", dovo.class});
            }
            if (i2 == 3) {
                return new dovp();
            }
            if (i2 == 4) {
                return new dovi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dovp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dovp.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
