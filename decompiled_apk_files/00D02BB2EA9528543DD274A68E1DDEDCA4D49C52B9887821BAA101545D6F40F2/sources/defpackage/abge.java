package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: abge  reason: default package */
/* loaded from: classes2.dex */
public final class abge extends cqiw<absp> {
    public static final cqtv a = cqsv.f(dcyn.a, dcyn.a, 28.0d, dcyn.a);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, absp abspVar, Context context, cqiv cqivVar) {
        cqivVar.e(abspVar.b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<absp> a() {
        cqmp<absp>[] cqmpVarArr = {cqgr.fE(new cqjb() { // from class: abgb
            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                final absp abspVar = (absp) cqkpVar;
                return new cqfc(abspVar) { // from class: abgc
                    private final absp a;

                    {
                        this.a = abspVar;
                    }

                    @Override // defpackage.cqfc
                    public final void a(View view, boolean z) {
                        absp abspVar2 = this.a;
                        cqtv cqtvVar = abge.a;
                        if (abspVar2.a(false)) {
                            view.setAlpha(0.0f);
                            view.animate().alpha(1.0f).setDuration(225L).setInterpolator(irf.b).start();
                        }
                    }
                };
            }
        }), cqgr.ck(C())};
        cqmj<absp> fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.dK(abgd.a), cqgr.z(ibm.b()));
        fY.f(cqmpVarArr);
        return fY;
    }
}
