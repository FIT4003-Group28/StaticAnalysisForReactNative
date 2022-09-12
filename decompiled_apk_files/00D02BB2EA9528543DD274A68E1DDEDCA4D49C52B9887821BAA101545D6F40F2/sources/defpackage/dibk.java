package defpackage;
/* compiled from: PG */
/* renamed from: dibk  reason: default package */
/* loaded from: classes6.dex */
public final class dibk extends dsqw<dibk, dibj> implements dssk {
    public static final dibk d;
    private static volatile dssr<dibk> f;
    public int a;
    public dnqh c;
    private byte e = 2;
    public dsrj<dppt> b = dssu.b;

    static {
        dibk dibkVar = new dibk();
        d = dibkVar;
        dsqw.cc(dibk.class, dibkVar);
    }

    private dibk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"a", "b", dppt.class, "c"});
            }
            if (i2 == 3) {
                return new dibk();
            }
            if (i2 == 4) {
                return new dibj();
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
            dssr<dibk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dibk.class) {
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
