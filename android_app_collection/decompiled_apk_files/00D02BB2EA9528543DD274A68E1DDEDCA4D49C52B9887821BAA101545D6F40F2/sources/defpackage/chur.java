package defpackage;
/* compiled from: PG */
/* renamed from: chur  reason: default package */
/* loaded from: classes4.dex */
public final class chur extends dsqw<chur, chuq> implements dssk {
    public static final chur d;
    private static volatile dssr<chur> e;
    public int a;
    public int b;
    public dsrj<chxr> c = dssu.b;

    static {
        chur churVar = new chur();
        d = churVar;
        dsqw.cc(chur.class, churVar);
    }

    private chur() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"a", "b", "c", chxr.class});
            }
            if (i2 == 3) {
                return new chur();
            }
            if (i2 == 4) {
                return new chuq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chur> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chur.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
