package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aejc  reason: default package */
/* loaded from: classes2.dex */
final class aejc extends czvx {
    final /* synthetic */ aejg a;
    final /* synthetic */ int b;
    final /* synthetic */ aejh c;

    public aejc(aejh aejhVar, aejg aejgVar, int i) {
        this.c = aejhVar;
        this.a = aejgVar;
        this.b = i;
    }

    @Override // defpackage.czvx
    public final void b(int i) {
        if (i == 5) {
            this.c.aQ();
        } else if (i != 3) {
        } else {
            aejh aejhVar = this.c;
            aejhVar.ae = true;
            aekn aeknVar = aejhVar.ad;
            if (aeknVar != null) {
                aeknVar.k(true);
            }
            this.a.a = true;
        }
    }

    @Override // defpackage.czvx
    public final void a(float f) {
        int round = Math.round(this.b * (1.0f - f));
        aejh aejhVar = this.c;
        float f2 = 1.0f - (round / aejhVar.ag);
        if (f2 >= 0.0f) {
            View view = aejhVar.ai;
            if (view != null) {
                view.setAlpha(f2);
                aejhVar.ai.invalidate();
            }
            View view2 = aejhVar.aj;
            if (view2 != null) {
                view2.setAlpha(f2);
                aejhVar.aj.invalidate();
            }
        }
        aejh aejhVar2 = this.c;
        View view3 = aejhVar2.ah;
        boolean z = false;
        if (view3 == null) {
            z = aejhVar2.af;
        } else if (round <= view3.getHeight()) {
            aejhVar2.ah.setTranslationY(-round);
            if (!aejhVar2.af) {
                aejh.aP(aejhVar2.ah, 1.0f);
            }
            aejhVar2.ah.invalidate();
            z = true;
        } else if (aejhVar2.af) {
            aejh.aP(aejhVar2.ah, 0.0f);
            aejhVar2.ah.invalidate();
        }
        aejhVar2.af = z;
    }
}
