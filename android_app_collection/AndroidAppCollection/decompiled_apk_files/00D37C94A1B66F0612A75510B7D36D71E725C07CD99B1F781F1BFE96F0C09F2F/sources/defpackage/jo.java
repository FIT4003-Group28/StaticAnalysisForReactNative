package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: jo  reason: default package */
/* loaded from: classes3.dex */
public class jo {
    private static final View.AccessibilityDelegate b = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate c;

    public jo() {
        this(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List b(View view) {
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public ml a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.c.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new ml(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, mh mhVar) {
        this.c.onInitializeAccessibilityNodeInfo(view, mhVar.b);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void f(View view, int i) {
        this.c.sendAccessibilityEvent(view, i);
    }

    public void g(View view, AccessibilityEvent accessibilityEvent) {
        this.c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean h(View view, AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List b2 = b(view);
        int i2 = 0;
        while (true) {
            if (i2 >= b2.size()) {
                break;
            }
            mf mfVar = (mf) b2.get(i2);
            if (mfVar.a() != i) {
                i2++;
            } else if (mfVar.m != null) {
                Class cls = mfVar.l;
                if (cls != null) {
                    try {
                        ks ksVar = (ks) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e) {
                        Class cls2 = mfVar.l;
                        String name = cls2 == null ? "null" : cls2.getName();
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                    }
                }
                z = mfVar.m.a(view);
            }
        }
        z = false;
        if (!z) {
            z = this.c.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null || (clickableSpan = (ClickableSpan) weakReference.get()) == null) {
            return false;
        }
        ClickableSpan[] K = mh.K(view.createAccessibilityNodeInfo().getText());
        for (int i4 = 0; K != null && i4 < K.length; i4++) {
            if (clickableSpan.equals(K[i4])) {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    public jo(View.AccessibilityDelegate accessibilityDelegate) {
        this.c = accessibilityDelegate;
        this.a = new jn(this);
    }
}
