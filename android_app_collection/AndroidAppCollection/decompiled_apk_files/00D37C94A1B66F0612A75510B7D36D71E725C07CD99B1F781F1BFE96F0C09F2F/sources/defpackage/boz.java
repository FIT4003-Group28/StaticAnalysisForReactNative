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
/* renamed from: boz  reason: default package */
/* loaded from: classes2.dex */
public final class boz extends Drawable.ConstantState {
    int a;
    boy b;
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

    public boz() {
        this.c = null;
        this.d = bpb.a;
        this.b = new boy();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        boy boyVar = this.b;
        boyVar.a(boyVar.d, boy.a, canvas, i, i2);
    }

    public final boolean b() {
        boy boyVar = this.b;
        if (boyVar.k == null) {
            boyVar.k = Boolean.valueOf(boyVar.d.e());
        }
        return boyVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new bpb(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new bpb(this);
    }

    public boz(boz bozVar) {
        this.c = null;
        this.d = bpb.a;
        if (bozVar != null) {
            this.a = bozVar.a;
            this.b = new boy(bozVar.b);
            Paint paint = bozVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = bozVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = bozVar.c;
            this.d = bozVar.d;
            this.e = bozVar.e;
        }
    }
}
