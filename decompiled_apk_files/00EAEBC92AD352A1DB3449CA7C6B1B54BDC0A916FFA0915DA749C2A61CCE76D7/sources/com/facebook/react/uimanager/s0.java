package com.facebook.react.uimanager;

import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a() {
        return com.facebook.react.common.f.a("bubblingEventTypes", r0.a(), "directEventTypes", r0.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(UIManagerModule.g gVar) {
        Map<String, Object> b2 = r0.b();
        if (!com.facebook.react.b0.a.f5409a) {
            b2.put("ViewManagerNames", gVar.a());
        }
        b2.put("LazyViewManagersEnabled", true);
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap b2 = com.facebook.react.common.f.b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            a(map3, exportedCustomBubblingEventTypeConstants);
            a(exportedCustomBubblingEventTypeConstants, map);
            b2.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            b2.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            a(map4, exportedCustomDirectEventTypeConstants);
            a(exportedCustomDirectEventTypeConstants, map2);
            b2.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            b2.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            b2.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            b2.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            b2.put("NativeProps", nativeProps);
        }
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> b2 = r0.b();
        Map<? extends String, ? extends Object> a2 = r0.a();
        Map<? extends String, ? extends Object> c2 = r0.c();
        if (map != null) {
            map.putAll(a2);
        }
        if (map2 != null) {
            map2.putAll(c2);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            b.AbstractC0140b a3 = com.facebook.systrace.b.a(0L, "UIManagerModuleConstantsHelper.createConstants");
            a3.a("ViewManager", name);
            a3.a("Lazy", (Object) false);
            a3.a();
            try {
                Map<String, Object> a4 = a(viewManager, null, null, map, map2);
                if (!a4.isEmpty()) {
                    b2.put(name, a4);
                }
            } finally {
                com.facebook.systrace.b.a(0L);
            }
        }
        b2.put("genericBubblingEventTypes", a2);
        b2.put("genericDirectEventTypes", c2);
        return b2;
    }

    private static void a(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Object obj : map2.keySet()) {
            Object obj2 = map2.get(obj);
            Object obj3 = map.get(obj);
            if (obj3 == null || !(obj2 instanceof Map) || !(obj3 instanceof Map)) {
                map.put(obj, obj2);
            } else {
                a((Map) obj3, (Map) obj2);
            }
        }
    }
}
