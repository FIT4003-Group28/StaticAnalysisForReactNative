package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: ankh  reason: default package */
/* loaded from: classes2.dex */
final class ankh implements DialogInterface.OnClickListener {
    final /* synthetic */ anki a;

    public ankh(anki ankiVar) {
        this.a = ankiVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c.a.D(gfk.i("https://history.google.com/history", "local"));
    }
}
