package defpackage;

import com.google.android.material.progressindicator.ProgressIndicator;
/* compiled from: PG */
/* renamed from: dacr  reason: default package */
/* loaded from: classes5.dex */
public final class dacr extends azu {
    final /* synthetic */ ProgressIndicator b;

    public dacr(ProgressIndicator progressIndicator) {
        this.b = progressIndicator;
    }

    @Override // defpackage.azu
    public final void b() {
        this.b.setIndeterminate(false);
        this.b.setProgressCompat(0, false);
        ProgressIndicator progressIndicator = this.b;
        progressIndicator.setProgressCompat(progressIndicator.a, progressIndicator.b);
    }
}
