package defpackage;
/* compiled from: PG */
/* renamed from: diyq  reason: default package */
/* loaded from: classes6.dex */
public final class diyq extends dsqw<diyq, diyn> implements dssk {
    public static final diyq d;
    private static volatile dssr<diyq> h;
    public dqau b;
    private int e;
    private diyp f;
    private byte g = 2;
    public String a = "";
    public dsrj<dwfl> c = dssu.b;

    static {
        diyq diyqVar = new diyq();
        d = diyqVar;
        dsqw.cc(diyq.class, diyqVar);
    }

    private diyq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဉ\u0001\u0002\u001b\u0003ဈ\u0000\u0004ᐉ\u0003", new Object[]{"e", "b", "c", dwfl.class, "a", "f"});
            }
            if (i2 == 3) {
                return new diyq();
            }
            if (i2 == 4) {
                return new diyn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<diyq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (diyq.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
