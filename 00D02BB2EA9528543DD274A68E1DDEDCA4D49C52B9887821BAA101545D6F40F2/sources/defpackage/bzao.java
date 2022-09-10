package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bzao  reason: default package */
/* loaded from: classes4.dex */
final class bzao extends Drawable {
    final /* synthetic */ bzap a;

    public bzao(bzap bzapVar) {
        this.a = bzapVar;
    }

    private static final void a(Drawable drawable, Canvas canvas, int i, int i2, int i3) {
        drawable.setBounds(i - i3, i2 - i3, i + i3, i2 + i3);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        int dimensionPixelSize = this.a.f.getDimensionPixelSize(R.dimen.notification_progress_line_width);
        int dimensionPixelSize2 = (this.a.f.getDimensionPixelSize(R.dimen.notification_vehicle_shadow_size) - this.a.f.getDimensionPixelSize(R.dimen.notification_badge_circle_size)) / 2;
        int width = canvas.getWidth() / 2;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(this.a.a);
        int i = dimensionPixelSize / 2;
        float f = i;
        float[] fArr = new float[8];
        int width2 = (canvas.getWidth() - dimensionPixelSize) / 2;
        int width3 = canvas.getWidth() - width2;
        int height = canvas.getHeight() - dimensionPixelSize2;
        Arrays.fill(fArr, 0, 8, f);
        boolean z = true;
        if (!bvoa.b(this.a.a, -1) && !bvoa.b(this.a.a, -16777216)) {
            z = false;
        }
        if (!z) {
            shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
            shapeDrawable.setBounds(width2, dimensionPixelSize2, width3, height);
            drawable = null;
        } else {
            int dimensionPixelSize3 = this.a.f.getDimensionPixelSize(R.dimen.notification_progress_line_border_width);
            ShapeDrawable shapeDrawable2 = new ShapeDrawable();
            shapeDrawable2.setShape(new RoundRectShape(fArr, null, null));
            shapeDrawable2.getPaint().setColor(this.a.f.getColor(R.color.progress_outline_color));
            shapeDrawable2.setBounds(width2, dimensionPixelSize2, width3, height);
            shapeDrawable2.draw(canvas);
            Arrays.fill(fArr, 0, 8, f - dimensionPixelSize3);
            drawable = null;
            shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
            shapeDrawable.setBounds(width2 + dimensionPixelSize3, dimensionPixelSize2 + dimensionPixelSize3, width3 - dimensionPixelSize3, height - dimensionPixelSize3);
        }
        shapeDrawable.draw(canvas);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable();
        shapeDrawable3.setShape(new OvalShape());
        if (!z) {
            shapeDrawable3.getPaint().setColor(-1);
        } else {
            shapeDrawable3.getPaint().setColor(this.a.f.getColor(R.color.progress_outline_color));
        }
        int dimensionPixelSize4 = this.a.f.getDimensionPixelSize(R.dimen.notification_progress_cap_size) / 2;
        int i2 = i + dimensionPixelSize2;
        a(shapeDrawable3, canvas, width, i2, dimensionPixelSize4);
        a(shapeDrawable3, canvas, width, canvas.getHeight() - i2, dimensionPixelSize4);
        int dimensionPixelSize5 = this.a.f.getDimensionPixelSize(R.dimen.notification_vehicle_circle_size);
        int dimensionPixelSize6 = this.a.f.getDimensionPixelSize(R.dimen.notification_vehicle_shadow_size);
        int height2 = canvas.getHeight();
        bzap bzapVar = this.a;
        int i3 = dimensionPixelSize5 / 2;
        int i4 = dimensionPixelSize2 + ((int) (((height2 - (dimensionPixelSize2 + dimensionPixelSize2)) - dimensionPixelSize5) * bzapVar.b)) + i3;
        if (bzapVar.d) {
            ShapeDrawable shapeDrawable4 = new ShapeDrawable();
            shapeDrawable4.setShape(new OvalShape());
            shapeDrawable4.getPaint().setColor(this.a.a);
            shapeDrawable4.setAlpha(38);
            a(shapeDrawable4, canvas, width, i4, this.a.f.getDimensionPixelSize(R.dimen.notification_vehicle_halo_size) / 2);
        }
        a(this.a.f.getDrawable(2131231689), canvas, width, i4, dimensionPixelSize6 / 2);
        shapeDrawable3.getPaint().setColor(-1);
        a(shapeDrawable3, canvas, width, i4, i3);
        int dimensionPixelSize7 = this.a.f.getDimensionPixelSize(R.dimen.notification_vehicle_icon_size);
        bzap bzapVar2 = this.a;
        String str = bzapVar2.c;
        if (str != null) {
            vtn vtnVar = bzapVar2.e;
            dbsk.s(vtnVar);
            drawable2 = vtnVar.b(str, vtj.TRANSIT_LIGHT, new vtl() { // from class: bzan
                @Override // defpackage.vtl
                public final void a(Drawable drawable3) {
                }
            });
        } else {
            drawable2 = drawable;
        }
        if (drawable2 == null) {
            return;
        }
        a(drawable2, canvas, width, i4, dimensionPixelSize7 / 2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }
}
