package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ccal  reason: default package */
/* loaded from: classes4.dex */
final class ccal implements View.OnClickListener {
    final /* synthetic */ ccam a;

    public ccal(ccam ccamVar) {
        this.a = ccamVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.a.e.a() || !this.a.f.booleanValue()) {
            return;
        }
        if (this.a.e.b().b) {
            this.a.e.b().b = false;
        } else {
            this.a.e.b().a();
        }
    }
}
