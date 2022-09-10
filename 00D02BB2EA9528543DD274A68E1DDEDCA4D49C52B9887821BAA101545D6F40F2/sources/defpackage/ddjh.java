package defpackage;
/* compiled from: PG */
/* renamed from: ddjh  reason: default package */
/* loaded from: classes5.dex */
public final class ddjh extends dsqw<ddjh, ddjg> implements dssk {
    public static final ddjh n;
    private static volatile dssr<ddjh> o;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;

    static {
        ddjh ddjhVar = new ddjh();
        n = ddjhVar;
        dsqw.cc(ddjh.class, ddjhVar);
    }

    private ddjh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fဂ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new ddjh();
            }
            if (i2 == 4) {
                return new ddjg();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddjh> dssrVar = o;
            if (dssrVar == null) {
                synchronized (ddjh.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
