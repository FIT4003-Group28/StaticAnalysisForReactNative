package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cgzx  reason: default package */
/* loaded from: classes4.dex */
public final class cgzx implements DialogInterface.OnClickListener {
    final /* synthetic */ chac a;

    public cgzx(chac chacVar) {
        this.a = chacVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cgwi H = this.a.H();
        if (H != null) {
            H.m();
        }
    }
}
