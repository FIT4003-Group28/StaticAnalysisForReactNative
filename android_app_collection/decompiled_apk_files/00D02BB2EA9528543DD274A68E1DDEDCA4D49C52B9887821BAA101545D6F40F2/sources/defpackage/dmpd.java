package defpackage;
/* compiled from: PG */
/* renamed from: dmpd  reason: default package */
/* loaded from: classes.dex */
public final class dmpd extends dsqs<dmpd, dmpc> implements dsqt {
    public static final dmpd h;
    private static volatile dssr<dmpd> j;
    public int a;
    public int e;
    public boolean f;
    public String g;
    private byte i = 2;
    public String b = "";
    public int c = -1;
    public long d = -1;

    static {
        dmpd dmpdVar = new dmpd();
        h = dmpdVar;
        dsqw.cc(dmpd.class, dmpdVar);
    }

    private dmpd() {
        dsqz dsqzVar = dsqz.b;
        this.g = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001ϩ\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0004\u0004ဂ\u0002\u0005င\u0003ϩဈ\u0006", new Object[]{"a", "b", "c", "f", "d", "e", "g"});
            }
            if (i2 == 3) {
                return new dmpd();
            }
            if (i2 == 4) {
                return new dmpc();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dmpd> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dmpd.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
