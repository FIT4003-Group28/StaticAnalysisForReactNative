package defpackage;
/* compiled from: PG */
/* renamed from: dqtk  reason: default package */
/* loaded from: classes6.dex */
public final class dqtk extends dsqw<dqtk, dqtj> implements dssk {
    public static final dqtk d;
    private static volatile dssr<dqtk> f;
    public String a = "";
    public String b = "";
    public String c = "";
    private int e;

    static {
        dqtk dqtkVar = new dqtk();
        d = dqtkVar;
        dsqw.cc(dqtk.class, dqtkVar);
    }

    private dqtk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqtk();
            }
            if (i2 == 4) {
                return new dqtj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqtk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqtk.class) {
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
