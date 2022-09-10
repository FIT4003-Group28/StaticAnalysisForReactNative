package defpackage;
/* compiled from: PG */
/* renamed from: awhw  reason: default package */
/* loaded from: classes3.dex */
public final class awhw extends dsqw<awhw, awht> implements dssk {
    public static final awhw b;
    private static volatile dssr<awhw> c;
    public dsrj<awhv> a = dssu.b;

    static {
        awhw awhwVar = new awhw();
        b = awhwVar;
        dsqw.cc(awhw.class, awhwVar);
    }

    private awhw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", awhv.class});
            }
            if (i2 == 3) {
                return new awhw();
            }
            if (i2 == 4) {
                return new awht();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<awhw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (awhw.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
