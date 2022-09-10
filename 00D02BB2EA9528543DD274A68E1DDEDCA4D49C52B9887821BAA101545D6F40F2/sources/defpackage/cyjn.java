package defpackage;
/* compiled from: PG */
/* renamed from: cyjn  reason: default package */
/* loaded from: classes5.dex */
public final class cyjn extends dsqw<cyjn, cyjj> implements dssk {
    public static final cyjn d;
    private static volatile dssr<cyjn> e;
    public cyjt a;
    public cyjm b;
    public String c = "";

    static {
        cyjn cyjnVar = new cyjn();
        d = cyjnVar;
        dsqw.cc(cyjn.class, cyjnVar);
    }

    private cyjn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cyjn();
            }
            if (i2 == 4) {
                return new cyjj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyjn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cyjn.class) {
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
