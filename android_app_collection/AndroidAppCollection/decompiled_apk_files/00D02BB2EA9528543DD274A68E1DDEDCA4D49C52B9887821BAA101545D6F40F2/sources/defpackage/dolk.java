package defpackage;
/* compiled from: PG */
/* renamed from: dolk  reason: default package */
/* loaded from: classes.dex */
public final class dolk extends dsqw<dolk, dolj> implements dssk {
    public static final dolk h;
    private static volatile dssr<dolk> i;
    public int a;
    public dnoh e;
    public boolean f;
    public String b = "";
    public dsrj<String> c = dssu.b;
    public String d = "";
    public String g = "";

    static {
        dolk dolkVar = new dolk();
        h = dolkVar;
        dsqw.cc(dolk.class, dolkVar);
    }

    private dolk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဉ\u0002\u0005ဇ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dolk();
            }
            if (i3 == 4) {
                return new dolj();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dolk> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dolk.class) {
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
