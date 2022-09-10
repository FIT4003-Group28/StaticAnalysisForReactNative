package defpackage;
/* compiled from: PG */
/* renamed from: yis  reason: default package */
/* loaded from: classes7.dex */
public final class yis extends dsqw<yis, yir> implements dssk {
    public static final yis b;
    private static volatile dssr<yis> c;
    public dsrj<yiq> a = dssu.b;

    static {
        yis yisVar = new yis();
        b = yisVar;
        dsqw.cc(yis.class, yisVar);
    }

    private yis() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", yiq.class});
            }
            if (i2 == 3) {
                return new yis();
            }
            if (i2 == 4) {
                return new yir();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<yis> dssrVar = c;
            if (dssrVar == null) {
                synchronized (yis.class) {
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

    public final void b() {
        dsrj<yiq> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
