package defpackage;
/* compiled from: PG */
/* renamed from: dhmz  reason: default package */
/* loaded from: classes6.dex */
public final class dhmz extends dsqw<dhmz, dhmy> implements dssk {
    public static final dhmz h;
    private static volatile dssr<dhmz> i;
    public int a;
    public dhjz e;
    public float g;
    public String b = "";
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        dhmz dhmzVar = new dhmz();
        h = dhmzVar;
        dsqw.cc(dhmz.class, dhmzVar);
    }

    private dhmz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ခ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dhmz();
            }
            if (i3 == 4) {
                return new dhmy();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dhmz> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dhmz.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
