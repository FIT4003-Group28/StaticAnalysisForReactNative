package defpackage;

import android.support.v4.widget.ContentLoadingProgressBar;
/* compiled from: PG */
/* renamed from: pw  reason: default package */
/* loaded from: classes7.dex */
public final class pw implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar a;

    public pw(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setVisibility(8);
    }
}
