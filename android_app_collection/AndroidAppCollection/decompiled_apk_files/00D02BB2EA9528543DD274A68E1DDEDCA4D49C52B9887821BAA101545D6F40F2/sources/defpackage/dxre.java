package defpackage;
/* compiled from: PG */
/* renamed from: dxre  reason: default package */
/* loaded from: classes6.dex */
public final class dxre extends dsqw<dxre, dxrd> implements dssk {
    public static final dxre e;
    private static volatile dssr<dxre> f;
    public dxpv a;
    public int b;
    public int c;
    public String d = "";

    static {
        dxre dxreVar = new dxre();
        e = dxreVar;
        dsqw.cc(dxre.class, dxreVar);
    }

    private dxre() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0004\u0003\u0004\u0004Ȉ\u0005\t", new Object[]{"b", "c", "d", "a"});
            }
            if (i2 == 3) {
                return new dxre();
            }
            if (i2 == 4) {
                return new dxrd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxre> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxre.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
