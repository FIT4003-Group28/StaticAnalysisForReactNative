package defpackage;
/* compiled from: PG */
/* renamed from: dmqk  reason: default package */
/* loaded from: classes.dex */
public final class dmqk extends dsqw<dmqk, dmqj> implements dssk {
    public static final dmqk j;
    private static volatile dssr<dmqk> k;
    public int a;
    public dsrj<dmsl> b = dssu.b;
    public int c;
    public boolean d;
    public String e;
    public String f;
    public float g;
    public float h;
    public int i;

    static {
        dmqk dmqkVar = new dmqk();
        j = dmqkVar;
        dsqw.cc(dmqk.class, dmqkVar);
    }

    private dmqk() {
        dsqz dsqzVar = dsqz.b;
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0000\u0001\u001b\u0004င\u0002\u0005ဇ\u0003\u0007ဈ\u0004\tဈ\u0006\u000bခ\b\fင\n\rခ\t", new Object[]{"a", "b", dmsl.class, "c", "d", "e", "f", "g", "i", "h"});
            }
            if (i2 == 3) {
                return new dmqk();
            }
            if (i2 == 4) {
                return new dmqj();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmqk> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dmqk.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
