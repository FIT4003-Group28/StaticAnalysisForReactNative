package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cxpu  reason: default package */
/* loaded from: classes5.dex */
public final class cxpu extends cih<Bitmap> {
    final /* synthetic */ cxpv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxpu(cxpv cxpvVar, int i, int i2) {
        super(i, i2);
        this.a = cxpvVar;
    }

    private final void l() {
        cxpv cxpvVar = this.a;
        cxpvVar.g = null;
        cxpvVar.d.setShader(null);
        cxps cxpsVar = this.a.l;
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
        cxpv cxpvVar = this.a;
        cxpvVar.g = (Bitmap) obj;
        BitmapShader bitmapShader = (BitmapShader) cxpvVar.d.getShader();
        if (bitmapShader == null) {
            BitmapShader bitmapShader2 = new BitmapShader(cxpvVar.g, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
            bitmapShader2.setLocalMatrix(cxpvVar.c(cxpvVar.b, cxpvVar.c, cxpvVar.g.getWidth(), cxpvVar.g.getHeight(), 0));
            cxpvVar.d.setShader(bitmapShader2);
        } else {
            bitmapShader.setLocalMatrix(cxpvVar.c(cxpvVar.b, cxpvVar.c, cxpvVar.g.getWidth(), cxpvVar.g.getHeight(), 0));
        }
        cxps cxpsVar = cxpvVar.l;
        if (cxpsVar != null) {
            cxpsVar.a();
        }
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
