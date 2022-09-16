package defpackage;
/* compiled from: PG */
/* renamed from: ahmn  reason: default package */
/* loaded from: classes2.dex */
public final class ahmn extends dsqw<ahmn, ahmm> implements dssk {
    public static final ahmn h;
    private static volatile dssr<ahmn> i;
    public int a;
    public long b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public duhi g;

    static {
        ahmn ahmnVar = new ahmn();
        h = ahmnVar;
        dsqw.cc(ahmn.class, ahmnVar);
    }

    private ahmn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new ahmn();
            }
            if (i3 == 4) {
                return new ahmm();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ahmn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (ahmn.class) {
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
