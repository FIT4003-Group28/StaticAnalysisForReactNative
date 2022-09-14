package defpackage;
/* compiled from: PG */
/* renamed from: dvqa  reason: default package */
/* loaded from: classes6.dex */
public final class dvqa extends dsqw<dvqa, dvpz> implements dssk {
    public static final dvqa f;
    private static volatile dssr<dvqa> h;
    public int a;
    public int d;
    public dnqh e;
    private byte g = 2;
    public String b = "";
    public String c = "";

    static {
        dvqa dvqaVar = new dvqa();
        f = dvqaVar;
        dsqw.cc(dvqa.class, dvqaVar);
    }

    private dvqa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0003\b\u0004\u0000\u0000\u0001\u0003ဈ\u0002\u0006ᐉ\u0005\u0007ဌ\u0003\bဈ\u0000", new Object[]{"a", "c", "e", "d", dqgr.c(), "b"});
            }
            if (i2 == 3) {
                return new dvqa();
            }
            if (i2 == 4) {
                return new dvpz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dvqa> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvqa.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
