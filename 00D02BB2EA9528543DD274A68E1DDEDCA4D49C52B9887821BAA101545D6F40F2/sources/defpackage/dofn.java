package defpackage;
/* compiled from: PG */
/* renamed from: dofn  reason: default package */
/* loaded from: classes6.dex */
public final class dofn extends dsqw<dofn, dofk> implements dssk {
    public static final dofn b;
    private static volatile dssr<dofn> d;
    public int a;
    private int c;

    static {
        dofn dofnVar = new dofn();
        b = dofnVar;
        dsqw.cc(dofn.class, dofnVar);
    }

    private dofn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dofl.a});
            }
            if (i2 == 3) {
                return new dofn();
            }
            if (i2 == 4) {
                return new dofk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dofn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dofn.class) {
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
