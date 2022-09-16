package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: yv  reason: default package */
/* loaded from: classes4.dex */
public final class yv {
    private static yv b;
    private WeakHashMap c;
    private agd d;
    private age e;
    private final WeakHashMap f = new WeakHashMap(0);
    private TypedValue g;
    private boolean h;
    private yu i;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final agc j = new agc(6);

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        synchronized (yv.class) {
            agc agcVar = j;
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) agcVar.c(Integer.valueOf(agc.g(i, mode)));
            if (porterDuffColorFilter == null) {
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter3 = (PorterDuffColorFilter) agcVar.d(Integer.valueOf(agc.g(i, mode)), porterDuffColorFilter2);
                return porterDuffColorFilter2;
            }
            return porterDuffColorFilter;
        }
    }

    public static synchronized yv e() {
        yv yvVar;
        synchronized (yv.class) {
            if (b == null) {
                yv yvVar2 = new yv();
                b = yvVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    yvVar2.k("vector", new yr(2));
                    yvVar2.k("animated-vector", new yr());
                    yvVar2.k("animated-selector", new yr(1));
                    yvVar2.k("drawable", new ys());
                }
            }
            yvVar = b;
        }
        return yvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(android.graphics.drawable.Drawable r3, defpackage.aab r4, int[] r5) {
        /*
            boolean r0 = defpackage.vs.d(r3)
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r3.mutate()
            if (r0 != r3) goto Ld
            goto Le
        Ld:
            return
        Le:
            boolean r0 = r4.d
            r1 = 0
            if (r0 != 0) goto L1d
            boolean r0 = r4.c
            if (r0 == 0) goto L19
            r0 = r1
            goto L1f
        L19:
            r3.clearColorFilter()
            goto L39
        L1d:
            android.content.res.ColorStateList r0 = r4.a
        L1f:
            boolean r2 = r4.c
            if (r2 == 0) goto L26
            android.graphics.PorterDuff$Mode r4 = r4.b
            goto L28
        L26:
            android.graphics.PorterDuff$Mode r4 = defpackage.yv.a
        L28:
            if (r0 == 0) goto L36
            if (r4 != 0) goto L2d
            goto L36
        L2d:
            r1 = 0
            int r5 = r0.getColorForState(r5, r1)
            android.graphics.PorterDuffColorFilter r1 = b(r5, r4)
        L36:
            r3.setColorFilter(r1)
        L39:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 > r5) goto L42
            r3.invalidateSelf()
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv.h(android.graphics.drawable.Drawable, aab, int[]):void");
    }

    private static long i(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private final synchronized Drawable j(Context context, long j2) {
        agb agbVar = (agb) this.f.get(context);
        if (agbVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) agbVar.f(j2);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            agbVar.l(j2);
        }
        return null;
    }

    private final void k(String str, yt ytVar) {
        if (this.d == null) {
            this.d = new agd();
        }
        this.d.put(str, ytVar);
    }

    private final synchronized void l(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            agb agbVar = (agb) this.f.get(context);
            if (agbVar == null) {
                agbVar = new agb();
                this.f.put(context, agbVar);
            }
            agbVar.k(j2, new WeakReference(constantState));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ColorStateList a(Context context, int i) {
        int b2;
        age ageVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateList = null;
        ColorStateList colorStateList2 = (weakHashMap == null || (ageVar = (age) weakHashMap.get(context)) == null) ? null : (ColorStateList) ageVar.e(i);
        if (colorStateList2 == null) {
            yu yuVar = this.i;
            if (yuVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateList = po.a(context, R.color.abc_tint_edittext);
                } else if (i == 2131230829) {
                    colorStateList = po.a(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3];
                    int[] iArr2 = new int[3];
                    ColorStateList c = zy.c(context, R.attr.colorSwitchThumbNormal);
                    if (c == null || !c.isStateful()) {
                        iArr[0] = zy.a;
                        iArr2[0] = zy.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = zy.d;
                        iArr2[1] = zy.b(context, R.attr.colorControlActivated);
                        iArr[2] = zy.e;
                        iArr2[2] = zy.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = zy.a;
                        iArr[0] = iArr3;
                        iArr2[0] = c.getColorForState(iArr3, 0);
                        iArr[1] = zy.d;
                        iArr2[1] = zy.b(context, R.attr.colorControlActivated);
                        iArr[2] = zy.e;
                        iArr2[2] = c.getDefaultColor();
                    }
                    colorStateList = new ColorStateList(iArr, iArr2);
                } else {
                    if (i == R.drawable.abc_btn_default_mtrl_shape) {
                        b2 = zy.b(context, R.attr.colorButtonNormal);
                    } else if (i == R.drawable.abc_btn_borderless_material) {
                        colorStateList = uc.b(context, 0);
                    } else if (i == R.drawable.abc_btn_colored_material) {
                        b2 = zy.b(context, R.attr.colorAccent);
                    } else {
                        if (i != 2131230824 && i != R.drawable.abc_spinner_textfield_background_material) {
                            if (uc.a(((uc) yuVar).b, i)) {
                                colorStateList = zy.c(context, R.attr.colorControlNormal);
                            } else if (uc.a(((uc) yuVar).e, i)) {
                                colorStateList = po.a(context, R.color.abc_tint_default);
                            } else if (uc.a(((uc) yuVar).f, i)) {
                                colorStateList = po.a(context, R.color.abc_tint_btn_checkable);
                            } else if (i == R.drawable.abc_seekbar_thumb_material) {
                                colorStateList = po.a(context, R.color.abc_tint_seek_thumb);
                                i = R.drawable.abc_seekbar_thumb_material;
                            }
                        }
                        colorStateList = po.a(context, R.color.abc_tint_spinner);
                    }
                    colorStateList = uc.b(context, b2);
                }
            }
            if (colorStateList != null) {
                if (this.c == null) {
                    this.c = new WeakHashMap();
                }
                age ageVar2 = (age) this.c.get(context);
                if (ageVar2 == null) {
                    ageVar2 = new age();
                    this.c.put(context, ageVar2);
                }
                ageVar2.h(i, colorStateList);
                return colorStateList;
            }
            colorStateList2 = colorStateList;
        }
        return colorStateList2;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized void f(Context context) {
        agb agbVar = (agb) this.f.get(context);
        if (agbVar != null) {
            agbVar.j();
        }
    }

    public final synchronized void g(yu yuVar) {
        this.i = yuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0189, code lost:
        r0.setTintMode(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027a A[Catch: all -> 0x0289, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:22:0x004d, B:26:0x005e, B:28:0x0062, B:29:0x0069, B:56:0x00ec, B:58:0x00f0, B:59:0x00f7, B:62:0x010c, B:75:0x0153, B:67:0x0117, B:69:0x0133, B:71:0x013d, B:73:0x0147, B:77:0x015e, B:79:0x0164, B:81:0x016a, B:83:0x0170, B:84:0x0174, B:91:0x0189, B:133:0x027a, B:89:0x0185, B:93:0x018f, B:97:0x01a6, B:98:0x01cd, B:102:0x01d8, B:104:0x0202, B:122:0x0257, B:124:0x025d, B:126:0x0263, B:128:0x0270, B:107:0x0219, B:110:0x022a, B:112:0x0234, B:116:0x023e, B:32:0x007d, B:34:0x0081, B:36:0x008f, B:37:0x0097, B:41:0x00a0, B:42:0x00a7, B:43:0x00a8, B:45:0x00bb, B:47:0x00c5, B:50:0x00cf, B:52:0x00d8, B:25:0x0057, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:136:0x027f, B:137:0x0288), top: B:144:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec A[Catch: all -> 0x0289, TryCatch #1 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:22:0x004d, B:26:0x005e, B:28:0x0062, B:29:0x0069, B:56:0x00ec, B:58:0x00f0, B:59:0x00f7, B:62:0x010c, B:75:0x0153, B:67:0x0117, B:69:0x0133, B:71:0x013d, B:73:0x0147, B:77:0x015e, B:79:0x0164, B:81:0x016a, B:83:0x0170, B:84:0x0174, B:91:0x0189, B:133:0x027a, B:89:0x0185, B:93:0x018f, B:97:0x01a6, B:98:0x01cd, B:102:0x01d8, B:104:0x0202, B:122:0x0257, B:124:0x025d, B:126:0x0263, B:128:0x0270, B:107:0x0219, B:110:0x022a, B:112:0x0234, B:116:0x023e, B:32:0x007d, B:34:0x0081, B:36:0x008f, B:37:0x0097, B:41:0x00a0, B:42:0x00a7, B:43:0x00a8, B:45:0x00bb, B:47:0x00c5, B:50:0x00cf, B:52:0x00d8, B:25:0x0057, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:136:0x027f, B:137:0x0288), top: B:144:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0153 A[Catch: all -> 0x0289, TryCatch #1 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:22:0x004d, B:26:0x005e, B:28:0x0062, B:29:0x0069, B:56:0x00ec, B:58:0x00f0, B:59:0x00f7, B:62:0x010c, B:75:0x0153, B:67:0x0117, B:69:0x0133, B:71:0x013d, B:73:0x0147, B:77:0x015e, B:79:0x0164, B:81:0x016a, B:83:0x0170, B:84:0x0174, B:91:0x0189, B:133:0x027a, B:89:0x0185, B:93:0x018f, B:97:0x01a6, B:98:0x01cd, B:102:0x01d8, B:104:0x0202, B:122:0x0257, B:124:0x025d, B:126:0x0263, B:128:0x0270, B:107:0x0219, B:110:0x022a, B:112:0x0234, B:116:0x023e, B:32:0x007d, B:34:0x0081, B:36:0x008f, B:37:0x0097, B:41:0x00a0, B:42:0x00a7, B:43:0x00a8, B:45:0x00bb, B:47:0x00c5, B:50:0x00cf, B:52:0x00d8, B:25:0x0057, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:136:0x027f, B:137:0x0288), top: B:144:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e A[Catch: all -> 0x0289, TryCatch #1 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:22:0x004d, B:26:0x005e, B:28:0x0062, B:29:0x0069, B:56:0x00ec, B:58:0x00f0, B:59:0x00f7, B:62:0x010c, B:75:0x0153, B:67:0x0117, B:69:0x0133, B:71:0x013d, B:73:0x0147, B:77:0x015e, B:79:0x0164, B:81:0x016a, B:83:0x0170, B:84:0x0174, B:91:0x0189, B:133:0x027a, B:89:0x0185, B:93:0x018f, B:97:0x01a6, B:98:0x01cd, B:102:0x01d8, B:104:0x0202, B:122:0x0257, B:124:0x025d, B:126:0x0263, B:128:0x0270, B:107:0x0219, B:110:0x022a, B:112:0x0234, B:116:0x023e, B:32:0x007d, B:34:0x0081, B:36:0x008f, B:37:0x0097, B:41:0x00a0, B:42:0x00a7, B:43:0x00a8, B:45:0x00bb, B:47:0x00c5, B:50:0x00cf, B:52:0x00d8, B:25:0x0057, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:136:0x027f, B:137:0x0288), top: B:144:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0164 A[Catch: all -> 0x0289, TryCatch #1 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:22:0x004d, B:26:0x005e, B:28:0x0062, B:29:0x0069, B:56:0x00ec, B:58:0x00f0, B:59:0x00f7, B:62:0x010c, B:75:0x0153, B:67:0x0117, B:69:0x0133, B:71:0x013d, B:73:0x0147, B:77:0x015e, B:79:0x0164, B:81:0x016a, B:83:0x0170, B:84:0x0174, B:91:0x0189, B:133:0x027a, B:89:0x0185, B:93:0x018f, B:97:0x01a6, B:98:0x01cd, B:102:0x01d8, B:104:0x0202, B:122:0x0257, B:124:0x025d, B:126:0x0263, B:128:0x0270, B:107:0x0219, B:110:0x022a, B:112:0x0234, B:116:0x023e, B:32:0x007d, B:34:0x0081, B:36:0x008f, B:37:0x0097, B:41:0x00a0, B:42:0x00a7, B:43:0x00a8, B:45:0x00bb, B:47:0x00c5, B:50:0x00cf, B:52:0x00d8, B:25:0x0057, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:136:0x027f, B:137:0x0288), top: B:144:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }
}
