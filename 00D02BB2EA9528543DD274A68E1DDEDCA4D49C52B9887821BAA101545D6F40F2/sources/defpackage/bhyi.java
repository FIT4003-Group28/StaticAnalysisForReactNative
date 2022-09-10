package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bhyi  reason: default package */
/* loaded from: classes3.dex */
final class bhyi implements DialogInterface.OnClickListener {
    final /* synthetic */ bhyn a;

    public bhyi(bhyn bhynVar) {
        this.a = bhynVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(this.a.a.j.getText().toString().trim());
    }
}
