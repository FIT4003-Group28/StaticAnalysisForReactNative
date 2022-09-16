package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bixl  reason: default package */
/* loaded from: classes3.dex */
final class bixl implements DialogInterface.OnClickListener {
    final /* synthetic */ bixn a;

    public bixl(bixn bixnVar) {
        this.a = bixnVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.REOPEN_PLACE_LINK;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 1;
        dnqeVar2.a |= 2;
        dnqe bK = bZ.bK();
        bixn bixnVar = this.a;
        bwrs<ilo> bwrsVar = bixnVar.d;
        if (bwrsVar == null) {
            bvoo.h("PlacemarkRef should not be null", new Object[0]);
        } else {
            bixnVar.b.K(bwrsVar, bK);
        }
        this.a.c.i(cjtd.a(dtxl.dX));
        this.a.l();
    }
}
