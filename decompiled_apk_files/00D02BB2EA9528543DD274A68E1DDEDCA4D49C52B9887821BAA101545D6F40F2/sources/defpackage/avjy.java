package defpackage;
/* compiled from: PG */
/* renamed from: avjy  reason: default package */
/* loaded from: classes3.dex */
public final class avjy extends dsqw<avjy, avjr> implements dssk {
    public static final avjy l;
    private static volatile dssr<avjy> m;
    public int a;
    public boolean b;
    public int e;
    public int h;
    public boolean k;
    public boolean c = true;
    public boolean d = true;
    public int f = 3;
    public int g = 1;
    public String i = "";
    public int j = 1;

    static {
        avjy avjyVar = new avjy();
        l = avjyVar;
        dsqw.cc(avjy.class, avjyVar);
    }

    private avjy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007င\u0006\bဈ\u0007\tဌ\b\nဇ\t", new Object[]{"a", "b", "c", "d", "e", avjq.c(), "f", avjt.c(), "g", avjv.c(), "h", "i", "j", avjx.c(), "k"});
            }
            if (i2 == 3) {
                return new avjy();
            }
            if (i2 == 4) {
                return new avjr();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<avjy> dssrVar = m;
            if (dssrVar == null) {
                synchronized (avjy.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
