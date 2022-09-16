package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ListPopupWindow;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajyh  reason: default package */
/* loaded from: classes.dex */
public class ajyh implements View.OnClickListener, View.OnLongClickListener, ajyc {
    private final Context a;
    public final ajrg b;
    public final ajsm c;
    public final aakn d;
    public Object e;
    public acti f;
    public final lmm g;
    private final ajyz h;
    private final Object i;
    private volatile ListPopupWindow j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ajsa] */
    public ajyh(Context context, aafo aafoVar, ajyi ajyiVar, ajrh ajrhVar, lmm lmmVar, aakn aaknVar, ajyz ajyzVar) {
        aafoVar.getClass();
        context.getClass();
        ajyiVar.getClass();
        this.a = context;
        ajyiVar.a(aten.class);
        ajrg a = ajrhVar.a(ajyiVar.get());
        this.b = a;
        ajsm ajsmVar = new ajsm();
        this.c = ajsmVar;
        a.h(ajsmVar);
        this.g = lmmVar;
        this.d = aaknVar;
        this.h = ajyzVar;
        this.i = new Object();
        if (ajyg.a == null) {
            ajyg.a = new ajyg();
        }
        ajyg.a.b.put(this, null);
    }

    private final boolean b(atep atepVar, Object obj) {
        return atepVar != null && aolu.n(atepVar, obj, this.g, this.d);
    }

    public void a(atep atepVar, View view, Object obj, acti actiVar) {
        this.c.clear();
        this.c.addAll(aolu.m(atepVar, obj, this.g, this.d));
        this.e = obj;
        this.f = actiVar;
        ListPopupWindow i = i();
        i.setDropDownGravity(8388661);
        i.setAnchorView(view);
        i.show();
    }

    @Override // defpackage.ajyc
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.e);
        hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.f);
        return hashMap;
    }

    @Override // defpackage.ajyc
    public final void d(View view, atep atepVar, Object obj, acti actiVar) {
        ajyz ajyzVar;
        boolean b = b(atepVar, obj);
        view.setVisibility(true != b ? 8 : 0);
        view.setOnClickListener(this);
        view.setTag(R.id.innertube_menu_anchor_model, atepVar);
        view.setTag(R.id.innertube_menu_anchor_tag, obj);
        view.setTag(R.id.innertube_menu_anchor_interaction_logger, actiVar);
        view.setTag(R.id.innertube_menu_anchor_on_click_listener, this);
        if (!b || (ajyzVar = this.h) == null || ajyzVar.a.isEmpty()) {
            return;
        }
        for (ajyy ajyyVar : ajyzVar.a) {
            ajyyVar.b(atepVar, view);
        }
    }

    @Override // defpackage.ajyc
    public final void e(View view, View view2, atep atepVar, Object obj, acti actiVar) {
        view.getClass();
        d(view2, atepVar, obj, actiVar);
        if (view2.getTag(R.id.innertube_menu_anchor_touch_handler) == null) {
            view2.setTag(R.id.innertube_menu_anchor_touch_handler, new ajyf(view, view2));
        }
        if (!b(atepVar, obj) || !atepVar.f) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ajyd(this, view, atepVar, view2, obj, actiVar));
    }

    @Override // defpackage.ajyc
    public final void g(View view) {
        view.setOnClickListener(null);
        view.setTag(R.id.innertube_menu_anchor_model, null);
        view.setTag(R.id.innertube_menu_anchor_tag, null);
        view.setTag(R.id.innertube_menu_anchor_interaction_logger, null);
        view.setTag(R.id.innertube_menu_anchor_on_click_listener, null);
    }

    @Override // defpackage.ajyc
    public final void h() {
        ListPopupWindow i;
        synchronized (this.i) {
            if (this.j != null && (i = i()) != null) {
                i.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ListPopupWindow i() {
        if (this.j == null) {
            synchronized (this.i) {
                if (this.j == null) {
                    this.j = new ListPopupWindow(this.a);
                    this.j.setWidth(this.a.getResources().getDimensionPixelSize(R.dimen.innertube_menu_width));
                    this.j.setPromptPosition(1);
                    this.j.setInputMethodMode(2);
                    this.j.setModal(true);
                    this.j.setAdapter(this.b);
                }
            }
        }
        return this.j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        atep atepVar = (atep) view.getTag(R.id.innertube_menu_anchor_model);
        Object tag = view.getTag(R.id.innertube_menu_anchor_tag);
        Object tag2 = view.getTag(R.id.innertube_menu_anchor_interaction_logger);
        acti actiVar = tag2 instanceof acti ? (acti) tag2 : null;
        if (b(atepVar, tag)) {
            a(atepVar, view, tag, actiVar);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        atep atepVar = (atep) view.getTag(R.id.innertube_menu_anchor_model);
        Object tag = view.getTag(R.id.innertube_menu_anchor_tag);
        Object tag2 = view.getTag(R.id.innertube_menu_anchor_interaction_logger);
        acti actiVar = tag2 instanceof acti ? (acti) tag2 : null;
        if (b(atepVar, tag)) {
            a(atepVar, view, tag, actiVar);
            return true;
        }
        return false;
    }
}
