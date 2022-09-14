package com.facebook.react.uimanager;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: UIManagerModuleConstants.java */
/* loaded from: classes.dex */
class al {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map a() {
        return com.facebook.react.b.f.c().a("topChange", com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onChange", "captured", "onChangeCapture"))).a("topSelect", com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onSelect", "captured", "onSelectCapture"))).a(com.facebook.react.uimanager.events.h.START.a(), com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).a(com.facebook.react.uimanager.events.h.MOVE.a(), com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).a(com.facebook.react.uimanager.events.h.END.a(), com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).a(com.facebook.react.uimanager.events.h.CANCEL.a(), com.facebook.react.b.f.a("phasedRegistrationNames", com.facebook.react.b.f.a("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map b() {
        return com.facebook.react.b.f.c().a("topContentSizeChange", com.facebook.react.b.f.a("registrationName", "onContentSizeChange")).a("topLayout", com.facebook.react.b.f.a("registrationName", "onLayout")).a("topLoadingError", com.facebook.react.b.f.a("registrationName", "onLoadingError")).a("topLoadingFinish", com.facebook.react.b.f.a("registrationName", "onLoadingFinish")).a("topLoadingStart", com.facebook.react.b.f.a("registrationName", "onLoadingStart")).a("topSelectionChange", com.facebook.react.b.f.a("registrationName", "onSelectionChange")).a("topMessage", com.facebook.react.b.f.a("registrationName", "onMessage")).a("topScrollBeginDrag", com.facebook.react.b.f.a("registrationName", "onScrollBeginDrag")).a("topScrollEndDrag", com.facebook.react.b.f.a("registrationName", "onScrollEndDrag")).a("topScroll", com.facebook.react.b.f.a("registrationName", "onScroll")).a("topMomentumScrollBegin", com.facebook.react.b.f.a("registrationName", "onMomentumScrollBegin")).a("topMomentumScrollEnd", com.facebook.react.b.f.a("registrationName", "onMomentumScrollEnd")).a();
    }

    public static Map<String, Object> c() {
        HashMap a2 = com.facebook.react.b.f.a();
        a2.put("UIView", com.facebook.react.b.f.a("ContentMode", com.facebook.react.b.f.a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        a2.put("StyleConstants", com.facebook.react.b.f.a("PointerEventsValues", com.facebook.react.b.f.a("none", Integer.valueOf(p.NONE.ordinal()), "boxNone", Integer.valueOf(p.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(p.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(p.AUTO.ordinal()))));
        a2.put("PopupMenu", com.facebook.react.b.f.a("dismissed", "dismissed", "itemSelected", "itemSelected"));
        a2.put("AccessibilityEventTypes", com.facebook.react.b.f.a("typeWindowStateChanged", 32, "typeViewClicked", 1));
        return a2;
    }
}
