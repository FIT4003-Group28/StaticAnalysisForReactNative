package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bjb  reason: default package */
/* loaded from: classes2.dex */
final class bjb implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ bjc a;

    public bjb(bjc bjcVar) {
        this.a = bjcVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        if (z) {
            bjc bjcVar = this.a;
            bjcVar.af = bjcVar.ae.add(bjcVar.ah[i].toString()) | bjcVar.af;
            return;
        }
        bjc bjcVar2 = this.a;
        bjcVar2.af = bjcVar2.ae.remove(bjcVar2.ah[i].toString()) | bjcVar2.af;
    }
}
