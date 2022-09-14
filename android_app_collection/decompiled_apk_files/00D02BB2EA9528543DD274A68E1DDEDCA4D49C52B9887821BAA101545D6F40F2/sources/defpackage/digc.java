package defpackage;
/* compiled from: PG */
/* renamed from: digc  reason: default package */
/* loaded from: classes6.dex */
public final class digc extends dsqs<digc, difs> implements dsqt {
    public static final digc b;
    private static volatile dssr<digc> d;
    private byte c = 2;
    public dsrj<digb> a = dssu.b;

    static {
        digc digcVar = new digc();
        b = digcVar;
        dsqw.cc(digc.class, digcVar);
    }

    private digc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", digb.class});
            }
            if (i2 == 3) {
                return new digc();
            }
            if (i2 == 4) {
                return new difs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<digc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (digc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
