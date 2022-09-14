package com.facebook.react.devsupport;

import android.content.Context;
import java.util.Map;
/* loaded from: classes.dex */
public class a {
    public static com.facebook.react.devsupport.h.c a(Context context, e eVar, String str, boolean z, f fVar, com.facebook.react.devsupport.h.a aVar, int i, Map<String, Object> map) {
        if (!z) {
            return new b();
        }
        try {
            return (com.facebook.react.devsupport.h.c) Class.forName("com.facebook.react.devsupport.DevSupportManagerImpl").getConstructor(Context.class, e.class, String.class, Boolean.TYPE, f.class, com.facebook.react.devsupport.h.a.class, Integer.TYPE, Map.class).newInstance(context, eVar, str, true, fVar, aVar, Integer.valueOf(i), map);
        } catch (Exception e2) {
            throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e2);
        }
    }
}
