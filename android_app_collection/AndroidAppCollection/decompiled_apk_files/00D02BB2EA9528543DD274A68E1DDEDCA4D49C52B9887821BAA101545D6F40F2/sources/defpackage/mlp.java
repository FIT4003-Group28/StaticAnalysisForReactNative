package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: mlp  reason: default package */
/* loaded from: classes7.dex */
public final class mlp extends cqiw<mpe> {
    public static final int a = cqir.a();
    public static final int b = cqir.a();
    public static final cqtv c = cqrp.d(400.0d);
    private final boolean d;

    public mlp(boolean z) {
        super(Boolean.valueOf(z));
        this.d = z;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, mpe mpeVar, Context context, cqiv cqivVar) {
        cqiw mltVar;
        Object obj;
        mpe mpeVar2 = mpeVar;
        if (this.d) {
            cqivVar.a(new mku(), mpeVar2.d());
        }
        int intValue = mpeVar2.b().intValue();
        for (int i2 = 0; i2 < intValue; i2++) {
            moa c2 = mpeVar2.c(i2);
            int i3 = c2.b;
            boolean z = this.d;
            if (!z) {
                if (i3 == 1) {
                    i3 = 1;
                }
            }
            int i4 = i3 - 1;
            if (i4 != 0) {
                if (i4 == 1) {
                    mltVar = new mju();
                    obj = (mow) c2.a;
                } else if (i4 == 2) {
                    mltVar = new mky();
                    obj = (moz) c2.a;
                } else if (i4 == 3) {
                    mltVar = new mjp();
                    obj = (mov) c2.a;
                } else if (i4 != 4) {
                    mltVar = new mlj();
                    obj = (mpa) c2.a;
                } else {
                    mltVar = new mjk();
                    obj = (mou) c2.a;
                }
            } else if (!z) {
                mltVar = new mlt(false);
                obj = (mpb) c2.a;
            }
            cqivVar.a(mltVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<mpe> a() {
        if (!this.d) {
            cqmj gq = cqgr.gq(cqgr.aR(Integer.valueOf(a)), cqgr.cd(-1), cqgr.bp(-2), cqgr.bY(cqjd.i()), vlb.a(), nre.e(), cqgr.eM(mlm.a), cqgr.cC(mln.a));
            return cqgr.gj(cqgr.am(true), cqgr.ch(cquz.b), iue.c(mlo.a), gq, jgf.a(cqgr.am(true), cqgr.bY(cqjd.v(gq)), cqgr.dr(1), cqgr.ck(C())));
        }
        return nrj.a(cqgr.aR(Integer.valueOf(b)), iue.c(mll.a), cqgr.cd(-1), cqgr.bp(-1), nrj.e(0), cqgr.bv(3), nrj.d(nqo.aJ), nrj.g(true), cqgr.ck(C()));
    }
}
