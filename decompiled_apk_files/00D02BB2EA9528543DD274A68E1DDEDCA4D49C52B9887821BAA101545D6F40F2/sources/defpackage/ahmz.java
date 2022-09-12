package defpackage;
/* compiled from: PG */
/* renamed from: ahmz  reason: default package */
/* loaded from: classes2.dex */
public final class ahmz extends dsqw<ahmz, ahmy> implements dssk {
    public static final ahmz h;
    private static volatile dssr<ahmz> i;
    public int a;
    public long b;
    public long c;
    public float d;
    public float e;
    public boolean f;
    public dsrf g = dsqz.b;

    static {
        ahmz ahmzVar = new ahmz();
        h = ahmzVar;
        dsqw.cc(ahmz.class, ahmzVar);
    }

    private ahmz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new ahmz();
            }
            if (i3 == 4) {
                return new ahmy();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ahmz> dssrVar = i;
            if (dssrVar == null) {
                synchronized (ahmz.class) {
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
