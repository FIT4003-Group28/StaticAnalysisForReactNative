package defpackage;
/* compiled from: PG */
/* renamed from: dwsx  reason: default package */
/* loaded from: classes.dex */
public final class dwsx extends dsqw<dwsx, dwsw> implements dssk {
    public static final dwsx f;
    private static volatile dssr<dwsx> h;
    public boolean a;
    public boolean c;
    private int g;
    public int b = 50;
    public float d = 0.15f;
    public float e = 0.3f;

    static {
        dwsx dwsxVar = new dwsx();
        f = dwsxVar;
        dsqw.cc(dwsx.class, dwsxVar);
    }

    private dwsx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002င\u0001\u0003ဇ\u0000\u0004ဇ\u0002\u0005ခ\u0003\u0006ခ\u0004", new Object[]{"g", "b", "a", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dwsx();
            }
            if (i2 == 4) {
                return new dwsw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwsx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwsx.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
