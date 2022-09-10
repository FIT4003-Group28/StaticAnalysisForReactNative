package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: pds  reason: default package */
/* loaded from: classes7.dex */
final class pds implements pdu {
    final /* synthetic */ dljf a;
    final /* synthetic */ pap b;
    final /* synthetic */ pau c;
    final /* synthetic */ btlu d;
    final /* synthetic */ pdv e;

    public pds(pdv pdvVar, dljf dljfVar, pap papVar, pau pauVar, btlu btluVar) {
        this.e = pdvVar;
        this.a = dljfVar;
        this.b = papVar;
        this.c = pauVar;
        this.d = btluVar;
    }

    @Override // defpackage.pdu
    public final void a(@dzsi Bitmap bitmap) {
        pdv pdvVar = this.e;
        dljf dljfVar = this.a;
        pdvVar.e((dljfVar.a & 16) != 0 ? dljfVar.f : null, 500, new pdr(this, bitmap));
    }
}
