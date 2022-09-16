package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
/* compiled from: PG */
/* renamed from: knv  reason: default package */
/* loaded from: classes3.dex */
public final class knv implements Runnable {
    final /* synthetic */ SuggestedActionsMainController a;
    private final /* synthetic */ int b;

    public knv(SuggestedActionsMainController suggestedActionsMainController) {
        this.a = suggestedActionsMainController;
    }

    public /* synthetic */ knv(SuggestedActionsMainController suggestedActionsMainController, int i) {
        this.b = i;
        this.a = suggestedActionsMainController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            SuggestedActionsMainController suggestedActionsMainController = this.a;
            ViewGroup viewGroup = suggestedActionsMainController.l;
            if (viewGroup == null || viewGroup.getChildCount() == 0) {
                return;
            }
            avch avchVar = (avch) suggestedActionsMainController.l.getChildAt(0).getTag();
            if (avchVar != null) {
                suggestedActionsMainController.d.add(avchVar);
            }
            suggestedActionsMainController.k(new knv(suggestedActionsMainController, 1));
            return;
        }
        this.a.j();
    }
}
