package defpackage;
/* compiled from: PG */
/* renamed from: dgqd  reason: default package */
/* loaded from: classes6.dex */
public final class dgqd extends dsqw<dgqd, dgqc> implements dssk {
    public static final dgqd a;
    private static volatile dssr<dgqd> e;
    private int b;
    private dgrn c;
    private byte d = 2;

    static {
        dgqd dgqdVar = new dgqd();
        a = dgqdVar;
        dsqw.cc(dgqd.class, dgqdVar);
    }

    private dgqd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgqd();
            }
            if (i2 == 4) {
                return new dgqc();
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
            dssr<dgqd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgqd.class) {
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
