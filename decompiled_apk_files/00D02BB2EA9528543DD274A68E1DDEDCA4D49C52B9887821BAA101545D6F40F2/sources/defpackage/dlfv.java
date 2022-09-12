package defpackage;
/* compiled from: PG */
/* renamed from: dlfv  reason: default package */
/* loaded from: classes6.dex */
public final class dlfv extends dsqw<dlfv, dlfu> implements dssk {
    public static final dlfv h;
    private static volatile dssr<dlfv> i;
    public int a;
    public dlft b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public dlgn g;

    static {
        dlfv dlfvVar = new dlfv();
        h = dlfvVar;
        dsqw.cc(dlfv.class, dlfvVar);
    }

    private dlfv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0005\u0006ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
            }
            if (i3 == 3) {
                return new dlfv();
            }
            if (i3 == 4) {
                return new dlfu();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dlfv> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dlfv.class) {
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
