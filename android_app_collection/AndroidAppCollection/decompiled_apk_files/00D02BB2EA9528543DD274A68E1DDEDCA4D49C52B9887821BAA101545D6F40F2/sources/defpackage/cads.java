package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: cads  reason: default package */
/* loaded from: classes4.dex */
final class cads implements DialogInterface.OnClickListener {
    final /* synthetic */ cadx a;

    public cads(cadx cadxVar) {
        this.a = cadxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.p();
        this.a.j.S(bvjk.fV, true);
    }
}
