package defpackage;
/* compiled from: PG */
/* renamed from: dvqo  reason: default package */
/* loaded from: classes6.dex */
public final class dvqo extends dsqw<dvqo, dvqn> implements dssk {
    public static final dvqo c;
    private static volatile dssr<dvqo> d;
    public int a;
    public double b;

    static {
        dvqo dvqoVar = new dvqo();
        c = dvqoVar;
        dsqw.cc(dvqo.class, dvqoVar);
    }

    private dvqo() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002က\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvqo();
            }
            if (i2 == 4) {
                return new dvqn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvqo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvqo.class) {
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
