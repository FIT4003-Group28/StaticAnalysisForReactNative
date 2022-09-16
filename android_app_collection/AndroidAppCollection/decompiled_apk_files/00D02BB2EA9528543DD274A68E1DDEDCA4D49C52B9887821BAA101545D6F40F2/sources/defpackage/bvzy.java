package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
/* compiled from: PG */
/* renamed from: bvzy  reason: default package */
/* loaded from: classes4.dex */
public final class bvzy extends bvwl<dmfk, dmfm> {
    private final gga c;
    private final dbty<dbsg<WindowInsets>> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvzy(gga ggaVar) {
        super(dmfk.b, dmfm.g);
        dbty<dbsg<WindowInsets>> dbtyVar;
        if (Build.VERSION.SDK_INT >= 23) {
            final View findViewById = ggaVar.findViewById(16908290);
            dbtyVar = new dbty(findViewById) { // from class: bvzw
                private final View a;

                {
                    this.a = findViewById;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return dbsg.i(this.a.getRootWindowInsets());
                }
            };
        } else {
            dbtyVar = bvzx.a;
        }
        this.c = ggaVar;
        this.d = dbtyVar;
    }

    @Override // defpackage.bvwl
    public final /* bridge */ /* synthetic */ dmfm g(dmfk dmfkVar) {
        dbsg<WindowInsets> a = this.d.a();
        if (!a.a()) {
            return dmfm.f;
        }
        WindowInsets b = a.b();
        int systemWindowInsetTop = b.getSystemWindowInsetTop();
        int systemWindowInsetBottom = b.getSystemWindowInsetBottom();
        int systemWindowInsetLeft = b.getSystemWindowInsetLeft();
        int systemWindowInsetRight = b.getSystemWindowInsetRight();
        ViewGroup viewGroup = (ViewGroup) this.c.getWindow().getDecorView();
        Rect rect = new Rect();
        viewGroup.getDrawingRect(rect);
        View findViewById = this.c.findViewById(16908290);
        Rect rect2 = new Rect();
        findViewById.getDrawingRect(rect2);
        viewGroup.offsetDescendantRectToMyCoords(findViewById, rect2);
        double d = this.c.getResources().getDisplayMetrics().densityDpi / 160.0f;
        dmfl bZ = dmfm.f.bZ();
        double max = Math.max(0, systemWindowInsetTop - rect2.top);
        Double.isNaN(max);
        Double.isNaN(d);
        double d2 = max / d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmfm dmfmVar = (dmfm) bZ.b;
        dmfmVar.a |= 8;
        dmfmVar.e = d2;
        double max2 = Math.max(0, systemWindowInsetBottom - (rect.height() - rect2.bottom));
        Double.isNaN(max2);
        Double.isNaN(d);
        double d3 = max2 / d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmfm dmfmVar2 = (dmfm) bZ.b;
        dmfmVar2.a |= 1;
        dmfmVar2.b = d3;
        double max3 = Math.max(0, systemWindowInsetLeft - rect2.left);
        Double.isNaN(max3);
        Double.isNaN(d);
        double d4 = max3 / d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmfm dmfmVar3 = (dmfm) bZ.b;
        dmfmVar3.a |= 2;
        dmfmVar3.c = d4;
        double max4 = Math.max(0, systemWindowInsetRight - (rect.width() - rect2.right));
        Double.isNaN(max4);
        Double.isNaN(d);
        double d5 = max4 / d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmfm dmfmVar4 = (dmfm) bZ.b;
        dmfmVar4.a |= 4;
        dmfmVar4.d = d5;
        return bZ.bK();
    }
}
