package android.support.v4.j.a;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f483a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final AccessibilityNodeInfo f484b;

    private static String b(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
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
            case PKIFailureInfo.certRevoked /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case PKIFailureInfo.notAuthorized /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* renamed from: android.support.v4.j.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0010a {
        public static final C0010a A;
        public static final C0010a B;
        public static final C0010a C;
        public static final C0010a D;

        /* renamed from: a  reason: collision with root package name */
        public static final C0010a f485a = new C0010a(1, null);

        /* renamed from: b  reason: collision with root package name */
        public static final C0010a f486b = new C0010a(2, null);

        /* renamed from: c  reason: collision with root package name */
        public static final C0010a f487c = new C0010a(4, null);

        /* renamed from: d  reason: collision with root package name */
        public static final C0010a f488d = new C0010a(8, null);
        public static final C0010a e = new C0010a(16, null);
        public static final C0010a f = new C0010a(32, null);
        public static final C0010a g = new C0010a(64, null);
        public static final C0010a h = new C0010a(128, null);
        public static final C0010a i = new C0010a(256, null);
        public static final C0010a j = new C0010a(512, null);
        public static final C0010a k = new C0010a(1024, null);
        public static final C0010a l = new C0010a(2048, null);
        public static final C0010a m = new C0010a(4096, null);
        public static final C0010a n = new C0010a(PKIFailureInfo.certRevoked, null);
        public static final C0010a o = new C0010a(16384, null);
        public static final C0010a p = new C0010a(32768, null);
        public static final C0010a q = new C0010a(PKIFailureInfo.notAuthorized, null);
        public static final C0010a r = new C0010a(131072, null);
        public static final C0010a s = new C0010a(PKIFailureInfo.transactionIdInUse, null);
        public static final C0010a t = new C0010a(PKIFailureInfo.signerNotTrusted, null);
        public static final C0010a u = new C0010a(PKIFailureInfo.badCertTemplate, null);
        public static final C0010a v = new C0010a(PKIFailureInfo.badSenderNonce, null);
        public static final C0010a w;
        public static final C0010a x;
        public static final C0010a y;
        public static final C0010a z;
        final Object E;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            w = new C0010a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
            x = new C0010a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);
            y = new C0010a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null);
            z = new C0010a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null);
            A = new C0010a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null);
            B = new C0010a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null);
            C = new C0010a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null);
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            }
            D = new C0010a(accessibilityAction);
        }

        public C0010a(int i2, CharSequence charSequence) {
            this(Build.VERSION.SDK_INT >= 21 ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : null);
        }

        C0010a(Object obj) {
            this.E = obj;
        }
    }

    private a(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f484b = accessibilityNodeInfo;
    }

    public static a a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new a(accessibilityNodeInfo);
    }

    public AccessibilityNodeInfo a() {
        return this.f484b;
    }

    public static a a(a aVar) {
        return a(AccessibilityNodeInfo.obtain(aVar.f484b));
    }

    public void a(View view) {
        this.f484b.setSource(view);
    }

    public void b(View view) {
        this.f484b.addChild(view);
    }

    public int b() {
        return this.f484b.getActions();
    }

    public void a(int i) {
        this.f484b.addAction(i);
    }

    public boolean a(C0010a c0010a) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f484b.removeAction((AccessibilityNodeInfo.AccessibilityAction) c0010a.E);
        }
        return false;
    }

    public void c(View view) {
        this.f484b.setParent(view);
    }

    public void a(Rect rect) {
        this.f484b.getBoundsInParent(rect);
    }

    public void b(Rect rect) {
        this.f484b.setBoundsInParent(rect);
    }

    public void c(Rect rect) {
        this.f484b.getBoundsInScreen(rect);
    }

    public void d(Rect rect) {
        this.f484b.setBoundsInScreen(rect);
    }

    public boolean c() {
        return this.f484b.isCheckable();
    }

    public boolean d() {
        return this.f484b.isChecked();
    }

    public boolean e() {
        return this.f484b.isFocusable();
    }

    public void a(boolean z) {
        this.f484b.setFocusable(z);
    }

    public boolean f() {
        return this.f484b.isFocused();
    }

    public void b(boolean z) {
        this.f484b.setFocused(z);
    }

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f484b.isVisibleToUser();
        }
        return false;
    }

    public void c(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f484b.setVisibleToUser(z);
        }
    }

    public boolean h() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f484b.isAccessibilityFocused();
        }
        return false;
    }

    public void d(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f484b.setAccessibilityFocused(z);
        }
    }

    public boolean i() {
        return this.f484b.isSelected();
    }

    public void e(boolean z) {
        this.f484b.setSelected(z);
    }

    public boolean j() {
        return this.f484b.isClickable();
    }

    public void f(boolean z) {
        this.f484b.setClickable(z);
    }

    public boolean k() {
        return this.f484b.isLongClickable();
    }

    public void g(boolean z) {
        this.f484b.setLongClickable(z);
    }

    public boolean l() {
        return this.f484b.isEnabled();
    }

    public void h(boolean z) {
        this.f484b.setEnabled(z);
    }

    public boolean m() {
        return this.f484b.isPassword();
    }

    public boolean n() {
        return this.f484b.isScrollable();
    }

    public void i(boolean z) {
        this.f484b.setScrollable(z);
    }

    public CharSequence o() {
        return this.f484b.getPackageName();
    }

    public void a(CharSequence charSequence) {
        this.f484b.setPackageName(charSequence);
    }

    public CharSequence p() {
        return this.f484b.getClassName();
    }

    public void b(CharSequence charSequence) {
        this.f484b.setClassName(charSequence);
    }

    public CharSequence q() {
        return this.f484b.getText();
    }

    public CharSequence r() {
        return this.f484b.getContentDescription();
    }

    public void c(CharSequence charSequence) {
        this.f484b.setContentDescription(charSequence);
    }

    public void s() {
        this.f484b.recycle();
    }

    public String t() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f484b.getViewIdResourceName();
        }
        return null;
    }

    public int hashCode() {
        if (this.f484b == null) {
            return 0;
        }
        return this.f484b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f484b == null) {
            if (aVar.f484b != null) {
                return false;
            }
        } else if (!this.f484b.equals(aVar.f484b)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        c(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(o());
        sb.append("; className: ");
        sb.append(p());
        sb.append("; text: ");
        sb.append(q());
        sb.append("; contentDescription: ");
        sb.append(r());
        sb.append("; viewId: ");
        sb.append(t());
        sb.append("; checkable: ");
        sb.append(c());
        sb.append("; checked: ");
        sb.append(d());
        sb.append("; focusable: ");
        sb.append(e());
        sb.append("; focused: ");
        sb.append(f());
        sb.append("; selected: ");
        sb.append(i());
        sb.append("; clickable: ");
        sb.append(j());
        sb.append("; longClickable: ");
        sb.append(k());
        sb.append("; enabled: ");
        sb.append(l());
        sb.append("; password: ");
        sb.append(m());
        sb.append("; scrollable: " + n());
        sb.append("; [");
        int b2 = b();
        while (b2 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b2);
            b2 &= ~numberOfTrailingZeros;
            sb.append(b(numberOfTrailingZeros));
            if (b2 != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
