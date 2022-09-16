package defpackage;
/* compiled from: PG */
/* renamed from: dkvs  reason: default package */
/* loaded from: classes.dex */
public final class dkvs extends dsqw<dkvs, dkvo> implements dssk {
    public static final dkvs i;
    private static volatile dssr<dkvs> k;
    public boolean b;
    public boolean c;
    public int e;
    public dkvr h;
    private int j;
    public int a = 150;
    public int d = 200000;
    public int f = 7;
    public int g = 60000;

    static {
        dkvs dkvsVar = new dkvs();
        i = dkvsVar;
        dsqw.cc(dkvs.class, dkvsVar);
    }

    private dkvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001င\u0000\u0004ဇ\u0003\u0005ဇ\u0004\u0007င\u0005\bင\u0007\tင\b\nဉ\t\u000bင\u0006", new Object[]{"j", "a", "b", "c", "d", "f", "g", "h", "e"});
            }
            if (i3 == 3) {
                return new dkvs();
            }
            if (i3 == 4) {
                return new dkvo();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkvs> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dkvs.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
