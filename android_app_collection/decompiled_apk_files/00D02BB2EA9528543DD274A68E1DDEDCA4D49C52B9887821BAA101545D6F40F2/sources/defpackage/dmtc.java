package defpackage;
/* compiled from: PG */
/* renamed from: dmtc  reason: default package */
/* loaded from: classes.dex */
public final class dmtc extends dsqs<dmtc, dmtb> implements dsqt {
    public static final dmtc h;
    private static volatile dssr<dmtc> j;
    public int a;
    public dmsj c;
    public int d;
    public int e;
    private byte i = 2;
    public dsrj<dmnz> b = dssu.b;
    public int f = -1;
    public long g = -1;

    static {
        dmtc dmtcVar = new dmtc();
        h = dmtcVar;
        dsqw.cc(dmtc.class, dmtcVar);
    }

    private dmtc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003င\u0004\bဂ\u0005\tင\u0002\nင\u0003", new Object[]{"a", "b", dmnz.class, "c", "f", "g", "d", "e"});
            }
            if (i2 == 3) {
                return new dmtc();
            }
            if (i2 == 4) {
                return new dmtb();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dmtc> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dmtc.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
