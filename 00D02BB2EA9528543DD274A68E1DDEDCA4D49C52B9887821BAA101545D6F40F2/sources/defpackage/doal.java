package defpackage;
/* compiled from: PG */
/* renamed from: doal  reason: default package */
/* loaded from: classes.dex */
public final class doal extends dsqw<doal, doag> implements dssk {
    public static final doal c;
    private static volatile dssr<doal> d;
    public dsrj<doak> a = dssu.b;
    public dsrj<doai> b = dssu.b;

    static {
        doal doalVar = new doal();
        c = doalVar;
        dsqw.cc(doal.class, doalVar);
    }

    private doal() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003\u001b", new Object[]{"b", doai.class, "a", doak.class});
            }
            if (i2 == 3) {
                return new doal();
            }
            if (i2 == 4) {
                return new doag();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doal> dssrVar = d;
            if (dssrVar == null) {
                synchronized (doal.class) {
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
