package defpackage;
/* compiled from: PG */
/* renamed from: dwvz  reason: default package */
/* loaded from: classes6.dex */
public final class dwvz extends dsqw<dwvz, dwvu> implements dssk {
    public static final dwvz n;
    private static volatile dssr<dwvz> o;
    public int a;
    public duls c;
    public dwvw f;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public drfs m;
    public String b = "";
    public String d = "";
    public int e = 1;
    public String g = "";

    static {
        dwvz dwvzVar = new dwvz();
        n = dwvzVar;
        dsqw.cc(dwvz.class, dwvzVar);
    }

    private dwvz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0004ဈ\u0003\u0005ဈ\u0006\u0007ဌ\u0004\bဇ\u0007\tဉ\u0005\nဇ\t\u000bဇ\f\fဉ\u000e\rဇ\n\u000eဇ\r", new Object[]{"a", "b", "c", "d", "g", "e", dwvy.c(), "h", "f", "i", "k", "m", "j", "l"});
            }
            if (i2 == 3) {
                return new dwvz();
            }
            if (i2 == 4) {
                return new dwvu();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwvz> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dwvz.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
