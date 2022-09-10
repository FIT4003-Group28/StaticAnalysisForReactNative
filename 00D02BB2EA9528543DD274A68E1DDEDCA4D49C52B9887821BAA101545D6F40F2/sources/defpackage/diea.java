package defpackage;
/* compiled from: PG */
/* renamed from: diea  reason: default package */
/* loaded from: classes6.dex */
public final class diea extends dsqw<diea, didl> implements dssk {
    public static final diea c;
    private static volatile dssr<diea> g;
    public Object b;
    private int d;
    private dnqh e;
    public int a = 0;
    private byte f = 2;

    static {
        diea dieaVar = new diea();
        c = dieaVar;
        dsqw.cc(diea.class, dieaVar);
    }

    private diea() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ြ\u0000\u0003ြ\u0000\u0004ᐉ\u0006\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", "d", didk.class, didn.class, "e", didz.class, didx.class, didr.class});
            }
            if (i2 == 3) {
                return new diea();
            }
            if (i2 == 4) {
                return new didl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<diea> dssrVar = g;
            if (dssrVar == null) {
                synchronized (diea.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
