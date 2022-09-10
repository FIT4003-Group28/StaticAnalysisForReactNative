package defpackage;
/* compiled from: PG */
/* renamed from: dimq  reason: default package */
/* loaded from: classes6.dex */
public final class dimq extends dsqs<dimq, dimn> implements dsqt {
    public static final dimq h;
    private static volatile dssr<dimq> j;
    public int a;
    public dimp b;
    public boolean c;
    public dimp d;
    public dimp e;
    public dqah f;
    public dqas g;
    private byte i = 2;

    static {
        dimq dimqVar = new dimq();
        h = dimqVar;
        dsqw.cc(dimq.class, dimqVar);
    }

    private dimq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0006\u0007ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
            }
            if (i2 == 3) {
                return new dimq();
            }
            if (i2 == 4) {
                return new dimn();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dimq> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dimq.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
