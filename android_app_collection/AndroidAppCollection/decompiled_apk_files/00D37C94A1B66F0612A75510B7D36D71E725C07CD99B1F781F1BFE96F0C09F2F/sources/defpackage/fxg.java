package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.accessibility.AccessibilityManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fxg  reason: default package */
/* loaded from: classes3.dex */
public final class fxg extends ne {
    final /* synthetic */ AccessibilityManager a;
    final /* synthetic */ aafo b;
    final /* synthetic */ apzg c;
    final /* synthetic */ fwx d;
    final /* synthetic */ fxh e;

    public fxg(fxh fxhVar, AccessibilityManager accessibilityManager, aafo aafoVar, apzg apzgVar, fwx fwxVar) {
        this.e = fxhVar;
        this.a = accessibilityManager;
        this.b = aafoVar;
        this.c = apzgVar;
        this.d = fwxVar;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            double computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            fxh fxhVar = this.e;
            if (fxhVar.a) {
                if (computeVerticalScrollOffset >= fxhVar.b) {
                    return;
                }
                this.d.b();
            } else if (i2 < 0 || computeVerticalScrollOffset < fxhVar.b) {
            } else {
                this.b.a(this.c);
            }
        }
    }
}
