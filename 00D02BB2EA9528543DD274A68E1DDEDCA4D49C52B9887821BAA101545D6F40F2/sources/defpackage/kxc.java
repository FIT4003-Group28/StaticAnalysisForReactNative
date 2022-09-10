package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: kxc  reason: default package */
/* loaded from: classes7.dex */
public final class kxc {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final Bitmap e;
    private final Bitmap f;
    private final Bitmap g;
    private final Bitmap h;
    private final Canvas i;
    private final Paint j;
    private final Rect k;
    private final kxd l;

    public kxc(Context context, akvz akvzVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Canvas canvas = new Canvas();
        this.i = canvas;
        Paint paint = new Paint();
        this.j = paint;
        this.k = new Rect();
        this.l = new kxd(akvzVar);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(nre.b);
        paint.setTextSize(nqo.b.a(context));
        Drawable a = nqu.an(cqta.d(-16777216)).a(context);
        a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
        this.e = c(i5, a, canvas);
        this.f = c(i6, a, canvas);
        this.g = c(i7, a, canvas);
        this.h = c(i8, a, canvas);
    }

    private static Bitmap c(int i, Drawable drawable, Canvas canvas) {
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        drawable.draw(canvas);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public final dmpn a(@dzsi akra akraVar, String str, boolean z, boolean z2) {
        Bitmap createBitmap;
        dmlp bZ = dmlq.e.bZ();
        dmlo dmloVar = dmlo.BOTTOM_RIGHT;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        dmlqVar.c = dmloVar.j;
        dmlqVar.a |= 2;
        if (akraVar != null) {
            dmls a = akxh.a(akraVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmlq dmlqVar2 = (dmlq) bZ.b;
            a.getClass();
            dmlqVar2.b = a;
            dmlqVar2.a |= 1;
        }
        kxd kxdVar = this.l;
        akuh akuhVar = z2 ? kxdVar.d : kxdVar.c;
        if (z) {
            createBitmap = Bitmap.createBitmap(z2 ? this.h : this.g);
            this.j.setColor(z2 ? this.d : this.c);
        } else {
            createBitmap = Bitmap.createBitmap(z2 ? this.f : this.e);
            this.j.setColor(z2 ? this.b : this.a);
        }
        this.j.getTextBounds(str, 0, str.length(), this.k);
        this.i.setBitmap(createBitmap);
        this.i.drawText(str, createBitmap.getWidth() / 2.0f, (createBitmap.getHeight() / 2.0f) - this.k.exactCenterY(), this.j);
        kxd kxdVar2 = this.l;
        akuh akuhVar2 = kxdVar2.b.get(createBitmap);
        if (akuhVar2 == null) {
            akuhVar2 = kxdVar2.a.d(createBitmap);
            kxdVar2.b.put(createBitmap, akuhVar2);
        }
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        int a2 = akuhVar.a();
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar = (dmph) dmpeVar.b;
        dmphVar.a |= 1;
        dmphVar.c = a2;
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        int a3 = akuhVar2.a();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        dmpdVar.a |= 2;
        dmpdVar.c = a3;
        dmpeVar.b(dmpcVar);
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar2 = (dmph) dmpeVar.bK();
        dmphVar2.getClass();
        dmpnVar.b = dmphVar2;
        dmpnVar.a |= 1;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar2.d = bK;
        dmpnVar2.a |= 4;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        dmpnVar3.a |= 32;
        dmpnVar3.g = 1;
        return (dmpn) dmpkVar.bK();
    }

    public final void b() {
        kxd kxdVar = this.l;
        kxdVar.a.j(kxdVar.c);
        kxdVar.a.j(kxdVar.d);
        for (akuh akuhVar : kxdVar.b.values()) {
            kxdVar.a.j(akuhVar);
        }
        kxdVar.b.clear();
    }
}
