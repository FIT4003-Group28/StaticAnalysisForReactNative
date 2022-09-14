package defpackage;
/* compiled from: PG */
/* renamed from: douj  reason: default package */
/* loaded from: classes6.dex */
public final class douj extends dsqs<douj, doue> implements dsqt {
    public static final douj h;
    private static volatile dssr<douj> j;
    public int a;
    public int b;
    public float g;
    private byte i = 2;
    public String c = "";
    public dsrj<doui> d = dssu.b;
    public String e = "";
    public String f = "";

    static {
        douj doujVar = new douj();
        h = doujVar;
        dsqw.cc(douj.class, doujVar);
    }

    private douj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005\u001b\u0006ဈ\u0003\u0007ခ\u0004", new Object[]{"a", "b", douf.a, "c", "e", "d", doui.class, "f", "g"});
            }
            if (i2 == 3) {
                return new douj();
            }
            if (i2 == 4) {
                return new doue();
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
            dssr<douj> dssrVar = j;
            if (dssrVar == null) {
                synchronized (douj.class) {
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
