package defpackage;
/* compiled from: PG */
/* renamed from: dlie  reason: default package */
/* loaded from: classes6.dex */
public final class dlie extends dsqw<dlie, dlid> implements dssk {
    public static final dlie c;
    private static volatile dssr<dlie> f;
    public dgrh a;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        dlie dlieVar = new dlie();
        c = dlieVar;
        dsqw.cc(dlie.class, dlieVar);
    }

    private dlie() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlie();
            }
            if (i2 == 4) {
                return new dlid();
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
            dssr<dlie> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlie.class) {
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
