package defpackage;
/* compiled from: PG */
/* renamed from: dulb  reason: default package */
/* loaded from: classes6.dex */
public final class dulb extends dsqw<dulb, dula> implements dssk {
    public static final dulb a;
    private static volatile dssr<dulb> c;
    private byte b = 2;

    static {
        dulb dulbVar = new dulb();
        a = dulbVar;
        dsqw.cc(dulb.class, dulbVar);
    }

    private dulb() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dulb();
            }
            if (i2 == 4) {
                return new dula();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dulb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dulb.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
