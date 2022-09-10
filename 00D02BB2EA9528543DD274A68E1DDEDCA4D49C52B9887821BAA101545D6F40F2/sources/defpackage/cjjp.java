package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: cjjp  reason: default package */
/* loaded from: classes4.dex */
public final class cjjp extends PopupWindow {
    public final Rect a;
    public final boolean b;
    public final cjjw c;
    public final cjjn d;
    private final cjjr e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjjp(Context context, cjjq cjjqVar, cjju cjjuVar) {
        super(-2, -2);
        dzvx.c(context, "context");
        dzvx.c(cjjqVar, "theme");
        dzvx.c(cjjuVar, "calloutContent");
        this.a = new Rect();
        cjjr a = cjjqVar.a(context);
        this.e = a;
        boolean z = Build.VERSION.SDK_INT >= 23 && cjjqVar == cjjq.TOOLTIP;
        this.b = z;
        this.c = new cjjw(a, cjjqVar.c);
        cjjn cjjnVar = new cjjn(context, null, 0, a, 6);
        cjjnVar.setContent(cjjuVar);
        cjjnVar.setOnClose(new cjjo(this));
        setContentView(cjjnVar);
        this.d = cjjnVar;
        setFocusable(cjjqVar == cjjq.CALLOUT);
        setOutsideTouchable(!isFocusable());
        setBackgroundDrawable(new ColorDrawable(0));
        setSoftInputMode(3);
        if (z) {
            setEnterTransition(cjjnVar.e);
            setExitTransition(cjjnVar.f);
            return;
        }
        setAnimationStyle(16973826);
    }
}
