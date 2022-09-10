package defpackage;
/* compiled from: PG */
/* renamed from: dwvl  reason: default package */
/* loaded from: classes.dex */
public final class dwvl extends dsqw<dwvl, dwvk> implements dssk {
    public static final dwvl e;
    private static volatile dssr<dwvl> f;
    public int a;
    public float b;
    public boolean c;
    public int d;

    static {
        dwvl dwvlVar = new dwvl();
        e = dwvlVar;
        dsqw.cc(dwvl.class, dwvlVar);
    }

    private dwvl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0003ဇ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwvl();
            }
            if (i2 == 4) {
                return new dwvk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwvl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwvl.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
