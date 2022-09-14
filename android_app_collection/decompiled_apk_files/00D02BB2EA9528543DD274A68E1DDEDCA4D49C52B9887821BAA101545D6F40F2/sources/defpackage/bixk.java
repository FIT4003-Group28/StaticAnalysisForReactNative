package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bixk  reason: default package */
/* loaded from: classes3.dex */
final class bixk implements DialogInterface.OnCancelListener {
    final /* synthetic */ bixn a;

    public bixk(bixn bixnVar) {
        this.a = bixnVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.c.i(cjtd.a(dtxl.a));
    }
}
