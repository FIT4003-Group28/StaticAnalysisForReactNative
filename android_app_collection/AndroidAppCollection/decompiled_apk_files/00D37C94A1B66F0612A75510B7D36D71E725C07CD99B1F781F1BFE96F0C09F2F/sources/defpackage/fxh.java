package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: fxh  reason: default package */
/* loaded from: classes3.dex */
public final class fxh {
    public boolean a;
    public double b;
    public RecyclerView c;
    public ne d;

    public final void a(apzg apzgVar, ajzq ajzqVar, aafo aafoVar, final fwx fwxVar, Context context, int i) {
        if (ajzqVar == null || context == null) {
            return;
        }
        RecyclerView recyclerView = ajzqVar.f60J;
        this.c = recyclerView;
        if (recyclerView == null) {
            return;
        }
        this.b = i * 5;
        AccessibilityManager a = zdg.a(context);
        fxg fxgVar = new fxg(this, a, aafoVar, apzgVar, fwxVar);
        this.d = fxgVar;
        this.c.aE(fxgVar);
        if (a == null) {
            return;
        }
        a.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: fxf
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                fxh fxhVar = fxh.this;
                fwx fwxVar2 = fwxVar;
                if (!fxhVar.a || !z) {
                    return;
                }
                fwxVar2.b();
            }
        });
    }
}
