package defpackage;
/* compiled from: PG */
/* renamed from: dwaq  reason: default package */
/* loaded from: classes6.dex */
public final class dwaq extends dsqw<dwaq, dwap> implements dssk {
    public static final dwaq i;
    private static volatile dssr<dwaq> j;
    public int a;
    public dixu b;
    public long c;
    public long d;
    public String e = "";
    public int f;
    public int g;
    public int h;

    static {
        dwaq dwaqVar = new dwaq();
        i = dwaqVar;
        dsqw.cc(dwaq.class, dwaqVar);
    }

    private dwaq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003င\u0005\u0004င\u0006\u0005င\u0007\u0006စ\u0002\u0007ဈ\u0003", new Object[]{"a", "b", "c", "f", "g", "h", "d", "e"});
            }
            if (i3 == 3) {
                return new dwaq();
            }
            if (i3 == 4) {
                return new dwap();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dwaq> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dwaq.class) {
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
