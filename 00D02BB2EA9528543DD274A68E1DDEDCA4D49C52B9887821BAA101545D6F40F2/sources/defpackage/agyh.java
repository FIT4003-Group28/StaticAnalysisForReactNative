package defpackage;
/* compiled from: PG */
/* renamed from: agyh  reason: default package */
/* loaded from: classes2.dex */
public final class agyh extends dsqw<agyh, agxs> implements dssk {
    public static final agyh k;
    private static volatile dssr<agyh> m;
    public int a;
    public boolean b;
    public boolean c;
    public agxw e;
    public agyg f;
    public agxu g;
    public agxy h;
    public agya i;
    public agye j;
    private byte l = 2;
    public String d = "";

    static {
        agyh agyhVar = new agyh();
        k = agyhVar;
        dsqw.cc(agyh.class, agyhVar);
    }

    private agyh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\u0002\u0001ဇ\u0000\u0004ဉ\u0005\u0005ဉ\u0003\u0006ဇ\u0001\u0007ဈ\u0002\bဉ\u0006\fᐉ\n\u000eᐉ\u000b\u000fဉ\f", new Object[]{"a", "b", "f", "e", "c", "d", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new agyh();
            }
            if (i2 == 4) {
                return new agxs();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<agyh> dssrVar = m;
            if (dssrVar == null) {
                synchronized (agyh.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
