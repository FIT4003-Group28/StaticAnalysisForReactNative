package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bbbn  reason: default package */
/* loaded from: classes3.dex */
final class bbbn implements DialogInterface.OnClickListener {
    final /* synthetic */ cjql a;
    final /* synthetic */ cjtd b;
    final /* synthetic */ bbbp c;

    public bbbn(bbbp bbbpVar, cjql cjqlVar, cjtd cjtdVar) {
        this.c = bbbpVar;
        this.a = cjqlVar;
        this.b = cjtdVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.c.d.j(this.a, this.b);
    }
}
