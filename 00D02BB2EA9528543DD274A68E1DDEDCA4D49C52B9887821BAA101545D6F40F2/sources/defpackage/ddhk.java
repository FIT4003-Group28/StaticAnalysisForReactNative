package defpackage;
/* compiled from: PG */
/* renamed from: ddhk  reason: default package */
/* loaded from: classes.dex */
public final class ddhk extends dsqs<ddhk, ddhh> implements dsqt {
    public static final ddhk k;
    private static volatile dssr<ddhk> m;
    public int a;
    public int b;
    public int f;
    public dtbc g;
    public int h;
    public ddcl j;
    private byte l = 2;
    public int c = -1;
    public dsrf d = dsqz.b;
    public String e = "";
    public int i = -1;

    static {
        ddhk ddhkVar = new ddhk();
        k = ddhkVar;
        dsqw.cc(ddhk.class, ddhkVar);
    }

    private ddhk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006ဌ\u0005\u0007င\u0003\u000bᐉ\u0004\u0095င\u0007èᐉ\b", new Object[]{"a", "b", "c", "d", "e", "h", ddhj.c(), "f", "g", "i", "j"});
            }
            if (i2 == 3) {
                return new ddhk();
            }
            if (i2 == 4) {
                return new ddhh();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<ddhk> dssrVar = m;
            if (dssrVar == null) {
                synchronized (ddhk.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
