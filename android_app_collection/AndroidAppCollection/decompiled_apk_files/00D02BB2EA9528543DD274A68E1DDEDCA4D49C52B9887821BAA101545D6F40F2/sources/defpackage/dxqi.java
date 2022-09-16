package defpackage;
/* compiled from: PG */
/* renamed from: dxqi  reason: default package */
/* loaded from: classes6.dex */
public final class dxqi extends dsqw<dxqi, dxqg> implements dssk {
    public static final dxqi t;
    private static volatile dssr<dxqi> u;
    public Object b;
    public Object d;
    public Object f;
    public long h;
    public dxnc i;
    public dxmq j;
    public int l;
    public boolean o;
    public dxkq p;
    public int q;
    public int r;
    public dxqk s;
    public int a = 0;
    public int c = 0;
    public int e = 0;
    public dssd<String, dsok> m = dssd.b;
    public String g = "";
    public String k = "";
    public String n = "";

    static {
        dxqi dxqiVar = new dxqi();
        t = dxqiVar;
        dsqw.cc(dxqi.class, dxqiVar);
    }

    private dxqi() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(t, "\u0000\u0016\u0003\u0000\u0001\u0097\u0016\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\t\u0004\t\u0005<\u0000\tȈ\n\f\u000b2\fȈ\r\u0007\u000e\t\u000f\f\u0010\f\u0011\te<\u0001f<\u0001g<\u0001h<\u0001i<\u0001j<\u0001k<\u0001\u0097<\u0002", new Object[]{"b", "a", "d", "c", "f", "e", "g", "h", "i", "j", dxnc.class, "k", "l", "m", dxqh.a, "n", "o", "p", "q", "r", "s", dxqd.class, dxqu.class, dxqm.class, dxpz.class, dxqf.class, dxsm.class, dxri.class, dxnx.class});
            }
            if (i2 == 3) {
                return new dxqi();
            }
            if (i2 == 4) {
                return new dxqg();
            }
            if (i2 == 5) {
                return t;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqi> dssrVar = u;
            if (dssrVar == null) {
                synchronized (dxqi.class) {
                    dssrVar = u;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(t);
                        u = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
