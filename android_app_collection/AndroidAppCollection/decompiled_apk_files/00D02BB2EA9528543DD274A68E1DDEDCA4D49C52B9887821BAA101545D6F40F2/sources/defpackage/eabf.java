package defpackage;
/* compiled from: PG */
/* renamed from: eabf  reason: default package */
/* loaded from: classes.dex */
public final class eabf extends dsqw<eabf, eabd> implements dssk {
    public static final eabf k;
    private static volatile dssr<eabf> m;
    public int a;
    public boolean b;
    public eaav c;
    public int f;
    public long g;
    public long h;
    public ddzc j;
    private byte l = 2;
    public String d = "";
    public String e = "";
    public String i = "";

    static {
        eabf eabfVar = new eabf();
        k = eabfVar;
        dsqw.cc(eabf.class, eabfVar);
    }

    private eabf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006စ\u0005\u0007ဈ\u0007\bစ\u0006\tᐉ\b", new Object[]{"a", "b", "c", "d", "e", "f", eabe.a, "g", "i", "h", "j"});
            }
            if (i2 == 3) {
                return new eabf();
            }
            if (i2 == 4) {
                return new eabd();
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
            dssr<eabf> dssrVar = m;
            if (dssrVar == null) {
                synchronized (eabf.class) {
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
