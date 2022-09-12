package defpackage;
/* compiled from: PG */
/* renamed from: dxcu  reason: default package */
/* loaded from: classes6.dex */
public final class dxcu extends dsqw<dxcu, dxct> implements dssk {
    public static final dxcu d;
    private static volatile dssr<dxcu> f;
    public int a;
    public dwzo b;
    public boolean c;
    private byte e = 2;

    static {
        dxcu dxcuVar = new dxcu();
        d = dxcuVar;
        dsqw.cc(dxcu.class, dxcuVar);
    }

    private dxcu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxcu();
            }
            if (i2 == 4) {
                return new dxct();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dxcu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxcu.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
