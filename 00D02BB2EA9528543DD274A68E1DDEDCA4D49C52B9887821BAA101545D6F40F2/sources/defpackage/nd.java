package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nd  reason: default package */
/* loaded from: classes.dex */
public final class nd extends View.AccessibilityDelegate {
    final ne a;

    public nd(ne neVar) {
        this.a = neVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        pg h = this.a.h(view);
        if (h != null) {
            return (AccessibilityNodeProvider) h.a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        pc a = pc.a(accessibilityNodeInfo);
        Boolean e = od.as().e(view);
        a.O(e == null ? false : e.booleanValue());
        Boolean e2 = od.ax().e(view);
        boolean booleanValue = e2 == null ? false : e2.booleanValue();
        if (Build.VERSION.SDK_INT >= 28) {
            a.a.setHeading(booleanValue);
        } else {
            a.P(2, booleanValue);
        }
        CharSequence at = od.at(view);
        if (Build.VERSION.SDK_INT >= 28) {
            a.a.setPaneTitle(at);
        } else {
            a.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", at);
        }
        CharSequence e3 = od.av().e(view);
        if (ako.d()) {
            a.a.setStateDescription(e3);
        } else {
            a.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", e3);
        }
        this.a.f(view, a);
        CharSequence text = accessibilityNodeInfo.getText();
        if (Build.VERSION.SDK_INT < 26) {
            a.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            a.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            a.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            a.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray<WeakReference<ClickableSpan>> Q = pc.Q(view);
            if (Q != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < Q.size(); i2++) {
                    if (Q.valueAt(i2).get() == null) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Q.remove(((Integer) arrayList.get(i3)).intValue());
                }
            }
            ClickableSpan[] E = pc.E(text);
            if (E != null && E.length > 0) {
                a.L().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> Q2 = pc.Q(view);
                if (Q2 == null) {
                    Q2 = new SparseArray<>();
                    view.setTag(R.id.tag_accessibility_clickable_spans, Q2);
                }
                for (int i4 = 0; i4 < E.length; i4++) {
                    ClickableSpan clickableSpan = E[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 < Q2.size()) {
                            if (clickableSpan.equals(Q2.valueAt(i5).get())) {
                                i = Q2.keyAt(i5);
                                break;
                            }
                            i5++;
                        } else {
                            i = pc.d;
                            pc.d = i + 1;
                            break;
                        }
                    }
                    Q2.put(i, new WeakReference<>(E[i4]));
                    ClickableSpan clickableSpan2 = E[i4];
                    Spanned spanned = (Spanned) text;
                    a.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    a.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    a.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    a.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List<oy> j = ne.j(view);
        for (int i6 = 0; i6 < j.size(); i6++) {
            a.h(j.get(i6));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.g(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.i(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.a(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }
}
