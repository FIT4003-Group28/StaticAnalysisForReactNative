package defpackage;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqzu  reason: default package */
/* loaded from: classes5.dex */
public final class cqzu {
    public static List<String> a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr, dbsg<String> dbsgVar, dbsg<Integer> dbsgVar2) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = sQLiteDatabase.query(true, str, new String[]{str2}, str3, strArr, null, null, dbsgVar.f(), dbsgVar2.a() ? dbsgVar2.b().toString() : null);
            while (query.moveToNext()) {
                arrayList.add(query.getString(query.getColumnIndexOrThrow(str2)));
            }
            if (query != null) {
                query.close();
            }
        } catch (IllegalArgumentException unused) {
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str, Iterable<?> iterable) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append("IN");
        sb.append(" ");
        Iterator<?> it = iterable.iterator();
        boolean z = true;
        while (true) {
            str2 = "(";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (true != z) {
                str2 = ", ";
            }
            sb.append(str2);
            if (next instanceof Number) {
                sb.append(next);
            } else {
                DatabaseUtils.appendEscapedSQLString(sb, String.valueOf(next));
            }
            z = false;
        }
        if (z) {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }
}
