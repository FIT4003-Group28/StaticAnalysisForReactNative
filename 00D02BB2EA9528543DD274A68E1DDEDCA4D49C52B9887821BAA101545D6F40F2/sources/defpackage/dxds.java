package defpackage;
/* compiled from: PG */
/* renamed from: dxds  reason: default package */
/* loaded from: classes6.dex */
public final class dxds extends dsqw<dxds, dxdr> implements dssk {
    public static final dxds a;
    private static volatile dssr<dxds> e;
    private int b;
    private dxdq c;
    private byte d = 2;

    static {
        dxds dxdsVar = new dxds();
        a = dxdsVar;
        dsqw.cc(dxds.class, dxdsVar);
    }

    private dxds() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dxds();
            }
            if (i2 == 4) {
                return new dxdr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dxds> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxds.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
