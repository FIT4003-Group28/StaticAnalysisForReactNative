package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdxt  reason: default package */
/* loaded from: classes3.dex */
public final class bdxt implements DialogInterface.OnDismissListener {
    final /* synthetic */ bdyb a;

    public bdxt(bdyb bdybVar) {
        this.a = bdybVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.bK = true;
    }
}
