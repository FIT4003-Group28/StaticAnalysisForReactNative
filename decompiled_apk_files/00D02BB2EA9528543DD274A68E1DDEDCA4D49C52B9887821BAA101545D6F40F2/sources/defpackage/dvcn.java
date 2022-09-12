package defpackage;
/* compiled from: PG */
/* renamed from: dvcn  reason: default package */
/* loaded from: classes6.dex */
public final class dvcn extends dsqw<dvcn, dvcm> implements dssk {
    public static final dvcn c;
    private static volatile dssr<dvcn> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dvcn dvcnVar = new dvcn();
        c = dvcnVar;
        dsqw.cc(dvcn.class, dvcnVar);
    }

    private dvcn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dvcn();
            }
            if (i2 == 4) {
                return new dvcm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvcn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvcn.class) {
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
