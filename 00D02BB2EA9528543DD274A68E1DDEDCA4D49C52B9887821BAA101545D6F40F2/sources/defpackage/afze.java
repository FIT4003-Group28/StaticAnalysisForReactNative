package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: afze  reason: default package */
/* loaded from: classes2.dex */
final class afze implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ ahhv b;
    final /* synthetic */ afzm c;

    public afze(afzm afzmVar, View view, ahhv ahhvVar) {
        this.c = afzmVar;
        this.a = view;
        this.b = ahhvVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        for (View view : agxk.k(this.a, agta.class)) {
            V v = cqjz.g(view).j;
            ahhv ahhvVar = this.b;
            if (v == ahhvVar) {
                this.c.ah.c(ahhvVar, view);
                return;
            }
        }
    }
}
