package defpackage;
/* compiled from: PG */
/* renamed from: dkae  reason: default package */
/* loaded from: classes6.dex */
public final class dkae extends dsqw<dkae, dkad> implements dssk {
    public static final dkae d;
    private static volatile dssr<dkae> f;
    public int a;
    public dppn b;
    public dnqh c;
    private byte e = 2;

    static {
        dkae dkaeVar = new dkae();
        d = dkaeVar;
        dsqw.cc(dkae.class, dkaeVar);
    }

    private dkae() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0001\u0003ᐉ\u0001\u0005ဉ\u0000", new Object[]{"a", "c", "b"});
            }
            if (i2 == 3) {
                return new dkae();
            }
            if (i2 == 4) {
                return new dkad();
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
            dssr<dkae> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkae.class) {
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
