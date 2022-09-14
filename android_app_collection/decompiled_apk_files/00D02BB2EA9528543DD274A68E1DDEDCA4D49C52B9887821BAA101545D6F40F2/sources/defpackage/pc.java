package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: pc  reason: default package */
/* loaded from: classes.dex */
public final class pc {
    public static int d;
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    private pc(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    @Deprecated
    public pc(Object obj) {
        this.a = (AccessibilityNodeInfo) obj;
    }

    public static ClickableSpan[] E(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static final SparseArray<WeakReference<ClickableSpan>> Q(View view) {
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    public static pc a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new pc(accessibilityNodeInfo);
    }

    public static pc b(View view) {
        return a(AccessibilityNodeInfo.obtain(view));
    }

    public static pc c() {
        return a(AccessibilityNodeInfo.obtain());
    }

    public final CharSequence A() {
        return this.a.getClassName();
    }

    public final void B(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final CharSequence C() {
        if (g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return this.a.getText();
        }
        List<Integer> g = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> g2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> g3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> g4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i = 0; i < g.size(); i++) {
            spannableString.setSpan(new ox(g4.get(i).intValue(), this, L().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), g.get(i).intValue(), g2.get(i).intValue(), g3.get(i).intValue());
        }
        return spannableString;
    }

    public final void D(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final CharSequence F() {
        return this.a.getContentDescription();
    }

    public final void G(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void H(Object obj) {
        this.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) (obj == null ? null : ((oz) obj).a));
    }

    public final void I(Object obj) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((pa) obj).a);
    }

    public final void J(pb pbVar) {
        this.a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) pbVar.a);
    }

    public final void K(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setHintText(charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public final Bundle L() {
        return this.a.getExtras();
    }

    public final void M(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalAfter(view);
        }
    }

    public final void N(boolean z) {
        this.a.setDismissable(z);
    }

    public final void O(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            P(1, z);
        }
    }

    public final void P(int i, boolean z) {
        Bundle L = L();
        if (L != null) {
            int i2 = L.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (true != z) {
                i = 0;
            }
            L.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void R(oy oyVar) {
        this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) oyVar.k);
    }

    public final void S() {
        this.a.setSelected(true);
    }

    public final void T() {
        this.a.setVisibleToUser(true);
    }

    public final int d() {
        return this.a.getChildCount();
    }

    public final void e(View view, int i) {
        this.a.addChild(view, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pc)) {
            return false;
        }
        pc pcVar = (pc) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (pcVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(pcVar.a)) {
            return false;
        }
        return this.c == pcVar.c && this.b == pcVar.b;
    }

    public final void f(int i) {
        this.a.addAction(i);
    }

    public final List<Integer> g(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final void h(oy oyVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) oyVar.k);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    @Deprecated
    public final void j(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    @Deprecated
    public final void k(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void l(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void m(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void n(boolean z) {
        this.a.setCheckable(z);
    }

    public final boolean o() {
        return this.a.isChecked();
    }

    public final boolean p() {
        return this.a.isFocusable();
    }

    public final void q(boolean z) {
        this.a.setFocusable(z);
    }

    public final void r(boolean z) {
        this.a.setFocused(z);
    }

    public final void s(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public final void t(boolean z) {
        this.a.setClickable(z);
    }

    public final String toString() {
        List emptyList;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb.append("; boundsInParent: " + rect);
        l(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.a.getPackageName());
        sb.append("; className: ");
        sb.append(A());
        sb.append("; text: ");
        sb.append(C());
        sb.append("; contentDescription: ");
        sb.append(F());
        sb.append("; viewId: ");
        sb.append(this.a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.a.isCheckable());
        sb.append("; checked: ");
        sb.append(o());
        sb.append("; focusable: ");
        sb.append(p());
        sb.append("; focused: ");
        sb.append(this.a.isFocused());
        sb.append("; selected: ");
        sb.append(this.a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(u());
        sb.append("; password: ");
        sb.append(w());
        sb.append("; scrollable: " + x());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                emptyList.add(new oy(actionList.get(i), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < emptyList.size(); i2++) {
            oy oyVar = (oy) emptyList.get(i2);
            int a = oyVar.a();
            if (a == 1) {
                str = "ACTION_FOCUS";
            } else if (a != 2) {
                switch (a) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case com.google.android.filament.R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case com.google.android.filament.R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case ImageMetadata.CONTROL_AE_ANTIBANDING_MODE /* 65536 */:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        str = "ACTION_EXPAND";
                        break;
                    case ImageMetadata.LENS_APERTURE /* 524288 */:
                        str = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str = "ACTION_MOVE_WINDOW";
                        break;
                    case 16908372:
                        str = "ACTION_IME_ENTER";
                        break;
                    default:
                        switch (a) {
                            case 16908342:
                                str = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a) {
                                    case 16908356:
                                        str = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str = "ACTION_PAGE_RIGHT";
                                        break;
                                    case 16908362:
                                        str = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        str = "ACTION_UNKNOWN";
                                        break;
                                }
                        }
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && oyVar.b() != null) {
                str = oyVar.b().toString();
            }
            sb.append(str);
            if (i2 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        return this.a.isEnabled();
    }

    public final void v(boolean z) {
        this.a.setEnabled(z);
    }

    public final boolean w() {
        return this.a.isPassword();
    }

    public final boolean x() {
        return this.a.isScrollable();
    }

    public final void y(boolean z) {
        this.a.setScrollable(z);
    }

    public final void z(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }
}
