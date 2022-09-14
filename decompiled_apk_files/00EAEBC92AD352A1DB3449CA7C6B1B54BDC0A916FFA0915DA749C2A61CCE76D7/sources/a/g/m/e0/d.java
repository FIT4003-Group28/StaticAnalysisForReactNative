package a.g.m.e0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f360a;

    /* loaded from: classes.dex */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        final d f361a;

        a(d dVar) {
            this.f361a = dVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            a.g.m.e0.c a2 = this.f361a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.x();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<a.g.m.e0.c> a2 = this.f361a.a(str, i);
            if (a2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(a2.get(i2).x());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f361a.a(i, i2, bundle);
        }
    }

    /* loaded from: classes.dex */
    static class b extends a {
        b(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            a.g.m.e0.c b2 = this.f361a.b(i);
            if (b2 == null) {
                return null;
            }
            return b2.x();
        }
    }

    /* loaded from: classes.dex */
    static class c extends b {
        c(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f361a.a(i, a.g.m.e0.c.a(accessibilityNodeInfo), str, bundle);
        }
    }

    public d() {
        int i = Build.VERSION.SDK_INT;
        this.f360a = i >= 26 ? new c(this) : i >= 19 ? new b(this) : i >= 16 ? new a(this) : null;
    }

    public d(Object obj) {
        this.f360a = obj;
    }

    public a.g.m.e0.c a(int i) {
        return null;
    }

    public Object a() {
        return this.f360a;
    }

    public List<a.g.m.e0.c> a(String str, int i) {
        return null;
    }

    public void a(int i, a.g.m.e0.c cVar, String str, Bundle bundle) {
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public a.g.m.e0.c b(int i) {
        return null;
    }
}
