package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bynl  reason: default package */
/* loaded from: classes4.dex */
public final class bynl implements DialogInterface.OnClickListener {
    final /* synthetic */ bynq a;

    public bynl(bynq bynqVar) {
        this.a = bynqVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.g.i(cjtd.a(dtyi.dk));
    }
}
