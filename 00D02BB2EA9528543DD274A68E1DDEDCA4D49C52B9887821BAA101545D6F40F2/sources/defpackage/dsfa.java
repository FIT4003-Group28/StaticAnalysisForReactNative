package defpackage;
/* compiled from: PG */
/* renamed from: dsfa  reason: default package */
/* loaded from: classes6.dex */
public final class dsfa extends dsqw<dsfa, dsex> implements dssk {
    public static final dsfa b;
    private static volatile dssr<dsfa> c;
    public dsrj<dsez> a = dssu.b;

    static {
        dsfa dsfaVar = new dsfa();
        b = dsfaVar;
        dsqw.cc(dsfa.class, dsfaVar);
    }

    private dsfa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dsez.class});
            }
            if (i2 == 3) {
                return new dsfa();
            }
            if (i2 == 4) {
                return new dsex();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsfa> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsfa.class) {
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
