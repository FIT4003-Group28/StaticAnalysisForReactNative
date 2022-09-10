package defpackage;
/* compiled from: PG */
/* renamed from: byaa  reason: default package */
/* loaded from: classes4.dex */
public final class byaa extends dsqw<byaa, bxzx> implements dssk {
    public static final byaa d;
    private static volatile dssr<byaa> f;
    public int a;
    public bxzz c;
    private byte e = 2;
    public String b = "";

    static {
        byaa byaaVar = new byaa();
        d = byaaVar;
        dsqw.cc(byaa.class, byaaVar);
    }

    private byaa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0004ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new byaa();
            }
            if (i2 == 4) {
                return new bxzx();
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
            dssr<byaa> dssrVar = f;
            if (dssrVar == null) {
                synchronized (byaa.class) {
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
