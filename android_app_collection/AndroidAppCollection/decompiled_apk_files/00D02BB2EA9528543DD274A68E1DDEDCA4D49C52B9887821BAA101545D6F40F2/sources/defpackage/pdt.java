package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: pdt  reason: default package */
/* loaded from: classes7.dex */
final class pdt extends cih<Bitmap> {
    final /* synthetic */ pdu a;
    final /* synthetic */ pdv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdt(pdv pdvVar, int i, int i2, pdu pduVar) {
        super(i, i2);
        this.b = pdvVar;
        this.a = pduVar;
    }

    @Override // defpackage.chz, defpackage.cij
    public final void a(@dzsi Drawable drawable) {
        int i = pdv.a;
        ((ckco) this.b.b.a(ckdz.ak)).a(ckdx.a(3));
        this.a.a(null);
    }

    @Override // defpackage.cij
    public final /* bridge */ /* synthetic */ void b(Object obj, @dzsi cit citVar) {
        ((ckco) this.b.b.a(ckdz.ak)).a(ckdx.a(1));
        this.a.a((Bitmap) obj);
    }
}
