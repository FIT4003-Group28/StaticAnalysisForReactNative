package defpackage;
/* compiled from: PG */
/* renamed from: difq  reason: default package */
/* loaded from: classes6.dex */
public final class difq extends dsqw<difq, difp> implements dssk {
    public static final difq b;
    private static volatile dssr<difq> c;
    public dsrj<drld> a = dssu.b;

    static {
        difq difqVar = new difq();
        b = difqVar;
        dsqw.cc(difq.class, difqVar);
    }

    private difq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drld.class});
            }
            if (i2 == 3) {
                return new difq();
            }
            if (i2 == 4) {
                return new difp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<difq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (difq.class) {
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
