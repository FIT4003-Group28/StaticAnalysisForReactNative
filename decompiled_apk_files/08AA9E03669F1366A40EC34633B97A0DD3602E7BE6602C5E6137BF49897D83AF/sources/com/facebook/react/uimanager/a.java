package com.facebook.react.uimanager;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.RadioButton;
/* compiled from: AccessibilityHelper.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private static final View.AccessibilityDelegate f3736a = new View.AccessibilityDelegate() { // from class: com.facebook.react.uimanager.a.1
        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(Button.class.getName());
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static final View.AccessibilityDelegate f3737b = new View.AccessibilityDelegate() { // from class: com.facebook.react.uimanager.a.2
        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(RadioButton.class.getName());
            accessibilityEvent.setChecked(true);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static final View.AccessibilityDelegate f3738c = new View.AccessibilityDelegate() { // from class: com.facebook.react.uimanager.a.3
        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(RadioButton.class.getName());
            accessibilityEvent.setChecked(false);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(RadioButton.class.getName());
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(false);
        }
    };

    public static void a(View view, String str) {
        if (str == null) {
            view.setAccessibilityDelegate(null);
            return;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1377687758) {
            if (hashCode != -1320494052) {
                if (hashCode == -714126251 && str.equals("radiobutton_checked")) {
                    c2 = 1;
                }
            } else if (str.equals("radiobutton_unchecked")) {
                c2 = 2;
            }
        } else if (str.equals("button")) {
            c2 = 0;
        }
        switch (c2) {
            case 0:
                view.setAccessibilityDelegate(f3736a);
                return;
            case 1:
                view.setAccessibilityDelegate(f3737b);
                return;
            case 2:
                view.setAccessibilityDelegate(f3738c);
                return;
            default:
                view.setAccessibilityDelegate(null);
                return;
        }
    }

    public static void a(View view, int i) {
        view.sendAccessibilityEvent(i);
    }
}
