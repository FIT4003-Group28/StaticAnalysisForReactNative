package defpackage;
/* compiled from: PG */
/* renamed from: dkfh  reason: default package */
/* loaded from: classes6.dex */
public final class dkfh extends dsqw<dkfh, dkfc> implements dssk {
    public static final dkfh k;
    private static volatile dssr<dkfh> n;
    public int a;
    public boolean e;
    public dpum f;
    private dnqh l;
    private byte m = 2;
    public dspd b = dspd.b;
    public dspd c = dspd.b;
    public dspd d = dspd.b;
    public dsrj<dkfg> g = dssu.b;
    public String h = "";
    public dsrj<dkfe> i = dssu.b;
    public dspd j = dspd.b;

    static {
        dkfh dkfhVar = new dkfh();
        k = dkfhVar;
        dsqw.cc(dkfh.class, dkfhVar);
    }

    private dkfh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0002\u0001\u0001ည\u0000\u0002ည\u0002\u0004ည\u0006\u0005ဉ\u0004\u0006ည\u0001\u0007ဈ\u0005\b\u001b\tᐉ\b\nဇ\u0003\u000b\u001b", new Object[]{"a", "b", "d", "j", "f", "c", "h", "i", dkfe.class, "l", "e", "g", dkfg.class});
            }
            if (i2 == 3) {
                return new dkfh();
            }
            if (i2 == 4) {
                return new dkfc();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<dkfh> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dkfh.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
