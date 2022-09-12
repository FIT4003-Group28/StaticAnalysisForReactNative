package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: hxg  reason: default package */
/* loaded from: classes6.dex */
public final class hxg extends FrameLayout {
    public final ModAppBar a;
    private final ViewGroup b;
    private final boolean c;
    private hxp d;

    public hxg(Context context) {
        this(context, null, true);
    }

    public void setToolbarProperties(jib jibVar) {
        if (this.c && jibVar != null) {
            jhz e = jibVar.e();
            e.w = true;
            jibVar = e.b();
        }
        this.a.setToolbarProperties(jibVar);
    }

    public hxg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, true);
    }

    private hxg(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        inflate(context, true != z ? R.layout.mod_app_bar_fullscreen_view_internal : R.layout.mod_app_bar_fullscreen_scrollable_view_internal, this);
        setBackgroundColor(ibm.b().b(context));
        this.a = (ModAppBar) findViewById(R.id.mod_app_bar);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.mod_app_bar_fullscreen_content_view);
        this.b = viewGroup;
        viewGroup.setBackgroundColor(ibm.b().b(context));
        this.c = z;
    }

    public void setContentView(View view) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        hxp hxpVar;
        if (!this.c && (recyclerView2 = (RecyclerView) this.b.findViewById(R.id.mod_app_bar_lift_on_scroll_recycler_view)) != null && (hxpVar = this.d) != null) {
            recyclerView2.j(hxpVar);
            this.d = null;
        }
        this.b.removeAllViews();
        if (view != null) {
            this.b.addView(view);
            if (this.c || (recyclerView = (RecyclerView) this.b.findViewById(R.id.mod_app_bar_lift_on_scroll_recycler_view)) == null) {
                return;
            }
            hxp hxpVar2 = new hxp(this.a);
            this.d = hxpVar2;
            recyclerView.i(hxpVar2);
        }
    }

    public hxg(Context context, boolean z) {
        this(context, null, z);
    }
}
