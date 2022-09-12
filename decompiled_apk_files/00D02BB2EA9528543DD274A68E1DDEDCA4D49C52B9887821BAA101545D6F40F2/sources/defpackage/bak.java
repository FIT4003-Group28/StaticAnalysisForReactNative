package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bak  reason: default package */
/* loaded from: classes.dex */
public final class bak extends Drawable.ConstantState {
    int a;
    baj b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public bak() {
        this.c = null;
        this.d = bam.a;
        this.b = new baj();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        baj bajVar = this.b;
        bajVar.a(bajVar.d, baj.a, canvas, i, i2);
    }

    public final boolean b() {
        baj bajVar = this.b;
        if (bajVar.k == null) {
            bajVar.k = Boolean.valueOf(bajVar.d.b());
        }
        return bajVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new bam(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new bam(this);
    }

    public bak(bak bakVar) {
        this.c = null;
        this.d = bam.a;
        if (bakVar != null) {
            this.a = bakVar.a;
            this.b = new baj(bakVar.b);
            Paint paint = bakVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = bakVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = bakVar.c;
            this.d = bakVar.d;
            this.e = bakVar.e;
        }
    }
}
