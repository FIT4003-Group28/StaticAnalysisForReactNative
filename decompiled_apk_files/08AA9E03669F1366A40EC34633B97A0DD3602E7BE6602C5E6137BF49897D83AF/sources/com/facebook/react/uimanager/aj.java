package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.yoga.YogaDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: UIImplementation.java */
/* loaded from: classes.dex */
public class aj {

    /* renamed from: a  reason: collision with root package name */
    protected final com.facebook.react.uimanager.events.c f3753a;

    /* renamed from: b  reason: collision with root package name */
    protected final com.facebook.react.bridge.ah f3754b;

    /* renamed from: c  reason: collision with root package name */
    protected final ac f3755c;

    /* renamed from: d  reason: collision with root package name */
    protected a f3756d;
    private final Set<Integer> e;
    private final as f;
    private final ao g;
    private final l h;
    private final int[] i;
    private long j;

    /* compiled from: UIImplementation.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(w wVar);
    }

    public void g() {
    }

    public aj(com.facebook.react.bridge.ah ahVar, UIManagerModule.c cVar, com.facebook.react.uimanager.events.c cVar2, int i) {
        this(ahVar, new as(cVar), cVar2, i);
    }

    public aj(com.facebook.react.bridge.ah ahVar, List<ViewManager> list, com.facebook.react.uimanager.events.c cVar, int i) {
        this(ahVar, new as(list), cVar, i);
    }

    private aj(com.facebook.react.bridge.ah ahVar, as asVar, com.facebook.react.uimanager.events.c cVar, int i) {
        this(ahVar, asVar, new ao(ahVar, new k(asVar), i), cVar);
    }

    protected aj(com.facebook.react.bridge.ah ahVar, as asVar, ao aoVar, com.facebook.react.uimanager.events.c cVar) {
        this.f3755c = new ac();
        this.e = new HashSet();
        this.i = new int[4];
        this.j = 0L;
        this.f3754b = ahVar;
        this.f = asVar;
        this.g = aoVar;
        this.h = new l(this.g, this.f3755c);
        this.f3753a = cVar;
    }

    protected w a() {
        x xVar = new x();
        if (com.facebook.react.modules.i18nmanager.a.a().a(this.f3754b)) {
            xVar.setLayoutDirection(YogaDirection.RTL);
        }
        xVar.setViewClassName("Root");
        return xVar;
    }

    protected w a(String str) {
        return this.f.a(str).createShadowNodeInstance(this.f3754b);
    }

    public final w a(int i) {
        return this.f3755c.c(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ViewManager b(String str) {
        return this.f.a(str);
    }

    public void a(int i, int i2, int i3) {
        w c2 = this.f3755c.c(i);
        if (c2 == null) {
            com.facebook.common.e.a.c("ReactNative", "Tried to update non-existent root tag: " + i);
            return;
        }
        a(c2, i2, i3);
    }

    public void a(w wVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            wVar.setStyleMaxWidth(size);
        } else if (mode == 0) {
            wVar.setStyleWidthAuto();
        } else if (mode == 1073741824) {
            wVar.setStyleWidth(size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            wVar.setStyleMaxHeight(size2);
        } else if (mode2 == 0) {
            wVar.setStyleHeightAuto();
        } else if (mode2 != 1073741824) {
        } else {
            wVar.setStyleHeight(size2);
        }
    }

    public <T extends ad & j> void a(T t, int i, af afVar) {
        w a2 = a();
        a2.setReactTag(i);
        a2.setThemedContext(afVar);
        T t2 = t;
        a(a2, t2.getWidthMeasureSpec(), t2.getHeightMeasureSpec());
        this.f3755c.a(a2);
        this.g.a(i, t, afVar);
    }

    public void b(int i) {
        c(i);
        this.g.a(i);
    }

    public void c(int i) {
        this.f3755c.a(i);
    }

    public void b(int i, int i2, int i3) {
        w c2 = this.f3755c.c(i);
        if (c2 == null) {
            com.facebook.common.e.a.c("ReactNative", "Tried to update size of non-existent tag: " + i);
            return;
        }
        c2.setStyleWidth(i2);
        c2.setStyleHeight(i3);
        h();
    }

    public void a(int i, Object obj) {
        w c2 = this.f3755c.c(i);
        if (c2 == null) {
            com.facebook.common.e.a.c("ReactNative", "Attempt to set local data for view with unknown tag: " + i);
            return;
        }
        c2.setLocalData(obj);
        h();
    }

    public Map<String, Long> b() {
        return this.g.b();
    }

    public void a(int i, String str, int i2, com.facebook.react.bridge.an anVar) {
        y yVar;
        w a2 = a(str);
        w c2 = this.f3755c.c(i2);
        a2.setReactTag(i);
        a2.setViewClassName(str);
        a2.setRootNode(c2);
        a2.setThemedContext(c2.getThemedContext());
        this.f3755c.b(a2);
        if (anVar != null) {
            yVar = new y(anVar);
            a2.updateProperties(yVar);
        } else {
            yVar = null;
        }
        a(a2, i2, yVar);
    }

    protected void a(w wVar, int i, y yVar) {
        if (!wVar.isVirtual()) {
            this.h.a(wVar, wVar.getThemedContext(), yVar);
        }
    }

    public void a(int i, String str, com.facebook.react.bridge.an anVar) {
        if (this.f.a(str) == null) {
            throw new e("Got unknown view type: " + str);
        }
        w c2 = this.f3755c.c(i);
        if (c2 == null) {
            throw new e("Trying to update non-existent view with tag " + i);
        } else if (anVar == null) {
        } else {
            y yVar = new y(anVar);
            c2.updateProperties(yVar);
            a(c2, str, yVar);
        }
    }

    public void a(int i, y yVar) {
        com.facebook.react.bridge.ap.b();
        this.g.a().a(i, yVar);
    }

    protected void a(w wVar, String str, y yVar) {
        if (!wVar.isVirtual()) {
            this.h.a(wVar, str, yVar);
        }
    }

    public void a(int i, com.facebook.react.bridge.am amVar, com.facebook.react.bridge.am amVar2, com.facebook.react.bridge.am amVar3, com.facebook.react.bridge.am amVar4, com.facebook.react.bridge.am amVar5) {
        com.facebook.react.bridge.am amVar6 = amVar;
        w c2 = this.f3755c.c(i);
        int size = amVar6 == null ? 0 : amVar.size();
        int size2 = amVar3 == null ? 0 : amVar3.size();
        int size3 = amVar5 == null ? 0 : amVar5.size();
        if (size != 0 && (amVar2 == null || size != amVar2.size())) {
            throw new e("Size of moveFrom != size of moveTo!");
        }
        if (size2 != 0 && (amVar4 == null || size2 != amVar4.size())) {
            throw new e("Size of addChildTags != size of addAtIndices!");
        }
        ap[] apVarArr = new ap[size + size2];
        int[] iArr = new int[size + size3];
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[size3];
        if (size > 0) {
            com.facebook.j.a.a.b(amVar);
            com.facebook.j.a.a.b(amVar2);
            int i2 = 0;
            while (i2 < size) {
                int i3 = amVar6.getInt(i2);
                int reactTag = c2.getChildAt(i3).getReactTag();
                apVarArr[i2] = new ap(reactTag, amVar2.getInt(i2));
                iArr[i2] = i3;
                iArr2[i2] = reactTag;
                i2++;
                iArr3 = iArr3;
                amVar6 = amVar;
            }
        }
        int[] iArr4 = iArr3;
        if (size2 > 0) {
            com.facebook.j.a.a.b(amVar3);
            com.facebook.j.a.a.b(amVar4);
            for (int i4 = 0; i4 < size2; i4++) {
                apVarArr[size + i4] = new ap(amVar3.getInt(i4), amVar4.getInt(i4));
            }
        }
        if (size3 > 0) {
            com.facebook.j.a.a.b(amVar5);
            for (int i5 = 0; i5 < size3; i5++) {
                int i6 = amVar5.getInt(i5);
                int reactTag2 = c2.getChildAt(i6).getReactTag();
                int i7 = size + i5;
                iArr[i7] = i6;
                iArr2[i7] = reactTag2;
                iArr4[i5] = reactTag2;
            }
        }
        Arrays.sort(apVarArr, ap.f3812a);
        Arrays.sort(iArr);
        int i8 = -1;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (iArr[length] == i8) {
                throw new e("Repeated indices in Removal list for view tag: " + i);
            }
            c2.removeChildAt(iArr[length]);
            i8 = iArr[length];
        }
        for (ap apVar : apVarArr) {
            w c3 = this.f3755c.c(apVar.f3813b);
            if (c3 == null) {
                throw new e("Trying to add unknown view tag: " + apVar.f3813b);
            }
            c2.addChildAt(c3, apVar.f3814c);
        }
        if (!c2.isVirtual() && !c2.isVirtualAnchor()) {
            this.h.a(c2, iArr, iArr2, apVarArr, iArr4);
        }
        for (int i9 : iArr4) {
            a(this.f3755c.c(i9));
        }
    }

    public void a(int i, com.facebook.react.bridge.am amVar) {
        w c2 = this.f3755c.c(i);
        for (int i2 = 0; i2 < amVar.size(); i2++) {
            w c3 = this.f3755c.c(amVar.getInt(i2));
            if (c3 == null) {
                throw new e("Trying to add unknown view tag: " + amVar.getInt(i2));
            }
            c2.addChildAt(c3, i2);
        }
        if (c2.isVirtual() || c2.isVirtualAnchor()) {
            return;
        }
        this.h.a(c2, amVar);
    }

    public void a(int i, int i2) {
        if (this.f3755c.d(i) || this.f3755c.d(i2)) {
            throw new e("Trying to add or replace a root tag!");
        }
        w c2 = this.f3755c.c(i);
        if (c2 == null) {
            throw new e("Trying to replace unknown view tag: " + i);
        }
        w parent = c2.getParent();
        if (parent == null) {
            throw new e("Node is not attached to a parent: " + i);
        }
        int indexOf = parent.indexOf(c2);
        if (indexOf < 0) {
            throw new IllegalStateException("Didn't find child tag in parent");
        }
        com.facebook.react.bridge.aq a2 = com.facebook.react.bridge.b.a();
        a2.pushInt(i2);
        com.facebook.react.bridge.aq a3 = com.facebook.react.bridge.b.a();
        a3.pushInt(indexOf);
        com.facebook.react.bridge.aq a4 = com.facebook.react.bridge.b.a();
        a4.pushInt(indexOf);
        a(parent.getReactTag(), null, null, a2, a3, a4);
    }

    public void d(int i) {
        w c2 = this.f3755c.c(i);
        if (c2 == null) {
            throw new e("Trying to remove subviews of an unknown view tag: " + i);
        }
        com.facebook.react.bridge.aq a2 = com.facebook.react.bridge.b.a();
        for (int i2 = 0; i2 < c2.getChildCount(); i2++) {
            a2.pushInt(i2);
        }
        a(i, null, null, null, null, a2);
    }

    public void a(int i, float f, float f2, com.facebook.react.bridge.d dVar) {
        this.g.a(i, f, f2, dVar);
    }

    public void a(int i, int i2, com.facebook.react.bridge.d dVar) {
        w c2 = this.f3755c.c(i);
        w c3 = this.f3755c.c(i2);
        if (c2 == null || c3 == null) {
            dVar.a(false);
        } else {
            dVar.a(Boolean.valueOf(c2.isDescendantOf(c3)));
        }
    }

    public void a(int i, com.facebook.react.bridge.d dVar) {
        this.g.a(i, dVar);
    }

    public void b(int i, com.facebook.react.bridge.d dVar) {
        this.g.b(i, dVar);
    }

    public void a(int i, int i2, com.facebook.react.bridge.d dVar, com.facebook.react.bridge.d dVar2) {
        try {
            a(i, i2, this.i);
            dVar2.a(Float.valueOf(o.c(this.i[0])), Float.valueOf(o.c(this.i[1])), Float.valueOf(o.c(this.i[2])), Float.valueOf(o.c(this.i[3])));
        } catch (e e) {
            dVar.a(e.getMessage());
        }
    }

    public void a(int i, com.facebook.react.bridge.d dVar, com.facebook.react.bridge.d dVar2) {
        try {
            a(i, this.i);
            dVar2.a(Float.valueOf(o.c(this.i[0])), Float.valueOf(o.c(this.i[1])), Float.valueOf(o.c(this.i[2])), Float.valueOf(o.c(this.i[3])));
        } catch (e e) {
            dVar.a(e.getMessage());
        }
    }

    public void e(int i) {
        com.facebook.m.b.a(0L, "UIImplementation.dispatchViewUpdates").a("batchId", i).a();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            c();
            this.h.a();
            this.g.a(i, uptimeMillis, this.j);
        } finally {
            com.facebook.m.a.b(0L);
        }
    }

    private void h() {
        if (this.g.c()) {
            e(-1);
        }
    }

    protected void c() {
        com.facebook.m.a.a(0L, "UIImplementation.updateViewHierarchy");
        for (int i = 0; i < this.f3755c.a(); i++) {
            try {
                int e = this.f3755c.e(i);
                w c2 = this.f3755c.c(e);
                if (this.e.contains(Integer.valueOf(e))) {
                    com.facebook.m.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").a("rootTag", c2.getReactTag()).a();
                    e(c2);
                    com.facebook.m.a.b(0L);
                    b(c2);
                    com.facebook.m.b.a(0L, "UIImplementation.applyUpdatesRecursive").a("rootTag", c2.getReactTag()).a();
                    a(c2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    com.facebook.m.a.b(0L);
                    if (this.f3756d != null) {
                        this.f3756d.a(c2);
                    }
                }
            } finally {
                com.facebook.m.a.b(0L);
            }
        }
    }

    public void a(com.facebook.react.a.a aVar) {
        this.g.a(aVar);
    }

    public void b(int i, int i2, com.facebook.react.bridge.d dVar) {
        a(i, "addAnimation");
        this.g.a(i, i2, dVar);
    }

    public void b(int i, int i2) {
        a(i, "removeAnimation");
        this.g.b(i2);
    }

    public void a(boolean z) {
        this.g.a(z);
    }

    public void a(com.facebook.react.bridge.an anVar, com.facebook.react.bridge.d dVar, com.facebook.react.bridge.d dVar2) {
        this.g.a(anVar, dVar, dVar2);
    }

    public void a(int i, boolean z) {
        a(i, "setJSResponder");
        w c2 = this.f3755c.c(i);
        while (true) {
            if (c2.isVirtual() || c2.isLayoutOnly()) {
                c2 = c2.getParent();
            } else {
                this.g.a(c2.getReactTag(), i, z);
                return;
            }
        }
    }

    public void d() {
        this.g.d();
    }

    public void a(int i, int i2, com.facebook.react.bridge.am amVar) {
        a(i, "dispatchViewManagerCommand");
        this.g.a(i, i2, amVar);
    }

    public void a(int i, com.facebook.react.bridge.am amVar, com.facebook.react.bridge.d dVar, com.facebook.react.bridge.d dVar2) {
        a(i, "showPopupMenu");
        this.g.a(i, amVar, dVar, dVar2);
    }

    public void c(int i, int i2) {
        this.g.a(i, i2);
    }

    public void e() {
        this.g.e();
    }

    public void f() {
        this.g.f();
    }

    public void a(com.facebook.react.uimanager.b.a aVar) {
        this.g.a(aVar);
    }

    protected final void a(w wVar) {
        c(wVar);
        wVar.dispose();
    }

    private void c(w wVar) {
        l.a(wVar);
        this.f3755c.b(wVar.getReactTag());
        this.e.remove(Integer.valueOf(wVar.getReactTag()));
        for (int childCount = wVar.getChildCount() - 1; childCount >= 0; childCount--) {
            c(wVar.getChildAt(childCount));
        }
        wVar.removeAndDisposeAllChildren();
    }

    private void a(int i, int i2, int[] iArr) {
        w c2 = this.f3755c.c(i);
        w c3 = this.f3755c.c(i2);
        if (c2 == null || c3 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tag ");
            if (c2 != null) {
                i = i2;
            }
            sb.append(i);
            sb.append(" does not exist");
            throw new e(sb.toString());
        }
        if (c2 != c3) {
            for (w parent = c2.getParent(); parent != c3; parent = parent.getParent()) {
                if (parent == null) {
                    throw new e("Tag " + i2 + " is not an ancestor of tag " + i);
                }
            }
        }
        a(c2, c3, iArr);
    }

    private void a(int i, int[] iArr) {
        w c2 = this.f3755c.c(i);
        if (c2 == null) {
            throw new e("No native view for tag " + i + " exists!");
        }
        w parent = c2.getParent();
        if (parent == null) {
            throw new e("View with tag " + i + " doesn't have a parent!");
        }
        a(c2, parent, iArr);
    }

    private void a(w wVar, w wVar2, int[] iArr) {
        int i;
        int i2;
        if (wVar != wVar2) {
            i = Math.round(wVar.getLayoutX());
            i2 = Math.round(wVar.getLayoutY());
            for (w parent = wVar.getParent(); parent != wVar2; parent = parent.getParent()) {
                com.facebook.j.a.a.b(parent);
                d(parent);
                i += Math.round(parent.getLayoutX());
                i2 += Math.round(parent.getLayoutY());
            }
            d(wVar2);
        } else {
            i = 0;
            i2 = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = wVar.getScreenWidth();
        iArr[3] = wVar.getScreenHeight();
    }

    private void a(int i, String str) {
        if (this.f3755c.c(i) == null) {
            throw new e("Unable to execute operation " + str + " on view with tag: " + i + ", since the view does not exists");
        }
    }

    private void d(w wVar) {
        ViewManager viewManager = (ViewManager) com.facebook.j.a.a.b(this.f.a(wVar.getViewClass()));
        if (viewManager instanceof ViewGroupManager) {
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            if (viewGroupManager == null || !viewGroupManager.needsCustomLayoutForChildren()) {
                return;
            }
            throw new e("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + wVar.getViewClass() + "). Use measure instead.");
        }
        throw new e("Trying to use view " + wVar.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
    }

    private void e(w wVar) {
        if (!wVar.hasUpdates()) {
            return;
        }
        for (int i = 0; i < wVar.getChildCount(); i++) {
            e(wVar.getChildAt(i));
        }
        wVar.onBeforeLayout();
    }

    protected void b(w wVar) {
        com.facebook.m.b.a(0L, "cssRoot.calculateLayout").a("rootTag", wVar.getReactTag()).a();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            wVar.calculateLayout();
        } finally {
            com.facebook.m.a.b(0L);
            this.j = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    protected void a(w wVar, float f, float f2) {
        if (!wVar.hasUpdates()) {
            return;
        }
        if (!wVar.isVirtualAnchor()) {
            for (int i = 0; i < wVar.getChildCount(); i++) {
                a(wVar.getChildAt(i), wVar.getLayoutX() + f, wVar.getLayoutY() + f2);
            }
        }
        int reactTag = wVar.getReactTag();
        if (!this.f3755c.d(reactTag) && wVar.dispatchUpdates(f, f2, this.g, this.h) && wVar.shouldNotifyOnLayout()) {
            this.f3753a.a(n.a(reactTag, wVar.getScreenX(), wVar.getScreenY(), wVar.getScreenWidth(), wVar.getScreenHeight()));
        }
        wVar.markUpdateSeen();
    }

    public void a(ai aiVar) {
        this.g.a(aiVar);
    }

    public void b(ai aiVar) {
        this.g.b(aiVar);
    }

    public int f(int i) {
        if (this.f3755c.d(i)) {
            return i;
        }
        w a2 = a(i);
        if (a2 != null) {
            return a2.getRootNode().getReactTag();
        }
        com.facebook.common.e.a.c("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i);
        return 0;
    }

    public void g(int i) {
        this.e.add(Integer.valueOf(i));
    }
}
