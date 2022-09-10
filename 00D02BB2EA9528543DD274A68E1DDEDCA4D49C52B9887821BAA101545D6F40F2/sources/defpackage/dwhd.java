package defpackage;
/* compiled from: PG */
/* renamed from: dwhd  reason: default package */
/* loaded from: classes6.dex */
public final class dwhd extends dsqw<dwhd, dwha> implements dssk {
    public static final dwhd h;
    private static volatile dssr<dwhd> j;
    public int a;
    public int b;
    public dnof c;
    public djgl f;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public dsrj<dnzx> g = dssu.b;

    static {
        dwhd dwhdVar = new dwhd();
        h = dwhdVar;
        dsqw.cc(dwhd.class, dwhdVar);
    }

    private dwhd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0007\u001b", new Object[]{"a", "b", dwhb.a, "c", "d", "e", "f", "g", dnzx.class});
            }
            if (i2 == 3) {
                return new dwhd();
            }
            if (i2 == 4) {
                return new dwha();
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
            dssr<dwhd> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dwhd.class) {
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
