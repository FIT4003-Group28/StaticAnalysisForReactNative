package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdio  reason: default package */
/* loaded from: classes3.dex */
public final class bdio implements View.OnClickListener {
    final /* synthetic */ bdir a;

    public bdio(bdir bdirVar) {
        this.a = bdirVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bdir bdirVar = this.a;
        bdirVar.b = !bdirVar.b;
        cqkx.p(bdirVar);
        bdir bdirVar2 = this.a;
        if (bdirVar2.b) {
            bdip bdipVar = bdirVar2.a;
            bvrj.UI_THREAD.c();
            final bdja bdjaVar = (bdja) bdipVar;
            bdjaVar.a++;
            bdhf bdhfVar = bdhf.MULTIPLE;
            int ordinal = bdjaVar.b.b.i().ordinal();
            if (ordinal == 0) {
                if (bdjaVar.a != 1) {
                    return;
                }
                cqkx.p(bdjaVar.b);
                return;
            } else if (ordinal != 1) {
                return;
            } else {
                if (!bdjaVar.b.f.isEmpty() && bdjaVar.a > 1) {
                    bdjaVar.b.f.get(0).n();
                }
                bdjaVar.b.e.postDelayed(new Runnable(bdjaVar) { // from class: bdiz
                    private final bdja a;

                    {
                        this.a = bdjaVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bdjc bdjcVar = this.a.b;
                        bdjcVar.d.a(bdjcVar.n());
                    }
                }, 100L);
                return;
            }
        }
        bdip bdipVar2 = bdirVar2.a;
        bvrj.UI_THREAD.c();
        bdja bdjaVar2 = (bdja) bdipVar2;
        bdjaVar2.a--;
        bdhf bdhfVar2 = bdhf.MULTIPLE;
        if (bdjaVar2.b.b.i().ordinal() != 0 || bdjaVar2.a != 0) {
            return;
        }
        bvrj.UI_THREAD.c();
        cqkx.p(bdjaVar2.b);
    }
}
