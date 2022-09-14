package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
/* compiled from: PG */
/* renamed from: npb  reason: default package */
/* loaded from: classes7.dex */
public final class npb implements nou, not {
    public final LayoutTransition a;
    public final RelativeLayout b;
    private final ViewGroup c;
    @dzsi
    private View d;

    public npb(Context context, ViewGroup viewGroup) {
        LayoutTransition b = nod.b();
        this.a = b;
        dbsk.s(viewGroup);
        this.c = viewGroup;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.b = relativeLayout;
        relativeLayout.setLayoutTransition(b);
        relativeLayout.setFitsSystemWindows(true);
        relativeLayout.setClipToPadding(false);
    }

    private static void d(ViewGroup viewGroup) {
        viewGroup.setLayoutTransition(null);
    }

    private static void e(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    @Override // defpackage.not
    public final /* bridge */ /* synthetic */ ViewGroup a() {
        return this.b;
    }

    @Override // defpackage.not
    public final void b(noe noeVar, View view) {
        dbsk.s(view);
        boolean z = true;
        if (!noeVar.b && !this.c.hasFocus()) {
            z = false;
        }
        nou nouVar = noeVar.a;
        if (nouVar != this) {
            if (nouVar != null) {
                nouVar.c();
            }
            this.d = null;
        }
        ViewParent parent = this.b.getParent();
        ViewGroup viewGroup = this.c;
        if (parent != viewGroup) {
            d(viewGroup);
            this.c.addView(this.b);
        }
        ayn c = nod.c(nrk.a, this.d);
        d(this.b);
        c.A(new npa(this));
        ayr.b(this.b, c);
        e(view);
        this.b.addView(view);
        this.b.requestApplyInsets();
        if (z) {
            nol.b(view);
        }
        View view2 = this.d;
        if (view2 != null) {
            e(view2);
        }
        this.d = view;
        noeVar.a(this);
    }

    @Override // defpackage.nou
    public final void c() {
        View view = this.d;
        if (view != null) {
            e(view);
            e(this.b);
            this.d = null;
        }
    }
}
