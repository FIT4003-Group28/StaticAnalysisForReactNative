package defpackage;
/* compiled from: PG */
/* renamed from: dsca  reason: default package */
/* loaded from: classes6.dex */
public final class dsca extends dsqw<dsca, dsbx> implements dssk {
    public static final dsca h;
    private static volatile dssr<dsca> i;
    public int a;
    public int f;
    public String b = "";
    public String c = "";
    public dsrj<dscx> d = dssu.b;
    public dsrj<dsbi> e = dssu.b;
    public dsrj<dscx> g = dssu.b;

    static {
        dsca dscaVar = new dsca();
        h = dscaVar;
        dsqw.cc(dsca.class, dscaVar);
    }

    private dsca() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002\u0006\u001b", new Object[]{"a", "b", "c", "d", dscx.class, "e", dsbi.class, "f", dsby.a, "g", dscx.class});
            }
            if (i3 == 3) {
                return new dsca();
            }
            if (i3 == 4) {
                return new dsbx();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dsca> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dsca.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
