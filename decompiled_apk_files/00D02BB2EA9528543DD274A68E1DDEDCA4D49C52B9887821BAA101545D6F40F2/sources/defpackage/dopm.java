package defpackage;
/* compiled from: PG */
/* renamed from: dopm  reason: default package */
/* loaded from: classes6.dex */
public final class dopm extends dsqw<dopm, dopl> implements dssk {
    public static final dopm c;
    private static volatile dssr<dopm> e;
    public String a = "";
    public dsrj<String> b = dssu.b;
    private int d;

    static {
        dopm dopmVar = new dopm();
        c = dopmVar;
        dsqw.cc(dopm.class, dopmVar);
    }

    private dopm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001a", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dopm();
            }
            if (i2 == 4) {
                return new dopl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dopm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dopm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
