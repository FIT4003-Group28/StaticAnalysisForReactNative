package defpackage;

import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.util.HashMap;
/* renamed from: cthu  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cthu implements dbrn {
    static final dbrn a = new cthu();

    private cthu() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        dbsg dbsgVar3;
        Cursor cursor = (Cursor) obj;
        dccx F = dcdc.F();
        while (cursor.moveToNext()) {
            if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
                cugw g = Notification.g();
                g.b(cursor.getString(ctma.a(2)));
                ((ctyo) g).a = Long.valueOf(cursor.getLong(ctma.a(6)));
                g.f(csto.e(cursor.getBlob(ctma.a(4))));
                HashMap<String, Object> d = csto.d(cursor.getBlob(ctma.a(5)));
                dbsg<Notification.NotificationType> a2 = Notification.NotificationType.a(cursor.getInt(ctma.a(3)));
                if (!a2.a()) {
                    dbsgVar = dbpy.a;
                } else {
                    if (a2.b().ordinal() == 0) {
                        try {
                            HashMap hashMap = (HashMap) d.get("message_received_notification");
                            try {
                                cugv j = MessageReceivedNotification.j();
                                HashMap hashMap2 = (HashMap) hashMap.get("CONVERSATION_ID");
                                try {
                                    cufq f = ConversationId.f();
                                    dbsg<ContactId> b = ctju.b((HashMap) hashMap2.get("OWNER"));
                                    if (!b.a()) {
                                        dbsgVar3 = dbpy.a;
                                    } else {
                                        f.c(b.b());
                                        ConversationId.IdType idType = ConversationId.IdType.ONE_TO_ONE;
                                        int ordinal = ConversationId.IdType.a(((Integer) hashMap2.get("TYPE")).intValue()).ordinal();
                                        if (ordinal == 0) {
                                            dbsg<ContactId> b2 = ctju.b((HashMap) hashMap2.get("OTHER_PARTICIPANT"));
                                            if (!b2.a()) {
                                                dbsgVar3 = dbpy.a;
                                            } else {
                                                f.e(b2.b());
                                            }
                                        } else if (ordinal == 1) {
                                            dbsg<ConversationId.GroupId> b3 = ctka.b((HashMap) hashMap2.get("GROUP"));
                                            if (!b3.a()) {
                                                dbsgVar3 = dbpy.a;
                                            } else {
                                                f.d(b3.b());
                                            }
                                        }
                                        dbsgVar3 = dbsg.i(f.a());
                                    }
                                } catch (Exception unused) {
                                    cstl.a("ConversationIdConverters");
                                    dbsgVar3 = dbpy.a;
                                }
                                if (!dbsgVar3.a()) {
                                    dbsgVar2 = dbpy.a;
                                } else {
                                    j.d((ConversationId) dbsgVar3.b());
                                    j.g((String) hashMap.get("MESSAGE_ID"));
                                    dbsg<ContactId> b4 = ctju.b((HashMap) hashMap.get("SENDER_ID"));
                                    if (!b4.a()) {
                                        dbsgVar2 = dbpy.a;
                                    } else {
                                        j.h(b4.b());
                                        j.b((String) hashMap.get("AVATAR_URL"));
                                        j.j((String) hashMap.get("TITLE"));
                                        j.c((String) hashMap.get("BODY"));
                                        j.i((String) hashMap.get("SENDER_NAME"));
                                        j.f((String) hashMap.get("MESSAGE_CONTENT"));
                                        j.e(Boolean.TRUE.equals(hashMap.get("DISABLE_INLINE_RESPONSE")));
                                        dbsgVar2 = dbsg.i(j.a());
                                    }
                                }
                            } catch (Exception unused2) {
                                cstl.a("MessageReceivedNotificationConverters");
                                dbsgVar2 = dbpy.a;
                            }
                            if (!dbsgVar2.a()) {
                                dbsgVar = dbpy.a;
                            } else {
                                g.e((MessageReceivedNotification) dbsgVar2.b());
                            }
                        } catch (ClassCastException unused3) {
                            dbsgVar = dbpy.a;
                        }
                    }
                    dbsgVar = dbsg.i(g.a());
                }
            } else {
                dbsgVar = dbpy.a;
            }
            if (dbsgVar.a()) {
                F.g((Notification) dbsgVar.b());
            }
        }
        return F.f();
    }
}
