package defpackage;
/* compiled from: PG */
/* renamed from: dfzs  reason: default package */
/* loaded from: classes6.dex */
public final class dfzs extends dsqw<dfzs, dfzr> implements dssk {
    public static final dfzs i;
    private static volatile dssr<dfzs> j;
    public int a;
    public dgfy c;
    public int d;
    public long e;
    public int f;
    public dgbo h;
    public String b = "";
    public String g = "";

    static {
        dfzs dfzsVar = new dfzs();
        i = dfzsVar;
        dsqw.cc(dfzs.class, dfzsVar);
    }

    private dfzs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0001\u0002င\u0002\u0003ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဉ\u0007\bဈ\u0000", new Object[]{"a", "c", "d", "e", "f", "g", "h", "b"});
            }
            if (i3 == 3) {
                return new dfzs();
            }
            if (i3 == 4) {
                return new dfzr();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dfzs> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dfzs.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
