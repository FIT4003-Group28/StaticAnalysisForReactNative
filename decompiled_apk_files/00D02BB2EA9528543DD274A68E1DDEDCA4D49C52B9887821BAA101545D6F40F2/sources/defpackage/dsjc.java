package defpackage;
/* compiled from: PG */
/* renamed from: dsjc  reason: default package */
/* loaded from: classes6.dex */
public final class dsjc extends dsqw<dsjc, dsiz> implements dssk {
    public static final dsjc j;
    private static volatile dssr<dsjc> l;
    public int a;
    public dsjk c;
    public int d;
    public int e;
    public int f;
    public dsjo g;
    public dsje h;
    private byte k = 2;
    public String b = "";
    public dsrj<String> i = dssu.b;

    static {
        dsjc dsjcVar = new dsjc();
        j = dsjcVar;
        dsqw.cc(dsjc.class, dsjcVar);
    }

    private dsjc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006ဌ\u0004\u0007ဉ\u0005\bᐉ\u0006\t\u001a", new Object[]{"a", "b", "c", "d", dsjf.a, "e", dsjh.a, "f", dsja.a, "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dsjc();
            }
            if (i2 == 4) {
                return new dsiz();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<dsjc> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dsjc.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
