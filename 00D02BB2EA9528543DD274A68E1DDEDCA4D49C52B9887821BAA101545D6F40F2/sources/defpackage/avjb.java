package defpackage;
/* compiled from: PG */
/* renamed from: avjb  reason: default package */
/* loaded from: classes3.dex */
public final class avjb extends dsqw<avjb, avja> implements dssk {
    public static final avjb h;
    private static volatile dssr<avjb> i;
    public int a;
    public int d;
    public dtaq e;
    public boolean g;
    public String b = "";
    public int c = 10;
    public String f = "";

    static {
        avjb avjbVar = new avjb();
        h = avjbVar;
        dsqw.cc(avjb.class, avjbVar);
    }

    private avjb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new avjb();
            }
            if (i3 == 4) {
                return new avja();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<avjb> dssrVar = i;
            if (dssrVar == null) {
                synchronized (avjb.class) {
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
