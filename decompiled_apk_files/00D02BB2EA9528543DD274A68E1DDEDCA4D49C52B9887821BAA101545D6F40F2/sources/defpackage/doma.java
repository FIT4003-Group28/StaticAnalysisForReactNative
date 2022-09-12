package defpackage;
/* compiled from: PG */
/* renamed from: doma  reason: default package */
/* loaded from: classes6.dex */
public final class doma extends dsqw<doma, dolz> implements dssk {
    public static final doma c;
    private static volatile dssr<doma> e;
    public int a;
    public dolq b;
    private int d;

    static {
        doma domaVar = new doma();
        c = domaVar;
        dsqw.cc(doma.class, domaVar);
    }

    private doma() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", dolx.a, "b"});
            }
            if (i2 == 3) {
                return new doma();
            }
            if (i2 == 4) {
                return new dolz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doma> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doma.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
