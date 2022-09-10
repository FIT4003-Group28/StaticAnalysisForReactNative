package defpackage;
/* compiled from: PG */
/* renamed from: diob  reason: default package */
/* loaded from: classes6.dex */
public final class diob extends dsqw<diob, dioa> implements dssk {
    public static final diob d;
    private static volatile dssr<diob> f;
    public String a = "";
    public String b = "";
    public boolean c;
    private int e;

    static {
        diob diobVar = new diob();
        d = diobVar;
        dsqw.cc(diob.class, diobVar);
    }

    private diob() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new diob();
            }
            if (i2 == 4) {
                return new dioa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diob> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diob.class) {
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
