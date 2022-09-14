package defpackage;
/* compiled from: PG */
/* renamed from: dwca  reason: default package */
/* loaded from: classes.dex */
public final class dwca extends dsqw<dwca, dwbz> implements dssk {
    public static final dwca e;
    private static volatile dssr<dwca> g;
    public dsrj<dwcg> a = dssu.b;
    public int b;
    public int c;
    public dwcm d;
    private int f;

    static {
        dwca dwcaVar = new dwca();
        e = dwcaVar;
        dsqw.cc(dwca.class, dwcaVar);
    }

    private dwca() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"f", "a", dwcg.class, "b", dwcj.a, "c", dwci.c(), "d"});
            }
            if (i2 == 3) {
                return new dwca();
            }
            if (i2 == 4) {
                return new dwbz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwca> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwca.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
