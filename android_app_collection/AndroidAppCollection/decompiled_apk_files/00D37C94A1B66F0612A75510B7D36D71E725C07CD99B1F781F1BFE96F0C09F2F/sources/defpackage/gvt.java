package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.youtube.R;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gvt  reason: default package */
/* loaded from: classes3.dex */
public final class gvt implements hps {
    public static final actj a = actj.SHORTS_CREATION_TOOLBELT_EXPANDED_SCRIM_VIEW;
    public final apy b;
    public final gyq c;
    public final LinearLayout d;
    public final EditorButtonView e;
    public final EditorButtonView f;
    public final List g;
    public final List h;
    public final Map i;
    public final View[] j;
    public final View[] k;
    public final Handler l;
    public EditorButtonView m;
    final String n;
    public int o = 0;
    public boolean p;
    public boolean q;
    public final vne r;
    private final LinearLayout s;
    private final View t;
    private final View u;
    private final Map v;

    public gvt(apy apyVar, gyq gyqVar, vne vneVar, String str, View view, View[] viewArr) {
        this.b = apyVar;
        gyqVar.getClass();
        this.c = gyqVar;
        vneVar.getClass();
        this.r = vneVar;
        this.n = str;
        this.j = viewArr;
        this.k = new View[9];
        this.l = new Handler();
        this.p = true;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.v = new HashMap();
        this.i = new HashMap();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.shorts_camera_toolbar_buttons);
        this.d = linearLayout;
        this.s = (LinearLayout) linearLayout.findViewById(R.id.shorts_camera_toolbar_expanded_buttons);
        EditorButtonView editorButtonView = (EditorButtonView) linearLayout.findViewById(R.id.shorts_expandy_toolbar_more);
        this.e = editorButtonView;
        EditorButtonView editorButtonView2 = (EditorButtonView) view.findViewById(R.id.shorts_expandy_toolbar_collapse);
        this.f = editorButtonView2;
        this.t = view.findViewById(R.id.collapsed_toolbar_scrim);
        View findViewById = view.findViewById(R.id.expanded_toolbar_scrim);
        this.u = findViewById;
        editorButtonView.setOnClickListener(new gvo(this, gyqVar, 1));
        editorButtonView2.setOnClickListener(new gvo(this, gyqVar));
        findViewById.setOnClickListener(new gvo(this, gyqVar, 2));
        gyqVar.a(a).a();
        n(linearLayout);
        g();
        ylx.n(apyVar, vneVar.a(), etg.i, new gvp(this, 1));
    }

    public static TimeInterpolator a() {
        return new apo();
    }

    public static void j(vne vneVar, Map map) {
        vneVar.b(new znw(map, 1), anjk.a);
    }

    public static final boolean k(EditorButtonView editorButtonView) {
        return editorButtonView.getVisibility() == 0 && ((ViewGroup) editorButtonView.getParent()).getVisibility() == 0;
    }

    public static final void l(EditorButtonView editorButtonView) {
        gyy.b(editorButtonView.a, false);
    }

    public static final void m(EditorButtonView editorButtonView) {
        gyy.b(editorButtonView.a, true);
    }

    private final void n(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof EditorButtonView) {
                EditorButtonView editorButtonView = (EditorButtonView) viewGroup.getChildAt(i);
                editorButtonView.c = this;
                if (editorButtonView.d != null) {
                    boolean k = k(editorButtonView);
                    this.v.put(editorButtonView, Boolean.valueOf(k));
                    gyo a2 = this.c.a(editorButtonView.d);
                    a2.h(k);
                    a2.a();
                }
                if (viewGroup == this.d) {
                    this.g.add(editorButtonView);
                } else {
                    this.h.add(editorButtonView);
                }
            } else if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                n((ViewGroup) viewGroup.getChildAt(i));
            }
        }
    }

    public final void d(EditorButtonView editorButtonView) {
        boolean k = k(editorButtonView);
        if (editorButtonView.d == null || !this.v.containsKey(editorButtonView) || k == ((Boolean) this.v.get(editorButtonView)).booleanValue()) {
            return;
        }
        this.v.put(editorButtonView, Boolean.valueOf(k));
        gyo a2 = this.c.a(editorButtonView.d);
        a2.h(k);
        a2.g();
    }

    public final void e() {
        this.c.a(a).d();
        this.o = 0;
        int[] iArr = new int[2];
        this.f.getLocationOnScreen(iArr);
        h(0.0f);
        f(iArr[1]);
        b(false, this.p);
        c();
        gyy.c(this.k);
    }

    public final void f(final float f) {
        int i = this.o;
        if (i != 0) {
            for (EditorButtonView editorButtonView : this.h) {
                if (editorButtonView.getVisibility() == 0 && editorButtonView != this.f) {
                    editorButtonView.setAlpha(0.0f);
                }
            }
        }
        final EditorButtonView editorButtonView2 = i != 0 ? this.f : this.e;
        editorButtonView2.setAlpha(0.0f);
        this.s.setVisibility(1 != i ? 8 : 0);
        this.d.post(new Runnable() { // from class: gvl
            @Override // java.lang.Runnable
            public final void run() {
                gvt gvtVar = gvt.this;
                EditorButtonView editorButtonView3 = editorButtonView2;
                float f2 = f;
                EditorButtonView editorButtonView4 = gvtVar.m;
                if (editorButtonView4 != null) {
                    editorButtonView4.clearAnimation();
                    ImageView imageView = gvtVar.m.b;
                    if (imageView != null) {
                        imageView.clearAnimation();
                    }
                }
                editorButtonView3.getClass();
                gvtVar.m = editorButtonView3;
                int[] iArr = new int[2];
                gvtVar.m.getLocationOnScreen(iArr);
                gvtVar.m.setTranslationY(f2 - iArr[1]);
                gvtVar.m.setAlpha(1.0f);
                gvtVar.m.animate().translationY(0.0f).setInterpolator(gvt.a()).setDuration(200L).start();
                EditorButtonView editorButtonView5 = gvtVar.m;
                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) editorButtonView5.getResources().getDrawable(editorButtonView5 == gvtVar.f ? R.drawable.ic_expandy_collapse_anim : R.drawable.ic_expandy_expand_anim);
                gvtVar.m.b.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
            }
        });
        for (EditorButtonView editorButtonView3 : this.h) {
            d(editorButtonView3);
        }
    }

    public final void g() {
        h(1.0f);
    }

    final void h(float f) {
        this.e.setAlpha(1.0f);
        if (this.o == 1) {
            this.e.setVisibility(8);
            return;
        }
        for (EditorButtonView editorButtonView : this.h) {
            if (editorButtonView != this.f && editorButtonView.getVisibility() == 0) {
                this.e.setAlpha(f);
                this.e.setVisibility(0);
                i();
                return;
            }
        }
        this.e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        Iterator it = this.g.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            EditorButtonView editorButtonView = (EditorButtonView) it.next();
            String str = editorButtonView.e;
            if (str != null) {
                if (((Integer) Map.EL.getOrDefault(this.i, str, 0)).intValue() == 2) {
                    z = false;
                }
                editorButtonView.d(z);
            }
        }
        boolean z2 = false;
        for (EditorButtonView editorButtonView2 : this.h) {
            String str2 = editorButtonView2.e;
            if (str2 != null) {
                int intValue = ((Integer) Map.EL.getOrDefault(this.i, str2, 0)).intValue();
                if (intValue == 2) {
                    editorButtonView2.d(false);
                } else {
                    editorButtonView2.d(true);
                    if (intValue == 0 && editorButtonView2.getVisibility() == 0) {
                        z2 = true;
                    }
                }
            }
        }
        this.e.d(z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(final boolean z, boolean z2) {
        this.q = z || !z2;
        ArrayList arrayList = new ArrayList();
        if (z || z2) {
            for (EditorButtonView editorButtonView : this.g) {
                if (editorButtonView.getVisibility() == 0) {
                    arrayList.add(new Pair(editorButtonView, false));
                }
            }
        } else if (!this.g.isEmpty()) {
            arrayList.add(new Pair((EditorButtonView) this.g.get(0), false));
        }
        for (EditorButtonView editorButtonView2 : this.h) {
            if (editorButtonView2.getVisibility() == 0) {
                arrayList.add(new Pair(editorButtonView2, Boolean.valueOf(editorButtonView2 != this.f && z)));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 8;
        if (!z) {
            Collections.reverse(arrayList);
            this.e.a.setVisibility(8);
        }
        TimeInterpolator a2 = a();
        float size = 1.0f / arrayList.size();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int round = Math.round(a2.getInterpolation(i2 * size) * 200.0f);
            boolean booleanValue = ((Boolean) ((Pair) arrayList.get(i2)).second).booleanValue();
            final View view = booleanValue ? (View) ((Pair) arrayList.get(i2)).first : ((EditorButtonView) ((Pair) arrayList.get(i2)).first).a;
            if ((!z || view.getAlpha() != 1.0f || view.getVisibility() != 0) && (z || view.getVisibility() != i)) {
                float f = 0.0f;
                view.setAlpha(true != z ? 1.0f : 0.0f);
                view.setVisibility(0);
                if (booleanValue) {
                    ((EditorButtonView) view).a.setVisibility(0);
                }
                ViewPropertyAnimator animate = view.animate();
                if (true == z) {
                    f = 1.0f;
                }
                animate.alpha(f).setDuration(150L).setStartDelay(round).withEndAction(new Runnable() { // from class: gvn
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z3 = z;
                        View view2 = view;
                        actj actjVar = gvt.a;
                        if (!z3) {
                            view2.setVisibility(8);
                            view2.setAlpha(1.0f);
                        }
                    }
                }).start();
            }
            i2++;
            i = 8;
        }
        if (z || z2) {
            return;
        }
        TextView textView = this.e.a;
        textView.setAlpha(1.0f);
        textView.setVisibility(0);
        textView.animate().alpha(1.0f).setDuration(150L).setStartDelay(200L).start();
    }

    public final void c() {
        int i = this.o;
        View view = i == 0 ? this.u : this.t;
        View view2 = i == 0 ? this.t : this.u;
        view.animate().cancel();
        view.animate().alpha(0.0f).setDuration(200L).setListener(new gvr(view)).start();
        view2.animate().cancel();
        view2.animate().alpha(1.0f).setDuration(200L).setListener(new gvs(view2)).start();
    }
}
