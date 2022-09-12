package defpackage;
/* compiled from: PG */
/* renamed from: dxur  reason: default package */
/* loaded from: classes6.dex */
public final class dxur extends dsqw<dxur, dxuq> implements dssk {
    public static final dxur h;
    private static volatile dssr<dxur> i;
    public dxvq a;
    public String b = "";
    public dxwe c;
    public String d;
    public String e;
    public dsrf f;
    public String g;

    static {
        dxur dxurVar = new dxur();
        h = dxurVar;
        dsqw.cc(dxur.class, dxurVar);
    }

    private dxur() {
        dspd dspdVar = dspd.b;
        this.d = "";
        this.e = "";
        this.f = dsqz.b;
        this.g = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0000\u0007\u0000\u0000\u0001!\u0007\u0000\u0001\u0000\u0001\t\u0003Ȉ\u0006\t\u0007Ȉ\bȈ\t'!Ȉ", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dxur();
            }
            if (i3 == 4) {
                return new dxuq();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dxur> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dxur.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
