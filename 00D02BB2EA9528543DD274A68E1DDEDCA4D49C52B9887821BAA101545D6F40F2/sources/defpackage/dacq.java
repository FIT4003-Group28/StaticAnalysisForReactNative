package defpackage;

import com.google.android.material.progressindicator.ProgressIndicator;
/* compiled from: PG */
/* renamed from: dacq  reason: default package */
/* loaded from: classes5.dex */
public final class dacq implements Runnable {
    final /* synthetic */ ProgressIndicator a;

    public dacq(ProgressIndicator progressIndicator) {
        this.a = progressIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressIndicator progressIndicator = this.a;
        progressIndicator.getCurrentDrawable().setVisible(false, false);
        if (progressIndicator.getProgressDrawable() == null || !progressIndicator.getProgressDrawable().isVisible()) {
            if (progressIndicator.getIndeterminateDrawable() != null && progressIndicator.getIndeterminateDrawable().isVisible()) {
                return;
            }
            progressIndicator.setVisibility(4);
        }
    }
}
