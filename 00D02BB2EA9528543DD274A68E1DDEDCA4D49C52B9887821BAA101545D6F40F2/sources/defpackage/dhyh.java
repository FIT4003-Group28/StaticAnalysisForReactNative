package defpackage;
/* compiled from: PG */
/* renamed from: dhyh  reason: default package */
/* loaded from: classes6.dex */
public final class dhyh extends dsqw<dhyh, dhyg> implements dssk {
    public static final dhyh k;
    private static volatile dssr<dhyh> n;
    public int a;
    public dhjx b;
    public int c;
    public int d;
    public dnwb e;
    public dwfv f;
    public dqgy g;
    public dpsh h;
    public dqex i;
    public dhnv j;
    private dnqh l;
    private byte m = 2;

    static {
        dhyh dhyhVar = new dhyh();
        k = dhyhVar;
        dsqw.cc(dhyh.class, dhyhVar);
    }

    private dhyh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဉ\u0005\u0005ဌ\u0002\bဉ\u0004\u000bဉ\t\fဌ\u0003\rဉ\n\u000eဉ\u0006\u000fဉ\u000b", new Object[]{"a", "l", "b", "f", "c", dpsv.c(), "e", "h", "d", dpsw.a, "i", "g", "j"});
            }
            if (i2 == 3) {
                return new dhyh();
            }
            if (i2 == 4) {
                return new dhyg();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<dhyh> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dhyh.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
