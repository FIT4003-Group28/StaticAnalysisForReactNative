package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: afuo  reason: default package */
/* loaded from: classes2.dex */
final class afuo implements DialogInterface.OnClickListener {
    final /* synthetic */ afuu a;

    public afuo(afuu afuuVar) {
        this.a = afuuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        afuu afuuVar = this.a;
        afuuVar.d.S(bvjk.E, false);
        afuuVar.d.S(bvjk.G, true);
        afuuVar.f.i(cjtd.a(dtyb.b));
        dialogInterface.cancel();
    }
}
