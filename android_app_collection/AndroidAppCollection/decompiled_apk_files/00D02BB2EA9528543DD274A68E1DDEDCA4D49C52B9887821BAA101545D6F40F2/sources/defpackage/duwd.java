package defpackage;
/* compiled from: PG */
/* renamed from: duwd  reason: default package */
/* loaded from: classes.dex */
public final class duwd extends dsqw<duwd, duwc> implements dssk {
    public static final duwd f;
    private static volatile dssr<duwd> h;
    public boolean a;
    public String b = "";
    public boolean c = true;
    public String d = "";
    public int e = 31536000;
    private int g;

    static {
        duwd duwdVar = new duwd();
        f = duwdVar;
        dsqw.cc(duwd.class, duwdVar);
    }

    private duwd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\bဈ\u0007\tင\b", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new duwd();
            }
            if (i2 == 4) {
                return new duwc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duwd> dssrVar = h;
            if (dssrVar == null) {
                synchronized (duwd.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
