package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: blkh  reason: default package */
/* loaded from: classes3.dex */
public final class blkh {
    public final bkpj a;
    public final blij b;
    public final boolean c;
    @dzsi
    public RecyclerView e;
    public final Rect d = new Rect();
    public final View.OnAttachStateChangeListener f = new blkb(this);
    public final ViewGroup.OnHierarchyChangeListener g = new blkd(this);
    public final View.AccessibilityDelegate h = new blke(this);
    public final cqqw i = new blkg(this);

    public blkh(Activity activity, cpv cpvVar, bkpj bkpjVar, blij blijVar) {
        this.a = bkpjVar;
        this.b = blijVar;
        this.c = cpvVar.e(activity);
    }

    public static void a(View view, dbrn<View, Boolean> dbrnVar) {
        if (dbrnVar.a(view).booleanValue() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), dbrnVar);
            }
        }
    }
}
