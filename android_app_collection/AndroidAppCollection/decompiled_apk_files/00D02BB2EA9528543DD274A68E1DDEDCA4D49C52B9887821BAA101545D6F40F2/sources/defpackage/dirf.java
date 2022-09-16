package defpackage;
/* compiled from: PG */
/* renamed from: dirf  reason: default package */
/* loaded from: classes6.dex */
public final class dirf extends dsqw<dirf, dire> implements dssk {
    public static final dirf f;
    private static volatile dssr<dirf> h;
    public int a;
    public int d;
    public dnqh e;
    private byte g = 2;
    public dsrj<dkzo> b = dssu.b;
    public dsrj<dlas> c = dssu.b;

    static {
        dirf dirfVar = new dirf();
        f = dirfVar;
        dsqw.cc(dirf.class, dirfVar);
    }

    private dirf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0001\u0001\u001b\u0002\u001b\u0003ᐉ\u0001\u0006ဌ\u0000", new Object[]{"a", "b", dkzo.class, "c", dlas.class, "e", "d", dkzq.c()});
            }
            if (i2 == 3) {
                return new dirf();
            }
            if (i2 == 4) {
                return new dire();
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
            dssr<dirf> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dirf.class) {
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
