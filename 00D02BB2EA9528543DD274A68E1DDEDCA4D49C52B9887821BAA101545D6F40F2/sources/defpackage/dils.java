package defpackage;
/* compiled from: PG */
/* renamed from: dils  reason: default package */
/* loaded from: classes6.dex */
public final class dils extends dsqw<dils, dilr> implements dssk {
    public static final dils i;
    private static volatile dssr<dils> k;
    public int a;
    public dprx b;
    public dhjx c;
    public djmy d;
    public dpsb f;
    public dnqh g;
    public dhyb h;
    private byte j = 2;
    public dspd e = dspd.b;

    static {
        dils dilsVar = new dils();
        i = dilsVar;
        dsqw.cc(dils.class, dilsVar);
    }

    private dils() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ᐉ\u0006\u0006ည\u0003\u0007ဉ\u0007\bဉ\u0004", new Object[]{"a", "b", "c", "d", "g", "e", "h", "f"});
            }
            if (i3 == 3) {
                return new dils();
            }
            if (i3 == 4) {
                return new dilr();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dils> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dils.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
