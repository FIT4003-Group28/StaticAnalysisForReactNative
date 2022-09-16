package defpackage;
/* compiled from: PG */
/* renamed from: dixa  reason: default package */
/* loaded from: classes6.dex */
public final class dixa extends dsqw<dixa, diwy> implements dssk {
    public static final dixa e;
    private static volatile dssr<dixa> h;
    public int a;
    public int d;
    private dnqh f;
    private byte g = 2;
    public String b = "";
    public String c = "";

    static {
        dixa dixaVar = new dixa();
        e = dixaVar;
        dsqw.cc(dixa.class, dixaVar);
    }

    private dixa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0001\u0002ဌ\u0002\u0003ᐉ\u0003\u0005ဈ\u0000\u0006ဈ\u0001", new Object[]{"a", "d", diwz.a, "f", "b", "c"});
            }
            if (i2 == 3) {
                return new dixa();
            }
            if (i2 == 4) {
                return new diwy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dixa> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dixa.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
