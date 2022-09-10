package defpackage;
/* compiled from: PG */
/* renamed from: dxrk  reason: default package */
/* loaded from: classes6.dex */
public final class dxrk extends dsqw<dxrk, dxrj> implements dssk {
    public static final dxrk h;
    private static volatile dssr<dxrk> i;
    public String a = "";
    public dxmm b;
    public dugy c;
    public dugy d;
    public dugy e;
    public boolean f;
    public dxna g;

    static {
        dxrk dxrkVar = new dxrk();
        h = dxrkVar;
        dsqw.cc(dxrk.class, dxrkVar);
    }

    private dxrk() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0000\u0000\u0001Ȉ\u0003\t\u0004\t\u0005\t\u0007\t\t\u0007\n\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dxrk();
            }
            if (i3 == 4) {
                return new dxrj();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dxrk> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dxrk.class) {
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
