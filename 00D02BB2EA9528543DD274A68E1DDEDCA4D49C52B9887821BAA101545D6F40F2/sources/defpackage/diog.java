package defpackage;
/* compiled from: PG */
/* renamed from: diog  reason: default package */
/* loaded from: classes6.dex */
public final class diog extends dsqw<diog, diod> implements dssk {
    public static final diog d;
    private static volatile dssr<diog> e;
    public int a;
    public diof b;
    public dinw c;

    static {
        diog diogVar = new diog();
        d = diogVar;
        dsqw.cc(diog.class, diogVar);
    }

    private diog() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new diog();
            }
            if (i2 == 4) {
                return new diod();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diog> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diog.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
