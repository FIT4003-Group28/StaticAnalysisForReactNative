package defpackage;
/* compiled from: PG */
/* renamed from: dwfa  reason: default package */
/* loaded from: classes.dex */
public final class dwfa extends dsqw<dwfa, dwez> implements dssk {
    public static final dwfa c;
    private static volatile dssr<dwfa> d;
    public int a;
    public drah b;

    static {
        dwfa dwfaVar = new dwfa();
        c = dwfaVar;
        dsqw.cc(dwfa.class, dwfaVar);
    }

    private dwfa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwfa();
            }
            if (i2 == 4) {
                return new dwez();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwfa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwfa.class) {
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
