package defpackage;
/* compiled from: PG */
/* renamed from: dvhk  reason: default package */
/* loaded from: classes6.dex */
public final class dvhk extends dsqw<dvhk, dvhj> implements dssk {
    public static final dvhk c;
    private static volatile dssr<dvhk> e;
    public int a;
    public dvyw b;
    private byte d = 2;

    static {
        dvhk dvhkVar = new dvhk();
        c = dvhkVar;
        dsqw.cc(dvhk.class, dvhkVar);
    }

    private dvhk() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvhk();
            }
            if (i2 == 4) {
                return new dvhj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dvhk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvhk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
