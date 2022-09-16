package defpackage;
/* compiled from: PG */
/* renamed from: dirl  reason: default package */
/* loaded from: classes6.dex */
public final class dirl extends dsqw<dirl, dirk> implements dssk {
    public static final dirl h;
    private static volatile dssr<dirl> i;
    public int a;
    public float b = 10.0f;
    public float c = 10.0f;
    public float d = 15.0f;
    public float e = 15.0f;
    public float f = 20.0f;
    public float g = 6.0f;

    static {
        dirl dirlVar = new dirl();
        h = dirlVar;
        dsqw.cc(dirl.class, dirlVar);
    }

    private dirl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dirl();
            }
            if (i3 == 4) {
                return new dirk();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dirl> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dirl.class) {
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
