package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: mf  reason: default package */
/* loaded from: classes3.dex */
public final class mf {
    public static final mf a = new mf(1, (CharSequence) null);
    public static final mf b;
    public static final mf c;
    public static final mf d;
    public static final mf e;
    public static final mf f;
    public static final mf g;
    public static final mf h;
    public static final mf i;
    public final Object j;
    public final int k;
    public final Class l;
    public final mu m;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        new mf(2, (CharSequence) null);
        new mf(4, (CharSequence) null);
        new mf(8, (CharSequence) null);
        b = new mf(16, (CharSequence) null);
        new mf(32, (CharSequence) null);
        new mf(64, (CharSequence) null);
        new mf(128, (CharSequence) null);
        new mf(256, mn.class);
        new mf(512, mn.class);
        new mf(1024, mo.class);
        new mf(2048, mo.class);
        c = new mf(4096, (CharSequence) null);
        d = new mf(8192, (CharSequence) null);
        new mf(16384, (CharSequence) null);
        new mf(32768, (CharSequence) null);
        new mf(65536, (CharSequence) null);
        new mf(131072, ms.class);
        e = new mf(262144, (CharSequence) null);
        f = new mf(524288, (CharSequence) null);
        g = new mf(1048576, (CharSequence) null);
        new mf(2097152, mt.class);
        new mf(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, mq.class);
        h = new mf(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
        i = new mf(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, mr.class);
        new mf(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, mp.class);
        new mf(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
        new mf(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        }
        new mf(accessibilityAction, 16908372, null, null, null);
    }

    public mf(int i2, CharSequence charSequence) {
        this(null, i2, charSequence, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.j).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.j).getLabel();
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof mf) && this.j.equals(((mf) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    private mf(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public mf(Object obj, int i2, CharSequence charSequence, mu muVar, Class cls) {
        this.k = i2;
        this.m = muVar;
        this.j = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
        this.l = cls;
    }
}
