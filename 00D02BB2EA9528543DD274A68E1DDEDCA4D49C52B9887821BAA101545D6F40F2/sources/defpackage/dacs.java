package defpackage;

import com.google.android.material.progressindicator.ProgressIndicator;
/* compiled from: PG */
/* renamed from: dacs  reason: default package */
/* loaded from: classes5.dex */
public final class dacs extends azu {
    final /* synthetic */ ProgressIndicator b;

    public dacs(ProgressIndicator progressIndicator) {
        this.b = progressIndicator;
    }

    @Override // defpackage.azu
    public final void b() {
        ProgressIndicator progressIndicator = this.b;
        if (progressIndicator.c || !progressIndicator.e()) {
            return;
        }
        ProgressIndicator progressIndicator2 = this.b;
        progressIndicator2.setVisibility(progressIndicator2.d);
    }
}
