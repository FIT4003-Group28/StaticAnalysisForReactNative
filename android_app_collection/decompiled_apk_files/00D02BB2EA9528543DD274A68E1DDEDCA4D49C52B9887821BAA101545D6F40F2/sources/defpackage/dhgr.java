package defpackage;
/* compiled from: PG */
/* renamed from: dhgr  reason: default package */
/* loaded from: classes6.dex */
public final class dhgr extends dsqw<dhgr, dhgq> implements dssk {
    public static final dhgr c;
    private static volatile dssr<dhgr> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        dhgr dhgrVar = new dhgr();
        c = dhgrVar;
        dsqw.cc(dhgr.class, dhgrVar);
    }

    private dhgr() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001%\u0001\u0000\u0002(%\u0000\u0000\u0012\u0002ᐼ\u0000\u0003ြ\u0000\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tᐼ\u0000\u000bᐼ\u0000\fᐼ\u0000\rြ\u0000\u000eᐼ\u0000\u000fြ\u0000\u0010ᐼ\u0000\u0011ြ\u0000\u0012ြ\u0000\u0013ᐼ\u0000\u0014ᐼ\u0000\u0015ြ\u0000\u0016ᐼ\u0000\u0017ᐼ\u0000\u0018ᐼ\u0000\u0019ᐼ\u0000\u001aᐼ\u0000\u001bြ\u0000\u001cြ\u0000\u001dြ\u0000\u001eြ\u0000\u001fြ\u0000 ြ\u0000\"ᐼ\u0000#ြ\u0000$ြ\u0000%ြ\u0000&ြ\u0000'ᐼ\u0000(ᐼ\u0000", new Object[]{"b", "a", dhgv.class, dhgz.class, dtdj.class, dtdv.class, dtfz.class, dtfj.class, dtdl.class, dtfn.class, dtxf.class, dtxd.class, dtdn.class, dswy.class, dtdd.class, dtfr.class, dtft.class, dtfp.class, dtfx.class, dteb.class, dtef.class, dteh.class, dbla.class, dtfv.class, dtel.class, dtxh.class, dswu.class, dtdz.class, dble.class, dtrs.class, dblg.class, dtfl.class, dhgx.class, dblk.class, dtru.class, dtdb.class, dhgt.class, dtdf.class, dblc.class});
            }
            if (i2 == 3) {
                return new dhgr();
            }
            if (i2 == 4) {
                return new dhgq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dhgr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhgr.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
