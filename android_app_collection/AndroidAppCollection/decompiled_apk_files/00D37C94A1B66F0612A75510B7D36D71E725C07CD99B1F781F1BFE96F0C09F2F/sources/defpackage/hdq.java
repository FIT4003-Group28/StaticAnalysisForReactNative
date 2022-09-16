package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsEditToolButtonView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.effects.ShortsIntensitySliderView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import com.google.research.xeno.effect.Control;
import java.util.List;
/* compiled from: PG */
/* renamed from: hdq  reason: default package */
/* loaded from: classes3.dex */
public final class hdq implements View.OnClickListener, zuj {
    public final dt a;
    public ChooseFilterView b;
    public EditorButtonView c;
    public actj d;
    public ShortsEditToolButtonView e;
    public ShortsIntensitySliderView f;
    public AnimatorSet g;
    public gyq h;
    public actj i;
    public FilterMapTable$FilterDescriptor j;
    public zse k;
    private View l;
    private TextView m;
    private zxr n;

    public hdq(dt dtVar) {
        this.a = dtVar;
    }

    private final void d(int i, final TextView textView, final AnimatorSet animatorSet) {
        ChooseFilterView chooseFilterView = this.b;
        final zuk c = chooseFilterView == null ? null : chooseFilterView.c();
        if (c != null) {
            if (i == 3) {
                c.j();
                gtd.d(this.h.a, c.c, this.i);
            } else if (i != 1) {
                return;
            } else {
                c.k();
                gtd.d(this.h.a, c.c, this.i);
            }
            this.a.runOnUiThread(new Runnable() { // from class: hdo
                @Override // java.lang.Runnable
                public final void run() {
                    hdq hdqVar = hdq.this;
                    TextView textView2 = textView;
                    zuk zukVar = c;
                    AnimatorSet animatorSet2 = animatorSet;
                    AnimatorSet animatorSet3 = hdqVar.g;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    textView2.setText(zukVar.f());
                    animatorSet2.start();
                    hdqVar.g = animatorSet2;
                }
            });
        }
    }

    public final void a(FrameLayout frameLayout, ChooseFilterView chooseFilterView, TextView textView, gyq gyqVar, List list, Context context) {
        this.l = frameLayout;
        this.b = chooseFilterView;
        textView.getClass();
        this.m = textView;
        this.h = gyqVar;
        if (chooseFilterView != null) {
            frameLayout.addView(chooseFilterView, 0);
        }
        hdp hdpVar = new hdp(this, context, this.a.getSupportFragmentManager(), this.h.a, context, list);
        this.n = hdpVar;
        hdpVar.F(context.getString(R.string.camera_filter_presets_done));
        if (chooseFilterView != null) {
            chooseFilterView.a.n = this;
        }
    }

    public final void b(int i) {
        View view;
        TextView textView;
        TextView textView2;
        if (i == 3) {
            View view2 = this.l;
            if (view2 == null) {
                return;
            }
            AnimatorSet c = gtd.c(this.m, -view2.getWidth());
            if (c == null || (textView2 = this.m) == null) {
                return;
            }
            d(3, textView2, c);
        } else if (i != 1 || (view = this.l) == null) {
        } else {
            AnimatorSet c2 = gtd.c(this.m, view.getWidth());
            if (c2 == null || (textView = this.m) == null) {
                return;
            }
            d(1, textView, c2);
        }
    }

    public final void c() {
        FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor;
        Control.FloatSetting floatSetting;
        Pair pair;
        ChooseFilterView chooseFilterView = this.b;
        if (chooseFilterView == null || !chooseFilterView.f || (filterMapTable$FilterDescriptor = this.j) == null || !filterMapTable$FilterDescriptor.f("preset_intensity")) {
            ShortsIntensitySliderView shortsIntensitySliderView = this.f;
            if (shortsIntensitySliderView == null) {
                return;
            }
            shortsIntensitySliderView.setVisibility(4);
            return;
        }
        Control b = this.j.b("preset_intensity");
        ShortsIntensitySliderView shortsIntensitySliderView2 = this.f;
        if (shortsIntensitySliderView2 != null && b != null && (pair = (floatSetting = b.b).b) != null) {
            shortsIntensitySliderView2.c.setMax(ShortsIntensitySliderView.b(((Float) pair.second).floatValue()));
            shortsIntensitySliderView2.c.setProgress(ShortsIntensitySliderView.b(Control.nativeGetFloatValue(floatSetting.a)));
            shortsIntensitySliderView2.a = floatSetting;
        }
        ShortsIntensitySliderView shortsIntensitySliderView3 = this.f;
        if (shortsIntensitySliderView3 == null) {
            return;
        }
        shortsIntensitySliderView3.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        actj actjVar;
        if (view == this.c && (actjVar = this.d) != null) {
            this.h.a(actjVar).b();
        }
        zxr zxrVar = this.n;
        if (zxrVar != null) {
            zxrVar.G();
        }
    }
}
