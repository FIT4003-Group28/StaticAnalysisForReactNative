package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.PopupWindow;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajih  reason: default package */
/* loaded from: classes.dex */
public final class ajih implements srx {
    public final aypf a = new aypf();
    PopupWindow b;
    private final Context c;
    private final axnm d;

    public ajih(Context context, axnm axnmVar) {
        this.c = context;
        this.d = axnmVar;
    }

    private static int c(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i == -2 ? 0 : 1073741824);
    }

    @Override // defpackage.srx
    public final void a() {
        PopupWindow popupWindow = this.b;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
    }

    @Override // defpackage.srx
    public final void b(awnn awnnVar, View view) {
        a();
        dci dciVar = new dci(this.c);
        cyv cyvVar = dciVar.t;
        swq swqVar = (swq) this.d.get();
        tcz a = tda.a();
        a.a = dciVar;
        cyr a2 = swqVar.a(cyvVar, a.a(), awnnVar.toByteArray(), null, this.a);
        ComponentTree componentTree = dciVar.r;
        if (componentTree == null) {
            dciVar.G(ComponentTree.c(dciVar.t, a2).a());
        } else if (a2 == null) {
            throw new IllegalArgumentException("Root component can't be null");
        } else {
            componentTree.x(a2, -1, -1, false, null, 0, null);
        }
        dciVar.setBackgroundColor(zhn.d(this.c, R.attr.ytBrandBackgroundSolid));
        PopupWindow popupWindow = new PopupWindow((View) dciVar, -2, -2, true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        popupWindow.setElevation(TypedValue.applyDimension(1, 3.0f, this.c.getResources().getDisplayMetrics()));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: ajig
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ajih ajihVar = ajih.this;
                if (ajihVar.b != null) {
                    ajihVar.b = null;
                    ajihVar.a.c();
                }
            }
        });
        popupWindow.setAnimationStyle(16973826);
        dciVar.measure(c(popupWindow.getWidth()), c(popupWindow.getHeight()));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        popupWindow.showAtLocation(view, 0, rect.right - dciVar.getMeasuredWidth(), rect.top - 15);
        this.b = popupWindow;
    }
}
