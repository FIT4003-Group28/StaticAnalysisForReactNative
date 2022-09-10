package defpackage;
/* compiled from: PG */
/* renamed from: dopa  reason: default package */
/* loaded from: classes6.dex */
public final class dopa extends dsqw<dopa, dooz> implements dssk {
    public static final dopa c;
    private static volatile dssr<dopa> d;
    public int a;
    public int b;

    static {
        dopa dopaVar = new dopa();
        c = dopaVar;
        dsqw.cc(dopa.class, dopaVar);
    }

    private dopa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dopa();
            }
            if (i2 == 4) {
                return new dooz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dopa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dopa.class) {
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
