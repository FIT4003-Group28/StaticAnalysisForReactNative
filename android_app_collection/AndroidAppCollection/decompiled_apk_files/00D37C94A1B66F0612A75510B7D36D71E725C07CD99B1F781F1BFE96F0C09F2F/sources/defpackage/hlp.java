package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: hlp  reason: default package */
/* loaded from: classes3.dex */
public final class hlp {
    public final boolean a;
    public final acti b;
    public final ChooseFilterView c;
    public final ChooseFilterView d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final zrp j;
    public final View k;
    public final int l;
    public final int m;
    public final hlo n;
    public final hlo o;
    public final hlo p;
    public final hln q;
    public boolean r;
    public boolean s;
    public boolean t;

    public hlp(ChooseFilterView chooseFilterView, ChooseFilterView chooseFilterView2, zrp zrpVar, View view, View view2, View view3, View view4, ImageView imageView, View view5, acti actiVar) {
        this.c = chooseFilterView;
        this.d = chooseFilterView2;
        zrpVar.getClass();
        this.j = zrpVar;
        view.getClass();
        this.e = view;
        view2.getClass();
        this.g = view2;
        this.h = view4;
        this.i = imageView;
        this.k = view5;
        this.f = view3;
        actiVar.getClass();
        this.b = actiVar;
        boolean z = true;
        if (chooseFilterView != null) {
            chooseFilterView.o(new hll(this, 1));
            chooseFilterView.i(view5);
        }
        if (chooseFilterView2 != null) {
            chooseFilterView2.o(new hll(this));
            chooseFilterView2.i(view5);
        }
        if (chooseFilterView == null && chooseFilterView2 == null) {
            z = false;
        }
        this.a = z;
        if (z) {
            this.l = (int) view2.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_height);
            this.m = (int) view2.getResources().getDimension(R.dimen.reel_camera_choose_filter_view_button_padding);
        } else {
            this.l = 0;
            this.m = 0;
        }
        this.p = new hlo(this, view3);
        this.n = new hlo(this, view);
        this.o = new hlo(this, view2);
        this.q = new hln(this, imageView);
        zrpVar.e(new zrm() { // from class: hlk
            @Override // defpackage.zdt
            public final void a(Object obj) {
                FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) obj;
                hlp.this.c();
            }
        });
    }

    private static void e(ChooseFilterView chooseFilterView, boolean z) {
        if (chooseFilterView == null || chooseFilterView.f == z) {
            return;
        }
        chooseFilterView.k();
    }

    public final void a(boolean z) {
        this.r = z;
        e(this.c, false);
        e(this.d, false);
        this.s = false;
        this.t = false;
    }

    public final void b(avxu avxuVar) {
        avxu avxuVar2 = avxu.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
        int ordinal = avxuVar.ordinal();
        if (ordinal == 1) {
            e(this.c, true);
            e(this.d, false);
        } else if (ordinal != 2) {
        } else {
            e(this.d, true);
            e(this.c, false);
        }
    }

    public final void c() {
        Runnable runnable = new Runnable() { // from class: hlm
            @Override // java.lang.Runnable
            public final void run() {
                hlp hlpVar = hlp.this;
                if (!hlpVar.a) {
                    return;
                }
                View view = hlpVar.h;
                if (view != null) {
                    ((ImageView) view.findViewById(R.id.reel_camera_effects_button)).setImageDrawable(hlpVar.h.getResources().getDrawable(true != hlpVar.s ? 2131232883 : 2131232882));
                    if (hlpVar.s) {
                        hlpVar.b.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_EFFECTS_BUTTON), null);
                    }
                }
                if (hlpVar.i != null) {
                    zrk g = hlpVar.j.g();
                    boolean z = g != null && g.c == avxu.EFFECT_SUBPACKAGE_ID_PRESET;
                    ImageView imageView = hlpVar.i;
                    imageView.setImageDrawable(imageView.getResources().getDrawable(true != z ? 2131231761 : 2131231762));
                    hln hlnVar = hlpVar.q;
                    ArrayList<hln> arrayList = new ArrayList();
                    arrayList.add(hlnVar);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (hln hlnVar2 : arrayList) {
                        View view2 = hlnVar2.a;
                        Property property = View.ROTATION;
                        float[] fArr = new float[2];
                        fArr[0] = hlnVar2.a.getRotation();
                        fArr[1] = true != hlnVar2.b.t ? 0.0f : 60.0f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, property, fArr);
                        ofFloat.setDuration(250L);
                        arrayList2.add(ofFloat);
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.start();
                    if (hlpVar.t) {
                        hlpVar.b.H(3, new acte(actj.REELS_CAMERA_PRESETS_BUTTON), null);
                    }
                }
                hqb.d(hlpVar.n);
                if (hlpVar.r) {
                    return;
                }
                if (hlpVar.f != null) {
                    hqb.d(hlpVar.p);
                }
                hqb.d(hlpVar.o);
            }
        };
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.e.post(runnable);
        }
    }

    public final boolean d() {
        return this.s || this.t;
    }
}
