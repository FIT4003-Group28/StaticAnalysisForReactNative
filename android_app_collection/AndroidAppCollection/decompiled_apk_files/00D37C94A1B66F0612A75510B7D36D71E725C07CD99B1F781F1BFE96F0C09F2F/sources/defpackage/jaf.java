package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;
/* compiled from: PG */
/* renamed from: jaf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jaf implements View.OnClickListener {
    public final /* synthetic */ OfflineModeChangedMealbarController a;
    private final /* synthetic */ int b;

    public /* synthetic */ jaf(OfflineModeChangedMealbarController offlineModeChangedMealbarController, int i) {
        this.b = i;
        this.a = offlineModeChangedMealbarController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.j(actj.OFFLINE_DOWNLOAD_RECOMMENDATIONS_AVAILABLE_MEALBAR_CANCEL_BUTTON);
        } else if (i == 1) {
            OfflineModeChangedMealbarController offlineModeChangedMealbarController = this.a;
            offlineModeChangedMealbarController.j(actj.OFFLINE_DOWNLOAD_RECOMMENDATIONS_AVAILABLE_MEALBAR_GOTO_BUTTON);
            offlineModeChangedMealbarController.a.c(far.a, null);
        } else if (i == 2) {
            OfflineModeChangedMealbarController offlineModeChangedMealbarController2 = this.a;
            offlineModeChangedMealbarController2.j(actj.OFFLINE_DOWNLOADS_AVAILABLE_MEALBAR_GOTO_BUTTON);
            offlineModeChangedMealbarController2.a.c(far.a, null);
        } else {
            this.a.j(actj.OFFLINE_DOWNLOADS_AVAILABLE_MEALBAR_CANCEL_BUTTON);
        }
    }
}
