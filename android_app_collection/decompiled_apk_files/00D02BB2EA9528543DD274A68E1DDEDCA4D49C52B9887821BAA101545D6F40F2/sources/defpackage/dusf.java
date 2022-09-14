package defpackage;
/* compiled from: PG */
/* renamed from: dusf  reason: default package */
/* loaded from: classes.dex */
public final class dusf extends dsqw<dusf, duse> implements dssk {
    public static final dusf c;
    private static volatile dssr<dusf> e;
    public int a = 2;
    public int b = 2;
    private int d;

    static {
        dusf dusfVar = new dusf();
        c = dusfVar;
        dsqw.cc(dusf.class, dusfVar);
    }

    private dusf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dusf();
            }
            if (i2 == 4) {
                return new duse();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dusf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dusf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
