package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxpt  reason: default package */
/* loaded from: classes5.dex */
public final class cxpt extends cih<Bitmap> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ cxpv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxpt(cxpv cxpvVar, int i, int i2, int i3, int i4, int i5) {
        super(i, i2);
        this.d = cxpvVar;
        this.a = i3;
        this.b = i4;
        this.c = i5;
    }

    private final void l() {
        cxpv cxpvVar = this.d;
        Bitmap[] bitmapArr = cxpvVar.j;
        int i = this.a;
        bitmapArr[i] = null;
        cxpvVar.i[i].setShader(null);
        cxps cxpsVar = this.d.l;
        if (cxpsVar != null) {
            cxpsVar.a();
        }
    }

    @Override // defpackage.chz, defpackage.cij
    public final void a(Drawable drawable) {
        l();
    }

    @Override // defpackage.cij
    public final /* bridge */ /* synthetic */ void b(Object obj, cit citVar) {
        cxpv cxpvVar = this.d;
        Bitmap[] bitmapArr = cxpvVar.j;
        int i = this.a;
        bitmapArr[i] = (Bitmap) obj;
        cxpvVar.b(this.b, this.c, i);
    }

    @Override // defpackage.chz, defpackage.cij
    public final void c(Drawable drawable) {
        l();
    }

    @Override // defpackage.chz, defpackage.cij
    public final void k(Drawable drawable) {
        l();
    }
}
