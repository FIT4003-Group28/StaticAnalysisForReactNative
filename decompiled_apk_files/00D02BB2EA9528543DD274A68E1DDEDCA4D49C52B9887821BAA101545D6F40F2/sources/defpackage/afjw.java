package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: afjw  reason: default package */
/* loaded from: classes2.dex */
final class afjw implements DialogInterface.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ afjy b;

    public afjw(afjy afjyVar, String str) {
        this.b = afjyVar;
        this.a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i != -1) {
            return;
        }
        this.b.d(this.a);
    }
}
