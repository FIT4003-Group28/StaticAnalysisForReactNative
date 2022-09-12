package defpackage;
/* compiled from: PG */
/* renamed from: djar  reason: default package */
/* loaded from: classes6.dex */
public final class djar extends dsqw<djar, djap> implements dssk {
    public static final djar l;
    private static volatile dssr<djar> o;
    public int a;
    public int b;
    public dqcu f;
    public boolean i;
    public dnwb j;
    public djgw k;
    private dnqh m;
    private byte n = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public dsrj<dqcq> g = dssu.b;
    public String h = "";

    static {
        djar djarVar = new djar();
        l = djarVar;
        dsqw.cc(djar.class, djarVar);
    }

    private djar() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဇ\u0006\u0007ဉ\u0007\bᐉ\b\tဉ\t\u000bဉ\u0004\f\u001b", new Object[]{"a", "b", djaq.a, "c", "d", "e", "h", "i", "j", "m", "k", "f", "g", dqcq.class});
            }
            if (i2 == 3) {
                return new djar();
            }
            if (i2 == 4) {
                return new djap();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            }
            dssr<djar> dssrVar = o;
            if (dssrVar == null) {
                synchronized (djar.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.n);
    }
}
