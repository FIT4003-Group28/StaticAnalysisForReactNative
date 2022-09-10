package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bays  reason: default package */
/* loaded from: classes3.dex */
final class bays implements View.OnClickListener {
    final /* synthetic */ bayu a;

    public bays(bayu bayuVar) {
        this.a = bayuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bayu bayuVar = this.a;
        ilo f = bayuVar.f();
        if (f != null) {
            bayuVar.t.D(bhzy.g(bayuVar.u, bwrs.a(f)));
        }
    }
}
