package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bidg  reason: default package */
/* loaded from: classes3.dex */
final class bidg implements DialogInterface.OnClickListener {
    final /* synthetic */ bidk a;

    public bidg(bidk bidkVar) {
        this.a = bidkVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bidk bidkVar = this.a;
        bidkVar.b.x().e(bidkVar.e.g(), new bide(bidkVar));
    }
}
