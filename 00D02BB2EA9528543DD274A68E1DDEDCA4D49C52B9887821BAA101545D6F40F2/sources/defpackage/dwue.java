package defpackage;
/* compiled from: PG */
/* renamed from: dwue  reason: default package */
/* loaded from: classes6.dex */
public final class dwue extends dsqw<dwue, dwtz> implements dssk {
    public static final dwue c;
    private static volatile dssr<dwue> d;
    public int a = 0;
    public Object b;

    static {
        dwue dwueVar = new dwue();
        c = dwueVar;
        dsqw.cc(dwue.class, dwueVar);
    }

    private dwue() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", dwud.class});
            }
            if (i2 == 3) {
                return new dwue();
            }
            if (i2 == 4) {
                return new dwtz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwue> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwue.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
