package defpackage;
/* compiled from: PG */
/* renamed from: doga  reason: default package */
/* loaded from: classes6.dex */
public final class doga extends dsqw<doga, dofz> implements dssk {
    public static final doga e;
    private static volatile dssr<doga> g;
    public long a;
    public String b = "";
    public String c = "";
    public dojz d;
    private int f;

    static {
        doga dogaVar = new doga();
        e = dogaVar;
        dsqw.cc(doga.class, dogaVar);
    }

    private doga() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new doga();
            }
            if (i2 == 4) {
                return new dofz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doga> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doga.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
