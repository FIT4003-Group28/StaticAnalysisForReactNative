package defpackage;
/* compiled from: PG */
/* renamed from: aoum  reason: default package */
/* loaded from: classes2.dex */
public final class aoum extends dsqw<aoum, aouh> implements dssk {
    public static final aoum k;
    private static volatile dssr<aoum> l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long h;
    public String g = "";
    public String i = "";
    public String j = "";

    static {
        aoum aoumVar = new aoum();
        k = aoumVar;
        dsqw.cc(aoum.class, aoumVar);
    }

    private aoum() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဈ\b\tဈ\u0007", new Object[]{"a", "b", aoul.c(), "c", aouj.c(), "d", aouj.c(), "e", aouj.c(), "f", "g", "h", "j", "i"});
            }
            if (i2 == 3) {
                return new aoum();
            }
            if (i2 == 4) {
                return new aouh();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aoum> dssrVar = l;
            if (dssrVar == null) {
                synchronized (aoum.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
