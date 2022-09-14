package com.facebook.react.uimanager;

import a.g.m.e0.c;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.HashMap;
/* loaded from: classes.dex */
public class s extends a.g.m.a {

    /* renamed from: f  reason: collision with root package name */
    private static int f6044f = 1056964608;

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap<String, Integer> f6045g = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<Integer, String> f6047e = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private Handler f6046d = new a(this);

    /* loaded from: classes.dex */
    class a extends Handler {
        a(s sVar) {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6048a = new int[c.values().length];

        static {
            try {
                f6048a[c.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6048a[c.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6048a[c.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6048a[c.IMAGEBUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6048a[c.KEYBOARDKEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6048a[c.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6048a[c.ADJUSTABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6048a[c.CHECKBOX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6048a[c.RADIO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6048a[c.SPINBUTTON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6048a[c.SWITCH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6048a[c.NONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6048a[c.LINK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6048a[c.SUMMARY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6048a[c.HEADER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6048a[c.ALERT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6048a[c.COMBOBOX.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6048a[c.MENU.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f6048a[c.MENUBAR.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f6048a[c.MENUITEM.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f6048a[c.PROGRESSBAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f6048a[c.RADIOGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f6048a[c.SCROLLBAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f6048a[c.TAB.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f6048a[c.TABLIST.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f6048a[c.TIMER.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f6048a[c.TOOLBAR.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NONE,
        BUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        TOOLBAR;

        public static c a(String str) {
            c[] values;
            for (c cVar : values()) {
                if (cVar.name().equalsIgnoreCase(str)) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static String a(c cVar) {
            switch (b.f6048a[cVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.EditText";
                case 3:
                    return "android.widget.ImageView";
                case 4:
                    return "android.widget.ImageButon";
                case 5:
                    return "android.inputmethodservice.Keyboard$Key";
                case 6:
                    return "android.widget.TextView";
                case 7:
                    return "android.widget.SeekBar";
                case 8:
                    return "android.widget.CheckBox";
                case 9:
                    return "android.widget.RadioButton";
                case 10:
                    return "android.widget.SpinButton";
                case 11:
                    return "android.widget.Switch";
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + cVar);
            }
        }
    }

    static {
        f6045g.put("activate", Integer.valueOf(c.a.f351g.a()));
        f6045g.put("longpress", Integer.valueOf(c.a.f352h.a()));
        f6045g.put("increment", Integer.valueOf(c.a.i.a()));
        f6045g.put("decrement", Integer.valueOf(c.a.j.a()));
    }

    private static void a(a.g.m.e0.c cVar, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(nextKey);
            if (nextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                cVar.n(dynamic.asBoolean());
            } else if (nextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                cVar.g(!dynamic.asBoolean());
            } else if (nextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean asBoolean = dynamic.asBoolean();
                cVar.b(true);
                cVar.c(asBoolean);
                if (cVar.d().equals(c.a(c.SWITCH))) {
                    cVar.i(context.getString(asBoolean ? com.facebook.react.j.state_on_description : com.facebook.react.j.state_off_description));
                }
            }
        }
    }

    public static void a(a.g.m.e0.c cVar, c cVar2, Context context) {
        int i;
        int i2;
        if (cVar2 == null) {
            cVar2 = c.NONE;
        }
        cVar.a(c.a(cVar2));
        if (cVar2.equals(c.LINK)) {
            cVar.g(context.getString(com.facebook.react.j.link_description));
            if (cVar.e() != null) {
                SpannableString spannableString = new SpannableString(cVar.e());
                spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 0);
                cVar.b((CharSequence) spannableString);
            }
            if (cVar.h() == null) {
                return;
            }
            SpannableString spannableString2 = new SpannableString(cVar.h());
            spannableString2.setSpan(new URLSpan(""), 0, spannableString2.length(), 0);
            cVar.i(spannableString2);
            return;
        }
        if (cVar2.equals(c.SEARCH)) {
            i = com.facebook.react.j.search_description;
        } else if (!cVar2.equals(c.IMAGE)) {
            if (cVar2.equals(c.IMAGEBUTTON)) {
                i2 = com.facebook.react.j.imagebutton_description;
            } else if (cVar2.equals(c.BUTTON)) {
                i2 = com.facebook.react.j.button_description;
            } else if (cVar2.equals(c.SUMMARY)) {
                i = com.facebook.react.j.summary_description;
            } else if (cVar2.equals(c.HEADER)) {
                cVar.g(context.getString(com.facebook.react.j.header_description));
                cVar.b(c.C0015c.a(0, 1, 0, 1, true));
                return;
            } else if (cVar2.equals(c.ALERT)) {
                i = com.facebook.react.j.alert_description;
            } else if (cVar2.equals(c.COMBOBOX)) {
                i = com.facebook.react.j.combobox_description;
            } else if (cVar2.equals(c.MENU)) {
                i = com.facebook.react.j.menu_description;
            } else if (cVar2.equals(c.MENUBAR)) {
                i = com.facebook.react.j.menubar_description;
            } else if (cVar2.equals(c.MENUITEM)) {
                i = com.facebook.react.j.menuitem_description;
            } else if (cVar2.equals(c.PROGRESSBAR)) {
                i = com.facebook.react.j.progressbar_description;
            } else if (cVar2.equals(c.RADIOGROUP)) {
                i = com.facebook.react.j.radiogroup_description;
            } else if (cVar2.equals(c.SCROLLBAR)) {
                i = com.facebook.react.j.scrollbar_description;
            } else if (cVar2.equals(c.SPINBUTTON)) {
                i = com.facebook.react.j.spinbutton_description;
            } else if (cVar2.equals(c.TAB)) {
                i = com.facebook.react.j.rn_tab_description;
            } else if (cVar2.equals(c.TABLIST)) {
                i = com.facebook.react.j.tablist_description;
            } else if (cVar2.equals(c.TIMER)) {
                i = com.facebook.react.j.timer_description;
            } else if (!cVar2.equals(c.TOOLBAR)) {
                return;
            } else {
                i = com.facebook.react.j.toolbar_description;
            }
            cVar.g(context.getString(i2));
            cVar.d(true);
            return;
        } else {
            i = com.facebook.react.j.image_description;
        }
        cVar.g(context.getString(i));
    }

    private void c(View view) {
        if (this.f6046d.hasMessages(1, view)) {
            this.f6046d.removeMessages(1, view);
        }
        this.f6046d.sendMessageDelayed(this.f6046d.obtainMessage(1, view), 200L);
    }

    public static void d(View view) {
        if (!a.g.m.v.C(view)) {
            if (view.getTag(com.facebook.react.h.accessibility_role) == null && view.getTag(com.facebook.react.h.accessibility_state) == null && view.getTag(com.facebook.react.h.accessibility_actions) == null) {
                return;
            }
            a.g.m.v.a(view, new s());
        }
    }

    @Override // a.g.m.a
    public void a(View view, a.g.m.e0.c cVar) {
        super.a(view, cVar);
        c cVar2 = (c) view.getTag(com.facebook.react.h.accessibility_role);
        if (cVar2 != null) {
            a(cVar, cVar2, view.getContext());
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.h.accessibility_state);
        if (readableMap != null) {
            a(cVar, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(com.facebook.react.h.accessibility_actions);
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap mo209getMap = readableArray.mo209getMap(i);
                if (!mo209getMap.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                int i2 = f6044f;
                String string = mo209getMap.hasKey("label") ? mo209getMap.getString("label") : null;
                if (f6045g.containsKey(mo209getMap.getString("name"))) {
                    i2 = f6045g.get(mo209getMap.getString("name")).intValue();
                } else {
                    f6044f++;
                }
                this.f6047e.put(Integer.valueOf(i2), mo209getMap.getString("name"));
                cVar.a(new c.a(i2, string));
            }
        }
        ReadableMap readableMap2 = (ReadableMap) view.getTag(com.facebook.react.h.accessibility_value);
        if (readableMap2 == null || !readableMap2.hasKey("min") || !readableMap2.hasKey("now") || !readableMap2.hasKey("max")) {
            return;
        }
        Dynamic dynamic = readableMap2.getDynamic("min");
        Dynamic dynamic2 = readableMap2.getDynamic("now");
        Dynamic dynamic3 = readableMap2.getDynamic("max");
        if (dynamic == null || dynamic.getType() != ReadableType.Number || dynamic2 == null || dynamic2.getType() != ReadableType.Number || dynamic3 == null || dynamic3.getType() != ReadableType.Number) {
            return;
        }
        int asInt = dynamic.asInt();
        int asInt2 = dynamic2.asInt();
        int asInt3 = dynamic3.asInt();
        if (asInt3 <= asInt || asInt2 < asInt || asInt3 < asInt2) {
            return;
        }
        cVar.a(c.d.a(0, asInt, asInt3, asInt2));
    }

    @Override // a.g.m.a
    public boolean a(View view, int i, Bundle bundle) {
        if (this.f6047e.containsKey(Integer.valueOf(i))) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("actionName", this.f6047e.get(Integer.valueOf(i)));
            ReactContext reactContext = (ReactContext) view.getContext();
            if (reactContext.hasActiveCatalystInstance()) {
                ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), "topAccessibilityAction", createMap);
            } else {
                ReactSoftException.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
            }
            c cVar = (c) view.getTag(com.facebook.react.h.accessibility_role);
            ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.h.accessibility_value);
            if (cVar != c.ADJUSTABLE) {
                return true;
            }
            if (i != c.a.i.a() && i != c.a.j.a()) {
                return true;
            }
            if (readableMap != null && !readableMap.hasKey("text")) {
                c(view);
            }
            return super.a(view, i, bundle);
        }
        return super.a(view, i, bundle);
    }

    @Override // a.g.m.a
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.h.accessibility_value);
        if (readableMap == null || !readableMap.hasKey("min") || !readableMap.hasKey("now") || !readableMap.hasKey("max")) {
            return;
        }
        Dynamic dynamic = readableMap.getDynamic("min");
        Dynamic dynamic2 = readableMap.getDynamic("now");
        Dynamic dynamic3 = readableMap.getDynamic("max");
        if (dynamic == null || dynamic.getType() != ReadableType.Number || dynamic2 == null || dynamic2.getType() != ReadableType.Number || dynamic3 == null || dynamic3.getType() != ReadableType.Number) {
            return;
        }
        int asInt = dynamic.asInt();
        int asInt2 = dynamic2.asInt();
        int asInt3 = dynamic3.asInt();
        if (asInt3 <= asInt || asInt2 < asInt || asInt3 < asInt2) {
            return;
        }
        accessibilityEvent.setItemCount(asInt3 - asInt);
        accessibilityEvent.setCurrentItemIndex(asInt2);
    }
}
