package defpackage;
/* compiled from: PG */
/* renamed from: acit  reason: default package */
/* loaded from: classes2.dex */
public final class acit extends dsqw<acit, acis> implements dssk {
    public static final acit c;
    private static volatile dssr<acit> e;
    public int a;
    public dirb b;
    private byte d = 2;

    static {
        acit acitVar = new acit();
        c = acitVar;
        dsqw.cc(acit.class, acitVar);
    }

    private acit() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new acit();
            }
            if (i2 == 4) {
                return new acis();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<acit> dssrVar = e;
            if (dssrVar == null) {
                synchronized (acit.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
