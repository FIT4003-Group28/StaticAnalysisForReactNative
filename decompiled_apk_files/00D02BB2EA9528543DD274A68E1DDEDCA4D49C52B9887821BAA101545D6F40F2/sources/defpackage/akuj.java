package defpackage;
/* compiled from: PG */
/* renamed from: akuj  reason: default package */
/* loaded from: classes.dex */
public final class akuj extends dsqw<akuj, akui> implements dssk {
    public static final akuj e;
    private static volatile dssr<akuj> f;
    public int a;
    public float b;
    public akul c;
    public boolean d;

    static {
        akuj akujVar = new akuj();
        e = akujVar;
        dsqw.cc(akuj.class, akujVar);
    }

    private akuj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new akuj();
            }
            if (i2 == 4) {
                return new akui();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akuj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (akuj.class) {
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
