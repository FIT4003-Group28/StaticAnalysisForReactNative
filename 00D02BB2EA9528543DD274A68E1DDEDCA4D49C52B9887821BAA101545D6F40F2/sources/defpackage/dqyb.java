package defpackage;
/* compiled from: PG */
/* renamed from: dqyb  reason: default package */
/* loaded from: classes6.dex */
public final class dqyb extends dsqw<dqyb, dqxy> implements dssk {
    public static final dqyb j;
    private static volatile dssr<dqyb> k;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        dqyb dqybVar = new dqyb();
        j = dqybVar;
        dsqw.cc(dqyb.class, dqybVar);
    }

    private dqyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0005\u0004ဈ\u0006\u0005ဈ\u0007\u0006ြ\u0000\u0007ျ\u0000\bဈ\u0004", new Object[]{"c", "b", "a", "d", "e", "g", "h", "i", dqya.class, "f"});
            }
            if (i2 == 3) {
                return new dqyb();
            }
            if (i2 == 4) {
                return new dqxy();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyb> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dqyb.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
