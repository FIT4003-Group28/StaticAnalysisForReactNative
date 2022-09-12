package defpackage;
/* compiled from: PG */
/* renamed from: daqk  reason: default package */
/* loaded from: classes5.dex */
public final class daqk extends dsqw<daqk, daqj> implements dssk {
    public static final daqk d;
    private static volatile dssr<daqk> f;
    public int a;
    public long b;
    public dhhi c;
    private byte e = 2;

    static {
        daqk daqkVar = new daqk();
        d = daqkVar;
        dsqw.cc(daqk.class, daqkVar);
    }

    private daqk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new daqk();
            }
            if (i2 == 4) {
                return new daqj();
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
            dssr<daqk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (daqk.class) {
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
