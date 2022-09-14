package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    private static h f971b;
    private WeakHashMap<Context, android.support.v4.i.m<ColorStateList>> j;
    private android.support.v4.i.a<String, c> k;
    private android.support.v4.i.m<String> l;
    private final Object m = new Object();
    private final WeakHashMap<Context, android.support.v4.i.f<WeakReference<Drawable.ConstantState>>> n = new WeakHashMap<>(0);
    private TypedValue o;
    private boolean p;

    /* renamed from: a  reason: collision with root package name */
    private static final PorterDuff.Mode f970a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private static final b f972c = new b(6);

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f973d = {a.e.abc_textfield_search_default_mtrl_alpha, a.e.abc_textfield_default_mtrl_alpha, a.e.abc_ab_share_pack_mtrl_alpha};
    private static final int[] e = {a.e.abc_ic_commit_search_api_mtrl_alpha, a.e.abc_seekbar_tick_mark_material, a.e.abc_ic_menu_share_mtrl_alpha, a.e.abc_ic_menu_copy_mtrl_am_alpha, a.e.abc_ic_menu_cut_mtrl_alpha, a.e.abc_ic_menu_selectall_mtrl_alpha, a.e.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] f = {a.e.abc_textfield_activated_mtrl_alpha, a.e.abc_textfield_search_activated_mtrl_alpha, a.e.abc_cab_background_top_mtrl_alpha, a.e.abc_text_cursor_material, a.e.abc_text_select_handle_left_mtrl_dark, a.e.abc_text_select_handle_middle_mtrl_dark, a.e.abc_text_select_handle_right_mtrl_dark, a.e.abc_text_select_handle_left_mtrl_light, a.e.abc_text_select_handle_middle_mtrl_light, a.e.abc_text_select_handle_right_mtrl_light};
    private static final int[] g = {a.e.abc_popup_background_mtrl_mult, a.e.abc_cab_background_internal_bg, a.e.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] h = {a.e.abc_tab_indicator_material, a.e.abc_textfield_search_material};
    private static final int[] i = {a.e.abc_btn_check_material, a.e.abc_btn_radio_material};

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public interface c {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public static h a() {
        if (f971b == null) {
            f971b = new h();
            a(f971b);
        }
        return f971b;
    }

    private static void a(h hVar) {
        if (Build.VERSION.SDK_INT < 24) {
            hVar.a("vector", new d());
            hVar.a("animated-vector", new a());
        }
    }

    public Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    Drawable a(Context context, int i2, boolean z) {
        e(context);
        Drawable d2 = d(context, i2);
        if (d2 == null) {
            d2 = c(context, i2);
        }
        if (d2 == null) {
            d2 = android.support.v4.a.a.a(context, i2);
        }
        if (d2 != null) {
            d2 = a(context, i2, z, d2);
        }
        if (d2 != null) {
            u.b(d2);
        }
        return d2;
    }

    private static long a(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable c(Context context, int i2) {
        if (this.o == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = this.o;
        context.getResources().getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 != null) {
            return a3;
        }
        if (i2 == a.e.abc_cab_background_top_material) {
            a3 = new LayerDrawable(new Drawable[]{a(context, a.e.abc_cab_background_internal_bg), a(context, a.e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a3 != null) {
            a3.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, a2, a3);
        }
        return a3;
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            if (u.c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable f2 = android.support.v4.b.a.a.f(drawable);
            android.support.v4.b.a.a.a(f2, b2);
            PorterDuff.Mode a2 = a(i2);
            if (a2 == null) {
                return f2;
            }
            android.support.v4.b.a.a.a(f2, a2);
            return f2;
        } else if (i2 == a.e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(16908288), ah.a(context, a.C0020a.colorControlNormal), f970a);
            a(layerDrawable.findDrawableByLayerId(16908303), ah.a(context, a.C0020a.colorControlNormal), f970a);
            a(layerDrawable.findDrawableByLayerId(16908301), ah.a(context, a.C0020a.colorControlActivated), f970a);
            return drawable;
        } else if (i2 == a.e.abc_ratingbar_material || i2 == a.e.abc_ratingbar_indicator_material || i2 == a.e.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            a(layerDrawable2.findDrawableByLayerId(16908288), ah.c(context, a.C0020a.colorControlNormal), f970a);
            a(layerDrawable2.findDrawableByLayerId(16908303), ah.a(context, a.C0020a.colorControlActivated), f970a);
            a(layerDrawable2.findDrawableByLayerId(16908301), ah.a(context, a.C0020a.colorControlActivated), f970a);
            return drawable;
        } else if (!a(context, i2, drawable) && z) {
            return null;
        } else {
            return drawable;
        }
    }

    private Drawable d(Context context, int i2) {
        int next;
        if (this.k == null || this.k.isEmpty()) {
            return null;
        }
        if (this.l != null) {
            String a2 = this.l.a(i2);
            if ("appcompat_skip_skip".equals(a2) || (a2 != null && this.k.get(a2) == null)) {
                return null;
            }
        } else {
            this.l = new android.support.v4.i.m<>();
        }
        if (this.o == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = this.o;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long a3 = a(typedValue);
        Drawable a4 = a(context, a3);
        if (a4 != null) {
            return a4;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.l.c(i2, name);
                c cVar = this.k.get(name);
                if (cVar != null) {
                    a4 = cVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (a4 != null) {
                    a4.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, a3, a4);
                }
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e2);
            }
        }
        if (a4 == null) {
            this.l.c(i2, "appcompat_skip_skip");
        }
        return a4;
    }

    private Drawable a(Context context, long j) {
        synchronized (this.m) {
            android.support.v4.i.f<WeakReference<Drawable.ConstantState>> fVar = this.n.get(context);
            if (fVar == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> a2 = fVar.a(j);
            if (a2 != null) {
                Drawable.ConstantState constantState = a2.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                fVar.b(j);
            }
            return null;
        }
    }

    private boolean a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            synchronized (this.m) {
                android.support.v4.i.f<WeakReference<Drawable.ConstantState>> fVar = this.n.get(context);
                if (fVar == null) {
                    fVar = new android.support.v4.i.f<>();
                    this.n.put(context, fVar);
                }
                fVar.b(j, new WeakReference<>(constantState));
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable a(Context context, ar arVar, int i2) {
        Drawable d2 = d(context, i2);
        if (d2 == null) {
            d2 = arVar.a(i2);
        }
        if (d2 != null) {
            return a(context, i2, false, d2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = android.support.v7.widget.h.f970a
            int[] r1 = android.support.v7.widget.h.f973d
            boolean r1 = a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L15
            int r2 = android.support.v7.a.a.C0020a.colorControlNormal
        L12:
            r7 = 1
            r1 = -1
            goto L44
        L15:
            int[] r1 = android.support.v7.widget.h.f
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L20
            int r2 = android.support.v7.a.a.C0020a.colorControlActivated
            goto L12
        L20:
            int[] r1 = android.support.v7.widget.h.g
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L2b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L12
        L2b:
            int r1 = android.support.v7.a.a.e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L3c
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L44
        L3c:
            int r1 = android.support.v7.a.a.e.abc_dialog_material_background
            if (r7 != r1) goto L41
            goto L12
        L41:
            r7 = 0
            r1 = -1
            r2 = 0
        L44:
            if (r7 == 0) goto L61
            boolean r7 = android.support.v7.widget.u.c(r8)
            if (r7 == 0) goto L50
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L50:
            int r6 = android.support.v7.widget.ah.a(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L60
            r8.setAlpha(r1)
        L60:
            return r5
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.h.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    private void a(String str, c cVar) {
        if (this.k == null) {
            this.k = new android.support.v4.i.a<>();
        }
        this.k.put(str, cVar);
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    static PorterDuff.Mode a(int i2) {
        if (i2 == a.e.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b(Context context, int i2) {
        ColorStateList e2 = e(context, i2);
        if (e2 == null) {
            if (i2 == a.e.abc_edit_text_material) {
                e2 = android.support.v7.b.a.b.a(context, a.c.abc_tint_edittext);
            } else if (i2 == a.e.abc_switch_track_mtrl_alpha) {
                e2 = android.support.v7.b.a.b.a(context, a.c.abc_tint_switch_track);
            } else if (i2 == a.e.abc_switch_thumb_material) {
                e2 = d(context);
            } else if (i2 == a.e.abc_btn_default_mtrl_shape) {
                e2 = a(context);
            } else if (i2 == a.e.abc_btn_borderless_material) {
                e2 = b(context);
            } else if (i2 == a.e.abc_btn_colored_material) {
                e2 = c(context);
            } else if (i2 == a.e.abc_spinner_mtrl_am_alpha || i2 == a.e.abc_spinner_textfield_background_material) {
                e2 = android.support.v7.b.a.b.a(context, a.c.abc_tint_spinner);
            } else if (a(e, i2)) {
                e2 = ah.b(context, a.C0020a.colorControlNormal);
            } else if (a(h, i2)) {
                e2 = android.support.v7.b.a.b.a(context, a.c.abc_tint_default);
            } else if (a(i, i2)) {
                e2 = android.support.v7.b.a.b.a(context, a.c.abc_tint_btn_checkable);
            } else if (i2 == a.e.abc_seekbar_thumb_material) {
                e2 = android.support.v7.b.a.b.a(context, a.c.abc_tint_seek_thumb);
            }
            if (e2 != null) {
                a(context, i2, e2);
            }
        }
        return e2;
    }

    private ColorStateList e(Context context, int i2) {
        android.support.v4.i.m<ColorStateList> mVar;
        if (this.j == null || (mVar = this.j.get(context)) == null) {
            return null;
        }
        return mVar.a(i2);
    }

    private void a(Context context, int i2, ColorStateList colorStateList) {
        if (this.j == null) {
            this.j = new WeakHashMap<>();
        }
        android.support.v4.i.m<ColorStateList> mVar = this.j.get(context);
        if (mVar == null) {
            mVar = new android.support.v4.i.m<>();
            this.j.put(context, mVar);
        }
        mVar.c(i2, colorStateList);
    }

    private ColorStateList a(Context context) {
        return f(context, ah.a(context, a.C0020a.colorButtonNormal));
    }

    private ColorStateList b(Context context) {
        return f(context, 0);
    }

    private ColorStateList c(Context context) {
        return f(context, ah.a(context, a.C0020a.colorAccent));
    }

    private ColorStateList f(Context context, int i2) {
        int a2 = ah.a(context, a.C0020a.colorControlHighlight);
        return new ColorStateList(new int[][]{ah.f908a, ah.f911d, ah.f909b, ah.h}, new int[]{ah.c(context, a.C0020a.colorButtonNormal), android.support.v4.b.a.a(a2, i2), android.support.v4.b.a.a(a2, i2), i2});
    }

    private ColorStateList d(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList b2 = ah.b(context, a.C0020a.colorSwitchThumbNormal);
        if (b2 != null && b2.isStateful()) {
            iArr[0] = ah.f908a;
            iArr2[0] = b2.getColorForState(iArr[0], 0);
            iArr[1] = ah.e;
            iArr2[1] = ah.a(context, a.C0020a.colorControlActivated);
            iArr[2] = ah.h;
            iArr2[2] = b2.getDefaultColor();
        } else {
            iArr[0] = ah.f908a;
            iArr2[0] = ah.c(context, a.C0020a.colorSwitchThumbNormal);
            iArr[1] = ah.e;
            iArr2[1] = ah.a(context, a.C0020a.colorControlActivated);
            iArr[2] = ah.h;
            iArr2[2] = ah.a(context, a.C0020a.colorSwitchThumbNormal);
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public static class b extends android.support.v4.i.g<Integer, PorterDuffColorFilter> {
        public b(int i) {
            super(i);
        }

        PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(b(i, mode)));
        }

        PorterDuffColorFilter a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(b(i, mode)), porterDuffColorFilter);
        }

        private static int b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Drawable drawable, ak akVar, int[] iArr) {
        if (u.c(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (akVar.f919d || akVar.f918c) {
            drawable.setColorFilter(a(akVar.f919d ? akVar.f916a : null, akVar.f918c ? akVar.f917b : f970a, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT > 23) {
            return;
        }
        drawable.invalidateSelf();
    }

    private static PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return a(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2 = f972c.a(i2, mode);
        if (a2 == null) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            f972c.a(i2, mode, porterDuffColorFilter);
            return porterDuffColorFilter;
        }
        return a2;
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (u.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f970a;
        }
        drawable.setColorFilter(a(i2, mode));
    }

    private void e(Context context) {
        if (this.p) {
            return;
        }
        this.p = true;
        Drawable a2 = a(context, a.e.abc_vector_test);
        if (a2 != null && a(a2)) {
            return;
        }
        this.p = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    private static boolean a(Drawable drawable) {
        return (drawable instanceof android.support.b.a.i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public static class d implements c {
        d() {
        }

        @Override // android.support.v7.widget.h.c
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return android.support.b.a.i.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public static class a implements c {
        a() {
        }

        @Override // android.support.v7.widget.h.c
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return android.support.b.a.c.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }
}
