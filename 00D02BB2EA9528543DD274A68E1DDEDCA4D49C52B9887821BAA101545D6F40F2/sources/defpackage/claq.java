package defpackage;
/* compiled from: PG */
/* renamed from: claq  reason: default package */
/* loaded from: classes5.dex */
public final class claq extends dsqw<claq, clao> implements dssk {
    public static final claq i;
    private static volatile dssr<claq> j;
    public int a;
    public int c;
    public long g;
    public int h;
    public String b = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        claq claqVar = new claq();
        i = claqVar;
        dsqw.cc(claq.class, claqVar);
    }

    private claq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0007ဂ\u0006\bဌ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", clap.a});
            }
            if (i3 == 3) {
                return new claq();
            }
            if (i3 == 4) {
                return new clao();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<claq> dssrVar = j;
            if (dssrVar == null) {
                synchronized (claq.class) {
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
