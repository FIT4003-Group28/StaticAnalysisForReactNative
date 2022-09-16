package defpackage;
/* compiled from: PG */
/* renamed from: difj  reason: default package */
/* loaded from: classes6.dex */
public final class difj extends dsqw<difj, difg> implements dssk {
    public static final difj b;
    private static volatile dssr<difj> f;
    private int c;
    private dnqh d;
    private byte e = 2;
    public dsrj<difi> a = dssu.b;

    static {
        difj difjVar = new difj();
        b = difjVar;
        dsqw.cc(difj.class, difjVar);
    }

    private difj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"c", "a", difi.class, "d"});
            }
            if (i2 == 3) {
                return new difj();
            }
            if (i2 == 4) {
                return new difg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            }
            dssr<difj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (difj.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
