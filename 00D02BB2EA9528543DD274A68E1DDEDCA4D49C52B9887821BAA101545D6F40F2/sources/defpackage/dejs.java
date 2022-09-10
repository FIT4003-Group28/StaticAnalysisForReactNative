package defpackage;
/* compiled from: PG */
/* renamed from: dejs  reason: default package */
/* loaded from: classes6.dex */
public final class dejs extends dsqw<dejs, dejr> implements dssk {
    public static final dejs j;
    private static volatile dssr<dejs> k;
    public Object b;
    public long c;
    public long d;
    public long f;
    public int g;
    public int a = 0;
    public String e = "";
    public String h = "";
    public String i = "";

    static {
        dejs dejsVar = new dejs();
        j = dejsVar;
        dsqw.cc(dejs.class, dejsVar);
    }

    private dejs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0000\n\u0001\u0000\u0001\u000b\n\u0000\u0000\u0000\u0001\u0002\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\f\u0007<\u0000\bȈ\t<\u0000\n<\u0000\u000bȈ", new Object[]{"b", "a", "c", "d", "e", "f", "g", deje.class, "h", dejg.class, deji.class, "i"});
            }
            if (i2 == 3) {
                return new dejs();
            }
            if (i2 == 4) {
                return new dejr();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dejs> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dejs.class) {
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
