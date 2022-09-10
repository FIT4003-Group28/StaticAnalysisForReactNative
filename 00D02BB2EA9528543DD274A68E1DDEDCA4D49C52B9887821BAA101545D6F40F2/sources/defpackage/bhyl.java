package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bhyl  reason: default package */
/* loaded from: classes3.dex */
final class bhyl implements DialogInterface.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ bhyn b;

    public bhyl(bhyn bhynVar, String str) {
        this.b = bhynVar;
        this.a = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.b(this.a);
    }
}
