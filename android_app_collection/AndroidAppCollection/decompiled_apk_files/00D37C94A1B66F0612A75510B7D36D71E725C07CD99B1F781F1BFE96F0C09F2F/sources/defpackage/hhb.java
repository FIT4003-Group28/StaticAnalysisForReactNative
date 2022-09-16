package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hhb  reason: default package */
/* loaded from: classes3.dex */
public final class hhb extends View.AccessibilityDelegate {
    final /* synthetic */ hhc a;

    /* JADX INFO: Access modifiers changed from: protected */
    public hhb(hhc hhcVar) {
        this.a = hhcVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        Resources resources = this.a.a.getResources();
        hhc hhcVar = this.a;
        accessibilityNodeInfo.setContentDescription(resources.getString(R.string.a11y_object_selected_at, accessibilityNodeInfo.getContentDescription(), fcw.i(hhcVar.a, hhcVar.z.j(), this.a.v)));
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        hhc hhcVar = this.a;
        long j = hhcVar.v / 20;
        if (i == 4096) {
            hhcVar.t(hhcVar.z.j() + j);
        } else if (i == 8192) {
            hhcVar.t(hhcVar.z.j() - j);
        } else {
            return super.performAccessibilityAction(view, i, bundle);
        }
        hhc hhcVar2 = this.a;
        hhcVar2.j(hhcVar2.t);
        return true;
    }
}
