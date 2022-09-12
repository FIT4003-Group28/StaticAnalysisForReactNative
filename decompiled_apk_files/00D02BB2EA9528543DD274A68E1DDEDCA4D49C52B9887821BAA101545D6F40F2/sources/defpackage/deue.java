package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: deue  reason: default package */
/* loaded from: classes6.dex */
public final class deue {
    public static aif<String, String> extractDeveloperDefinedPayload(Bundle bundle) {
        aif<String, String> aifVar = new aif<>();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                    aifVar.put(str, str2);
                }
            }
        }
        return aifVar;
    }
}
