package defpackage;

import android.util.Base64;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ctkd  reason: default package */
/* loaded from: classes5.dex */
public final class ctkd {
    public static HashMap<String, Object> a(cugf cugfVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("MENU_NAME", cugfVar.a());
        hashMap.put("ACTION", ctjh.a(cugfVar.b()));
        if (cugfVar.c().a()) {
            hashMap.put("ICON", Base64.encodeToString(cugfVar.c().b(), 2));
        }
        return hashMap;
    }
}
