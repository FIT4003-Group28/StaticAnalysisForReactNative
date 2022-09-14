package defpackage;
/* compiled from: PG */
/* renamed from: diyf  reason: default package */
/* loaded from: classes6.dex */
public final class diyf extends dsqw<diyf, diya> implements dssk {
    public static final diyf h;
    private static volatile dssr<diyf> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public dsrj<diye> f = dssu.b;
    public int g;

    static {
        diyf diyfVar = new diyf();
        h = diyfVar;
        dsqw.cc(diyf.class, diyfVar);
    }

    private diyf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0000\u0002င\u0002\u0003င\u0003\u0005ဈ\u0004\u0006\u001b\u0007င\u0005\bင\u0001", new Object[]{"a", "c", "d", "e", "f", diye.class, "g", "b"});
            }
            if (i3 == 3) {
                return new diyf();
            }
            if (i3 == 4) {
                return new diya();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<diyf> dssrVar = i;
            if (dssrVar == null) {
                synchronized (diyf.class) {
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
