package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ne  reason: default package */
/* loaded from: classes.dex */
public class ne {
    private static final View.AccessibilityDelegate b = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate c;

    public ne() {
        this(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<oy> j(View view) {
        List<oy> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public void a(View view, int i) {
        this.c.sendAccessibilityEvent(view, i);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean c(View view, AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void f(View view, pc pcVar) {
        this.c.onInitializeAccessibilityNodeInfo(view, pcVar.a);
    }

    public boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public pg h(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.c.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new pg(accessibilityNodeProvider);
        }
        return null;
    }

    public boolean i(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List<oy> j = j(view);
        int i2 = 0;
        while (true) {
            if (i2 >= j.size()) {
                break;
            }
            oy oyVar = j.get(i2);
            if (oyVar.a() != i) {
                i2++;
            } else if (oyVar.n != null) {
                Class<? extends ph> cls = oyVar.m;
                if (cls != null) {
                    try {
                        cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception unused) {
                        Class<? extends ph> cls2 = oyVar.m;
                        String str = "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName());
                    }
                }
                z = oyVar.n.a(view);
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
        ClickableSpan[] E = pc.E(view.createAccessibilityNodeInfo().getText());
        for (int i4 = 0; E != null && i4 < E.length; i4++) {
            if (clickableSpan.equals(E[i4])) {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    public ne(View.AccessibilityDelegate accessibilityDelegate) {
        this.c = accessibilityDelegate;
        this.a = new nd(this);
    }
}
