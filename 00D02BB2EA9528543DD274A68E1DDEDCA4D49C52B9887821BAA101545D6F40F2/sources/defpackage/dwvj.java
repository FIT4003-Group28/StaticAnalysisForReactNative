package defpackage;
/* compiled from: PG */
/* renamed from: dwvj  reason: default package */
/* loaded from: classes6.dex */
public final class dwvj extends dsqw<dwvj, dwvg> implements dssk {
    public static final dwvj b;
    private static volatile dssr<dwvj> d;
    public int a;
    private int c;

    static {
        dwvj dwvjVar = new dwvj();
        b = dwvjVar;
        dsqw.cc(dwvj.class, dwvjVar);
    }

    private dwvj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dwvh.a});
            }
            if (i2 == 3) {
                return new dwvj();
            }
            if (i2 == 4) {
                return new dwvg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwvj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwvj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
