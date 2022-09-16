package defpackage;
/* compiled from: PG */
/* renamed from: awtr  reason: default package */
/* loaded from: classes3.dex */
public final class awtr extends dsqw<awtr, awto> implements dssk {
    public static final awtr l;
    private static volatile dssr<awtr> m;
    public int a;
    public dpum b;
    public long c;
    public long d;
    public long e;
    public long f;
    public String g = "";
    public String h = "";
    public dsrj<awtq> i = dssu.b;
    public int j;
    public boolean k;

    static {
        awtr awtrVar = new awtr();
        l = awtrVar;
        dsqw.cc(awtr.class, awtrVar);
    }

    private awtr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0005\u0004ဂ\u0003\u0005ဈ\u0006\u0006ဂ\u0004\u0007\u001b\bဌ\u0007\tဇ\b\nဂ\u0002", new Object[]{"a", "b", "c", "g", "e", "h", "f", "i", awtq.class, "j", dpzk.a, "k", "d"});
            }
            if (i2 == 3) {
                return new awtr();
            }
            if (i2 == 4) {
                return new awto();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<awtr> dssrVar = m;
            if (dssrVar == null) {
                synchronized (awtr.class) {
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
