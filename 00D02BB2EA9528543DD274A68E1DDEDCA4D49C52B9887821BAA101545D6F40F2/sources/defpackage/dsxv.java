package defpackage;
/* compiled from: PG */
/* renamed from: dsxv  reason: default package */
/* loaded from: classes6.dex */
public final class dsxv extends dsqw<dsxv, dsxu> implements dssk {
    public static final dsxv a;
    private static volatile dssr<dsxv> e;
    private int b;
    private dsxn c;
    private byte d = 2;

    static {
        dsxv dsxvVar = new dsxv();
        a = dsxvVar;
        dsqw.cc(dsxv.class, dsxvVar);
    }

    private dsxv() {
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
                return new dsxv();
            }
            if (i2 == 4) {
                return new dsxu();
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
            dssr<dsxv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsxv.class) {
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
