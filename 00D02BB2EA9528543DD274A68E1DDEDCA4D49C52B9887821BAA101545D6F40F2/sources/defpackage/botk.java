package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: botk  reason: default package */
/* loaded from: classes3.dex */
final class botk implements DialogInterface.OnCancelListener {
    final /* synthetic */ botl a;

    public botk(botl botlVar) {
        this.a = botlVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.f.a().i(cjtd.a(dtya.cg));
    }
}
