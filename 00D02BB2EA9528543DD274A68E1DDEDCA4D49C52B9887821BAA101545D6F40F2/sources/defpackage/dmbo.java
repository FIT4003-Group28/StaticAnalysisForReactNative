package defpackage;
/* compiled from: PG */
/* renamed from: dmbo  reason: default package */
/* loaded from: classes6.dex */
public final class dmbo extends dsqw<dmbo, dmbj> implements dssk {
    public static final dmbo i;
    private static volatile dssr<dmbo> j;
    public int a;
    public boolean d;
    public dmbn h;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        dmbo dmboVar = new dmbo();
        i = dmboVar;
        dsqw.cc(dmbo.class, dmboVar);
    }

    private dmbo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dmbo();
            }
            if (i3 == 4) {
                return new dmbj();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dmbo> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dmbo.class) {
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
