package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: iib  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iib implements View.OnClickListener {
    public final /* synthetic */ iid a;
    private final /* synthetic */ int b;

    public /* synthetic */ iib(iid iidVar) {
        this.a = iidVar;
    }

    public /* synthetic */ iib(iid iidVar, int i) {
        this.b = i;
        this.a = iidVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.d.setText("");
            return;
        }
        iid iidVar = this.a;
        ((hub) iidVar.b).d();
        zag.i(iidVar.d);
        iidVar.c.f();
    }
}
