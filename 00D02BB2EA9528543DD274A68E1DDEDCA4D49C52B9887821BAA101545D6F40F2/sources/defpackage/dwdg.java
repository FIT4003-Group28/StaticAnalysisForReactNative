package defpackage;
/* compiled from: PG */
/* renamed from: dwdg  reason: default package */
/* loaded from: classes6.dex */
public final class dwdg extends dsqw<dwdg, dwdf> implements dssk {
    public static final dwdg h;
    private static volatile dssr<dwdg> i;
    public int a;
    public boolean d;
    public boolean f;
    public boolean g;
    public dsrj<dobx> b = dssu.b;
    public dsrj<dqzz> c = dssu.b;
    public dspd e = dspd.b;

    static {
        dwdg dwdgVar = new dwdg();
        h = dwdgVar;
        dsqw.cc(dwdg.class, dwdgVar);
    }

    private dwdg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0002\u000b\u0006\u0000\u0002\u0000\u0002\u001b\u0005ဇ\u0002\u0006ည\u0004\u0007ဇ\u0005\t\u001b\u000bဇ\u0007", new Object[]{"a", "b", dobx.class, "d", "e", "f", "c", dqzz.class, "g"});
            }
            if (i3 == 3) {
                return new dwdg();
            }
            if (i3 == 4) {
                return new dwdf();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dwdg> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwdg.class) {
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
