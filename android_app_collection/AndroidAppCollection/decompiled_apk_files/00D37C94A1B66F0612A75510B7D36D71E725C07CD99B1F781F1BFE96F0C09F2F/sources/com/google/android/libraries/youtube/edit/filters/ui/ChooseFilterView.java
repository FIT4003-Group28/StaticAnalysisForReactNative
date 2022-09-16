package com.google.android.libraries.youtube.edit.filters.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ChooseFilterView extends LinearLayout {
    public final zuk a;
    public final LinearLayout b;
    public HorizontalScrollView c;
    public ztr d;
    public zrj e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ValueAnimator i;
    public apy j;

    public ChooseFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        LayoutInflater.from(context).inflate(R.layout.choose_asset_view, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zni.a, 0, 0);
        int i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        int i2 = i != 1 ? i != 2 ? i != 3 ? R.layout.choose_filter_list_item : R.layout.choose_filter_list_item_shorts_camera_preset : R.layout.choose_filter_list_item_camera_preset : R.layout.choose_filter_list_item_camera;
        this.d = new ztr(this);
        this.a = new zuk(getContext(), i2);
        this.b = (LinearLayout) findViewById(R.id.asset_list);
        this.c = (HorizontalScrollView) findViewById(R.id.asset_list_container);
        setImportantForAccessibility(1);
        setAlpha(0.0f);
    }

    private final void p(String str) {
        if (!zdg.e(getContext())) {
            return;
        }
        zdg.c(getContext(), this, str);
    }

    private final void q(final boolean z, final boolean z2) {
        this.f = z;
        post(new Runnable() { // from class: ztx
            @Override // java.lang.Runnable
            public final void run() {
                final ChooseFilterView chooseFilterView = ChooseFilterView.this;
                boolean z3 = z;
                boolean z4 = z2;
                ValueAnimator valueAnimator = chooseFilterView.i;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    chooseFilterView.i.end();
                }
                if (!chooseFilterView.a.r()) {
                    return;
                }
                int max = Math.max(chooseFilterView.getHeight(), 1);
                if (!z3) {
                    chooseFilterView.i = chooseFilterView.b(max, 1);
                } else {
                    chooseFilterView.setY(0.0f);
                    chooseFilterView.setAlpha(1.0f);
                    chooseFilterView.i = chooseFilterView.b(max, chooseFilterView.a());
                }
                if (z4) {
                    chooseFilterView.i.start();
                } else {
                    chooseFilterView.i.end();
                }
                if (z3) {
                    ylx.o(chooseFilterView.j, chooseFilterView.a.d(), zbx.b, new zdt() { // from class: ztt
                        @Override // defpackage.zdt
                        public final void a(Object obj) {
                            ChooseFilterView chooseFilterView2 = ChooseFilterView.this;
                            Integer num = (Integer) obj;
                            if (num == null || num.intValue() <= 0) {
                                return;
                            }
                            chooseFilterView2.d.a();
                        }
                    });
                }
                chooseFilterView.d.b();
            }
        });
    }

    public final int a() {
        return this.a.m;
    }

    public final ValueAnimator b(int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zts
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                zgd.t(ChooseFilterView.this, zgd.h(((Integer) valueAnimator.getAnimatedValue()).intValue()), ViewGroup.LayoutParams.class);
            }
        });
        if (i2 == 1) {
            ofInt.addListener(new zty(this));
            p(getContext().getString(R.string.accessibility_filter_view_closed));
        } else {
            ofInt.addListener(new ztz(this));
            p(getContext().getString(R.string.accessibility_filter_view_shown));
        }
        return ofInt;
    }

    public final zuk c() {
        if (this.a.r()) {
            return this.a;
        }
        return null;
    }

    public final void d() {
        this.h = true;
    }

    public final void e(List list, View view, boolean z, boolean z2, znk znkVar, apy apyVar) {
        aqxo.p(!list.isEmpty());
        zuk zukVar = this.a;
        LinearLayout linearLayout = this.b;
        HorizontalScrollView horizontalScrollView = this.c;
        zukVar.i = znkVar.a(list);
        zukVar.g(list, linearLayout, horizontalScrollView, z, z2);
        g(view, apyVar);
    }

    public final void f(final zse zseVar, final apy apyVar) {
        ((zsj) zseVar).a.c(new zrl() { // from class: ztu
            @Override // defpackage.zdt
            public final void a(Object obj) {
                final ChooseFilterView chooseFilterView = ChooseFilterView.this;
                final zse zseVar2 = zseVar;
                final apy apyVar2 = apyVar;
                final zrg zrgVar = (zrg) obj;
                chooseFilterView.e = zseVar2.b(new zsd() { // from class: ztv
                    @Override // defpackage.zdt
                    public final void a(Object obj2) {
                        final ChooseFilterView chooseFilterView2 = ChooseFilterView.this;
                        final zrg zrgVar2 = zrgVar;
                        final zse zseVar3 = zseVar2;
                        final apy apyVar3 = apyVar2;
                        final zno znoVar = (zno) obj2;
                        chooseFilterView2.post(new Runnable() { // from class: ztw
                            @Override // java.lang.Runnable
                            public final void run() {
                                ChooseFilterView chooseFilterView3 = ChooseFilterView.this;
                                zrg zrgVar3 = zrgVar2;
                                zno znoVar2 = znoVar;
                                zse zseVar4 = zseVar3;
                                apy apyVar4 = apyVar3;
                                if (chooseFilterView3.a.r()) {
                                    return;
                                }
                                chooseFilterView3.d.b = chooseFilterView3.g || zrgVar3.a(avxv.EFFECTS_FEATURE_DOT_ON_FILTER_ICON);
                                boolean z = chooseFilterView3.h || zrgVar3.a(avxv.EFFECTS_FEATURE_DOT_ON_EFFECT_THUMBNAIL);
                                aqxo.p(!znoVar2.a().isEmpty());
                                zuk zukVar = chooseFilterView3.a;
                                LinearLayout linearLayout = chooseFilterView3.b;
                                HorizontalScrollView horizontalScrollView = chooseFilterView3.c;
                                zukVar.j = zseVar4;
                                zukVar.g = znoVar2.c;
                                Iterator it = znoVar2.a().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((FilterMapTable$FilterDescriptor) it.next()).a.equals(zukVar.c)) {
                                            break;
                                        }
                                    } else {
                                        zukVar.c = znoVar2.b;
                                        break;
                                    }
                                }
                                zukVar.g(znoVar2.a(), linearLayout, horizontalScrollView, z, false);
                                chooseFilterView3.g(null, apyVar4);
                            }
                        });
                    }
                });
            }
        });
    }

    public final void g(View view, apy apyVar) {
        this.j = apyVar;
        if (view != null) {
            this.a.l(view);
        }
        this.d.a();
        if (this.f) {
            q(true, false);
        }
    }

    public final void h(String str) {
        this.a.n(str);
    }

    public final void i(View view) {
        this.a.l(view);
    }

    public final void j(zua zuaVar) {
        this.a.d = zuaVar;
    }

    public final void k() {
        l(true);
    }

    public final void l(boolean z) {
        q(!this.f, z);
    }

    public final void m(acti actiVar, zwm zwmVar) {
        zuk zukVar = this.a;
        zukVar.o = zwmVar;
        for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : zukVar.e) {
            znm a = znm.a(actiVar, filterMapTable$FilterDescriptor.a);
            awbs awbsVar = a.a;
            if (awbsVar != null) {
                actiVar.D(acun.a(awbsVar));
                actiVar.w(acun.a(a.a), a.b);
            }
        }
    }

    public final void n(hlq hlqVar) {
        ztr ztrVar = this.d;
        ztrVar.d = hlqVar;
        ztrVar.a();
        new ztp(ztrVar, 1);
    }

    public final void o(zub zubVar) {
        ztr ztrVar = this.d;
        ztrVar.c = zubVar;
        if (ztrVar.a.c() != null && ztrVar.a.f) {
            ztrVar.b();
        }
        new ztp(ztrVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zrj zrjVar = this.e;
        if (zrjVar != null) {
            zrjVar.a();
        }
        zuk zukVar = this.a;
        for (zrj zrjVar2 : zukVar.f) {
            zrjVar2.a();
        }
        zukVar.f.clear();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            zuk zukVar = this.a;
            if (!zukVar.k) {
                zukVar.n(bundle.getString("SELECTED_FILTER"));
            }
            q(bundle.getBoolean("CHOOSE_FILTER_VIEW_VISIBLE"), false);
            parcelable = bundle.getParcelable("SUPER_STATE");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE", super.onSaveInstanceState());
        bundle.putString("SELECTED_FILTER", this.a.c);
        bundle.putBoolean("CHOOSE_FILTER_VIEW_VISIBLE", this.f);
        return bundle;
    }
}
