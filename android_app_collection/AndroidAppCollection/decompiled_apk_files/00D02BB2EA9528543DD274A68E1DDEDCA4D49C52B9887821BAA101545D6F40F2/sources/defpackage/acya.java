package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acya  reason: default package */
/* loaded from: classes2.dex */
public final class acya implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ acyf a;

    public acya(acyf acyfVar) {
        this.a = acyfVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.a.J() == null) {
            return;
        }
        aegc h = this.a.h();
        final View o = h == null ? null : h.o();
        if (o == null) {
            return;
        }
        o.post(new Runnable(this, o) { // from class: acxz
            private final acya a;
            private final View b;

            {
                this.a = this;
                this.b = o;
            }

            @Override // java.lang.Runnable
            public final void run() {
                acya acyaVar = this.a;
                View view = this.b;
                acxd a = acyaVar.a.aG.a();
                if (a == acxd.ERROR || a == acxd.SHEET_COLLAPSED || a == acxd.LOADED_WITH_IMAGES) {
                    acyaVar.a.aw.a().d(aeav.EXPLORE_TAB_BELOW_FOLD);
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver == null) {
                        return;
                    }
                    viewTreeObserver.removeOnDrawListener(acyaVar);
                }
            }
        });
    }
}
