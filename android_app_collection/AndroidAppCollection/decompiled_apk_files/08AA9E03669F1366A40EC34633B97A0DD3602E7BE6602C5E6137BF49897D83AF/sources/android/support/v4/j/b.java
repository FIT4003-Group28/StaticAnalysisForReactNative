package android.support.v4.j;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final C0012b f492b;

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f493c;

    /* renamed from: a  reason: collision with root package name */
    final View.AccessibilityDelegate f494a = f492b.a(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: android.support.v4.j.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0012b {
        public android.support.v4.j.a.b a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        public boolean a(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }

        C0012b() {
        }

        public View.AccessibilityDelegate a(final b bVar) {
            return new View.AccessibilityDelegate() { // from class: android.support.v4.j.b.b.1
                @Override // android.view.View.AccessibilityDelegate
                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.b(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.d(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    bVar.a(view, android.support.v4.j.a.a.a(accessibilityNodeInfo));
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.c(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.a(viewGroup, view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void sendAccessibilityEvent(View view, int i) {
                    bVar.a(view, i);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.a(view, accessibilityEvent);
                }
            };
        }
    }

    /* compiled from: AccessibilityDelegateCompat.java */
    /* loaded from: classes.dex */
    static class a extends C0012b {
        a() {
        }

        @Override // android.support.v4.j.b.C0012b
        public View.AccessibilityDelegate a(final b bVar) {
            return new View.AccessibilityDelegate() { // from class: android.support.v4.j.b.a.1
                @Override // android.view.View.AccessibilityDelegate
                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.b(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.d(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    bVar.a(view, android.support.v4.j.a.a.a(accessibilityNodeInfo));
                }

                @Override // android.view.View.AccessibilityDelegate
                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.c(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.a(viewGroup, view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void sendAccessibilityEvent(View view, int i) {
                    bVar.a(view, i);
                }

                @Override // android.view.View.AccessibilityDelegate
                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.a(view, accessibilityEvent);
                }

                @Override // android.view.View.AccessibilityDelegate
                public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    android.support.v4.j.a.b a2 = bVar.a(view);
                    if (a2 != null) {
                        return (AccessibilityNodeProvider) a2.a();
                    }
                    return null;
                }

                @Override // android.view.View.AccessibilityDelegate
                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return bVar.a(view, i, bundle);
                }
            };
        }

        @Override // android.support.v4.j.b.C0012b
        public android.support.v4.j.a.b a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new android.support.v4.j.a.b(accessibilityNodeProvider);
            }
            return null;
        }

        @Override // android.support.v4.j.b.C0012b
        public boolean a(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f492b = new a();
        } else {
            f492b = new C0012b();
        }
        f493c = new View.AccessibilityDelegate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View.AccessibilityDelegate a() {
        return this.f494a;
    }

    public void a(View view, int i) {
        f493c.sendAccessibilityEvent(view, i);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        f493c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return f493c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        f493c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        f493c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, android.support.v4.j.a.a aVar) {
        f493c.onInitializeAccessibilityNodeInfo(view, aVar.a());
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f493c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public android.support.v4.j.a.b a(View view) {
        return f492b.a(f493c, view);
    }

    public boolean a(View view, int i, Bundle bundle) {
        return f492b.a(f493c, view, i, bundle);
    }
}
