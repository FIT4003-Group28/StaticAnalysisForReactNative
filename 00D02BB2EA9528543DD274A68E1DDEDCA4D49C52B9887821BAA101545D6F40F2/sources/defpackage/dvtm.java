package defpackage;
/* compiled from: PG */
/* renamed from: dvtm  reason: default package */
/* loaded from: classes6.dex */
public final class dvtm extends dsqw<dvtm, dvtl> implements dssk {
    public static final dvtm a;
    private static volatile dssr<dvtm> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dvtm dvtmVar = new dvtm();
        a = dvtmVar;
        dsqw.cc(dvtm.class, dvtmVar);
    }

    private dvtm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dvtm();
            }
            if (i2 == 4) {
                return new dvtl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dvtm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvtm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
