package g.a.a.d;

import android.database.Cursor;
/* loaded from: classes.dex */
public class b {
    public static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
