package defpackage;
/* compiled from: PG */
/* renamed from: dswn  reason: default package */
/* loaded from: classes6.dex */
public final class dswn extends dsqw<dswn, dswm> implements dssk {
    public static final dswn b;
    private static volatile dssr<dswn> c;
    public dsrj<dswl> a = dssu.b;

    static {
        dswn dswnVar = new dswn();
        b = dswnVar;
        dsqw.cc(dswn.class, dswnVar);
    }

    private dswn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dswl.class});
            }
            if (i2 == 3) {
                return new dswn();
            }
            if (i2 == 4) {
                return new dswm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dswn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dswn.class) {
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
