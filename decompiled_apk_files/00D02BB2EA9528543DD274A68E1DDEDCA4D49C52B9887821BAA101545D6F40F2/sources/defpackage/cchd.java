package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cchd  reason: default package */
/* loaded from: classes4.dex */
public final class cchd implements DialogInterface.OnClickListener {
    final /* synthetic */ cchj a;

    public cchd(cchj cchjVar) {
        this.a = cchjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cchj cchjVar = this.a;
        if (cchjVar.aD && i == -1 && cchjVar.bg()) {
            this.a.w();
        }
    }
}
