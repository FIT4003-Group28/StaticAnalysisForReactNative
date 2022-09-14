package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnxl  reason: default package */
/* loaded from: classes3.dex */
public final class bnxl implements DialogInterface.OnClickListener {
    final /* synthetic */ bnxn a;

    public bnxl(bnxn bnxnVar) {
        this.a = bnxnVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.a.b(cjqg.c(this.a.a));
        }
    }
}
