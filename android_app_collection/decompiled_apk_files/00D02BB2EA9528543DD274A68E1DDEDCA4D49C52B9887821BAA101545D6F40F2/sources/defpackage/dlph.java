package defpackage;
/* compiled from: PG */
/* renamed from: dlph  reason: default package */
/* loaded from: classes6.dex */
public final class dlph extends dsqw<dlph, dlpe> implements dssk {
    public static final dlph l;
    private static volatile dssr<dlph> n;
    public int a;
    public dvfg c;
    public boolean d;
    public dlte e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public dlpd j;
    public dlpd k;
    private byte m = 2;
    public String b = "";

    static {
        dlph dlphVar = new dlph();
        l = dlphVar;
        dsqw.cc(dlph.class, dlphVar);
    }

    private dlph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဉ\b\nဉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new dlph();
            }
            if (i2 == 4) {
                return new dlpe();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<dlph> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dlph.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
