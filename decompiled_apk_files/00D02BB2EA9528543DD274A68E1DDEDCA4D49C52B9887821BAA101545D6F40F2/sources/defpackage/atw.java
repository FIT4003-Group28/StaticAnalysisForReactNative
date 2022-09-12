package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: atw  reason: default package */
/* loaded from: classes2.dex */
final class atw implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ atx a;

    public atw(atx atxVar) {
        this.a = atxVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        if (z) {
            atx atxVar = this.a;
            atxVar.ae = atxVar.ad.add(atxVar.ag[i].toString()) | atxVar.ae;
            return;
        }
        atx atxVar2 = this.a;
        atxVar2.ae = atxVar2.ad.remove(atxVar2.ag[i].toString()) | atxVar2.ae;
    }
}
