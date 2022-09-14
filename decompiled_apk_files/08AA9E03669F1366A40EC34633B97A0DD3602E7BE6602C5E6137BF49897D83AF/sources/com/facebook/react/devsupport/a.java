package com.facebook.react.devsupport;

import android.content.Context;
/* compiled from: DevSupportManagerFactory.java */
/* loaded from: classes.dex */
public class a {
    public static com.facebook.react.devsupport.a.b a(Context context, d dVar, String str, boolean z, e eVar, com.facebook.react.devsupport.a.a aVar, int i) {
        if (!z) {
            return new b();
        }
        try {
            return (com.facebook.react.devsupport.a.b) Class.forName("com.facebook.react.devsupport.DevSupportManagerImpl").getConstructor(Context.class, d.class, String.class, Boolean.TYPE, e.class, com.facebook.react.devsupport.a.a.class, Integer.TYPE).newInstance(context, dVar, str, true, eVar, aVar, Integer.valueOf(i));
        } catch (Exception e) {
            throw new RuntimeException("Requested enabled DevSupportManager, but DevSupportManagerImpl class was not found or could not be created", e);
        }
    }
}
