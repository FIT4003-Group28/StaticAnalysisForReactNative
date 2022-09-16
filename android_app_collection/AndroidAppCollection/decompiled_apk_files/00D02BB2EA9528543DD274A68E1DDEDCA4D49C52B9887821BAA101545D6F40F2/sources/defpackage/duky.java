package defpackage;
/* compiled from: PG */
/* renamed from: duky  reason: default package */
/* loaded from: classes.dex */
public final class duky extends dsqw<duky, dukv> implements dukz {
    public static final duky o;
    private static volatile dssr<duky> r;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public dukx e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    private int p;
    private int q;

    static {
        duky dukyVar = new duky();
        o = dukyVar;
        dsqw.cc(duky.class, dukyVar);
    }

    private duky() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\u000e\u0000\u0002\u00020\u000e\u0000\u0000\u0000\u0002ဇ\u0001\u0005ဇ\u0004\u0006ဇ\u0006\u0007ဇ\u0005\u000eဉ\r\u0019ဇ\u0018\u001cဇ\u001b\u001dဇ\u001c$ဇ#(ဇ'-ဇ,.ဇ-/ဇ.0ဇ/", new Object[]{"p", "q", "a", "b", "d", "c", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            }
            if (i2 == 3) {
                return new duky();
            }
            if (i2 == 4) {
                return new dukv();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duky> dssrVar = r;
            if (dssrVar == null) {
                synchronized (duky.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
