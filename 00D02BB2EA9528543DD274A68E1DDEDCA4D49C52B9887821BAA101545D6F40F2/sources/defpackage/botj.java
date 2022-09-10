package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: botj  reason: default package */
/* loaded from: classes3.dex */
final class botj implements DialogInterface.OnClickListener {
    final /* synthetic */ botl a;

    public botj(botl botlVar) {
        this.a = botlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        botl botlVar = this.a;
        if (!((ges) botlVar.c).aD) {
            return;
        }
        botlVar.f.a().i(cjtd.a(dtya.ch));
        this.a.b(cjqm.a);
    }
}
