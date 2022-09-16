package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awue  reason: default package */
/* loaded from: classes3.dex */
public final class awue implements DialogInterface.OnClickListener {
    final /* synthetic */ awug a;

    public awue(awug awugVar) {
        this.a = awugVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        long b;
        dialogInterface.dismiss();
        awug awugVar = this.a;
        awul awulVar = awugVar.i;
        if (awulVar != null) {
            awuf awufVar = awugVar.b;
            long n = awulVar.n();
            if (n == 0) {
                b = ((awqc) awufVar).a.ar.k();
            } else {
                b = n + ((awqc) awufVar).a.ai.b();
            }
            awqc awqcVar = (awqc) awufVar;
            awtm i2 = awqcVar.a.ar.i();
            i2.c(b);
            i2.b(awqcVar.a.ai.b());
            awtn k = i2.k();
            awqcVar.a.g(k);
            awqcVar.a.ag.a().i(k);
        }
    }
}
