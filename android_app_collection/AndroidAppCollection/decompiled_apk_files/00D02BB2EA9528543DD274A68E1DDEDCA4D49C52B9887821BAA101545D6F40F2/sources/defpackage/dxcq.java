package defpackage;
/* compiled from: PG */
/* renamed from: dxcq  reason: default package */
/* loaded from: classes6.dex */
public final class dxcq extends dsqw<dxcq, dxcp> implements dssk {
    public static final dxcq c;
    private static volatile dssr<dxcq> g;
    public djuj b;
    private int d;
    private dwzh e;
    private byte f = 2;
    public dsrj<dxcd> a = dssu.b;

    static {
        dxcq dxcqVar = new dxcq();
        c = dxcqVar;
        dsqw.cc(dxcq.class, dxcqVar);
    }

    private dxcq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"d", "a", dxcd.class, "e", "b"});
            }
            if (i2 == 3) {
                return new dxcq();
            }
            if (i2 == 4) {
                return new dxcp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dxcq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxcq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
