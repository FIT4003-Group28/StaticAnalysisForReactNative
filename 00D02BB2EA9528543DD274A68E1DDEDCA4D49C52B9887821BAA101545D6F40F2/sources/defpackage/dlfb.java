package defpackage;
/* compiled from: PG */
/* renamed from: dlfb  reason: default package */
/* loaded from: classes6.dex */
public final class dlfb extends dsqw<dlfb, dlfa> implements dssk {
    public static final dlfb h;
    private static volatile dssr<dlfb> i;
    public int a;
    public String b = "";
    public dlex c;
    public long d;
    public String e;
    public String f;
    public String g;

    static {
        dlfb dlfbVar = new dlfb();
        h = dlfbVar;
        dsqw.cc(dlfb.class, dlfbVar);
    }

    private dlfb() {
        dssu<Object> dssuVar = dssu.b;
        this.e = "";
        this.f = "";
        this.g = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dlfb();
            }
            if (i3 == 4) {
                return new dlfa();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dlfb> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dlfb.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
