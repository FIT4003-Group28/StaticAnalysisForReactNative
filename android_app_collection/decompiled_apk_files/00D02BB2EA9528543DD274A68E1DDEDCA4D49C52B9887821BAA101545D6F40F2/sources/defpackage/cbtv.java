package defpackage;
/* compiled from: PG */
/* renamed from: cbtv  reason: default package */
/* loaded from: classes4.dex */
public final class cbtv extends dsqw<cbtv, cbtt> implements dssk {
    public static final cbtv h;
    private static volatile dssr<cbtv> j;
    public Object b;
    public cbtx c;
    private int i;
    public int a = 0;
    public String d = "";
    public String e = "";
    public String f = "";
    public int g = 1;

    static {
        cbtv cbtvVar = new cbtv();
        h = cbtvVar;
        dsqw.cc(cbtv.class, cbtvVar);
    }

    private cbtv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ြ\u0000\u0007ဌ\u0004", new Object[]{"b", "a", "i", "c", cbuj.class, "d", "e", "f", cbub.class, "g", cbug.a});
            }
            if (i2 == 3) {
                return new cbtv();
            }
            if (i2 == 4) {
                return new cbtt();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbtv> dssrVar = j;
            if (dssrVar == null) {
                synchronized (cbtv.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
