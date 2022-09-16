package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: abps  reason: default package */
/* loaded from: classes.dex */
final class abps extends View.AccessibilityDelegate {
    final /* synthetic */ avjf a;
    final /* synthetic */ abpu b;

    public abps(abpu abpuVar, avjf avjfVar) {
        this.b = abpuVar;
        this.a = avjfVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        String valueOf = String.valueOf(this.b.a.r().getHint());
        arag aragVar = this.a.e;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        String valueOf2 = String.valueOf(ajgl.b(aragVar));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        accessibilityNodeInfo.setText(sb.toString());
    }
}
