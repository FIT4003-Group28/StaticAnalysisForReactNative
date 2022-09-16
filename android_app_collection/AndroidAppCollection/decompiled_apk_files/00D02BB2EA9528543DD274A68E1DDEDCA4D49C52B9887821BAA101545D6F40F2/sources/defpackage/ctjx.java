package defpackage;

import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ctjx  reason: default package */
/* loaded from: classes5.dex */
public final class ctjx {
    public static final String a = "ctjx";

    public static dbsg<cufw> a(Cursor cursor) {
        ConversationId a2;
        if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
            int length = ctlw.a.length;
            String[] strArr = ctlu.a;
            if (ConversationId.IdType.a(cursor.getInt(ctlv.a(2))) == ConversationId.IdType.GROUP) {
                cufq f = ConversationId.f();
                cufr c = ConversationId.GroupId.c();
                c.c(cursor.getString(ctlv.a(3)));
                c.b(cursor.getString(ctlv.a(4)));
                f.d(c.a());
                f.c(ctjt.b(9, cursor));
                a2 = f.a();
            } else {
                cufq f2 = ConversationId.f();
                f2.e(ctjt.b(16, cursor));
                f2.c(ctjt.b(9, cursor));
                a2 = f2.a();
            }
            HashMap<String, byte[]> e = csto.e(cursor.getBlob(ctlv.a(8)));
            long j = cursor.getLong(ctlv.a(6));
            long j2 = cursor.getLong(ctlv.a(9));
            cudf cudfVar = new cudf();
            cudfVar.d = 0L;
            cudfVar.c = -1L;
            if (a2 != null) {
                cudfVar.a = a2;
                cudfVar.b = dcdn.r(dcjz.s(e, ctjw.a));
                cudfVar.c = Long.valueOf(j);
                cudfVar.d = Long.valueOf(j2);
                String str = cudfVar.a == null ? " conversationId" : "";
                if (cudfVar.b == null) {
                    str = str.concat(" appData");
                }
                if (cudfVar.c == null) {
                    str = String.valueOf(str).concat(" updateTimestamp");
                }
                if (cudfVar.d == null) {
                    str = String.valueOf(str).concat(" lastDeleteTimestamp");
                }
                if (str.isEmpty()) {
                    return dbsg.i(new cudg(cudfVar.a, cudfVar.b, cudfVar.c, cudfVar.d));
                }
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null conversationId");
        }
        return dbpy.a;
    }
}
