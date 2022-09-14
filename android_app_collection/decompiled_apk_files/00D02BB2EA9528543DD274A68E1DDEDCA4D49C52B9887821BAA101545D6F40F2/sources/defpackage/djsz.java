package defpackage;
/* compiled from: PG */
/* renamed from: djsz  reason: default package */
/* loaded from: classes6.dex */
public final class djsz extends dsqw<djsz, djsw> implements dssk {
    public static final djsz c;
    private static volatile dssr<djsz> e;
    public dsrj<djsy> a = dssu.b;
    public dnwb b;
    private int d;

    static {
        djsz djszVar = new djsz();
        c = djszVar;
        dsqw.cc(djsz.class, djszVar);
    }

    private djsz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဉ\u0000", new Object[]{"d", "a", djsy.class, "b"});
            }
            if (i2 == 3) {
                return new djsz();
            }
            if (i2 == 4) {
                return new djsw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djsz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djsz.class) {
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
