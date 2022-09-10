package defpackage;
/* compiled from: PG */
/* renamed from: ddst  reason: default package */
/* loaded from: classes6.dex */
public final class ddst extends dsqw<ddst, ddsq> implements dssk {
    public static final ddst j;
    private static volatile dssr<ddst> k;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ddmg h;
    public dsrj<ddss> i = dssu.b;

    static {
        ddst ddstVar = new ddst();
        j = ddstVar;
        dsqw.cc(ddst.class, ddstVar);
    }

    private ddst() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဉ\u0006\b\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", ddss.class});
            }
            if (i2 == 3) {
                return new ddst();
            }
            if (i2 == 4) {
                return new ddsq();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddst> dssrVar = k;
            if (dssrVar == null) {
                synchronized (ddst.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
