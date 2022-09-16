package defpackage;
/* compiled from: PG */
/* renamed from: dtnv  reason: default package */
/* loaded from: classes6.dex */
public final class dtnv extends dsqs<dtnv, dtnu> implements dsqt {
    public static final dtnv g;
    private static volatile dssr<dtnv> i;
    public int a;
    public dwgl b;
    public dthb d;
    public long f;
    private byte h = 2;
    public dsrj<String> c = dssu.b;
    public String e = "";

    static {
        dtnv dtnvVar = new dtnv();
        g = dtnvVar;
        dsqw.cc(dtnv.class, dtnvVar);
    }

    private dtnv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002\u001a\u0003ᐉ\u0001\u0004ဈ\u0002\u0007ဂ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dtnv();
            }
            if (i3 == 4) {
                return new dtnu();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dtnv> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtnv.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
