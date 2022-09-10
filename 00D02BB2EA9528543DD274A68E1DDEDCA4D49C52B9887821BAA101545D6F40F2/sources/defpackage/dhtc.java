package defpackage;
/* compiled from: PG */
/* renamed from: dhtc  reason: default package */
/* loaded from: classes6.dex */
public final class dhtc extends dsqw<dhtc, dhtb> implements dssk {
    public static final dhtc l;
    private static volatile dssr<dhtc> m;
    public int a;
    public dqkn b;
    public dree d;
    public dqwa e;
    public dnhw f;
    public diog i;
    public drdu k;
    public String c = "";
    public String g = "";
    public boolean h = true;
    public boolean j = true;

    static {
        dhtc dhtcVar = new dhtc();
        l = dhtcVar;
        dsqw.cc(dhtc.class, dhtcVar);
    }

    private dhtc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0004\u000e\n\u0000\u0000\u0000\u0004ဈ\u0001\u0006ဉ\u0003\u0007ဉ\u0000\bဈ\u0005\tဉ\u0007\nဇ\b\u000bဉ\u0004\fဉ\u0002\rဇ\u0006\u000eဉ\t", new Object[]{"a", "c", "e", "b", "g", "i", "j", "f", "d", "h", "k"});
            }
            if (i2 == 3) {
                return new dhtc();
            }
            if (i2 == 4) {
                return new dhtb();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhtc> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dhtc.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
