package defpackage;
/* compiled from: PG */
/* renamed from: dkkx  reason: default package */
/* loaded from: classes6.dex */
public final class dkkx extends dsqw<dkkx, dkkw> implements dssk {
    public static final dkkx h;
    private static volatile dssr<dkkx> i;
    public int a;
    public boolean b;
    public String c = "";
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        dkkx dkkxVar = new dkkx();
        h = dkkxVar;
        dsqw.cc(dkkx.class, dkkxVar);
    }

    private dkkx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0005ဇ\u0005\u0006ဇ\u0006\u0007ဇ\u0004", new Object[]{"a", "b", "c", "d", "f", "g", "e"});
            }
            if (i3 == 3) {
                return new dkkx();
            }
            if (i3 == 4) {
                return new dkkw();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkkx> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dkkx.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
