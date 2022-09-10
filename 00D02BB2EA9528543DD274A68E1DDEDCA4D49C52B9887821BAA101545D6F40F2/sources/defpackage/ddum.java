package defpackage;
/* compiled from: PG */
/* renamed from: ddum  reason: default package */
/* loaded from: classes6.dex */
public final class ddum extends dsqw<ddum, dduf> implements dssk {
    public static final ddum o;
    private static volatile dssr<ddum> p;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public ddlj n;

    static {
        ddum ddumVar = new ddum();
        o = ddumVar;
        dsqw.cc(ddum.class, ddumVar);
    }

    private ddum() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007\tဌ\b\nဌ\t\u000bဇ\n\fဇ\u000b\rဉ\f", new Object[]{"a", "b", dusa.a, "c", dvep.a, "d", "e", "f", "g", dduk.a, "h", ddug.a, "i", ddug.a, "j", ddug.a, "k", ddui.a, "l", "m", "n"});
            }
            if (i2 == 3) {
                return new ddum();
            }
            if (i2 == 4) {
                return new dduf();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddum> dssrVar = p;
            if (dssrVar == null) {
                synchronized (ddum.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
