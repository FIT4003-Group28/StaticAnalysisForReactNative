package defpackage;
/* compiled from: PG */
/* renamed from: dggk  reason: default package */
/* loaded from: classes6.dex */
public final class dggk extends dsqw<dggk, dggj> implements dssk {
    public static final dggk c;
    private static volatile dssr<dggk> d;
    public int a;
    public dgga b;

    static {
        dggk dggkVar = new dggk();
        c = dggkVar;
        dsqw.cc(dggk.class, dggkVar);
    }

    private dggk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dggk();
            }
            if (i2 == 4) {
                return new dggj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dggk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dggk.class) {
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
