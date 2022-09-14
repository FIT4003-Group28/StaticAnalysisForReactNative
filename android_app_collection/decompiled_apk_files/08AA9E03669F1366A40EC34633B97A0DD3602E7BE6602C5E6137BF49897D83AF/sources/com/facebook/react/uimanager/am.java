package com.facebook.react.uimanager;

import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UIManagerModuleConstantsHelper.java */
/* loaded from: classes.dex */
public class am {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(UIManagerModule.c cVar) {
        Map<String, Object> c2 = al.c();
        c2.put("ViewManagerNames", cVar.a());
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a() {
        return com.facebook.react.b.f.a("bubblingEventTypes", al.a(), "directEventTypes", al.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        Map<String, Object> c2 = al.c();
        Map<? extends String, ? extends Object> a2 = al.a();
        Map<? extends String, ? extends Object> b2 = al.b();
        if (map != null) {
            map.putAll(a2);
        }
        if (map2 != null) {
            map2.putAll(b2);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            com.facebook.m.b.a(0L, "UIManagerModuleConstantsHelper.createConstants").a("ViewManager", name).a("Lazy", (Object) false).a();
            try {
                Map<String, Object> a3 = a(viewManager, null, null, map, map2);
                if (!a3.isEmpty()) {
                    c2.put(name, a3);
                }
            } finally {
                com.facebook.m.a.b(0L);
            }
        }
        c2.put("genericBubblingEventTypes", a2);
        c2.put("genericDirectEventTypes", b2);
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap a2 = com.facebook.react.b.f.a();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            a(map3, exportedCustomBubblingEventTypeConstants);
            a(exportedCustomBubblingEventTypeConstants, map);
            a2.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            a2.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            a(map4, exportedCustomDirectEventTypeConstants);
            a(exportedCustomDirectEventTypeConstants, map2);
            a2.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            a2.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            a2.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            a2.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            a2.put("NativeProps", nativeProps);
        }
        return a2;
    }

    private static void a(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Object obj : map2.keySet()) {
            Object obj2 = map2.get(obj);
            Object obj3 = map.get(obj);
            if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                a((Map) obj3, (Map) obj2);
            } else {
                map.put(obj, obj2);
            }
        }
    }
}
