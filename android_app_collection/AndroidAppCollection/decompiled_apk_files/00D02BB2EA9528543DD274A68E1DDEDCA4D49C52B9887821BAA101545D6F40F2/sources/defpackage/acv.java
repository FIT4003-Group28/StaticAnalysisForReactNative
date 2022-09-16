package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: acv  reason: default package */
/* loaded from: classes.dex */
public final class acv {
    private static acv b;
    private WeakHashMap<Context, ain<ColorStateList>> d;
    private aim<String, acs> e;
    private ain<String> f;
    private final WeakHashMap<Context, aik<WeakReference<Drawable.ConstantState>>> g = new WeakHashMap<>(0);
    private TypedValue h;
    private boolean i;
    private act j;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final acq c = new acq();

    public static synchronized acv a() {
        acv acvVar;
        synchronized (acv.class) {
            if (b == null) {
                acv acvVar2 = new acv();
                b = acvVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    acvVar2.k("vector", new acu());
                    acvVar2.k("animated-vector", new acp());
                    acvVar2.k("animated-selector", new aco());
                    acvVar2.k("drawable", new acr());
                }
            }
            acvVar = b;
        }
        return acvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(android.graphics.drawable.Drawable r3, defpackage.aeo r4, int[] r5) {
        /*
            boolean r0 = defpackage.ze.c(r3)
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
            android.graphics.PorterDuff$Mode r4 = defpackage.acv.a
        L28:
            if (r0 == 0) goto L36
            if (r4 != 0) goto L2d
            goto L36
        L2d:
            r1 = 0
            int r5 = r0.getColorForState(r5, r1)
            android.graphics.PorterDuffColorFilter r1 = h(r5, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acv.g(android.graphics.drawable.Drawable, aeo, int[]):void");
    }

    public static synchronized PorterDuffColorFilter h(int i, PorterDuff.Mode mode) {
        synchronized (acv.class) {
            acq acqVar = c;
            PorterDuffColorFilter b2 = acqVar.b(Integer.valueOf(acq.a(i, mode)));
            if (b2 == null) {
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                acqVar.c(Integer.valueOf(acq.a(i, mode)), porterDuffColorFilter);
                return porterDuffColorFilter;
            }
            return b2;
        }
    }

    private static long i(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private final synchronized Drawable j(Context context, long j) {
        aik<WeakReference<Drawable.ConstantState>> aikVar = this.g.get(context);
        if (aikVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> b2 = aikVar.b(j);
        if (b2 != null) {
            Drawable.ConstantState constantState = b2.get();
            if (constantState == null) {
                int f = aii.f(aikVar.c, aikVar.e, j);
                if (f >= 0 && aikVar.d[f] != aik.a) {
                    aikVar.d[f] = aik.a;
                    aikVar.b = true;
                }
            } else {
                return constantState.newDrawable(context.getResources());
            }
        }
        return null;
    }

    private final void k(String str, acs acsVar) {
        if (this.e == null) {
            this.e = new aim<>();
        }
        this.e.put(str, acsVar);
    }

    private final synchronized void l(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            aik<WeakReference<Drawable.ConstantState>> aikVar = this.g.get(context);
            if (aikVar == null) {
                aikVar = new aik<>();
                this.g.put(context, aikVar);
            }
            aikVar.d(j, new WeakReference<>(constantState));
        }
    }

    public final synchronized void b(act actVar) {
        this.j = actVar;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    public final synchronized void e(Context context) {
        aik<WeakReference<Drawable.ConstantState>> aikVar = this.g.get(context);
        if (aikVar != null) {
            aikVar.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ColorStateList f(Context context, int i) {
        int a2;
        ain<ColorStateList> ainVar;
        WeakHashMap<Context, ain<ColorStateList>> weakHashMap = this.d;
        ColorStateList colorStateList = null;
        ColorStateList b2 = (weakHashMap == null || (ainVar = weakHashMap.get(context)) == null) ? null : ainVar.b(i);
        if (b2 == null) {
            act actVar = this.j;
            if (actVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateList = sl.a(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateList = sl.a(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3];
                    int[] iArr2 = new int[3];
                    ColorStateList b3 = ael.b(context, R.attr.colorSwitchThumbNormal);
                    if (b3 == null || !b3.isStateful()) {
                        iArr[0] = ael.a;
                        iArr2[0] = ael.c(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = ael.d;
                        iArr2[1] = ael.a(context, R.attr.colorControlActivated);
                        iArr[2] = ael.e;
                        iArr2[2] = ael.a(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = ael.a;
                        iArr[0] = iArr3;
                        iArr2[0] = b3.getColorForState(iArr3, 0);
                        iArr[1] = ael.d;
                        iArr2[1] = ael.a(context, R.attr.colorControlActivated);
                        iArr[2] = ael.e;
                        iArr2[2] = b3.getDefaultColor();
                    }
                    colorStateList = new ColorStateList(iArr, iArr2);
                } else {
                    if (i == R.drawable.abc_btn_default_mtrl_shape) {
                        a2 = ael.a(context, R.attr.colorButtonNormal);
                    } else if (i == R.drawable.abc_btn_borderless_material) {
                        colorStateList = xh.b(context, 0);
                    } else if (i == R.drawable.abc_btn_colored_material) {
                        a2 = ael.a(context, R.attr.colorAccent);
                    } else {
                        if (i != 2131230854 && i != R.drawable.abc_spinner_textfield_background_material) {
                            if (xh.a(((xh) actVar).b, i)) {
                                colorStateList = ael.b(context, R.attr.colorControlNormal);
                            } else if (xh.a(((xh) actVar).e, i)) {
                                colorStateList = sl.a(context, R.color.abc_tint_default);
                            } else if (xh.a(((xh) actVar).f, i)) {
                                colorStateList = sl.a(context, R.color.abc_tint_btn_checkable);
                            } else if (i == R.drawable.abc_seekbar_thumb_material) {
                                colorStateList = sl.a(context, R.color.abc_tint_seek_thumb);
                                i = R.drawable.abc_seekbar_thumb_material;
                            }
                        }
                        colorStateList = sl.a(context, R.color.abc_tint_spinner);
                    }
                    colorStateList = xh.b(context, a2);
                }
            }
            if (colorStateList != null) {
                if (this.d == null) {
                    this.d = new WeakHashMap<>();
                }
                ain<ColorStateList> ainVar2 = this.d.get(context);
                if (ainVar2 == null) {
                    ainVar2 = new ain<>();
                    this.d.put(context, ainVar2);
                }
                ainVar2.j(i, colorStateList);
                return colorStateList;
            }
            b2 = colorStateList;
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0182, code lost:
        r0.setTintMode(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0273 A[Catch: all -> 0x0282, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:22:0x004d, B:26:0x005e, B:28:0x0062, B:29:0x0069, B:55:0x00e5, B:57:0x00e9, B:58:0x00f0, B:61:0x0105, B:74:0x014c, B:66:0x0110, B:68:0x012c, B:70:0x0136, B:72:0x0140, B:76:0x0157, B:78:0x015d, B:80:0x0163, B:82:0x0169, B:83:0x016d, B:90:0x0182, B:132:0x0273, B:88:0x017e, B:92:0x0188, B:96:0x019f, B:97:0x01c6, B:101:0x01d1, B:103:0x01fb, B:121:0x0250, B:123:0x0256, B:125:0x025c, B:127:0x0269, B:106:0x0212, B:109:0x0223, B:111:0x022d, B:115:0x0237, B:32:0x007d, B:34:0x0081, B:36:0x008f, B:37:0x0097, B:41:0x00a0, B:42:0x00a7, B:43:0x00a8, B:45:0x00bb, B:47:0x00c5, B:51:0x00d1, B:25:0x0057, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:135:0x0278, B:136:0x0281), top: B:143:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5 A[Catch: all -> 0x0282, TryCatch #1 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:22:0x004d, B:26:0x005e, B:28:0x0062, B:29:0x0069, B:55:0x00e5, B:57:0x00e9, B:58:0x00f0, B:61:0x0105, B:74:0x014c, B:66:0x0110, B:68:0x012c, B:70:0x0136, B:72:0x0140, B:76:0x0157, B:78:0x015d, B:80:0x0163, B:82:0x0169, B:83:0x016d, B:90:0x0182, B:132:0x0273, B:88:0x017e, B:92:0x0188, B:96:0x019f, B:97:0x01c6, B:101:0x01d1, B:103:0x01fb, B:121:0x0250, B:123:0x0256, B:125:0x025c, B:127:0x0269, B:106:0x0212, B:109:0x0223, B:111:0x022d, B:115:0x0237, B:32:0x007d, B:34:0x0081, B:36:0x008f, B:37:0x0097, B:41:0x00a0, B:42:0x00a7, B:43:0x00a8, B:45:0x00bb, B:47:0x00c5, B:51:0x00d1, B:25:0x0057, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:135:0x0278, B:136:0x0281), top: B:143:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014c A[Catch: all -> 0x0282, TryCatch #1 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:22:0x004d, B:26:0x005e, B:28:0x0062, B:29:0x0069, B:55:0x00e5, B:57:0x00e9, B:58:0x00f0, B:61:0x0105, B:74:0x014c, B:66:0x0110, B:68:0x012c, B:70:0x0136, B:72:0x0140, B:76:0x0157, B:78:0x015d, B:80:0x0163, B:82:0x0169, B:83:0x016d, B:90:0x0182, B:132:0x0273, B:88:0x017e, B:92:0x0188, B:96:0x019f, B:97:0x01c6, B:101:0x01d1, B:103:0x01fb, B:121:0x0250, B:123:0x0256, B:125:0x025c, B:127:0x0269, B:106:0x0212, B:109:0x0223, B:111:0x022d, B:115:0x0237, B:32:0x007d, B:34:0x0081, B:36:0x008f, B:37:0x0097, B:41:0x00a0, B:42:0x00a7, B:43:0x00a8, B:45:0x00bb, B:47:0x00c5, B:51:0x00d1, B:25:0x0057, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:135:0x0278, B:136:0x0281), top: B:143:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157 A[Catch: all -> 0x0282, TryCatch #1 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:22:0x004d, B:26:0x005e, B:28:0x0062, B:29:0x0069, B:55:0x00e5, B:57:0x00e9, B:58:0x00f0, B:61:0x0105, B:74:0x014c, B:66:0x0110, B:68:0x012c, B:70:0x0136, B:72:0x0140, B:76:0x0157, B:78:0x015d, B:80:0x0163, B:82:0x0169, B:83:0x016d, B:90:0x0182, B:132:0x0273, B:88:0x017e, B:92:0x0188, B:96:0x019f, B:97:0x01c6, B:101:0x01d1, B:103:0x01fb, B:121:0x0250, B:123:0x0256, B:125:0x025c, B:127:0x0269, B:106:0x0212, B:109:0x0223, B:111:0x022d, B:115:0x0237, B:32:0x007d, B:34:0x0081, B:36:0x008f, B:37:0x0097, B:41:0x00a0, B:42:0x00a7, B:43:0x00a8, B:45:0x00bb, B:47:0x00c5, B:51:0x00d1, B:25:0x0057, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:135:0x0278, B:136:0x0281), top: B:143:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015d A[Catch: all -> 0x0282, TryCatch #1 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0033, B:17:0x0039, B:19:0x003d, B:22:0x004d, B:26:0x005e, B:28:0x0062, B:29:0x0069, B:55:0x00e5, B:57:0x00e9, B:58:0x00f0, B:61:0x0105, B:74:0x014c, B:66:0x0110, B:68:0x012c, B:70:0x0136, B:72:0x0140, B:76:0x0157, B:78:0x015d, B:80:0x0163, B:82:0x0169, B:83:0x016d, B:90:0x0182, B:132:0x0273, B:88:0x017e, B:92:0x0188, B:96:0x019f, B:97:0x01c6, B:101:0x01d1, B:103:0x01fb, B:121:0x0250, B:123:0x0256, B:125:0x025c, B:127:0x0269, B:106:0x0212, B:109:0x0223, B:111:0x022d, B:115:0x0237, B:32:0x007d, B:34:0x0081, B:36:0x008f, B:37:0x0097, B:41:0x00a0, B:42:0x00a7, B:43:0x00a8, B:45:0x00bb, B:47:0x00c5, B:51:0x00d1, B:25:0x0057, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:135:0x0278, B:136:0x0281), top: B:143:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acv.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }
}
