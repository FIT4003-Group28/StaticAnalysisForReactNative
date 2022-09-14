package defpackage;
/* compiled from: PG */
/* renamed from: dojz  reason: default package */
/* loaded from: classes.dex */
public final class dojz extends dsqw<dojz, dojy> implements dssk {
    public static final dojz c;
    private static volatile dssr<dojz> d;
    public int a;
    public long b;

    static {
        dojz dojzVar = new dojz();
        c = dojzVar;
        dsqw.cc(dojz.class, dojzVar);
    }

    private dojz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dojz();
            }
            if (i2 == 4) {
                return new dojy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dojz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dojz.class) {
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
