package defpackage;
/* compiled from: PG */
/* renamed from: diky  reason: default package */
/* loaded from: classes6.dex */
public final class diky extends dsqw<diky, dikv> implements dssk {
    public static final diky c;
    private static volatile dssr<diky> e;
    public dsrj<dikx> a = dssu.b;
    public boolean b;
    private int d;

    static {
        diky dikyVar = new diky();
        c = dikyVar;
        dsqw.cc(diky.class, dikyVar);
    }

    private diky() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဇ\u0000", new Object[]{"d", "a", dikx.class, "b"});
            }
            if (i2 == 3) {
                return new diky();
            }
            if (i2 == 4) {
                return new dikv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diky> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diky.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
