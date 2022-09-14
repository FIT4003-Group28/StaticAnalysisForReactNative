package a.g.m;

import a.g.m.e0.c;
import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f314c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    private final View.AccessibilityDelegate f315a;

    /* renamed from: b  reason: collision with root package name */
    private final View.AccessibilityDelegate f316b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.g.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0013a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        final a f317a;

        C0013a(a aVar) {
            this.f317a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f317a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            a.g.m.e0.d a2 = this.f317a.a(view);
            if (a2 != null) {
                return (AccessibilityNodeProvider) a2.a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f317a.b(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            a.g.m.e0.c a2 = a.g.m.e0.c.a(accessibilityNodeInfo);
            a2.l(v.L(view));
            a2.j(v.G(view));
            a2.f(v.f(view));
            a2.h(v.x(view));
            this.f317a.a(view, a2);
            a2.a(accessibilityNodeInfo.getText(), view);
            List<c.a> b2 = a.b(view);
            for (int i = 0; i < b2.size(); i++) {
                a2.a(b2.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f317a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f317a.a(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f317a.a(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f317a.a(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f317a.d(view, accessibilityEvent);
        }
    }

    public a() {
        this(f314c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f315a = accessibilityDelegate;
        this.f316b = new C0013a(this);
    }

    private boolean a(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a.g.c.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!a(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    private boolean a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] j = a.g.m.e0.c.j(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; j != null && i < j.length; i++) {
                if (clickableSpan.equals(j[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    static List<c.a> b(View view) {
        List<c.a> list = (List) view.getTag(a.g.c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public a.g.m.e0.d a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f315a.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new a.g.m.e0.d(accessibilityNodeProvider);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.AccessibilityDelegate a() {
        return this.f316b;
    }

    public void a(View view, int i) {
        this.f315a.sendAccessibilityEvent(view, i);
    }

    public void a(View view, a.g.m.e0.c cVar) {
        this.f315a.onInitializeAccessibilityNodeInfo(view, cVar.x());
    }

    public boolean a(View view, int i, Bundle bundle) {
        List<c.a> b2 = b(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= b2.size()) {
                break;
            }
            c.a aVar = b2.get(i2);
            if (aVar.a() == i) {
                z = aVar.a(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f315a.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != a.g.c.accessibility_action_clickable_span) ? z : a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f315a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f315a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f315a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f315a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.f315a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
