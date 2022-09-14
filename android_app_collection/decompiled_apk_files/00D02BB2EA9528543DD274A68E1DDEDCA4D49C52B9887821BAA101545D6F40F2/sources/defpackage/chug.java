package defpackage;
/* compiled from: PG */
/* renamed from: chug  reason: default package */
/* loaded from: classes4.dex */
public final class chug extends dsqw<chug, chuf> implements dssk {
    public static final chug k;
    private static volatile dssr<chug> l;
    public int a;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String b = "";
    public String j = "";

    static {
        chug chugVar = new chug();
        k = chugVar;
        dsqw.cc(chug.class, chugVar);
    }

    private chug() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဈ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new chug();
            }
            if (i2 == 4) {
                return new chuf();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chug> dssrVar = l;
            if (dssrVar == null) {
                synchronized (chug.class) {
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
