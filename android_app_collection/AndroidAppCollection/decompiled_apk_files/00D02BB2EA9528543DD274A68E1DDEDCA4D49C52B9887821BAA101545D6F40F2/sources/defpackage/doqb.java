package defpackage;
/* compiled from: PG */
/* renamed from: doqb  reason: default package */
/* loaded from: classes.dex */
public final class doqb extends dsqw<doqb, dopo> implements dssk {
    public static final doqb h;
    private static volatile dssr<doqb> i;
    public int a;
    public int b = 0;
    public Object c;
    public dops d;
    public boolean e;
    public int f;
    public dopu g;

    static {
        doqb doqbVar = new doqb();
        h = doqbVar;
        dsqw.cc(doqb.class, doqbVar);
    }

    private doqb() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0001\u0001\u0002\u000f\u0006\u0000\u0000\u0000\u0002ဇ\u0002\nဉ\u0004\u000bဉ\u0001\fင\u0003\r်\u0000\u000fျ\u0000", new Object[]{"c", "b", "a", "e", "g", "d", "f"});
            }
            if (i3 == 3) {
                return new doqb();
            }
            if (i3 == 4) {
                return new dopo();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<doqb> dssrVar = i;
            if (dssrVar == null) {
                synchronized (doqb.class) {
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
