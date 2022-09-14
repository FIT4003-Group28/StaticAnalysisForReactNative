package defpackage;
/* compiled from: PG */
/* renamed from: vvf  reason: default package */
/* loaded from: classes7.dex */
public final class vvf extends dsqw<vvf, vvc> implements dssk {
    public static final vvf i;
    private static volatile dssr<vvf> j;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public dpjx h;

    static {
        vvf vvfVar = new vvf();
        i = vvfVar;
        dsqw.cc(vvf.class, vvfVar);
    }

    private vvf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0004ဌ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\u0005\tဉ\u0006", new Object[]{"a", "b", "c", vve.c(), "d", dqvj.d(), "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new vvf();
            }
            if (i3 == 4) {
                return new vvc();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<vvf> dssrVar = j;
            if (dssrVar == null) {
                synchronized (vvf.class) {
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
