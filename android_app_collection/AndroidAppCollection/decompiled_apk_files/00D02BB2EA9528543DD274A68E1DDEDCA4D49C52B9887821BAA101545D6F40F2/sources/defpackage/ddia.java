package defpackage;
/* compiled from: PG */
/* renamed from: ddia  reason: default package */
/* loaded from: classes5.dex */
public final class ddia extends dsqw<ddia, ddhz> implements dssk {
    public static final ddia d;
    private static volatile dssr<ddia> e;
    public int a;
    public int b;
    public int c;

    static {
        ddia ddiaVar = new ddia();
        d = ddiaVar;
        dsqw.cc(ddia.class, ddiaVar);
    }

    private ddia() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddia();
            }
            if (i2 == 4) {
                return new ddhz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddia> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddia.class) {
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
