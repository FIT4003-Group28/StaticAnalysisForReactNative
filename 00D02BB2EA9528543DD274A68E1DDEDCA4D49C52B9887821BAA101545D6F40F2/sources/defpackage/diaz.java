package defpackage;
/* compiled from: PG */
/* renamed from: diaz  reason: default package */
/* loaded from: classes6.dex */
public final class diaz extends dsqw<diaz, diay> implements dssk {
    public static final diaz f;
    private static volatile dssr<diaz> h;
    public int a;
    public dppt b;
    public dvyw c;
    public diwb d;
    public int e;
    private byte g = 2;

    static {
        diaz diazVar = new diaz();
        f = diazVar;
        dsqw.cc(diaz.class, diazVar);
    }

    private diaz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0003\u0004ᐉ\u0002", new Object[]{"a", "b", "c", "e", dqhy.c(), "d"});
            }
            if (i2 == 3) {
                return new diaz();
            }
            if (i2 == 4) {
                return new diay();
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
            dssr<diaz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (diaz.class) {
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
