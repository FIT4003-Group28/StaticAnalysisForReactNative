package defpackage;
/* compiled from: PG */
/* renamed from: dlkq  reason: default package */
/* loaded from: classes6.dex */
public final class dlkq extends dsqw<dlkq, dlkf> implements dssk {
    public static final dlkq j;
    private static volatile dssr<dlkq> k;
    public int a;
    public dlku b;
    public dlke c;
    public boolean d;
    public int g;
    public String e = "";
    public String f = "";
    public String h = "";
    public dsrj<dlkn> i = dssu.b;

    static {
        dlkq dlkqVar = new dlkq();
        j = dlkqVar;
        dsqw.cc(dlkq.class, dlkqVar);
    }

    private dlkq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဈ\u0006\u0005\u001b\u0006ဉ\u0001\u0007ဌ\u0005\bဇ\u0002", new Object[]{"a", "b", "e", "f", "h", "i", dlkn.class, "c", "g", dlkp.c(), "d"});
            }
            if (i2 == 3) {
                return new dlkq();
            }
            if (i2 == 4) {
                return new dlkf();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlkq> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dlkq.class) {
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
