package defpackage;
/* compiled from: PG */
/* renamed from: dhqa  reason: default package */
/* loaded from: classes6.dex */
public final class dhqa extends dsqw<dhqa, dhpz> implements dssk {
    public static final dhqa a;
    private static volatile dssr<dhqa> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dhqa dhqaVar = new dhqa();
        a = dhqaVar;
        dsqw.cc(dhqa.class, dhqaVar);
    }

    private dhqa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhqa();
            }
            if (i2 == 4) {
                return new dhpz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dhqa> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhqa.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}