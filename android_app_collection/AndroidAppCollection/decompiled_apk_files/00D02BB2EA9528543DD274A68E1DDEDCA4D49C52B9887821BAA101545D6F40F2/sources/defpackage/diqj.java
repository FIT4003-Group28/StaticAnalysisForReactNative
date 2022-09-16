package defpackage;
/* compiled from: PG */
/* renamed from: diqj  reason: default package */
/* loaded from: classes6.dex */
public final class diqj extends dsqw<diqj, diqi> implements dssk {
    public static final diqj d;
    private static volatile dssr<diqj> f;
    public int a;
    public dnqh c;
    private byte e = 2;
    public dsrj<dldl> b = dssu.b;

    static {
        diqj diqjVar = new diqj();
        d = diqjVar;
        dsqw.cc(diqj.class, diqjVar);
    }

    private diqj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"a", "b", dldl.class, "c"});
            }
            if (i2 == 3) {
                return new diqj();
            }
            if (i2 == 4) {
                return new diqi();
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
            dssr<diqj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diqj.class) {
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
