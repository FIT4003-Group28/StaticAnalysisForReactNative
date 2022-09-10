package defpackage;
/* compiled from: PG */
/* renamed from: ddsw  reason: default package */
/* loaded from: classes6.dex */
public final class ddsw extends dsqw<ddsw, ddsv> implements dssk {
    public static final ddsw c;
    private static volatile dssr<ddsw> f;
    public int a;
    private ddxx d;
    private byte e = 2;
    public String b = "";

    static {
        ddsw ddswVar = new ddsw();
        c = ddswVar;
        dsqw.cc(ddsw.class, ddswVar);
    }

    private ddsw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new ddsw();
            }
            if (i2 == 4) {
                return new ddsv();
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
            dssr<ddsw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddsw.class) {
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
