package defpackage;
/* compiled from: PG */
/* renamed from: dfie  reason: default package */
/* loaded from: classes6.dex */
public final class dfie extends dsqw<dfie, dfid> implements dssk {
    public static final dfie h;
    private static volatile dssr<dfie> i;
    public int a;
    public float b = 10.0f;
    public float c = 10.0f;
    public float d = 15.0f;
    public float e = 15.0f;
    public float f = 20.0f;
    public float g = 6.0f;

    static {
        dfie dfieVar = new dfie();
        h = dfieVar;
        dsqw.cc(dfie.class, dfieVar);
    }

    private dfie() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dfie();
            }
            if (i3 == 4) {
                return new dfid();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dfie> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dfie.class) {
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