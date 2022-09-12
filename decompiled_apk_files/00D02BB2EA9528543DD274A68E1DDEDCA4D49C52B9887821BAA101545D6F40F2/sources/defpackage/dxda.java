package defpackage;
/* compiled from: PG */
/* renamed from: dxda  reason: default package */
/* loaded from: classes6.dex */
public final class dxda extends dsqw<dxda, dxcz> implements dssk {
    public static final dxda a;
    private static volatile dssr<dxda> e;
    private int b;
    private dnbi c;
    private byte d = 2;

    static {
        dxda dxdaVar = new dxda();
        a = dxdaVar;
        dsqw.cc(dxda.class, dxdaVar);
    }

    private dxda() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dxda();
            }
            if (i2 == 4) {
                return new dxcz();
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
            dssr<dxda> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxda.class) {
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
