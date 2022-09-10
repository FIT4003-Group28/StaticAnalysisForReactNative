package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ctka  reason: default package */
/* loaded from: classes5.dex */
public final class ctka {
    public static HashMap<String, Object> a(ConversationId.GroupId groupId) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ID", groupId.a());
        hashMap.put("APP_NAME", groupId.b());
        return hashMap;
    }

    public static dbsg<ConversationId.GroupId> b(HashMap<String, Object> hashMap) {
        try {
            cufr c = ConversationId.GroupId.c();
            c.c((String) hashMap.get("ID"));
            c.b((String) hashMap.get("APP_NAME"));
            return dbsg.i(c.a());
        } catch (ClassCastException unused) {
            cstl.a("GroupIdConverters");
            return dbpy.a;
        }
    }
}
