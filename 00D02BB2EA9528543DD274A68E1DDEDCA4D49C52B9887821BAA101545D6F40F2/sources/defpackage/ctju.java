package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ctju  reason: default package */
/* loaded from: classes5.dex */
public final class ctju {
    public static HashMap<String, Object> a(ContactId contactId) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ID", contactId.a());
        hashMap.put("TACHYON_APP_NAME", contactId.b());
        hashMap.put("TYPE", Integer.valueOf(contactId.c().f));
        dbsg<String> d = contactId.d();
        if (d.a()) {
            hashMap.put("HANDLER_ID", d.b());
        }
        return hashMap;
    }

    public static dbsg<ContactId> b(HashMap<String, Object> hashMap) {
        try {
            cufk f = ContactId.f();
            f.c((String) hashMap.get("ID"));
            f.d((String) hashMap.get("TACHYON_APP_NAME"));
            f.e(ContactId.ContactType.a(((Integer) hashMap.get("TYPE")).intValue()));
            f.b((String) hashMap.get("HANDLER_ID"));
            return dbsg.i(f.a());
        } catch (Exception unused) {
            cstl.a("ContactIdConverters");
            return dbpy.a;
        }
    }
}
