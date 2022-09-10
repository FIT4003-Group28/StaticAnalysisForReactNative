package defpackage;
/* compiled from: PG */
/* renamed from: dolg  reason: default package */
/* loaded from: classes6.dex */
public final class dolg extends dsqw<dolg, dolf> implements dssk {
    public static final dolg a;
    private static volatile dssr<dolg> c;
    private byte b = 2;

    static {
        dolg dolgVar = new dolg();
        a = dolgVar;
        dsqw.cc(dolg.class, dolgVar);
    }

    private dolg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dolg();
            }
            if (i2 == 4) {
                return new dolf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dolg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dolg.class) {
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
