package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ccqx  reason: default package */
/* loaded from: classes4.dex */
final class ccqx extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, view.getResources().getText(R.string.OFFERINGS_MEDIA_CAROUSEL_ITEM_ACTION_DESCRIPTION)));
    }
}
