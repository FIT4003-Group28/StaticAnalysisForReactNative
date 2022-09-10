package defpackage;
/* compiled from: PG */
/* renamed from: dsxn  reason: default package */
/* loaded from: classes6.dex */
public final class dsxn extends dsqw<dsxn, dsxm> implements dssk {
    public static final dsxn a;
    private static volatile dssr<dsxn> f;
    private int b;
    private dsyb c;
    private dsxl d;
    private byte e = 2;

    static {
        dsxn dsxnVar = new dsxn();
        a = dsxnVar;
        dsqw.cc(dsxn.class, dsxnVar);
    }

    private dsxn() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dsxn();
            }
            if (i2 == 4) {
                return new dsxm();
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
            dssr<dsxn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsxn.class) {
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
