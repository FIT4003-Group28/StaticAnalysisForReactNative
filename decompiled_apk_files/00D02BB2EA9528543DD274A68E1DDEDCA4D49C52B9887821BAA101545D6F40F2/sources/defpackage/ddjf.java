package defpackage;
/* compiled from: PG */
/* renamed from: ddjf  reason: default package */
/* loaded from: classes.dex */
public final class ddjf extends dsqw<ddjf, ddje> implements dssk {
    public static final ddjf e;
    private static volatile dssr<ddjf> f;
    public int a;
    public String b = "";
    public boolean c;
    public boolean d;

    static {
        ddjf ddjfVar = new ddjf();
        e = ddjfVar;
        dsqw.cc(ddjf.class, ddjfVar);
    }

    private ddjf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddjf();
            }
            if (i2 == 4) {
                return new ddje();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddjf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddjf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
