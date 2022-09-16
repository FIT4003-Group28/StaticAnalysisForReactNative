package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: akdl  reason: default package */
/* loaded from: classes.dex */
final class akdl implements DialogInterface.OnClickListener {
    final /* synthetic */ akdm a;

    public akdl(akdm akdmVar) {
        this.a = akdmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        akdr.c(this.a.mJ());
    }
}
