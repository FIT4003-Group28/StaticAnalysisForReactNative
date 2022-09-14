package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfax  reason: default package */
/* loaded from: classes3.dex */
public final class bfax implements DialogInterface.OnShowListener {
    final /* synthetic */ bfbb a;

    public bfax(bfbb bfbbVar) {
        this.a = bfbbVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        bfbj bfbjVar = this.a.b;
        if (bfbjVar != null) {
            bfbjVar.n();
        }
    }
}
