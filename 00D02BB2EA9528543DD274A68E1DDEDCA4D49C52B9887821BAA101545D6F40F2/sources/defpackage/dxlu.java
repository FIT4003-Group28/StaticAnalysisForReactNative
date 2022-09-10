package defpackage;
/* compiled from: PG */
/* renamed from: dxlu  reason: default package */
/* loaded from: classes6.dex */
public final class dxlu extends dsqw<dxlu, dxlt> implements dssk {
    public static final dxlu g;
    private static volatile dssr<dxlu> i;
    public dxwi a;
    public long b;
    public long c;
    public int d;
    public String e = "";
    public boolean f;
    private dxld h;

    static {
        dxlu dxluVar = new dxlu();
        g = dxluVar;
        dsqw.cc(dxlu.class, dxluVar);
    }

    private dxlu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\t\u0002\u0002\u0003\u0002\u0004\u0004\u0005Ȉ\u0006\u0007\u0007\t", new Object[]{"a", "b", "c", "d", "e", "f", "h"});
            }
            if (i3 == 3) {
                return new dxlu();
            }
            if (i3 == 4) {
                return new dxlt();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dxlu> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dxlu.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
