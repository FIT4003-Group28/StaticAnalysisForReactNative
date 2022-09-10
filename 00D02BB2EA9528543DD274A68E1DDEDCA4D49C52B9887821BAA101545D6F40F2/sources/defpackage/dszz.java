package defpackage;
/* compiled from: PG */
/* renamed from: dszz  reason: default package */
/* loaded from: classes6.dex */
public final class dszz extends dsqw<dszz, dszy> implements dssk {
    public static final dszz a;
    private static volatile dssr<dszz> c;
    private byte b = 2;

    static {
        dszz dszzVar = new dszz();
        a = dszzVar;
        dsqw.cc(dszz.class, dszzVar);
    }

    private dszz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dszz();
            }
            if (i2 == 4) {
                return new dszy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dszz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dszz.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
