package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: akni  reason: default package */
/* loaded from: classes.dex */
final class akni implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ aknr a;
    private final /* synthetic */ int b;

    public akni(aknr aknrVar) {
        this.a = aknrVar;
    }

    public akni(aknr aknrVar, int i) {
        this.b = i;
        this.a = aknrVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.b;
        if (i == 0) {
            this.a.ag.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int height = this.a.ag.getHeight();
            this.a.ah.setAlpha(0.0f);
            this.a.ah.animate().alpha(1.0f).setDuration(250L).start();
            this.a.ai.setTranslationY(height);
            this.a.ai.animate().translationY(0.0f).setDuration(250L).setListener(new aknh(this)).start();
        } else if (i == 1) {
            aknr aknrVar = this.a;
            aknrVar.as.removeCallbacks(aknrVar.an);
            aknr aknrVar2 = this.a;
            aknrVar2.as.post(aknrVar2.an);
        } else if (this.a.aj.getChildCount() <= 1) {
        } else {
            if (this.a.ak.getChildCount() != 0 && this.a.ak.getHeight() <= 0) {
                return;
            }
            this.a.aj.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.aI(true);
        }
    }
}
