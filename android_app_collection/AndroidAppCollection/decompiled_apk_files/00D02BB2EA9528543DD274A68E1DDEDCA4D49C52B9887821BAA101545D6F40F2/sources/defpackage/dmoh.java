package defpackage;
/* compiled from: PG */
/* renamed from: dmoh  reason: default package */
/* loaded from: classes6.dex */
public final class dmoh extends dsqs<dmoh, dmog> implements dsqt {
    public static final dmoh h;
    private static volatile dssr<dmoh> j;
    public int a;
    public int d;
    public int e;
    public int g;
    private byte i = 2;
    public String b = "";
    public int c = 1;
    public int f = -16777216;

    static {
        dmoh dmohVar = new dmoh();
        h = dmohVar;
        dsqw.cc(dmoh.class, dmohVar);
    }

    private dmoh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0002\u0003င\u0003\u0004င\u0004\u0006ဆ\u0005\u0007ဆ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new dmoh();
            }
            if (i2 == 4) {
                return new dmog();
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
            dssr<dmoh> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dmoh.class) {
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
