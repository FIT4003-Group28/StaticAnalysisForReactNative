package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: pdr  reason: default package */
/* loaded from: classes7.dex */
final class pdr implements pdu {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ pds b;

    public pdr(pds pdsVar, Bitmap bitmap) {
        this.b = pdsVar;
        this.a = bitmap;
    }

    @Override // defpackage.pdu
    public final void a(@dzsi Bitmap bitmap) {
        ((ckco) this.b.e.b.a(ckdz.aj)).a(1);
        pds pdsVar = this.b;
        pdv pdvVar = pdsVar.e;
        auhi auhiVar = pdvVar.c;
        dljf dljfVar = pdsVar.a;
        pap papVar = pdsVar.b;
        auhiVar.j(pdvVar.f(dljfVar, papVar.b, papVar.c, this.a, bitmap, pdsVar.c, pdsVar.d, true));
    }
}
