package defpackage;
/* compiled from: PG */
/* renamed from: cxgf  reason: default package */
/* loaded from: classes5.dex */
public final class cxgf extends dsqw<cxgf, cxge> implements dssk {
    public static final cxgf k;
    private static volatile dssr<cxgf> m;
    public int a;
    public dzyu b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public boolean i;
    public dzze j;
    private byte l = 2;
    public String h = "";

    static {
        cxgf cxgfVar = new cxgf();
        k = cxgfVar;
        dsqw.cc(cxgf.class, cxgfVar);
    }

    private cxgf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\bဇ\u0007\tᐉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new cxgf();
            }
            if (i2 == 4) {
                return new cxge();
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
            dssr<cxgf> dssrVar = m;
            if (dssrVar == null) {
                synchronized (cxgf.class) {
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
