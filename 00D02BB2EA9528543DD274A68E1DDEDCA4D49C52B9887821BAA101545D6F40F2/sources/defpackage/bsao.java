package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bsao  reason: default package */
/* loaded from: classes4.dex */
final class bsao extends czvx {
    final /* synthetic */ bsar a;
    final /* synthetic */ int b;
    final /* synthetic */ bsas c;

    public bsao(bsas bsasVar, bsar bsarVar, int i) {
        this.c = bsasVar;
        this.a = bsarVar;
        this.b = i;
    }

    @Override // defpackage.czvx
    public final void a(float f) {
        int round = Math.round(this.b * (1.0f - f));
        bsas bsasVar = this.c;
        float f2 = 1.0f - (round / bsasVar.aj);
        View view = bsasVar.am;
        if (view != null) {
            view.setAlpha(f2);
            bsasVar.am.invalidate();
        }
        View view2 = bsasVar.an;
        if (view2 != null) {
            view2.setAlpha(f2);
            bsasVar.an.invalidate();
        }
        bsas bsasVar2 = this.c;
        View view3 = bsasVar2.ak;
        boolean z = false;
        if (view3 == null) {
            z = bsasVar2.ai;
        } else if (round <= view3.getHeight()) {
            bsasVar2.ak.setTranslationY(-round);
            if (!bsasVar2.ai) {
                bsas.aU(bsasVar2.ak);
            }
            bsasVar2.ak.invalidate();
            z = true;
        } else if (bsasVar2.ai) {
            bsas.aU(bsasVar2.ak);
            bsasVar2.ak.invalidate();
        }
        bsasVar2.ai = z;
    }

    @Override // defpackage.czvx
    public final void b(int i) {
        if (i == 5) {
            this.c.aS();
        } else if (i != 3) {
        } else {
            bsas bsasVar = this.c;
            bsal bsalVar = bsasVar.ag;
            if (bsalVar != null) {
                bsasVar.ah = true;
                bsalVar.f(true);
            }
            this.a.a = true;
        }
    }
}
