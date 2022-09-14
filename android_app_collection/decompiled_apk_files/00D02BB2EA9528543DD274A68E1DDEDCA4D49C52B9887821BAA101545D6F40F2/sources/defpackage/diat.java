package defpackage;
/* compiled from: PG */
/* renamed from: diat  reason: default package */
/* loaded from: classes6.dex */
public final class diat extends dsqw<diat, dias> implements dssk {
    public static final diat d;
    private static volatile dssr<diat> f;
    public int a;
    public dnzj b;
    public diwd c;
    private byte e = 2;

    static {
        diat diatVar = new diat();
        d = diatVar;
        dsqw.cc(diat.class, diatVar);
    }

    private diat() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new diat();
            }
            if (i2 == 4) {
                return new dias();
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
            dssr<diat> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diat.class) {
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
