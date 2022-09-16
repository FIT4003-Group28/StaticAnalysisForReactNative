package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
/* compiled from: PG */
/* renamed from: mxd  reason: default package */
/* loaded from: classes3.dex */
public class mxd {
    protected final View a;
    protected final View b;
    protected final TextView c;
    protected final TextView d;
    protected final View e;
    protected final View f;
    protected final View g;
    protected final View h;
    protected final GradientDrawable i;
    protected final Drawable j;
    protected final LayerDrawable k;
    protected boolean l;
    private final Context m;
    private final ajyc n;
    private final boolean o;
    private final akem p;

    /* JADX INFO: Access modifiers changed from: protected */
    public mxd(Context context, ajyc ajycVar, View view, View view2, boolean z, akem akemVar) {
        this.n = ajycVar;
        this.a = view;
        this.b = view2;
        this.m = context;
        this.o = z;
        this.p = akemVar;
        view2.findViewById(R.id.content_background);
        this.c = (TextView) view2.findViewById(R.id.title);
        this.d = (TextView) view2.findViewById(R.id.description);
        this.e = view2.findViewById(R.id.ad_attribution);
        View findViewById = view2.findViewById(R.id.close_button);
        this.f = findViewById;
        this.g = view2.findViewById(R.id.contextual_menu_anchor);
        this.h = view2.findViewById(R.id.static_contextual_menu_anchor);
        zag.k(view2, null);
        findViewById.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.i = gradientDrawable;
        gradientDrawable.setShape(0);
        Drawable e = zag.e(view2.getContext(), 0);
        this.j = e;
        this.k = new LayerDrawable(new Drawable[]{gradientDrawable, e});
    }

    private final void a(acti actiVar, Object obj, boolean z, View view, atep atepVar) {
        Context context;
        if (atepVar == null || z) {
            return;
        }
        this.n.e(this.a, view, atepVar, obj, actiVar);
        if (this.o && (context = this.m) != null && nfj.a(context)) {
            return;
        }
        view.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(acti actiVar, Object obj, auhs auhsVar) {
        arag aragVar;
        auhsVar.getClass();
        atep atepVar = null;
        if ((auhsVar.b & 1) != 0) {
            aragVar = auhsVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        aunb aunbVar = auhsVar.m;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aunbVar.qn(ButtonRendererOuterClass.buttonRenderer);
        aunb aunbVar2 = auhsVar.m;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(MenuRendererOuterClass.menuRenderer)) {
            aunb aunbVar3 = auhsVar.m;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            atepVar = (atep) aunbVar3.qm(MenuRendererOuterClass.menuRenderer);
        }
        e(actiVar, obj, b, null, null, false, atepVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(acti actiVar, Object obj, auik auikVar, atng atngVar) {
        arag aragVar;
        arag aragVar2;
        auikVar.getClass();
        auhy auhyVar = null;
        if ((auikVar.b & 8) != 0) {
            aragVar = auikVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((auikVar.b & 16) != 0) {
            aragVar2 = auikVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        if ((auikVar.b & 131072) != 0 && (auhyVar = auikVar.u) == null) {
            auhyVar = auhy.a;
        }
        auhy auhyVar2 = auhyVar;
        aunb aunbVar = auikVar.p;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        boolean z = aunbVar.qn(ButtonRendererOuterClass.buttonRenderer) && atngVar != null;
        aunb aunbVar2 = auikVar.p;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        e(actiVar, obj, b, b2, auhyVar2, z, (atep) ajjh.l(aunbVar2, MenuRendererOuterClass.menuRenderer));
    }

    public final void e(acti actiVar, Object obj, Spanned spanned, Spanned spanned2, auhy auhyVar, boolean z, atep atepVar) {
        zag.m(this.c, spanned);
        if (TextUtils.isEmpty(spanned)) {
            this.c.setText((CharSequence) null);
        }
        TextView textView = this.d;
        if (textView != null) {
            zag.m(textView, spanned2);
            if (TextUtils.isEmpty(spanned2)) {
                this.d.setText((CharSequence) null);
            }
        }
        boolean z2 = true;
        if (auhyVar != null) {
            this.i.setColor(auhyVar.b);
            this.l = true;
            f(true);
        } else {
            this.l = false;
            f(true);
        }
        zag.o(this.f, z);
        View view = this.g;
        if (view != null) {
            a(actiVar, obj, z, view, atepVar);
            zag.o(this.g, false);
        }
        View view2 = this.h;
        if (view2 != null) {
            a(actiVar, obj, z, view2, atepVar);
            View view3 = this.h;
            if (atepVar == null || z) {
                z2 = false;
            }
            zag.o(view3, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(boolean z) {
        GradientDrawable gradientDrawable = null;
        if (!z) {
            View view = this.b;
            if (this.l) {
                gradientDrawable = this.i;
            }
            zav.c(view, gradientDrawable);
        } else if (this.p.d()) {
            akem akemVar = this.p;
            View view2 = this.b;
            if (this.l) {
                gradientDrawable = this.i;
            }
            akemVar.b(view2, akemVar.a(view2, gradientDrawable));
        } else {
            zav.c(this.b, this.l ? this.k : this.j);
        }
    }
}
