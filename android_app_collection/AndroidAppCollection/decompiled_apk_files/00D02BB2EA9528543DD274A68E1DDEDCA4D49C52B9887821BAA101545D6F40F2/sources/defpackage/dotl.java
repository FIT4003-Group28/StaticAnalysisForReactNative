package defpackage;
/* compiled from: PG */
/* renamed from: dotl  reason: default package */
/* loaded from: classes6.dex */
public final class dotl extends dsqw<dotl, dotk> implements dssk {
    public static final dotl d;
    private static volatile dssr<dotl> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dotl dotlVar = new dotl();
        d = dotlVar;
        dsqw.cc(dotl.class, dotlVar);
    }

    private dotl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dotl();
            }
            if (i2 == 4) {
                return new dotk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dotl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dotl.class) {
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
