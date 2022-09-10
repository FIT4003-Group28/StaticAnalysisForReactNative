package defpackage;
/* compiled from: PG */
/* renamed from: duvu  reason: default package */
/* loaded from: classes6.dex */
public final class duvu extends dsqw<duvu, duvt> implements dssk {
    public static final duvu h;
    private static volatile dssr<duvu> k;
    public int a;
    public int b;
    public dpvk c;
    public int d;
    public djgw g;
    private dnqh i;
    private byte j = 2;
    public String e = "";
    public String f = "";

    static {
        duvu duvuVar = new duvu();
        h = duvuVar;
        dsqw.cc(duvu.class, duvuVar);
    }

    private duvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004င\u0003\u0005ဈ\u0004\u0007ဈ\u0005\bဉ\u0006", new Object[]{"a", "b", duvs.a, "c", "i", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new duvu();
            }
            if (i2 == 4) {
                return new duvt();
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
            dssr<duvu> dssrVar = k;
            if (dssrVar == null) {
                synchronized (duvu.class) {
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
