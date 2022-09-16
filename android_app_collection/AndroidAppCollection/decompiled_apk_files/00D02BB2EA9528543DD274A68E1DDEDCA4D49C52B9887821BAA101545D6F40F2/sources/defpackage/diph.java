package defpackage;
/* compiled from: PG */
/* renamed from: diph  reason: default package */
/* loaded from: classes6.dex */
public final class diph extends dsqw<diph, dipg> implements dssk {
    public static final diph d;
    private static volatile dssr<diph> e;
    public int a;
    public long b;
    public String c = "";

    static {
        diph diphVar = new diph();
        d = diphVar;
        dsqw.cc(diph.class, diphVar);
    }

    private diph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new diph();
            }
            if (i2 == 4) {
                return new dipg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diph> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diph.class) {
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
