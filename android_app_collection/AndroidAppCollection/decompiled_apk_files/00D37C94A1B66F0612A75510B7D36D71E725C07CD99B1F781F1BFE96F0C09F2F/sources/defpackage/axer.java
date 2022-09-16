package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axer  reason: default package */
/* loaded from: classes2.dex */
public final class axer implements View.OnClickListener {
    final /* synthetic */ axeu a;
    private final /* synthetic */ int b;

    public axer(axeu axeuVar) {
        this.a = axeuVar;
    }

    public axer(axeu axeuVar, int i) {
        this.b = i;
        this.a = axeuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.f(false);
        } else if (i == 1) {
            axfe.a(this.a.getContext());
        } else {
            this.a.d.run();
        }
    }
}
