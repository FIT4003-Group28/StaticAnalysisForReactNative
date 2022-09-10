package defpackage;
/* compiled from: PG */
/* renamed from: advh  reason: default package */
/* loaded from: classes2.dex */
public final class advh extends dsqw<advh, advg> implements dssk {
    public static final advh h;
    private static volatile dssr<advh> j;
    public int a;
    public long c;
    public advf e;
    public boolean f;
    public dqac g;
    private byte i = 2;
    public String b = "";
    public dspd d = dspd.b;

    static {
        advh advhVar = new advh();
        h = advhVar;
        dsqw.cc(advh.class, advhVar);
    }

    private advh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဂ\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new advh();
            }
            if (i2 == 4) {
                return new advg();
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
            dssr<advh> dssrVar = j;
            if (dssrVar == null) {
                synchronized (advh.class) {
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
