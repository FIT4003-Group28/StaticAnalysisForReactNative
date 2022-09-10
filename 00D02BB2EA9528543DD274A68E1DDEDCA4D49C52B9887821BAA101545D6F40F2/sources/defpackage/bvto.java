package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bvto  reason: default package */
/* loaded from: classes4.dex */
final class bvto implements DialogInterface.OnShowListener {
    final /* synthetic */ bvtp a;

    public bvto(bvtp bvtpVar) {
        this.a = bvtpVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        this.a.g().o(this.a.P);
    }
}
