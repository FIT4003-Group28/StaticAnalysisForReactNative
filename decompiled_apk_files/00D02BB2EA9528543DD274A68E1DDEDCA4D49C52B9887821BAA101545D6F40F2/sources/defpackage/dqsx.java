package defpackage;
/* compiled from: PG */
/* renamed from: dqsx  reason: default package */
/* loaded from: classes6.dex */
public final class dqsx extends dsqw<dqsx, dqsw> implements dssk {
    public static final dqsx c;
    private static volatile dssr<dqsx> e;
    public String a = "";
    public dsrj<dqsz> b = dssu.b;
    private int d;

    static {
        dqsx dqsxVar = new dqsx();
        c = dqsxVar;
        dsqw.cc(dqsx.class, dqsxVar);
    }

    private dqsx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dqsz.class});
            }
            if (i2 == 3) {
                return new dqsx();
            }
            if (i2 == 4) {
                return new dqsw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqsx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqsx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
