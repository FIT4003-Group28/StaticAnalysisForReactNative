package defpackage;
/* compiled from: PG */
/* renamed from: bpui  reason: default package */
/* loaded from: classes4.dex */
public final class bpui extends dsqw<bpui, bpuf> implements dssk {
    public static final bpui j;
    private static volatile dssr<bpui> l;
    public int a;
    public dpsn b;
    public dhjz c;
    public dgrt f;
    public int g;
    public long h;
    private byte k = 2;
    public dsri d = dsrx.b;
    public String e = "";
    public dsri i = dsrx.b;

    static {
        bpui bpuiVar = new bpui();
        j = bpuiVar;
        dsqw.cc(bpui.class, bpuiVar);
    }

    private bpui() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0004\r\b\u0000\u0002\u0001\u0004\u0014\u0005ဈ\u0002\u0006ᐉ\u0003\tဂ\u0005\nဉ\u0000\u000bဉ\u0001\f\u0014\rဌ\u0004", new Object[]{"a", "d", "e", "f", "h", "b", "c", "i", "g", bpuh.c()});
            }
            if (i2 == 3) {
                return new bpui();
            }
            if (i2 == 4) {
                return new bpuf();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<bpui> dssrVar = l;
            if (dssrVar == null) {
                synchronized (bpui.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
