package defpackage;
/* compiled from: PG */
/* renamed from: dtof  reason: default package */
/* loaded from: classes6.dex */
public final class dtof extends dsqs<dtof, dtoe> implements dsqt {
    public static final dtof i;
    private static volatile dssr<dtof> k;
    public int a;
    public dvyw b;
    public int c;
    public dthb d;
    public dthb e;
    public long h;
    private byte j = 2;
    public dsrj<dtkq> f = dssu.b;
    public String g = "";

    static {
        dtof dtofVar = new dtof();
        i = dtofVar;
        dsqw.cc(dtof.class, dtofVar);
    }

    private dtof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ဈ\u0005\u0005င\u0001\u0006ᐉ\u0003\bဂ\b\t\u001b", new Object[]{"a", "b", "d", "g", "c", "e", "h", "f", dtkq.class});
            }
            if (i3 == 3) {
                return new dtof();
            }
            if (i3 == 4) {
                return new dtoe();
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
            dssr<dtof> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dtof.class) {
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
