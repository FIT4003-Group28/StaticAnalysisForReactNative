package defpackage;
/* compiled from: PG */
/* renamed from: dsdp  reason: default package */
/* loaded from: classes6.dex */
public final class dsdp extends dsqw<dsdp, dsdm> implements dssk {
    public static final dsdp c;
    private static volatile dssr<dsdp> d;
    public int a;
    public dsdo b;

    static {
        dsdp dsdpVar = new dsdp();
        c = dsdpVar;
        dsqw.cc(dsdp.class, dsdpVar);
    }

    private dsdp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dsdp();
            }
            if (i2 == 4) {
                return new dsdm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsdp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsdp.class) {
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
