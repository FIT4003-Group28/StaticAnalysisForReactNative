package defpackage;
/* compiled from: PG */
/* renamed from: eaam  reason: default package */
/* loaded from: classes.dex */
public final class eaam extends dsqw<eaam, eaak> implements dssk {
    public static final eaam k;
    private static volatile dssr<eaam> m;
    public int a;
    public long c;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;
    private byte l = 2;
    public String b = "";
    public String d = "";

    static {
        eaam eaamVar = new eaam();
        k = eaamVar;
        dsqw.cc(eaam.class, eaamVar);
    }

    private eaam() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002စ\u0003\u0003စ\u0004\u0004ဂ\u0005\u0005ဂ\u0006\u0006ဂ\b\u0007ဌ\t\bစ\u0001\tဈ\u0002", new Object[]{"a", "b", "e", "f", "g", "h", "i", "j", eaal.a, "c", "d"});
            }
            if (i2 == 3) {
                return new eaam();
            }
            if (i2 == 4) {
                return new eaak();
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
            dssr<eaam> dssrVar = m;
            if (dssrVar == null) {
                synchronized (eaam.class) {
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
