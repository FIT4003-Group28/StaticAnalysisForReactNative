package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: sfu  reason: default package */
/* loaded from: classes4.dex */
public final class sfu {
    public final PopupWindow a;
    public final sfs b;
    public final View c;
    public final sbz d = new sbz();
    public final sbz e = new sbz();

    public sfu(View view) {
        this.c = view;
        sfs sfsVar = new sfs(view.getContext());
        this.b = sfsVar;
        PopupWindow popupWindow = new PopupWindow(sfsVar, -2, -2);
        this.a = popupWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(false);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void a(sfr sfrVar) {
        sfs sfsVar = this.b;
        sfsVar.d = sfrVar.a;
        sfsVar.e = sfrVar.b;
        sfsVar.f = sfrVar.c;
        sfsVar.b.setColor(sfrVar.d);
        sfsVar.a.setColor(sfrVar.e);
        sfsVar.b.clearShadowLayer();
        sfsVar.setLayerType(0, null);
        int ceil = (int) Math.ceil(sfsVar.f);
        sfsVar.setPadding(Math.abs(Math.min(0, 0)) + ceil, Math.abs(Math.min(0, 0)) + ceil, Math.max(0, 0) + ceil, ceil + Math.max(0, 0));
        sfsVar.c = new Paint();
        sfsVar.c.set(sfsVar.b);
        sfsVar.c.setStyle(Paint.Style.STROKE);
        sfsVar.c.clearShadowLayer();
        PopupWindow popupWindow = this.a;
        int i = sfrVar.f;
        popupWindow.setAnimationStyle(-1);
    }

    public final void b() {
        this.a.dismiss();
    }

    public final void c(int i) {
        this.b.g = i;
    }
}
