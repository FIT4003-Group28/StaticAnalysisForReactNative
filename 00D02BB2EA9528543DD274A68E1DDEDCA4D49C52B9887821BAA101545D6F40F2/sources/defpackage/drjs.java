package defpackage;
/* compiled from: PG */
/* renamed from: drjs  reason: default package */
/* loaded from: classes6.dex */
public final class drjs extends dsqw<drjs, drjq> implements dssk {
    public static final drjs h;
    private static volatile dssr<drjs> j;
    public Object b;
    private int i;
    public int a = 0;
    public String c = "";
    public dspd d = dspd.b;
    public String e = "";
    public dsrj<driz> f = dssu.b;
    public dsrj<drjd> g = dssu.b;

    static {
        drjs drjsVar = new drjs();
        h = drjsVar;
        dsqw.cc(drjs.class, drjsVar);
    }

    private drjs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(h, "\u0001\f\u0001\u0001\u0001\f\f\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tည\u0001\n\u001b\u000bြ\u0000\f\u001b", new Object[]{"b", "a", "i", "c", "e", drjj.class, drjl.class, drke.class, drix.class, drju.class, drit.class, "d", "f", driz.class, drka.class, "g", drjd.class});
            }
            if (i2 == 3) {
                return new drjs();
            }
            if (i2 == 4) {
                return new drjq();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drjs> dssrVar = j;
            if (dssrVar == null) {
                synchronized (drjs.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
