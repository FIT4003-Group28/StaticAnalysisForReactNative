package com.facebook.react.uimanager.c;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ap;
/* compiled from: LayoutAnimationController.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final a f3852a = new i();

    /* renamed from: b  reason: collision with root package name */
    private final a f3853b = new k();

    /* renamed from: c  reason: collision with root package name */
    private final a f3854c = new j();

    /* renamed from: d  reason: collision with root package name */
    private boolean f3855d;

    public void a(an anVar) {
        if (anVar == null) {
            a();
            return;
        }
        int i = 0;
        this.f3855d = false;
        if (anVar.hasKey("duration")) {
            i = anVar.getInt("duration");
        }
        if (anVar.hasKey(h.CREATE.toString())) {
            this.f3852a.a(anVar.d(h.CREATE.toString()), i);
            this.f3855d = true;
        }
        if (anVar.hasKey(h.UPDATE.toString())) {
            this.f3853b.a(anVar.d(h.UPDATE.toString()), i);
            this.f3855d = true;
        }
        if (!anVar.hasKey(h.DELETE.toString())) {
            return;
        }
        this.f3854c.a(anVar.d(h.DELETE.toString()), i);
        this.f3855d = true;
    }

    public void a() {
        this.f3852a.b();
        this.f3853b.b();
        this.f3854c.b();
        this.f3855d = false;
    }

    public boolean a(View view) {
        return this.f3855d && view.getParent() != null;
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        ap.b();
        Animation b2 = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.f3852a : this.f3853b).b(view, i, i2, i3, i4);
        if (b2 == null || !(b2 instanceof d)) {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
        if (b2 != null) {
            view.startAnimation(b2);
        }
    }

    public void a(View view, final g gVar) {
        ap.b();
        Animation b2 = this.f3854c.b(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (b2 != null) {
            b(view);
            b2.setAnimationListener(new Animation.AnimationListener() { // from class: com.facebook.react.uimanager.c.f.1
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    gVar.a();
                }
            });
            view.startAnimation(b2);
            return;
        }
        gVar.a();
    }

    private void b(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                b(viewGroup.getChildAt(i));
            }
        }
    }
}
