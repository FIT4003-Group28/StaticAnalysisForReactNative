package defpackage;
/* compiled from: PG */
/* renamed from: dniu  reason: default package */
/* loaded from: classes.dex */
public final class dniu extends dsqw<dniu, dnip> implements dniv {
    public static final dniu i;
    private static volatile dssr<dniu> j;
    public int a;
    public int c;
    public dhjx e;
    public String f;
    public dnoh g;
    public int h;
    public String b = "";
    public String d = "";

    static {
        dniu dniuVar = new dniu();
        i = dniuVar;
        dsqw.cc(dniu.class, dniuVar);
    }

    private dniu() {
        dspd dspdVar = dspd.b;
        this.f = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဉ\u0004\u0004ဉ\u0006\u0005ဌ\u0007\tဌ\u0001\u000bဈ\u0005", new Object[]{"a", "b", "d", "e", "g", "h", dniq.a, "c", dnis.a, "f"});
            }
            if (i3 == 3) {
                return new dniu();
            }
            if (i3 == 4) {
                return new dnip();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dniu> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dniu.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
