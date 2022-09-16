package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cqbk  reason: default package */
/* loaded from: classes5.dex */
final class cqbk extends View.AccessibilityDelegate {
    final /* synthetic */ cqbn a;

    public cqbk(cqbn cqbnVar) {
        this.a = cqbnVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), this.a.getContext().getResources().getString(R.string.learn_more_link_talkback_action_name)));
        view.setOnClickListener(new View.OnClickListener(this) { // from class: cqbj
            private final cqbk a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.a.b();
            }
        });
    }
}
