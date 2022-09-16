package a.g.m.e0;

import a.g.m.e0.f;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static int f345d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f346a;

    /* renamed from: b  reason: collision with root package name */
    public int f347b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f348c = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f349e = new a(1, null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f350f = new a(2, null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f351g;

        /* renamed from: h  reason: collision with root package name */
        public static final a f352h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;

        /* renamed from: a  reason: collision with root package name */
        final Object f353a;

        /* renamed from: b  reason: collision with root package name */
        private final int f354b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends f.a> f355c;

        /* renamed from: d  reason: collision with root package name */
        protected final f f356d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(4, null);
            new a(8, null);
            f351g = new a(16, null);
            f352h = new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, f.b.class);
            new a(512, null, f.b.class);
            new a(1024, null, f.c.class);
            new a(2048, null, f.c.class);
            i = new a(4096, null);
            j = new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, f.g.class);
            k = new a(262144, null);
            l = new a(524288, null);
            m = new a(1048576, null);
            new a(2097152, null, f.h.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, f.e.class);
            n = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            o = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            p = new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.C0016f.class);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, f.d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new a(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            if (Build.VERSION.SDK_INT >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            new a(accessibilityAction, 16908372, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f354b = i2;
            this.f356d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            }
            this.f353a = obj;
            this.f355c = cls;
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f353a).getId();
            }
            return 0;
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.f354b, charSequence, fVar, this.f355c);
        }

        public boolean a(View view, Bundle bundle) {
            f.a newInstance;
            if (this.f356d != null) {
                f.a aVar = null;
                Class<? extends f.a> cls = this.f355c;
                if (cls != null) {
                    try {
                        newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e2) {
                        e = e2;
                    }
                    try {
                        newInstance.a(bundle);
                        aVar = newInstance;
                    } catch (Exception e3) {
                        e = e3;
                        aVar = newInstance;
                        Class<? extends f.a> cls2 = this.f355c;
                        String name = cls2 == null ? "null" : cls2.getName();
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                        return this.f356d.a(view, aVar);
                    }
                }
                return this.f356d.a(view, aVar);
            }
            return false;
        }

        public CharSequence b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f353a).getLabel();
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                Object obj2 = this.f353a;
                Object obj3 = ((a) obj).f353a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f353a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f357a;

        b(Object obj) {
            this.f357a = obj;
        }

        public static b a(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new b(null);
        }
    }

    /* renamed from: a.g.m.e0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0015c {

        /* renamed from: a  reason: collision with root package name */
        final Object f358a;

        C0015c(Object obj) {
            this.f358a = obj;
        }

        public static C0015c a(int i, int i2, int i3, int i4, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new C0015c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0015c(null);
        }

        public static C0015c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0015c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0015c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0015c(null);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final Object f359a;

        d(Object obj) {
            this.f359a = obj;
        }

        public static d a(int i, float f2, float f3, float f4) {
            return Build.VERSION.SDK_INT >= 19 ? new d(AccessibilityNodeInfo.RangeInfo.obtain(i, f2, f3, f4)) : new d(null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f346a = accessibilityNodeInfo;
    }

    public static c A() {
        return a(AccessibilityNodeInfo.obtain());
    }

    private int a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f345d;
        f345d = i2 + 1;
        return i2;
    }

    public static c a(c cVar) {
        return a(AccessibilityNodeInfo.obtain(cVar.f346a));
    }

    public static c a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private List<Integer> a(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f346a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f346a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private void a(int i, boolean z) {
        Bundle f2 = f();
        if (f2 != null) {
            int i2 = f2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            f2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private void a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private static String b(int i) {
        if (i != 1) {
            if (i == 2) {
                return "ACTION_CLEAR_FOCUS";
            }
            switch (i) {
                case 4:
                    return "ACTION_SELECT";
                case 8:
                    return "ACTION_CLEAR_SELECTION";
                case 16:
                    return "ACTION_CLICK";
                case 32:
                    return "ACTION_LONG_CLICK";
                case 64:
                    return "ACTION_ACCESSIBILITY_FOCUS";
                case 128:
                    return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                case 256:
                    return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                case 512:
                    return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                case 1024:
                    return "ACTION_NEXT_HTML_ELEMENT";
                case 2048:
                    return "ACTION_PREVIOUS_HTML_ELEMENT";
                case 4096:
                    return "ACTION_SCROLL_FORWARD";
                case 8192:
                    return "ACTION_SCROLL_BACKWARD";
                case 16384:
                    return "ACTION_COPY";
                case 32768:
                    return "ACTION_PASTE";
                case 65536:
                    return "ACTION_CUT";
                case 131072:
                    return "ACTION_SET_SELECTION";
                case 262144:
                    return "ACTION_EXPAND";
                case 524288:
                    return "ACTION_COLLAPSE";
                case 2097152:
                    return "ACTION_SET_TEXT";
                case 16908354:
                    return "ACTION_MOVE_WINDOW";
                case 16908372:
                    return "ACTION_IME_ENTER";
                default:
                    switch (i) {
                        case 16908342:
                            return "ACTION_SHOW_ON_SCREEN";
                        case 16908343:
                            return "ACTION_SCROLL_TO_POSITION";
                        case 16908344:
                            return "ACTION_SCROLL_UP";
                        case 16908345:
                            return "ACTION_SCROLL_LEFT";
                        case 16908346:
                            return "ACTION_SCROLL_DOWN";
                        case 16908347:
                            return "ACTION_SCROLL_RIGHT";
                        case 16908348:
                            return "ACTION_CONTEXT_CLICK";
                        case 16908349:
                            return "ACTION_SET_PROGRESS";
                        default:
                            switch (i) {
                                case 16908356:
                                    return "ACTION_SHOW_TOOLTIP";
                                case 16908357:
                                    return "ACTION_HIDE_TOOLTIP";
                                case 16908358:
                                    return "ACTION_PAGE_UP";
                                case 16908359:
                                    return "ACTION_PAGE_DOWN";
                                case 16908360:
                                    return "ACTION_PAGE_LEFT";
                                case 16908361:
                                    return "ACTION_PAGE_RIGHT";
                                case 16908362:
                                    return "ACTION_PRESS_AND_HOLD";
                                default:
                                    return "ACTION_UNKNOWN";
                            }
                    }
            }
        }
        return "ACTION_FOCUS";
    }

    private boolean c(int i) {
        Bundle f2 = f();
        return f2 != null && (f2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    private SparseArray<WeakReference<ClickableSpan>> d(View view) {
        SparseArray<WeakReference<ClickableSpan>> e2 = e(view);
        if (e2 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(a.g.c.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return e2;
    }

    private SparseArray<WeakReference<ClickableSpan>> e(View view) {
        return (SparseArray) view.getTag(a.g.c.tag_accessibility_clickable_spans);
    }

    public static c f(View view) {
        return a(AccessibilityNodeInfo.obtain(view));
    }

    private void g(View view) {
        SparseArray<WeakReference<ClickableSpan>> e2 = e(view);
        if (e2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < e2.size(); i++) {
                if (e2.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e2.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public static ClickableSpan[] j(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private void y() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f346a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f346a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f346a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f346a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private boolean z() {
        return !a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public List<a> a() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f346a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void a(int i) {
        this.f346a.addAction(i);
    }

    public void a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f346a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f353a);
        }
    }

    public void a(d dVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f346a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f359a);
        }
    }

    @Deprecated
    public void a(Rect rect) {
        this.f346a.getBoundsInParent(rect);
    }

    public void a(View view) {
        this.f346a.addChild(view);
    }

    public void a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f346a.addChild(view, i);
        }
    }

    public void a(CharSequence charSequence) {
        this.f346a.setClassName(charSequence);
    }

    public void a(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i < 19 || i >= 26) {
            return;
        }
        y();
        g(view);
        ClickableSpan[] j = j(charSequence);
        if (j == null || j.length <= 0) {
            return;
        }
        f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", a.g.c.accessibility_action_clickable_span);
        SparseArray<WeakReference<ClickableSpan>> d2 = d(view);
        for (int i2 = 0; j != null && i2 < j.length; i2++) {
            int a2 = a(j[i2], d2);
            d2.put(a2, new WeakReference<>(j[i2]));
            a(j[i2], (Spanned) charSequence, a2);
        }
    }

    public void a(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f346a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f357a);
        }
    }

    public void a(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f346a.setAccessibilityFocused(z);
        }
    }

    public boolean a(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f346a.performAction(i, bundle);
        }
        return false;
    }

    public int b() {
        return this.f346a.getActions();
    }

    public void b(Rect rect) {
        this.f346a.getBoundsInScreen(rect);
    }

    public void b(View view) {
        this.f347b = -1;
        this.f346a.setParent(view);
    }

    public void b(View view, int i) {
        this.f347b = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f346a.setParent(view, i);
        }
    }

    public void b(CharSequence charSequence) {
        this.f346a.setContentDescription(charSequence);
    }

    public void b(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f346a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0015c) obj).f358a);
        }
    }

    public void b(boolean z) {
        this.f346a.setCheckable(z);
    }

    public boolean b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f346a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f353a);
        }
        return false;
    }

    public int c() {
        return this.f346a.getChildCount();
    }

    @Deprecated
    public void c(Rect rect) {
        this.f346a.setBoundsInParent(rect);
    }

    public void c(View view) {
        this.f348c = -1;
        this.f346a.setSource(view);
    }

    public void c(View view, int i) {
        this.f348c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f346a.setSource(view, i);
        }
    }

    public void c(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f346a.setError(charSequence);
        }
    }

    public void c(boolean z) {
        this.f346a.setChecked(z);
    }

    public CharSequence d() {
        return this.f346a.getClassName();
    }

    public void d(Rect rect) {
        this.f346a.setBoundsInScreen(rect);
    }

    public void d(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f346a.setHintText(charSequence);
        } else if (i < 19) {
        } else {
            this.f346a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void d(boolean z) {
        this.f346a.setClickable(z);
    }

    public CharSequence e() {
        return this.f346a.getContentDescription();
    }

    public void e(CharSequence charSequence) {
        this.f346a.setPackageName(charSequence);
    }

    public void e(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f346a.setContentInvalid(z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f346a;
        if (accessibilityNodeInfo == null) {
            if (cVar.f346a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f346a)) {
            return false;
        }
        return this.f348c == cVar.f348c && this.f347b == cVar.f347b;
    }

    public Bundle f() {
        return Build.VERSION.SDK_INT >= 19 ? this.f346a.getExtras() : new Bundle();
    }

    public void f(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f346a.setPaneTitle(charSequence);
        } else if (i < 19) {
        } else {
            this.f346a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void f(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f346a.setDismissable(z);
        }
    }

    public CharSequence g() {
        return this.f346a.getPackageName();
    }

    public void g(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f346a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public void g(boolean z) {
        this.f346a.setEnabled(z);
    }

    public CharSequence h() {
        if (z()) {
            List<Integer> a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f346a.getText(), 0, this.f346a.getText().length()));
            for (int i = 0; i < a2.size(); i++) {
                spannableString.setSpan(new a.g.m.e0.a(a5.get(i).intValue(), this, f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a2.get(i).intValue(), a3.get(i).intValue(), a4.get(i).intValue());
            }
            return spannableString;
        }
        return this.f346a.getText();
    }

    public void h(CharSequence charSequence) {
        if (a.g.j.a.a()) {
            this.f346a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            this.f346a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void h(boolean z) {
        this.f346a.setFocusable(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f346a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String i() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f346a.getViewIdResourceName();
        }
        return null;
    }

    public void i(CharSequence charSequence) {
        this.f346a.setText(charSequence);
    }

    public void i(boolean z) {
        this.f346a.setFocused(z);
    }

    public void j(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f346a.setHeading(z);
        } else {
            a(2, z);
        }
    }

    public boolean j() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f346a.isAccessibilityFocused();
        }
        return false;
    }

    public void k(boolean z) {
        this.f346a.setLongClickable(z);
    }

    public boolean k() {
        return this.f346a.isCheckable();
    }

    public void l(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f346a.setScreenReaderFocusable(z);
        } else {
            a(1, z);
        }
    }

    public boolean l() {
        return this.f346a.isChecked();
    }

    public void m(boolean z) {
        this.f346a.setScrollable(z);
    }

    public boolean m() {
        return this.f346a.isClickable();
    }

    public void n(boolean z) {
        this.f346a.setSelected(z);
    }

    public boolean n() {
        return this.f346a.isEnabled();
    }

    public void o(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f346a.setShowingHintText(z);
        } else {
            a(4, z);
        }
    }

    public boolean o() {
        return this.f346a.isFocusable();
    }

    public void p(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f346a.setVisibleToUser(z);
        }
    }

    public boolean p() {
        return this.f346a.isFocused();
    }

    public boolean q() {
        return this.f346a.isLongClickable();
    }

    public boolean r() {
        return this.f346a.isPassword();
    }

    public boolean s() {
        return this.f346a.isScrollable();
    }

    public boolean t() {
        return this.f346a.isSelected();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(g());
        sb.append("; className: ");
        sb.append(d());
        sb.append("; text: ");
        sb.append(h());
        sb.append("; contentDescription: ");
        sb.append(e());
        sb.append("; viewId: ");
        sb.append(i());
        sb.append("; checkable: ");
        sb.append(k());
        sb.append("; checked: ");
        sb.append(l());
        sb.append("; focusable: ");
        sb.append(o());
        sb.append("; focused: ");
        sb.append(p());
        sb.append("; selected: ");
        sb.append(t());
        sb.append("; clickable: ");
        sb.append(m());
        sb.append("; longClickable: ");
        sb.append(q());
        sb.append("; enabled: ");
        sb.append(n());
        sb.append("; password: ");
        sb.append(r());
        sb.append("; scrollable: " + s());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> a2 = a();
            for (int i = 0; i < a2.size(); i++) {
                a aVar = a2.get(i);
                String b2 = b(aVar.a());
                if (b2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                    b2 = aVar.b().toString();
                }
                sb.append(b2);
                if (i != a2.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int b3 = b();
            while (b3 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b3);
                b3 &= ~numberOfTrailingZeros;
                sb.append(b(numberOfTrailingZeros));
                if (b3 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean u() {
        return Build.VERSION.SDK_INT >= 26 ? this.f346a.isShowingHintText() : c(4);
    }

    public boolean v() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f346a.isVisibleToUser();
        }
        return false;
    }

    public void w() {
        this.f346a.recycle();
    }

    public AccessibilityNodeInfo x() {
        return this.f346a;
    }
}
