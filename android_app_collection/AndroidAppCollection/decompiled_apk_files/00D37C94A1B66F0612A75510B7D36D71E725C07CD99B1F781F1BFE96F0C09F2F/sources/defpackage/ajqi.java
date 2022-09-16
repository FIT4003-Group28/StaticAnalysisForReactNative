package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: ajqi  reason: default package */
/* loaded from: classes.dex */
public abstract class ajqi {
    private final Context a;
    private final ajsa b;
    private final Queue c;
    private final Queue d;

    public ajqi(Context context, ajsa ajsaVar) {
        context.getClass();
        this.a = context;
        ajsaVar.getClass();
        this.b = ajsaVar;
        this.c = new LinkedList();
        this.d = new LinkedList();
    }

    protected abstract ViewGroup a(Context context);

    @Deprecated
    public final View c(ajrs ajrsVar, Object obj) {
        return f(ajrsVar, obj, null);
    }

    public final ajrs d(ajrs ajrsVar) {
        ajrs ajrsVar2 = (ajrs) this.d.poll();
        if (ajrsVar2 == null) {
            return new ajrs(ajrsVar);
        }
        ajrsVar2.i(ajrsVar);
        return ajrsVar2;
    }

    public final void e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                View childAt2 = viewGroup2.getChildAt(0);
                if (childAt2 != null) {
                    viewGroup2.removeAllViews();
                    ajrs f = akel.f(childAt2);
                    if (f != null) {
                        f.h();
                        this.d.add(f);
                        akel.l(childAt2, null);
                    }
                    this.b.b(childAt2);
                }
                this.c.add(viewGroup2);
            }
        }
        viewGroup.removeAllViews();
    }

    public final View f(ajrs ajrsVar, Object obj, ViewGroup viewGroup) {
        View view;
        ViewGroup viewGroup2 = (ViewGroup) this.c.poll();
        if (viewGroup2 == null) {
            viewGroup2 = a(this.a);
        }
        if (obj != null) {
            int c = this.b.c(obj);
            ajru e = this.b.e(c, viewGroup);
            if (e == null) {
                view = null;
            } else {
                e.oK(ajrsVar, obj);
                View a = e.a();
                akel.n(a, e, c);
                akel.l(a, ajrsVar);
                view = a;
            }
            if (view != null) {
                viewGroup2.addView(view, -1, -2);
            }
        }
        return viewGroup2;
    }
}
