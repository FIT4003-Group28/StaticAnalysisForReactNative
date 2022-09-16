package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: nwh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nwh implements DialogInterface.OnClickListener {
    public final /* synthetic */ nwi a;
    private final /* synthetic */ int b;

    public /* synthetic */ nwh(nwi nwiVar) {
        this.a = nwiVar;
    }

    public /* synthetic */ nwh(nwi nwiVar, int i) {
        this.b = i;
        this.a = nwiVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            nwi nwiVar = this.a;
            ((airr) nwiVar.c.get()).b();
            nwiVar.d.r(1, 1);
            dialogInterface.dismiss();
            return;
        }
        nwi nwiVar2 = this.a;
        ((airr) nwiVar2.c.get()).M();
        adnt e = nwiVar2.b.e();
        if (e != null) {
            e.B();
        }
        dialogInterface.dismiss();
    }
}
