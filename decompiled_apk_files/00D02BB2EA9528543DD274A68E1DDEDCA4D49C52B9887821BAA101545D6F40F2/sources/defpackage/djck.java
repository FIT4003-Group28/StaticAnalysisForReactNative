package defpackage;
/* compiled from: PG */
/* renamed from: djck  reason: default package */
/* loaded from: classes6.dex */
public final class djck extends dsqw<djck, djcj> implements dssk {
    public static final djck i;
    private static volatile dssr<djck> k;
    public int a;
    public drdk b;
    public djcm e;
    public dspd f;
    public dsrj<docg> g;
    public dsrj<djvn> h;
    private byte j = 2;
    public String c = "";
    public String d = "";

    static {
        djck djckVar = new djck();
        i = djckVar;
        dsqw.cc(djck.class, djckVar);
    }

    private djck() {
        dssu<Object> dssuVar = dssu.b;
        this.f = dspd.b;
        this.g = dssu.b;
        this.h = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0001\u0001ဉ\u0000\u0002ဈ\u0002\u0004ဉ\u0003\u0005ည\u0004\u0006ဈ\u0001\u0007Л\t\u001b", new Object[]{"a", "b", "d", "e", "f", "c", "g", docg.class, "h", djvn.class});
            }
            if (i3 == 3) {
                return new djck();
            }
            if (i3 == 4) {
                return new djcj();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<djck> dssrVar = k;
            if (dssrVar == null) {
                synchronized (djck.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
