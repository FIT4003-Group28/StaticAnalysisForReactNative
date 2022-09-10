package defpackage;
/* compiled from: PG */
/* renamed from: absi  reason: default package */
/* loaded from: classes2.dex */
public final class absi extends dsqw<absi, absh> implements dssk {
    public static final absi d;
    private static volatile dssr<absi> f;
    public int a;
    public dhjx b;
    public dhym c;
    private byte e = 2;

    static {
        absi absiVar = new absi();
        d = absiVar;
        dsqw.cc(absi.class, absiVar);
    }

    private absi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new absi();
            }
            if (i2 == 4) {
                return new absh();
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
            dssr<absi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (absi.class) {
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
