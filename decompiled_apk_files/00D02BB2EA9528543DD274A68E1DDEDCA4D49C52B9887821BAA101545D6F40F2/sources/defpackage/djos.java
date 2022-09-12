package defpackage;
/* compiled from: PG */
/* renamed from: djos  reason: default package */
/* loaded from: classes6.dex */
public final class djos extends dsqw<djos, djor> implements dssk {
    public static final djos d;
    private static volatile dssr<djos> f;
    public int a;
    public dixu b;
    public ddwb c;
    private byte e = 2;

    static {
        djos djosVar = new djos();
        d = djosVar;
        dsqw.cc(djos.class, djosVar);
    }

    private djos() {
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
                return new djos();
            }
            if (i2 == 4) {
                return new djor();
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
            dssr<djos> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djos.class) {
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
