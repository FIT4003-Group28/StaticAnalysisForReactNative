package defpackage;
/* compiled from: PG */
/* renamed from: dncs  reason: default package */
/* loaded from: classes6.dex */
public final class dncs extends dsqw<dncs, dncr> implements dssk {
    public static final dncs a;
    private static volatile dssr<dncs> f;
    private int b;
    private dncn c;
    private dncn d;
    private byte e = 2;

    static {
        dncs dncsVar = new dncs();
        a = dncsVar;
        dsqw.cc(dncs.class, dncsVar);
    }

    private dncs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0005ᐉ\u0004", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dncs();
            }
            if (i2 == 4) {
                return new dncr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dncs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dncs.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
