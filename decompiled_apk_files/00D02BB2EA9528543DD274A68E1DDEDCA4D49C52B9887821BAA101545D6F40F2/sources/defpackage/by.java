package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: by  reason: default package */
/* loaded from: classes4.dex */
public final class by {
    public static void a(avu avuVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        Cursor f = avuVar.f("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (true) {
            try {
                if (!f.moveToNext()) {
                    break;
                }
                arrayList.add(f.getString(0));
            } catch (Throwable th) {
                f.close();
                throw th;
            }
        }
        f.close();
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (str.startsWith("room_fts_content_sync_")) {
                avuVar.h("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
