package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aaad  reason: default package */
/* loaded from: classes.dex */
final class aaad implements View.OnClickListener {
    final /* synthetic */ aaag a;

    public aaad(aaag aaagVar) {
        this.a = aaagVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aaar aaarVar = this.a.f;
        if (aaarVar != null) {
            aaarVar.r();
            this.a.f.d();
        }
    }
}
