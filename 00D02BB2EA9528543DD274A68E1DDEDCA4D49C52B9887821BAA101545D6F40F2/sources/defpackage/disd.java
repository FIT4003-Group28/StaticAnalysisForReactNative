package defpackage;
/* compiled from: PG */
/* renamed from: disd  reason: default package */
/* loaded from: classes6.dex */
public final class disd extends dsqw<disd, diro> implements dssk {
    public static final disd d;
    private static volatile dssr<disd> g;
    public int a;
    public dutq c;
    private dnqh e;
    private byte f = 2;
    public dsrj<dirs> b = dssu.b;

    static {
        disd disdVar = new disd();
        d = disdVar;
        dsqw.cc(disd.class, disdVar);
    }

    private disd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0002\u0002Л\u0003ᐉ\u0000\u0004ဉ\u0001", new Object[]{"a", "b", dirs.class, "e", "c"});
            }
            if (i2 == 3) {
                return new disd();
            }
            if (i2 == 4) {
                return new diro();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<disd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (disd.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
