package defpackage;
/* compiled from: PG */
/* renamed from: dvjt  reason: default package */
/* loaded from: classes6.dex */
public final class dvjt extends dsqw<dvjt, dvjs> implements dssk {
    public static final dvjt h;
    private static volatile dssr<dvjt> k;
    public int a;
    public int b;
    public dnkc c;
    public long g;
    private dnqh i;
    private byte j = 2;
    public dsrj<dnkc> d = dssu.b;
    public String e = "";
    public String f = "";

    static {
        dvjt dvjtVar = new dvjt();
        h = dvjtVar;
        dsqw.cc(dvjt.class, dvjtVar);
    }

    private dvjt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဈ\u0002\u0005ဈ\u0003\u0006ᐉ\u0005\u0007ဂ\u0004", new Object[]{"a", "b", dnvv.a, "c", "d", dnkc.class, "e", "f", "i", "g"});
            }
            if (i2 == 3) {
                return new dvjt();
            }
            if (i2 == 4) {
                return new dvjs();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dvjt> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dvjt.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
