package android.support.v4.j.a;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Object f489a;

    public android.support.v4.j.a.a a(int i) {
        return null;
    }

    public List<android.support.v4.j.a.a> a(String str, int i) {
        return null;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public android.support.v4.j.a.a b(int i) {
        return null;
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* loaded from: classes.dex */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final b f490a;

        a(b bVar) {
            this.f490a = bVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            android.support.v4.j.a.a a2 = this.f490a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.a();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<android.support.v4.j.a.a> a2 = this.f490a.a(str, i);
            if (a2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(a2.get(i2).a());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f490a.a(i, i2, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: android.support.v4.j.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0011b extends a {
        C0011b(b bVar) {
            super(bVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            android.support.v4.j.a.a b2 = this.f490a.b(i);
            if (b2 == null) {
                return null;
            }
            return b2.a();
        }
    }

    public b() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f489a = new C0011b(this);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f489a = new a(this);
        } else {
            this.f489a = null;
        }
    }

    public b(Object obj) {
        this.f489a = obj;
    }

    public Object a() {
        return this.f489a;
    }
}
