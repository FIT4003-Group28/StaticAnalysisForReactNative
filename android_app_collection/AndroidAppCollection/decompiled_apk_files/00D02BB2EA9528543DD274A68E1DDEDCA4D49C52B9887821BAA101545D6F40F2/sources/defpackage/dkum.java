package defpackage;
/* compiled from: PG */
/* renamed from: dkum  reason: default package */
/* loaded from: classes.dex */
public final class dkum extends dsqw<dkum, dkul> implements dssk {
    public static final dkum c;
    private static volatile dssr<dkum> d;
    public int a;
    public dqfo b;

    static {
        dkum dkumVar = new dkum();
        c = dkumVar;
        dsqw.cc(dkum.class, dkumVar);
    }

    private dkum() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkum();
            }
            if (i2 == 4) {
                return new dkul();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkum> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkum.class) {
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
