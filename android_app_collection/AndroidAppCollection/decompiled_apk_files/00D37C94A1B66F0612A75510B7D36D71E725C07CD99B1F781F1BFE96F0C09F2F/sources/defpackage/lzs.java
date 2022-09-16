package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lzs  reason: default package */
/* loaded from: classes3.dex */
public final class lzs {
    private final ajyc a;
    private final yzh b;

    public lzs(ajyc ajycVar, Context context) {
        this.a = ajycVar;
        this.b = new yzh(context);
    }

    public final void a(View view, ImageView imageView, atep atepVar, aqgw aqgwVar, Object obj, acti actiVar) {
        Context context = imageView.getContext();
        if (aqgwVar == null) {
            imageView.setImageDrawable(akf.a(context, R.drawable.contextual_menu_anchor));
        } else {
            Drawable a = akf.a(context, 2131231175);
            Drawable a2 = akf.a(context, 2131231176);
            Drawable b = this.b.b(a, aqgwVar.b);
            Drawable b2 = this.b.b(a2, aqgwVar.c);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842910, 16842919}, b2);
            stateListDrawable.addState(new int[]{16842910, 16842908}, b2);
            stateListDrawable.addState(new int[]{16842910, 16842913}, b2);
            stateListDrawable.addState(new int[]{16842910}, b);
            imageView.setImageDrawable(stateListDrawable);
        }
        this.a.e(view, imageView, atepVar, obj, actiVar);
    }
}
