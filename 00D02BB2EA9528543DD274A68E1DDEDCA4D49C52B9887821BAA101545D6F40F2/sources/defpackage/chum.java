package defpackage;
/* compiled from: PG */
/* renamed from: chum  reason: default package */
/* loaded from: classes4.dex */
public final class chum extends dsqw<chum, chul> implements dssk {
    public static final chum p;
    private static volatile dssr<chum> q;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public String n = "";
    public boolean o;

    static {
        chum chumVar = new chum();
        p = chumVar;
        dsqw.cc(chum.class, chumVar);
    }

    private chum() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fဇ\u000b\rဈ\f\u000eဇ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            }
            if (i2 == 3) {
                return new chum();
            }
            if (i2 == 4) {
                return new chul();
            }
            if (i2 == 5) {
                return p;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chum> dssrVar = q;
            if (dssrVar == null) {
                synchronized (chum.class) {
                    dssrVar = q;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(p);
                        q = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
