package defpackage;
/* compiled from: PG */
/* renamed from: dhtk  reason: default package */
/* loaded from: classes.dex */
public final class dhtk extends dsqw<dhtk, dhtj> implements dssk {
    public static final dhtk d;
    private static volatile dssr<dhtk> f;
    public String a = "";
    public String b = "";
    public boolean c;
    private int e;

    static {
        dhtk dhtkVar = new dhtk();
        d = dhtkVar;
        dsqw.cc(dhtk.class, dhtkVar);
    }

    private dhtk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhtk();
            }
            if (i2 == 4) {
                return new dhtj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhtk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhtk.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
