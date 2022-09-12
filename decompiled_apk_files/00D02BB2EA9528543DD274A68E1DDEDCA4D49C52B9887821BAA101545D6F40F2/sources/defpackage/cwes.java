package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwes  reason: default package */
/* loaded from: classes5.dex */
public final class cwes implements View.OnAttachStateChangeListener {
    final /* synthetic */ cvxj a;
    final /* synthetic */ cwev b;

    public cwes(cwev cwevVar, cvxj cvxjVar) {
        this.b = cwevVar;
        this.a = cvxjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.b.setBadgeRetriever(new cvvi(this) { // from class: cwer
            private final cwes a;

            {
                this.a = this;
            }

            @Override // defpackage.cvvn
            public final cvvm<cvvh> a(Object obj) {
                cwes cwesVar = this.a;
                if (cwesVar.b.d.e()) {
                    return new cvvm<>(cwesVar.b.a);
                }
                return null;
            }
        });
        this.b.f.i(this.a);
        this.a.a(this.b.f.e());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.f.k(this.a);
    }
}
