package defpackage;

import android.support.v4.widget.ContentLoadingProgressBar;
/* compiled from: PG */
/* renamed from: px  reason: default package */
/* loaded from: classes7.dex */
public final class px implements Runnable {
    final /* synthetic */ ContentLoadingProgressBar a;

    public px(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContentLoadingProgressBar contentLoadingProgressBar = this.a;
        contentLoadingProgressBar.a = false;
        contentLoadingProgressBar.setVisibility(0);
    }
}
