package defpackage;
/* compiled from: PG */
/* renamed from: dume  reason: default package */
/* loaded from: classes6.dex */
public final class dume extends dsqw<dume, dumd> implements dssk {
    public static final dume f;
    private static volatile dssr<dume> g;
    public int a;
    public dumx b;
    public String c = "";
    public dsrf d = dsqz.b;
    public String e = "";

    static {
        dume dumeVar = new dume();
        f = dumeVar;
        dsqw.cc(dume.class, dumeVar);
    }

    private dume() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003\u0016\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dume();
            }
            if (i2 == 4) {
                return new dumd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dume> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dume.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
