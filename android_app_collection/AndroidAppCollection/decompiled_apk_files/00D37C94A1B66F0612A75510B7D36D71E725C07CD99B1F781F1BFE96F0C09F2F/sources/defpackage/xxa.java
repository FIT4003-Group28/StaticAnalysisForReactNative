package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: xxa  reason: default package */
/* loaded from: classes4.dex */
public final class xxa implements xqi {
    public final ImageView a;
    public final TextView b;
    public final xqj c;
    public final aafo d;
    public xrp e;
    public apoj f;
    public int g;
    public int h;
    public final RectF i;
    public int j;
    private final ImageView k;
    private final ProgressBar l;
    private final View m;
    private final View n;
    private final int o;
    private final Matrix p;
    private final RectF q;

    public xxa(ImageView imageView, ImageView imageView2, TextView textView, ProgressBar progressBar, View view, View view2, int i, xqj xqjVar, aafo aafoVar) {
        imageView.getClass();
        this.a = imageView;
        imageView2.getClass();
        this.k = imageView2;
        textView.getClass();
        this.b = textView;
        progressBar.getClass();
        this.l = progressBar;
        view.getClass();
        this.m = view;
        view2.getClass();
        this.n = view2;
        this.o = i;
        xqjVar.getClass();
        this.c = xqjVar;
        aafoVar.getClass();
        this.d = aafoVar;
        this.p = new Matrix();
        this.q = new RectF();
        this.i = new RectF();
        this.g = 1;
        xqjVar.c(this);
    }

    public final void a(Drawable drawable, arif arifVar) {
        if (drawable == null || arifVar == null) {
            return;
        }
        this.p.reset();
        RectF rectF = this.q;
        double d = arifVar.c;
        double intrinsicWidth = drawable.getIntrinsicWidth();
        Double.isNaN(intrinsicWidth);
        double d2 = arifVar.d;
        double intrinsicHeight = drawable.getIntrinsicHeight();
        Double.isNaN(intrinsicHeight);
        double d3 = arifVar.e;
        double intrinsicWidth2 = drawable.getIntrinsicWidth();
        Double.isNaN(intrinsicWidth2);
        double d4 = arifVar.f;
        double intrinsicHeight2 = drawable.getIntrinsicHeight();
        Double.isNaN(intrinsicHeight2);
        rectF.set((float) (d * intrinsicWidth), (float) (d2 * intrinsicHeight), (float) (d3 * intrinsicWidth2), (float) (d4 * intrinsicHeight2));
        this.p.setRectToRect(this.q, this.i, Matrix.ScaleToFit.FILL);
        this.a.setImageMatrix(this.p);
    }

    public final boolean c() {
        return this.g != 1;
    }

    public final boolean d() {
        return this.l.getVisibility() == 0;
    }

    @Override // defpackage.xqi
    public final void g(xrp xrpVar, apoj apojVar) {
        this.j++;
        this.e = xrpVar;
        this.f = apojVar;
        if (xrpVar != null) {
            a(xrpVar.c, xrpVar.d);
        }
    }

    @Override // defpackage.xqi
    public final void qW(xrp xrpVar) {
    }

    public final void b(int i) {
        this.g = i;
        if (i == 2 || i == 3) {
            this.a.setColorFilter(this.o);
        } else {
            this.a.setColorFilter((ColorFilter) null);
        }
        boolean z = false;
        zag.o(this.a, i != 1);
        zag.o(this.n, (this.f == null || i == 1) ? false : true);
        zag.o(this.b, this.f != null && i == 4);
        zag.o(this.k, i == 4 || i == 3);
        zag.o(this.l, i == 2);
        View view = this.m;
        if (i == 3) {
            z = true;
        }
        zag.o(view, z);
    }
}
