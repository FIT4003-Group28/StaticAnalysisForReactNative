package defpackage;
/* compiled from: PG */
/* renamed from: dieh  reason: default package */
/* loaded from: classes6.dex */
public final class dieh extends dsqw<dieh, diee> implements dssk {
    public static final dieh d;
    private static volatile dssr<dieh> f;
    public dspd a = dspd.b;
    public String b = "";
    public int c;
    private int e;

    static {
        dieh diehVar = new dieh();
        d = diehVar;
        dsqw.cc(dieh.class, diehVar);
    }

    private dieh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", dief.a});
            }
            if (i2 == 3) {
                return new dieh();
            }
            if (i2 == 4) {
                return new diee();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dieh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dieh.class) {
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
