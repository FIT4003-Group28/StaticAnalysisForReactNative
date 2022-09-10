package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: oy  reason: default package */
/* loaded from: classes.dex */
public final class oy {
    public static final oy a = new oy(1, (CharSequence) null);
    public static final oy b = new oy(2, (CharSequence) null);
    public static final oy c;
    public static final oy d;
    public static final oy e;
    public static final oy f;
    public static final oy g;
    public static final oy h;
    public static final oy i;
    public static final oy j;
    final Object k;
    public final int l;
    public final Class<? extends ph> m;
    public final pp n;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new oy(4, (CharSequence) null);
        new oy(8, (CharSequence) null);
        c = new oy(16, (CharSequence) null);
        new oy(32, (CharSequence) null);
        new oy(64, (CharSequence) null);
        new oy(128, (CharSequence) null);
        new oy(256, pi.class);
        new oy(512, pi.class);
        new oy(1024, pj.class);
        new oy(2048, pj.class);
        d = new oy(4096, (CharSequence) null);
        e = new oy(8192, (CharSequence) null);
        new oy(16384, (CharSequence) null);
        new oy(32768, (CharSequence) null);
        new oy((int) ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, (CharSequence) null);
        new oy(131072, pn.class);
        f = new oy(262144, (CharSequence) null);
        g = new oy((int) ImageMetadata.LENS_APERTURE, (CharSequence) null);
        h = new oy((int) ImageMetadata.SHADING_MODE, (CharSequence) null);
        new oy(2097152, po.class);
        new oy(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, pl.class);
        i = new oy(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
        j = new oy(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, pm.class);
        new oy(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, pk.class);
        new oy(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
        new oy(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        }
        new oy(accessibilityAction, 16908372, null, null, null);
    }

    public oy(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.k).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.k).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof oy) && this.k.equals(((oy) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    private oy(int i2, Class<? extends ph> cls) {
        this(null, i2, null, null, cls);
    }

    public oy(Object obj, int i2, CharSequence charSequence, pp ppVar, Class<? extends ph> cls) {
        this.l = i2;
        this.n = ppVar;
        this.k = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.m = cls;
    }
}
