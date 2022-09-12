package defpackage;
/* compiled from: PG */
/* renamed from: drih  reason: default package */
/* loaded from: classes6.dex */
public final class drih extends dsqw<drih, drhy> implements dssk {
    public static final drih b;
    private static volatile dssr<drih> c;
    public dsrj<drig> a = dssu.b;

    static {
        drih drihVar = new drih();
        b = drihVar;
        dsqw.cc(drih.class, drihVar);
    }

    private drih() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drig.class});
            }
            if (i2 == 3) {
                return new drih();
            }
            if (i2 == 4) {
                return new drhy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drih> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drih.class) {
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
