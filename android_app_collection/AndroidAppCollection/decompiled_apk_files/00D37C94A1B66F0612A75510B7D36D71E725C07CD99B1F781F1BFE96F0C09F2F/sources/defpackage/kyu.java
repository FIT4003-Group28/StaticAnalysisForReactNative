package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kyu  reason: default package */
/* loaded from: classes3.dex */
public final class kyu implements View.OnClickListener {
    final /* synthetic */ kyz a;

    public kyu(kyz kyzVar) {
        this.a = kyzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = false;
        if (this.a.d.qn(awco.c) && ((Boolean) this.a.d.qm(awco.c)).booleanValue()) {
            z = true;
        }
        kyz kyzVar = this.a;
        aopc aopcVar = (aopc) kyzVar.d.mo52toBuilder();
        aopcVar.e(awco.c, Boolean.valueOf(!z));
        kyzVar.d = (awda) aopcVar.mo39build();
        this.a.b(true);
        this.a.c();
    }
}
