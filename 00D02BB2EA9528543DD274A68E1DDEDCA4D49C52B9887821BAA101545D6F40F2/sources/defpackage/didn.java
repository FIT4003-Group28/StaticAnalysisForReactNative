package defpackage;
/* compiled from: PG */
/* renamed from: didn  reason: default package */
/* loaded from: classes6.dex */
public final class didn extends dsqw<didn, didm> implements dssk {
    public static final didn h;
    private static volatile dssr<didn> i;
    public int a;
    public long c;
    public boolean d;
    public dpum e;
    public int f;
    public String b = "";
    public String g = "";

    static {
        didn didnVar = new didn();
        h = didnVar;
        dsqw.cc(didn.class, didnVar);
    }

    private didn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002စ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", dqvj.d(), "g"});
            }
            if (i3 == 3) {
                return new didn();
            }
            if (i3 == 4) {
                return new didm();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<didn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (didn.class) {
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
