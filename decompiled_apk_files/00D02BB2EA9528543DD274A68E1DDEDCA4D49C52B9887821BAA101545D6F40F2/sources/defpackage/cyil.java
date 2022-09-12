package defpackage;
/* compiled from: PG */
/* renamed from: cyil  reason: default package */
/* loaded from: classes5.dex */
public final class cyil extends dsqw<cyil, cyih> implements dssk {
    public static final cyil f;
    private static volatile dssr<cyil> g;
    public int a;
    public double b;
    public String c = "";
    public boolean d;
    public cyij e;

    static {
        cyil cyilVar = new cyil();
        f = cyilVar;
        dsqw.cc(cyil.class, cyilVar);
    }

    private cyil() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003Ȉ\u0004\u0007\u0005\t", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new cyil();
            }
            if (i2 == 4) {
                return new cyih();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyil> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cyil.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
