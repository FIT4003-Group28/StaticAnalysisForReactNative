package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ctje  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class ctje implements dbrn {
    static final dbrn a = new ctje();

    private ctje() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Object i;
        HashMap hashMap = (HashMap) obj;
        try {
            int b = ctzg.b(((Integer) hashMap.get("EVENT_CALLBACK_DESTINATION_TYPE")).intValue()) - 1;
            try {
                if (b == 1) {
                    dbsg<ContactId> b2 = ctju.b((HashMap) hashMap.get("EVENT_CALLBACK_DESTINATION"));
                    if (b2.a()) {
                        i = dbsg.i(cuaf.a(b2.b()));
                        return i;
                    }
                    i = dbpy.a;
                    return i;
                }
                if (b == 2) {
                    dbsg<ConversationId.GroupId> b3 = ctka.b((HashMap) hashMap.get("EVENT_CALLBACK_DESTINATION"));
                    if (b3.a()) {
                        i = dbsg.i(cuaf.b(b3.b()));
                    }
                    i = dbpy.a;
                } else {
                    cstl.a("EventCallDestConvter");
                    i = dbpy.a;
                }
                return i;
            } catch (IllegalStateException | NullPointerException unused) {
                cstl.a("EventCallDestConvter");
                return dbpy.a;
            }
        } catch (ClassCastException unused2) {
            return dbpy.a;
        }
    }
}
