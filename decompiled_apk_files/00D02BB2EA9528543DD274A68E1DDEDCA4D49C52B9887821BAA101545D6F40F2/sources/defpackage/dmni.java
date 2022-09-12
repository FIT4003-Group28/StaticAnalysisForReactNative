package defpackage;
/* compiled from: PG */
/* renamed from: dmni  reason: default package */
/* loaded from: classes6.dex */
public final class dmni extends dsqs<dmni, dmnh> implements dsqt {
    public static final dmni f;
    private static volatile dssr<dmni> h;
    public int a;
    public int b;
    public dmqi d;
    public dmpp e;
    private byte g = 2;
    public dsrj<dmqz> c = dssu.b;

    static {
        dmni dmniVar = new dmni();
        f = dmniVar;
        dsqw.cc(dmni.class, dmniVar);
    }

    private dmni() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0001\u0003\u0001ဌ\u0000\u0004ᐉ\u0002\u0007ᐉ\u0005\u000bЛ", new Object[]{"a", "b", dmti.c(), "d", "e", "c", dmqz.class});
            }
            if (i2 == 3) {
                return new dmni();
            }
            if (i2 == 4) {
                return new dmnh();
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
            dssr<dmni> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmni.class) {
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
