package defpackage;
/* compiled from: PG */
/* renamed from: doli  reason: default package */
/* loaded from: classes6.dex */
public final class doli extends dsqw<doli, dolh> implements dssk {
    public static final doli a;
    private static volatile dssr<doli> b;

    static {
        doli doliVar = new doli();
        a = doliVar;
        dsqw.cc(doli.class, doliVar);
    }

    private doli() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new doli();
            }
            if (i2 == 4) {
                return new dolh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doli> dssrVar = b;
            if (dssrVar == null) {
                synchronized (doli.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
