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
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jn  reason: default package */
/* loaded from: classes3.dex */
public final class jn extends View.AccessibilityDelegate {
    final jo a;

    public jn(jo joVar) {
        this.a = joVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.h(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        ml a = this.a.a(view);
        if (a != null) {
            return (AccessibilityNodeProvider) a.a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        mh c = mh.c(accessibilityNodeInfo);
        boolean ap = lj.ap(view);
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 28) {
            c.b.setScreenReaderFocusable(ap);
        } else {
            c.m(1, ap);
        }
        Boolean bool = (Boolean) new kp(Boolean.class).b(view);
        if (bool == null || !bool.booleanValue()) {
            z = false;
        }
        c.z(z);
        CharSequence v = lj.v(view);
        if (Build.VERSION.SDK_INT >= 28) {
            c.b.setPaneTitle(v);
        } else {
            c.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", v);
        }
        CharSequence charSequence = (CharSequence) lj.p().b(view);
        if (Build.VERSION.SDK_INT < 30) {
            c.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        } else {
            c.b.setStateDescription(charSequence);
        }
        this.a.d(view, c);
        CharSequence text = accessibilityNodeInfo.getText();
        if (Build.VERSION.SDK_INT < 26) {
            c.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            c.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            c.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            c.b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray L = mh.L(view);
            if (L != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < L.size(); i2++) {
                    if (((WeakReference) L.valueAt(i2)).get() == null) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    L.remove(((Integer) arrayList.get(i3)).intValue());
                }
            }
            ClickableSpan[] K = mh.K(text);
            if (K != null && K.length > 0) {
                c.a().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray L2 = mh.L(view);
                if (L2 == null) {
                    L2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, L2);
                }
                for (int i4 = 0; i4 < K.length; i4++) {
                    ClickableSpan clickableSpan = K[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 < L2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) L2.valueAt(i5)).get())) {
                                i = L2.keyAt(i5);
                                break;
                            }
                            i5++;
                        } else {
                            i = mh.a;
                            mh.a = i + 1;
                            break;
                        }
                    }
                    L2.put(i, new WeakReference(K[i4]));
                    ClickableSpan clickableSpan2 = K[i4];
                    Spanned spanned = (Spanned) text;
                    c.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c.g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List b = jo.b(view);
        for (int i6 = 0; i6 < b.size(); i6++) {
            c.i((mf) b.get(i6));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.i(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.j(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.f(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.g(view, accessibilityEvent);
    }
}
