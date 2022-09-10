package defpackage;
/* compiled from: PG */
/* renamed from: bzhp  reason: default package */
/* loaded from: classes4.dex */
public final class bzhp extends dsqw<bzhp, bzho> implements dssk {
    public static final bzhp d;
    private static volatile dssr<bzhp> e;
    public int a;
    public long b;
    public bzhx c;

    static {
        bzhp bzhpVar = new bzhp();
        d = bzhpVar;
        dsqw.cc(bzhp.class, bzhpVar);
    }

    private bzhp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bzhp();
            }
            if (i2 == 4) {
                return new bzho();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzhp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bzhp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
