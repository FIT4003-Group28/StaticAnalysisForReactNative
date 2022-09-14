package com.facebook.react.uimanager;

import android.widget.ImageView;
import com.facebook.react.common.f;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
class r0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map a() {
        f.b a2 = com.facebook.react.common.f.a();
        a2.a("topChange", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onChange", "captured", "onChangeCapture")));
        a2.a("topSelect", com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onSelect", "captured", "onSelectCapture")));
        a2.a(com.facebook.react.uimanager.events.i.a(com.facebook.react.uimanager.events.i.START), com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onTouchStart", "captured", "onTouchStartCapture")));
        a2.a(com.facebook.react.uimanager.events.i.a(com.facebook.react.uimanager.events.i.MOVE), com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onTouchMove", "captured", "onTouchMoveCapture")));
        a2.a(com.facebook.react.uimanager.events.i.a(com.facebook.react.uimanager.events.i.END), com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onTouchEnd", "captured", "onTouchEndCapture")));
        a2.a(com.facebook.react.uimanager.events.i.a(com.facebook.react.uimanager.events.i.CANCEL), com.facebook.react.common.f.a("phasedRegistrationNames", com.facebook.react.common.f.a("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture")));
        return a2.a();
    }

    public static Map<String, Object> b() {
        HashMap b2 = com.facebook.react.common.f.b();
        b2.put("UIView", com.facebook.react.common.f.a("ContentMode", com.facebook.react.common.f.a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        b2.put("StyleConstants", com.facebook.react.common.f.a("PointerEventsValues", com.facebook.react.common.f.a("none", Integer.valueOf(r.NONE.ordinal()), "boxNone", Integer.valueOf(r.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(r.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(r.AUTO.ordinal()))));
        b2.put("PopupMenu", com.facebook.react.common.f.a("dismissed", "dismissed", "itemSelected", "itemSelected"));
        b2.put("AccessibilityEventTypes", com.facebook.react.common.f.a("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map c() {
        f.b a2 = com.facebook.react.common.f.a();
        a2.a("topContentSizeChange", com.facebook.react.common.f.a("registrationName", "onContentSizeChange"));
        a2.a("topLayout", com.facebook.react.common.f.a("registrationName", "onLayout"));
        a2.a("topLoadingError", com.facebook.react.common.f.a("registrationName", "onLoadingError"));
        a2.a("topLoadingFinish", com.facebook.react.common.f.a("registrationName", "onLoadingFinish"));
        a2.a("topLoadingStart", com.facebook.react.common.f.a("registrationName", "onLoadingStart"));
        a2.a("topSelectionChange", com.facebook.react.common.f.a("registrationName", "onSelectionChange"));
        a2.a("topMessage", com.facebook.react.common.f.a("registrationName", "onMessage"));
        a2.a("topClick", com.facebook.react.common.f.a("registrationName", "onClick"));
        a2.a("topScrollBeginDrag", com.facebook.react.common.f.a("registrationName", "onScrollBeginDrag"));
        a2.a("topScrollEndDrag", com.facebook.react.common.f.a("registrationName", "onScrollEndDrag"));
        a2.a("topScroll", com.facebook.react.common.f.a("registrationName", "onScroll"));
        a2.a("topMomentumScrollBegin", com.facebook.react.common.f.a("registrationName", "onMomentumScrollBegin"));
        a2.a("topMomentumScrollEnd", com.facebook.react.common.f.a("registrationName", "onMomentumScrollEnd"));
        return a2.a();
    }
}
