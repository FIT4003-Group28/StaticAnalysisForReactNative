package defpackage;
/* compiled from: PG */
/* renamed from: dmfa  reason: default package */
/* loaded from: classes6.dex */
public final class dmfa extends dsqw<dmfa, dmex> implements dssk {
    public static final dmfa b;
    public static final dsqv<dmfu, dmfa> c;
    private static volatile dssr<dmfa> d;
    public dsrj<dmez> a = dssu.b;

    static {
        dmfa dmfaVar = new dmfa();
        b = dmfaVar;
        dsqw.cc(dmfa.class, dmfaVar);
        c = dsqw.newSingularGeneratedExtension(dmfu.e, dmfaVar, dmfaVar, null, 1002, dsur.MESSAGE, dmfa.class);
    }

    private dmfa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dmez.class});
            }
            if (i2 == 3) {
                return new dmfa();
            }
            if (i2 == 4) {
                return new dmex();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmfa.class) {
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
