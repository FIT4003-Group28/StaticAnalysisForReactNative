package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: afkl  reason: default package */
/* loaded from: classes2.dex */
final class afkl implements DialogInterface.OnCancelListener {
    final /* synthetic */ afkn a;

    public afkl(afkn afknVar) {
        this.a = afknVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.f(null);
    }
}
