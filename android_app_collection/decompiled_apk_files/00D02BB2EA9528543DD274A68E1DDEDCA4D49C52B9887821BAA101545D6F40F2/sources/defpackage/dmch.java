package defpackage;
/* compiled from: PG */
/* renamed from: dmch  reason: default package */
/* loaded from: classes6.dex */
public final class dmch extends dsqs<dmch, dmcg> implements dsqt {
    public static final dmch d;
    private static volatile dssr<dmch> f;
    public int a;
    public dqjt c;
    private byte e = 2;
    public String b = "";

    static {
        dmch dmchVar = new dmch();
        d = dmchVar;
        dsqw.cc(dmch.class, dmchVar);
    }

    private dmch() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmch();
            }
            if (i2 == 4) {
                return new dmcg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dmch> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmch.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
