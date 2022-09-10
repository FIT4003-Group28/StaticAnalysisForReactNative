package defpackage;
/* compiled from: PG */
/* renamed from: dulo  reason: default package */
/* loaded from: classes6.dex */
public final class dulo extends dsqw<dulo, duln> implements dssk {
    public static final dulo c;
    private static volatile dssr<dulo> d;
    public dsrf a = dsqz.b;
    public dsrf b = dsqz.b;

    static {
        dulo duloVar = new dulo();
        c = duloVar;
        dsqw.cc(dulo.class, duloVar);
    }

    private dulo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001e", new Object[]{"a", dulm.c(), "b", dulw.c()});
            }
            if (i2 == 3) {
                return new dulo();
            }
            if (i2 == 4) {
                return new duln();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dulo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dulo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
