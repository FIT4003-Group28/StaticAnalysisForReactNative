package defpackage;
/* compiled from: PG */
/* renamed from: duni  reason: default package */
/* loaded from: classes6.dex */
public final class duni extends dsqw<duni, dunh> implements dssk {
    public static final duni h;
    private static volatile dssr<duni> j;
    public int a;
    public long g;
    private byte i = 2;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public dsrj<drte> f = dssu.b;

    static {
        duni duniVar = new duni();
        h = duniVar;
        dsqw.cc(duni.class, duniVar);
    }

    private duni() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0003\u0005Л\u0006ဂ\u0005\u0007ဈ\u0004", new Object[]{"a", "b", "c", "d", "f", drte.class, "g", "e"});
            }
            if (i2 == 3) {
                return new duni();
            }
            if (i2 == 4) {
                return new dunh();
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
            dssr<duni> dssrVar = j;
            if (dssrVar == null) {
                synchronized (duni.class) {
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
