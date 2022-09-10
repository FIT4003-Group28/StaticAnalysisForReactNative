package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ztm  reason: default package */
/* loaded from: classes7.dex */
public final class ztm extends cqtd {
    private final doxf a;
    private final amtf b;
    private final dcdc<Integer> c;
    private final int d;
    private final CharSequence e;
    private final CharSequence f;
    private ztl h;

    public ztm(doxf doxfVar, amtf amtfVar, dcdc<Integer> dcdcVar, int i, CharSequence charSequence, CharSequence charSequence2) {
        super(new Object[]{doxfVar, amtfVar, dcdcVar, Integer.valueOf(i), charSequence, charSequence2});
        this.a = doxfVar;
        this.b = amtfVar;
        this.c = dcdcVar;
        this.d = i;
        this.e = charSequence;
        this.f = charSequence2;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        if (this.h == null) {
            Resources resources = context.getResources();
            int color = resources.getColor(R.color.mod_daynight_blue500);
            float dimension = resources.getDimension(R.dimen.directions_elevation_chart_stroke_width);
            int color2 = resources.getColor(R.color.mod_daynight_blue50);
            int color3 = resources.getColor(R.color.mod_daynight_grey600);
            float dimension2 = resources.getDimension(R.dimen.directions_elevation_chart_waypoint_stroke_width);
            int color4 = resources.getColor(R.color.mod_daynight_white);
            int color5 = resources.getColor(R.color.mod_daynight_grey650);
            float dimension3 = resources.getDimension(R.dimen.text_size_xmicro);
            float dimension4 = resources.getDimension(R.dimen.directions_elevation_chart_waypoint_radius);
            vuk vukVar = new vuk();
            vuo vuoVar = new vuo();
            vukVar.a(0.0f, this.b.c);
            amtf amtfVar = this.b;
            int i = amtfVar.b;
            if (i > 0 && i < 10) {
                i = 0;
            }
            int i2 = amtfVar.a;
            int i3 = this.d;
            if (i2 - i < i3) {
                i2 = i + i3;
            }
            vuoVar.a(i, i2);
            ztl ztlVar = new ztl(resources, vukVar, vuoVar);
            ztlVar.e.setColor(color2);
            ztlVar.f = ztlVar.e.getAlpha();
            ztlVar.g.setColor(color);
            ztlVar.g.setStrokeWidth(dimension);
            ztlVar.j.setColor(color4);
            ztlVar.i.setColor(color3);
            ztlVar.i.setStrokeWidth(dimension2);
            ztlVar.k = dimension4;
            ztlVar.l = 2.5f * dimension4;
            ztlVar.m = this.c;
            ztlVar.h.setColor(color5);
            ztlVar.h.setTextSize(dimension3);
            double d = dimension4;
            double d2 = dimension2;
            Double.isNaN(d2);
            Double.isNaN(d);
            int ceil = (int) Math.ceil(d + (d2 / 2.0d));
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.directions_elevation_chart_top_padding);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.directions_elevation_chart_bottom_padding);
            ztlVar.o = ceil;
            ztlVar.p = ceil;
            ztlVar.q = dimensionPixelSize;
            ztlVar.r = dimensionPixelSize2;
            ztlVar.d();
            ztlVar.u = bvox.b(context);
            doxf doxfVar = this.a;
            CharSequence charSequence = this.e;
            CharSequence charSequence2 = this.f;
            if (!amtg.a(doxfVar)) {
                bvoo.h("No elevation chart data.", new Object[0]);
            } else {
                ztlVar.n = new ztk(doxfVar, charSequence, charSequence2);
                ztk ztkVar = ztlVar.n;
                ztlVar.h.getTextBounds(ztkVar.c.toString(), 0, ztkVar.c.length(), ztlVar.c);
                ztlVar.h.getTextBounds(ztkVar.b.toString(), 0, ztkVar.b.length(), ztlVar.b);
                ztlVar.d();
            }
            ztlVar.a(1.0f);
            this.h = ztlVar;
        }
        return this.h;
    }

    public final void c(int i) {
        ztl ztlVar = this.h;
        if (ztlVar != null) {
            ztlVar.t = ztlVar.c(i);
            this.h.invalidateSelf();
        }
    }
}
