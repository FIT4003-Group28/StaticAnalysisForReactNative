package defpackage;
/* compiled from: PG */
/* renamed from: duga  reason: default package */
/* loaded from: classes6.dex */
public final class duga extends dsqw<duga, dufz> implements dssk {
    public static final duga d;
    private static volatile dssr<duga> f;
    public dufm a;
    public String b = "";
    public boolean c;
    private int e;

    static {
        duga dugaVar = new duga();
        d = dugaVar;
        dsqw.cc(duga.class, dugaVar);
    }

    private duga() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new duga();
            }
            if (i2 == 4) {
                return new dufz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duga> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duga.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
