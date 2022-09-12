package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: afkk  reason: default package */
/* loaded from: classes2.dex */
final class afkk implements DialogInterface.OnClickListener {
    final /* synthetic */ afkr a;
    final /* synthetic */ afkn b;

    public afkk(afkn afknVar, afkr afkrVar) {
        this.b = afknVar;
        this.a = afkrVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.b.f(null);
        } else if (i != -1) {
        } else {
            afkn afknVar = this.b;
            afkr afkrVar = this.a;
            afknVar.i(afkrVar.f, afkrVar.g).o();
        }
    }
}
