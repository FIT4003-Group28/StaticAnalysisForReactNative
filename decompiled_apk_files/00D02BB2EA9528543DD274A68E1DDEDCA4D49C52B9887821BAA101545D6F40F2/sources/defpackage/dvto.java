package defpackage;
/* compiled from: PG */
/* renamed from: dvto  reason: default package */
/* loaded from: classes6.dex */
public final class dvto extends dsqw<dvto, dvtn> implements dssk {
    public static final dvto k;
    private static volatile dssr<dvto> m;
    public int a;
    public dtnd b;
    public dnwj c;
    public dvxt d;
    public dhkd e;
    public dhkd f;
    public dnzj g;
    public dwfv i;
    public dnqh j;
    private byte l = 2;
    public dsrf h = dsqz.b;

    static {
        dvto dvtoVar = new dvto();
        k = dvtoVar;
        dsqw.cc(dvto.class, dvtoVar);
    }

    private dvto() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0002\u000e\t\u0000\u0001\u0003\u0002ᐉ\n\u0005ᐉ\u0000\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\nᐉ\u0007\u000b\u001e\rဉ\u0002\u000eဉ\t", new Object[]{"a", "j", "b", "d", "e", "f", "g", "h", dvxj.c(), "c", "i"});
            }
            if (i2 == 3) {
                return new dvto();
            }
            if (i2 == 4) {
                return new dvtn();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<dvto> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dvto.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
