package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afvr  reason: default package */
/* loaded from: classes2.dex */
final class afvr extends View.AccessibilityDelegate {
    final /* synthetic */ afvw a;

    public afvr(afvw afvwVar) {
        this.a = afvwVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Activity activity = this.a.a.a;
        accessibilityNodeInfo.setContentDescription(activity.getString(R.string.SIDE_MENU_NEW_UPDATES, new Object[]{activity.getString(R.string.YOUR_PLACES)}));
    }
}
