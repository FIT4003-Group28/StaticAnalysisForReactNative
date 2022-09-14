package defpackage;
/* compiled from: PG */
/* renamed from: dsvs  reason: default package */
/* loaded from: classes6.dex */
public final class dsvs extends dsqw<dsvs, dsvr> implements dssk {
    public static final dsvs c;
    private static volatile dssr<dsvs> d;
    public dsri a = dsrx.b;
    public dsrj<String> b = dssu.b;

    static {
        dsvs dsvsVar = new dsvs();
        c = dsvsVar;
        dsqw.cc(dsvs.class, dsvsVar);
    }

    private dsvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0014\u0002\u001a", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dsvs();
            }
            if (i2 == 4) {
                return new dsvr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsvs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsvs.class) {
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
