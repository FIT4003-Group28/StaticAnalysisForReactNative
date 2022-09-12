package defpackage;
/* compiled from: PG */
/* renamed from: dwhj  reason: default package */
/* loaded from: classes6.dex */
public final class dwhj extends dsqw<dwhj, dwhg> implements dssk {
    public static final dwhj f;
    private static volatile dssr<dwhj> h;
    public int a;
    public int b;
    public dpjx c;
    public dvyw d;
    public dfyp e;
    private byte g = 2;

    static {
        dwhj dwhjVar = new dwhj();
        f = dwhjVar;
        dsqw.cc(dwhj.class, dwhjVar);
    }

    private dwhj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0005ဉ\u0004", new Object[]{"a", "b", dwhh.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dwhj();
            }
            if (i2 == 4) {
                return new dwhg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dwhj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwhj.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
