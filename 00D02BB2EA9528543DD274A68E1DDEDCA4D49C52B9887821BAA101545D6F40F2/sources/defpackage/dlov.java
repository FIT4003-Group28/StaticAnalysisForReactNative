package defpackage;
/* compiled from: PG */
/* renamed from: dlov  reason: default package */
/* loaded from: classes.dex */
public final class dlov extends dsqw<dlov, dlou> implements dssk {
    public static final dlov h;
    private static volatile dssr<dlov> i;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        dlov dlovVar = new dlov();
        h = dlovVar;
        dsqw.cc(dlov.class, dlovVar);
    }

    private dlov() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dlov();
            }
            if (i3 == 4) {
                return new dlou();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dlov> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dlov.class) {
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
