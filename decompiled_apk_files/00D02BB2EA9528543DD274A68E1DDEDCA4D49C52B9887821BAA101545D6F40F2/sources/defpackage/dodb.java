package defpackage;
/* compiled from: PG */
/* renamed from: dodb  reason: default package */
/* loaded from: classes6.dex */
public final class dodb extends dsqw<dodb, doda> implements dssk {
    public static final dodb d;
    private static volatile dssr<dodb> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dodb dodbVar = new dodb();
        d = dodbVar;
        dsqw.cc(dodb.class, dodbVar);
    }

    private dodb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dodb();
            }
            if (i2 == 4) {
                return new doda();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dodb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dodb.class) {
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
