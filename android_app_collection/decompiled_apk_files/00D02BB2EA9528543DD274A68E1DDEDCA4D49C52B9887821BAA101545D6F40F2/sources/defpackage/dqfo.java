package defpackage;
/* compiled from: PG */
/* renamed from: dqfo  reason: default package */
/* loaded from: classes.dex */
public final class dqfo extends dsqw<dqfo, dqfk> implements dssk {
    public static final dqfo j;
    private static volatile dssr<dqfo> k;
    public int a;
    public Object c;
    public int g;
    public int h;
    public int i;
    public int b = 0;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dqfo dqfoVar = new dqfo();
        j = dqfoVar;
        dsqw.cc(dqfo.class, dqfoVar);
    }

    private dqfo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\n\u0001\u0001\u0001\f\n\u0000\u0000\u0000\u0001ဈ\u0002\u0002ျ\u0000\u0003ဈ\u0007\u0004ဈ\u0001\u0006ြ\u0000\u0007ြ\u0000\tင\t\nဌ\n\u000bြ\u0000\fင\u000b", new Object[]{"c", "b", "a", "e", "f", "d", dprx.class, dpvg.class, "g", "h", dqfn.c(), dqez.class, "i"});
            }
            if (i2 == 3) {
                return new dqfo();
            }
            if (i2 == 4) {
                return new dqfk();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqfo> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dqfo.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
