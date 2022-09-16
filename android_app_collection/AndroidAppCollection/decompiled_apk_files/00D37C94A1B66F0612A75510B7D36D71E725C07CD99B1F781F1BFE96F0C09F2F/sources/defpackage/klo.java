package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.FullscreenEngagementViewPresenter;
/* compiled from: PG */
/* renamed from: klo  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class klo implements View.OnClickListener {
    public final /* synthetic */ klt a;
    private final /* synthetic */ int b;

    public /* synthetic */ klo(klt kltVar) {
        this.a = kltVar;
    }

    public /* synthetic */ klo(klt kltVar, int i) {
        this.b = i;
        this.a = kltVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            klt kltVar = this.a;
            kltVar.a.H(3, new acte(actj.FULLSCREEN_ENGAGEMENT_EXPLICIT_CLOSE_BUTTON), null);
            klr klrVar = kltVar.d;
            if (klrVar == null) {
                return;
            }
            FullscreenEngagementViewPresenter fullscreenEngagementViewPresenter = (FullscreenEngagementViewPresenter) klrVar;
            if (!fullscreenEngagementViewPresenter.b.c.d()) {
                return;
            }
            fullscreenEngagementViewPresenter.b.e(1);
            return;
        }
        this.a.b.g();
    }
}
