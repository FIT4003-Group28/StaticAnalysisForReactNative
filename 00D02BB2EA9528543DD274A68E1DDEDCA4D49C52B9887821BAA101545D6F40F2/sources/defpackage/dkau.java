package defpackage;
/* compiled from: PG */
/* renamed from: dkau  reason: default package */
/* loaded from: classes6.dex */
public final class dkau extends dsqw<dkau, dkat> implements dssk {
    public static final dkau f;
    private static volatile dssr<dkau> h;
    public int a;
    public Object c;
    public dpov d;
    public dnqh e;
    public int b = 0;
    private byte g = 2;

    static {
        dkau dkauVar = new dkau();
        f = dkauVar;
        dsqw.cc(dkau.class, dkauVar);
    }

    private dkau() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဿ\u0000\u0003ဿ\u0000\u0004ᐉ\u0003", new Object[]{"c", "b", "a", "d", dpqn.c(), dpqq.a, "e"});
            }
            if (i2 == 3) {
                return new dkau();
            }
            if (i2 == 4) {
                return new dkat();
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
            dssr<dkau> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkau.class) {
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
