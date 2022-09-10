package defpackage;
/* compiled from: PG */
/* renamed from: dqnz  reason: default package */
/* loaded from: classes6.dex */
public final class dqnz extends dsqw<dqnz, dqny> implements dssk {
    public static final dqnz c;
    private static volatile dssr<dqnz> d;
    public int a;
    public boolean b;

    static {
        dqnz dqnzVar = new dqnz();
        c = dqnzVar;
        dsqw.cc(dqnz.class, dqnzVar);
    }

    private dqnz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဇ\u0004", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqnz();
            }
            if (i2 == 4) {
                return new dqny();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqnz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqnz.class) {
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
