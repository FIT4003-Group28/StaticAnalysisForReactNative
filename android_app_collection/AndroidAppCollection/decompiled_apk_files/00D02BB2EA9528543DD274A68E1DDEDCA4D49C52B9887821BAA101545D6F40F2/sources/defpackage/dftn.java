package defpackage;
/* compiled from: PG */
/* renamed from: dftn  reason: default package */
/* loaded from: classes6.dex */
public final class dftn extends dsqw<dftn, dftm> implements dssk {
    public static final dftn l;
    private static volatile dssr<dftn> m;
    public int a;
    public float c;
    public boolean d;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean k;
    public float b = 1.0f;
    public boolean e = true;
    public float j = 1.0f;

    static {
        dftn dftnVar = new dftn();
        l = dftnVar;
        dsqw.cc(dftn.class, dftnVar);
    }

    private dftn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\nခ\b\u000bဇ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new dftn();
            }
            if (i2 == 4) {
                return new dftm();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dftn> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dftn.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
