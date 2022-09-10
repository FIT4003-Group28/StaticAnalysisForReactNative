package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
/* renamed from: cyzu  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cyzu implements deft {
    static final deft a = new cyzu();

    private cyzu() {
    }

    @Override // defpackage.deft
    public final Object a(defu defuVar, Object obj) {
        Cursor cursor = (Cursor) obj;
        dccx F = dcdc.F();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                Long asLong = contentValues.getAsLong("_id");
                dbsk.s(asLong);
                F.g(new cyzy(asLong.longValue(), contentValues.getAsString("displayName"), contentValues.getAsString("accountName"), contentValues.getAsString("accountType"), contentValues.getAsString("packageName")));
            }
        }
        return F.f();
    }
}
