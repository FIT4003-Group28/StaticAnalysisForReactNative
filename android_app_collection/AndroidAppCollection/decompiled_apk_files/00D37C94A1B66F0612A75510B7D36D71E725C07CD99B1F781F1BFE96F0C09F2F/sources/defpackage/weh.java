package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: weh  reason: default package */
/* loaded from: classes4.dex */
final class weh implements View.OnClickListener {
    final /* synthetic */ wfe a;
    final /* synthetic */ wek b;

    public weh(wek wekVar, wfe wfeVar) {
        this.b = wekVar;
        this.a = wfeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aarw aarwVar = this.b.b;
        if (aarwVar != null) {
            this.a.a(aarwVar);
        }
    }
}
