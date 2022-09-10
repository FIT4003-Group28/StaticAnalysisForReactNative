package defpackage;
/* compiled from: PG */
/* renamed from: dbnf  reason: default package */
/* loaded from: classes5.dex */
public final class dbnf extends dsqw<dbnf, dbne> implements dssk {
    public static final dbnf a;
    private static volatile dssr<dbnf> b;

    static {
        dbnf dbnfVar = new dbnf();
        a = dbnfVar;
        dsqw.cc(dbnf.class, dbnfVar);
    }

    private dbnf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dbnf();
            }
            if (i2 == 4) {
                return new dbne();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbnf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dbnf.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
