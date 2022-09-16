package defpackage;
/* compiled from: PG */
/* renamed from: djxo  reason: default package */
/* loaded from: classes6.dex */
public final class djxo extends dsqw<djxo, djxl> implements dssk {
    public static final djxo f;
    private static volatile dssr<djxo> h;
    public int a;
    public int e;
    private byte g = 2;
    public dsrj<dopk> b = dssu.b;
    public dsrj<dvzn> c = dssu.b;
    public dsrj<djxn> d = dssu.b;

    static {
        djxo djxoVar = new djxo();
        f = djxoVar;
        dsqw.cc(djxo.class, djxoVar);
    }

    private djxo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0007\f\u0004\u0000\u0003\u0002\u0007Л\b\u001b\tЛ\fင\u0005", new Object[]{"a", "b", dopk.class, "c", dvzn.class, "d", djxn.class, "e"});
            }
            if (i2 == 3) {
                return new djxo();
            }
            if (i2 == 4) {
                return new djxl();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<djxo> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djxo.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
