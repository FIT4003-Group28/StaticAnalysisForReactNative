package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kwo  reason: default package */
/* loaded from: classes3.dex */
final class kwo implements View.OnClickListener {
    final /* synthetic */ kwr a;
    final /* synthetic */ kws b;

    public kwo(kws kwsVar, kwr kwrVar) {
        this.b = kwsVar;
        this.a = kwrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kvm kvmVar = this.b.g;
        if (kvmVar != null) {
            akhl akhlVar = this.a.f;
            kvz kvzVar = kvmVar.a;
            kvzVar.ai.e();
            kvzVar.aF();
            kvzVar.aH.setText(akhlVar.b);
            zag.j(kvzVar.aH);
            kvzVar.be();
        }
    }
}
