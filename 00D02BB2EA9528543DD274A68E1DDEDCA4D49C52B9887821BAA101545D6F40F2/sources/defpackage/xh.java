package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xh  reason: default package */
/* loaded from: classes.dex */
public final class xh implements act {
    public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    public final int[] b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, com.google.android.filament.R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, com.google.android.filament.R.drawable.abc_text_select_handle_left_mtrl, com.google.android.filament.R.drawable.abc_text_select_handle_middle_mtrl, com.google.android.filament.R.drawable.abc_text_select_handle_right_mtrl};
    public final int[] d = {com.google.android.filament.R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public static final boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final ColorStateList b(Context context, int i) {
        int a = ael.a(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{ael.a, ael.c, ael.b, ael.e}, new int[]{ael.c(context, R.attr.colorButtonNormal), kc.a(a, i), kc.a(a, i), i});
    }

    public static final LayerDrawable c(acv acvVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable c = acvVar.c(context, R.drawable.abc_star_black_48dp);
        Drawable c2 = acvVar.c(context, R.drawable.abc_star_half_black_48dp);
        if (!(c instanceof BitmapDrawable) || c.getIntrinsicWidth() != dimensionPixelSize || c.getIntrinsicHeight() != dimensionPixelSize) {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        } else {
            bitmapDrawable = (BitmapDrawable) c;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if (!(c2 instanceof BitmapDrawable) || c2.getIntrinsicWidth() != dimensionPixelSize || c2.getIntrinsicHeight() != dimensionPixelSize) {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        } else {
            bitmapDrawable3 = (BitmapDrawable) c2;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static final void d(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (ze.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = xi.a;
        }
        drawable.setColorFilter(xi.f(i, mode));
    }
}
