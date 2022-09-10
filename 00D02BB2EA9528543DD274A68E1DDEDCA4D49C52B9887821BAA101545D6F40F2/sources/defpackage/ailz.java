package defpackage;
/* compiled from: PG */
/* renamed from: ailz  reason: default package */
/* loaded from: classes2.dex */
public final class ailz extends dsqw<ailz, aily> implements dssk {
    public static final ailz b;
    private static volatile dssr<ailz> c;
    public dsrj<dqzv> a = dssu.b;

    static {
        ailz ailzVar = new ailz();
        b = ailzVar;
        dsqw.cc(ailz.class, ailzVar);
    }

    private ailz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqzv.class});
            }
            if (i2 == 3) {
                return new ailz();
            }
            if (i2 == 4) {
                return new aily();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ailz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ailz.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
