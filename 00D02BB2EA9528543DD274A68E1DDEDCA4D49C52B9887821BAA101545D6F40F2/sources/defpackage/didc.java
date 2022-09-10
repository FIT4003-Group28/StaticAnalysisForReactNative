package defpackage;
/* compiled from: PG */
/* renamed from: didc  reason: default package */
/* loaded from: classes6.dex */
public final class didc extends dsqw<didc, didb> implements dssk {
    public static final didc c;
    private static volatile dssr<didc> f;
    public int a;
    private dnqh d;
    private byte e = 2;
    public String b = "";

    static {
        didc didcVar = new didc();
        c = didcVar;
        dsqw.cc(didc.class, didcVar);
    }

    private didc() {
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
                return new didc();
            }
            if (i2 == 4) {
                return new didb();
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
            dssr<didc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (didc.class) {
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
