package defpackage;
/* compiled from: PG */
/* renamed from: dttp  reason: default package */
/* loaded from: classes6.dex */
public final class dttp extends dsqw<dttp, dtto> implements dssk {
    public static final dttp d;
    private static volatile dssr<dttp> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dttp dttpVar = new dttp();
        d = dttpVar;
        dsqw.cc(dttp.class, dttpVar);
    }

    private dttp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dttp();
            }
            if (i2 == 4) {
                return new dtto();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dttp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
