package defpackage;
/* compiled from: PG */
/* renamed from: cpzi  reason: default package */
/* loaded from: classes5.dex */
public final class cpzi extends dsqs<cpzi, cpzg> implements dsqt {
    public static final cpzi c;
    private static volatile dssr<cpzi> e;
    public int a;
    public int b;
    private byte d = 2;

    static {
        cpzi cpziVar = new cpzi();
        c = cpziVar;
        dsqw.cc(cpzi.class, cpziVar);
    }

    private cpzi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cpzh.a});
            }
            if (i2 == 3) {
                return new cpzi();
            }
            if (i2 == 4) {
                return new cpzg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<cpzi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cpzi.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
