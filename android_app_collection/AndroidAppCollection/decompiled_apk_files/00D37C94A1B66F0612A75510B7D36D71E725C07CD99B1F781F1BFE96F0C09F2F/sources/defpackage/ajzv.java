package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListPopupWindow;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajzv  reason: default package */
/* loaded from: classes.dex */
public class ajzv extends ajyh {
    private final FrameLayout a;
    private final Context h;

    public ajzv(Context context, aafo aafoVar, ajyi ajyiVar, ajrh ajrhVar, lmm lmmVar, aakn aaknVar, ajyz ajyzVar) {
        super(context, aafoVar, ajyiVar, ajrhVar, lmmVar, aaknVar, ajyzVar);
        this.h = context;
        this.a = new FrameLayout(context);
    }

    @Override // defpackage.ajyh
    public void a(atep atepVar, View view, Object obj, acti actiVar) {
        ajsm ajsmVar = this.c;
        ListPopupWindow i = i();
        ajsmVar.clear();
        ajsmVar.addAll(aolu.m(atepVar, obj, this.g, this.d));
        this.e = obj;
        this.f = actiVar;
        int c = zag.c(this.h, this.b, this.a);
        i.setWidth((int) zag.a(this.h, c, this.h.getResources().getDimension(R.dimen.innertube_menu_width_increment_dp)));
        i.setDropDownGravity(8388661);
        i.setAnchorView(view);
        i.show();
    }
}
