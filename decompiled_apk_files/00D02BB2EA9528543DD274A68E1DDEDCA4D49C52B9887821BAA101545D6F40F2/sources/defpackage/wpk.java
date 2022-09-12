package defpackage;
/* compiled from: PG */
/* renamed from: wpk  reason: default package */
/* loaded from: classes7.dex */
public class wpk extends cqiw<wpv> {
    public static final /* synthetic */ int c = 0;
    private final boolean a;
    public final boolean b;

    public wpk() {
        this(false, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<wpv> a() {
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[7];
        cqmpVarArr[0] = cqgr.dr(1);
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.bp(-2);
        cqmpVarArr[3] = cqgr.fH(wpc.a);
        cqmp[] cqmpVarArr2 = new cqmp[13];
        cqmpVarArr2[0] = cqgr.dr(1);
        cqmpVarArr2[1] = cqgr.cd(-1);
        cqmpVarArr2[2] = cqgr.bp(-2);
        cqmpVarArr2[3] = cqgr.cH(cqrp.d(76.0d));
        cqmpVarArr2[4] = this.a ? cqmp.e : ibn.s();
        cqmpVarArr2[5] = cqgr.dU(ibn.f());
        cqmpVarArr2[6] = cqgr.dB(ibn.f());
        cqmpVarArr2[7] = this.a ? cqmp.e : wmb.r();
        cqmpVarArr2[8] = cqgr.cW(wpd.a);
        cqmpVarArr2[9] = cqgr.K(wpe.a);
        cqmpVarArr2[10] = iue.c(wpf.a);
        cqmpVarArr2[11] = cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bp(-2), e(new cqmp[0]), f(new cqmp[0]));
        if (this.b) {
            cqmpVar = cqgr.fR(new xap(), wpg.a, new cqmp[0]);
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr2[12] = cqmpVar;
        cqmpVarArr[4] = cqgr.gd(cqmpVarArr2);
        cqmpVarArr[5] = i();
        cqmpVarArr[6] = this.a ? cqmp.e : wnm.g(new cqmp[0]);
        return cqgr.gd(cqmpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cqmj<wpv> e(cqmp<wpv>... cqmpVarArr) {
        cqmj<wpv> gd = cqgr.gd(cqgr.dr(1), cqgr.cd(0), cqgr.bp(-2), cqgr.ca(Float.valueOf(1.0f)), wmb.a(wmb.q()), wmb.b(!this.a, new cqlc(this) { // from class: wph
            private final wpk a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                wpv wpvVar = (wpv) cqkpVar;
                boolean z = true;
                if (this.a.b && wpvVar.V() != null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, wmb.q()), wmb.i(wmb.q()), wmb.h(wmb.q()));
        gd.f(cqmpVarArr);
        return gd;
    }

    protected cqmj<wpv> f(cqmp<wpv>... cqmpVarArr) {
        cqmj<wpv> j = j(cqgr.cL(cqrp.d(56.0d)), h());
        j.f(cqmpVarArr);
        return j;
    }

    protected cqmn<wpv> g() {
        cqmp[] cqmpVarArr = new cqmp[2];
        cqmpVarArr[0] = cqgr.D(false);
        cqmpVarArr[1] = cqgr.aJ(Integer.valueOf(true != this.a ? 17 : 8388629));
        return cqmn.a(cqmpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cqnm<wpv> h() {
        xjh xjhVar = new xjh();
        cqlc cqlcVar = wpj.a;
        cqmp[] cqmpVarArr = new cqmp[1];
        cqmpVarArr[0] = this.a ? cqmp.e : cqgr.dF(cqrp.d(4.0d));
        return cqgr.fP(xjhVar, cqlcVar, cqmpVarArr);
    }

    protected cqmp<wpv> i() {
        return cqmp.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final cqmj<wpv> j(cqmp<wpv>... cqmpVarArr) {
        cqmj<wpv> gd = cqgr.gd(cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.bR(cqrp.d(12.0d)), cqgr.bw(16), g(), iue.c(wpi.a));
        gd.f(cqmpVarArr);
        return gd;
    }

    public wpk(boolean z, boolean z2) {
        super(Boolean.valueOf(z), Boolean.valueOf(z2));
        this.a = z;
        this.b = z2;
    }
}
