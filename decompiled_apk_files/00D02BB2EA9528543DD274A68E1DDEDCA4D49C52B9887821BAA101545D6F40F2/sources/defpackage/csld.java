package defpackage;

import android.content.res.ColorStateList;
import android.os.Bundle;
import com.google.android.libraries.material.featurehighlight.ViewFinder;
/* compiled from: PG */
/* renamed from: csld  reason: default package */
/* loaded from: classes5.dex */
public final class csld {
    private final ViewFinder a;
    private final int b;
    private final CharSequence c;
    private final ColorStateList d;
    private final int e;
    private final CharSequence f;
    private final int g;
    private final ColorStateList h;
    private final int i;
    private final ColorStateList j;
    private final ColorStateList k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final float p;
    private final int q;
    private final int r;
    private final int s;
    private final boolean t;
    private final int u;
    private final csmk v;
    private final cslo w;

    public csld(ViewFinder viewFinder, int i, CharSequence charSequence, ColorStateList colorStateList, int i2, CharSequence charSequence2, int i3, ColorStateList colorStateList2, int i4, ColorStateList colorStateList3, ColorStateList colorStateList4, int i5, int i6, int i7, int i8, float f, int i9, int i10, int i11, boolean z, int i12, csmk csmkVar, cslo csloVar) {
        this.a = viewFinder;
        this.b = i;
        this.c = charSequence;
        this.d = colorStateList;
        this.e = i2;
        this.f = charSequence2;
        this.g = i3;
        this.h = colorStateList2;
        this.i = i4;
        this.j = colorStateList3;
        this.k = colorStateList4;
        this.l = i5;
        this.m = i6;
        this.n = i7;
        this.o = i8;
        this.p = f;
        this.q = i9;
        this.r = i10;
        this.s = i11;
        this.t = z;
        this.u = i12;
        this.v = csmkVar;
        this.w = csloVar;
    }

    public static boolean a(ff ffVar) {
        return !ffVar.isFinishing() && csln.p(ffVar) != null;
    }

    public static void b(ff ffVar) {
        csln p;
        if (!ffVar.isFinishing() && (p = csln.p(ffVar)) != null) {
            p.e();
        }
    }

    public final csln c() {
        ViewFinder viewFinder = this.a;
        int i = this.b;
        CharSequence charSequence = this.c;
        ColorStateList colorStateList = this.d;
        int i2 = this.e;
        CharSequence charSequence2 = this.f;
        int i3 = this.g;
        ColorStateList colorStateList2 = this.h;
        int i4 = this.i;
        ColorStateList colorStateList3 = this.j;
        ColorStateList colorStateList4 = this.k;
        int i5 = this.l;
        int i6 = this.m;
        int i7 = this.n;
        int i8 = this.o;
        float f = this.p;
        int i9 = this.q;
        int i10 = this.r;
        int i11 = this.s;
        boolean z = this.t;
        int i12 = this.u;
        csmk csmkVar = this.v;
        cslo csloVar = this.w;
        Bundle bundle = new Bundle();
        bundle.putParcelable("fh_view_finder", viewFinder);
        bundle.putInt("fh_target_view_tint_color", i);
        bundle.putInt("fh_confining_view_id", 16908290);
        bundle.putCharSequence("fh_header_text", charSequence);
        bundle.putInt("fh_header_text_size_res", 0);
        bundle.putInt("fh_header_text_appearance", 0);
        bundle.putParcelable("fh_header_text_color", colorStateList);
        bundle.putInt("fh_header_text_alignment", i2);
        bundle.putCharSequence("fh_body_text", charSequence2);
        bundle.putInt("fh_body_text_size_res", 0);
        bundle.putInt("fh_body_text_appearance", i3);
        bundle.putParcelable("fh_body_text_color", colorStateList2);
        bundle.putInt("fh_body_text_alignment", i4);
        bundle.putCharSequence("fh_dismiss_action_text", null);
        bundle.putInt("fh_dismiss_action_text_appearance", 0);
        bundle.putParcelable("fh_dismiss_action_text_color", colorStateList3);
        bundle.putParcelable("fh_dismiss_action_ripple_color", colorStateList4);
        bundle.putParcelable("fh_dismiss_action_stroke_color", null);
        bundle.putInt("fh_dismiss_action_text_alignment", 0);
        bundle.putInt("fh_outer_color", i5);
        bundle.putInt("fh_pulse_inner_color", i6);
        bundle.putInt("fh_pulse_outer_color", i7);
        bundle.putInt("fh_scrim_color", i8);
        bundle.putInt("fh_target_text_color", 0);
        bundle.putInt("fh_target_drawable", 0);
        bundle.putInt("fh_target_drawable_color", 0);
        bundle.putBoolean("fh_target_shadow_enabled", false);
        bundle.putFloat("fh_target_scale", f);
        bundle.putString("fh_callback_id", null);
        bundle.putString("fh_task_tag", null);
        bundle.putInt("fh_vertical_offset_res", i9);
        bundle.putInt("fh_horizontal_offset_res", i10);
        bundle.putInt("fh_center_threshold_res", i11);
        bundle.putBoolean("fh_task_complete_on_tap", true);
        bundle.putLong("fh_duration", -1L);
        bundle.putBoolean("fh_pin_to_closest_vertical_edge", false);
        bundle.putBoolean("fh_swipe_to_dismiss_enabled", z);
        bundle.putBoolean("fh_tap_to_dismiss_enabled", true);
        bundle.putInt("fh_text_vertical_gravity_hint", i12);
        bundle.putCharSequence("fh_content_description", null);
        bundle.putSerializable("fh_pulse_animation_type", csmkVar);
        bundle.putSerializable("fh_feature_highlight_style", csloVar);
        bundle.putInt("fh_theme_overlay", 0);
        csln cslnVar = new csln();
        cslnVar.B(bundle);
        return cslnVar;
    }
}
