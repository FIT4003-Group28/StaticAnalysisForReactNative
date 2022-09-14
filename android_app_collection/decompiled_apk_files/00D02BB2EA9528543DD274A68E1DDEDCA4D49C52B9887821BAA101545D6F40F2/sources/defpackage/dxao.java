package defpackage;
/* compiled from: PG */
/* renamed from: dxao  reason: default package */
/* loaded from: classes6.dex */
public final class dxao extends dsqw<dxao, dxan> implements dssk {
    public static final dxao a;
    private static volatile dssr<dxao> e;
    private int b;
    private dxds c;
    private byte d = 2;

    static {
        dxao dxaoVar = new dxao();
        a = dxaoVar;
        dsqw.cc(dxao.class, dxaoVar);
    }

    private dxao() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dxao();
            }
            if (i2 == 4) {
                return new dxan();
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
            dssr<dxao> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxao.class) {
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
