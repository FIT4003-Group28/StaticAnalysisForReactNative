package defpackage;
/* compiled from: PG */
/* renamed from: dihn  reason: default package */
/* loaded from: classes6.dex */
public final class dihn extends dsqw<dihn, dihm> implements dssk {
    public static final dihn e;
    private static volatile dssr<dihn> g;
    public int a;
    public dmbi c;
    public dnqh d;
    private byte f = 2;
    public String b = "";

    static {
        dihn dihnVar = new dihn();
        e = dihnVar;
        dsqw.cc(dihn.class, dihnVar);
    }

    private dihn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0002\u0004ဉ\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dihn();
            }
            if (i2 == 4) {
                return new dihm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dihn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dihn.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
