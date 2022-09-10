package defpackage;
/* compiled from: PG */
/* renamed from: ddsn  reason: default package */
/* loaded from: classes6.dex */
public final class ddsn extends dsqw<ddsn, ddsm> implements dssk {
    public static final ddsn c;
    private static volatile dssr<ddsn> d;
    public int a;
    public int b;

    static {
        ddsn ddsnVar = new ddsn();
        c = ddsnVar;
        dsqw.cc(ddsn.class, ddsnVar);
    }

    private ddsn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddsn();
            }
            if (i2 == 4) {
                return new ddsm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddsn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddsn.class) {
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
