package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvks  reason: default package */
/* loaded from: classes5.dex */
public final class cvks {
    public static dcdc<cxnj> a(String str, String str2, String[] strArr) {
        int length = strArr.length;
        if (length <= 900) {
            cxnk a = cxnk.a();
            if (!str.isEmpty()) {
                a.c(str);
                a.c(" AND ");
            }
            a.d(g(str2, length), strArr);
            return dcdc.f(a.b());
        }
        dccx F = dcdc.F();
        int i = 0;
        while (true) {
            int length2 = strArr.length;
            if (i < length2) {
                int i2 = i + 900;
                String[] strArr2 = (String[]) Arrays.copyOfRange(strArr, i, Math.min(i2, length2));
                cxnk a2 = cxnk.a();
                if (!str.isEmpty()) {
                    a2.c(str);
                    a2.c(" AND ");
                }
                a2.d(g(str2, strArr2.length), strArr2);
                F.g(a2.b());
                i = i2;
            } else {
                return F.f();
            }
        }
    }

    public static int b(Cursor cursor, String str) {
        try {
            return cursor.getColumnIndexOrThrow(str);
        } catch (IllegalArgumentException e) {
            throw new cvkr(str, e);
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        cxnk a = cxnk.a();
        a.c("ALTER TABLE ");
        a.c(str);
        a.c(" ADD COLUMN ");
        a.c(str2);
        a.c(" ");
        a.c(str3);
        cxnj b = a.b();
        sQLiteDatabase.execSQL(((cxni) b).a, b.c());
    }

    public static boolean d(SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
        Throwable th;
        Cursor cursor;
        try {
            cursor = sQLiteDatabase.query(str, null, "0", null, null, null, null);
            try {
                for (String str2 : strArr) {
                    if (cursor.getColumnIndex(str2) < 0) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return false;
                    }
                }
                if (cursor == null) {
                    return true;
                }
                cursor.close();
                return true;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @dzsi
    public static <T extends dssj> T e(Cursor cursor, T t, String str) {
        try {
            byte[] blob = cursor.getBlob(b(cursor, str));
            if (blob == null) {
                return null;
            }
            return (T) t.Nn().by(blob).bK();
        } catch (dsrm unused) {
            cvlw.e("ChimeThreadStorageImpl", "Error parsing column %s for notification %s", str, cursor.getString(b(cursor, "thread_id")));
            return null;
        }
    }

    public static <T extends dssj> List<T> f(Cursor cursor, T t, String str) {
        cvtc bK;
        ArrayList arrayList = new ArrayList();
        try {
            byte[] blob = cursor.getBlob(b(cursor, str));
            if (blob != null && (bK = ((cvtb) cvtc.b.bZ().by(blob)).bK()) != null) {
                for (dsok dsokVar : bK.a) {
                    dssi Nn = t.Nn();
                    Nn.bD(dsokVar.b);
                    arrayList.add(Nn.bK());
                }
            }
        } catch (dsrm unused) {
            cvlw.e("ChimeThreadStorageImpl", "Error parsing column %s for notification %s", str, cursor.getString(b(cursor, "thread_id")));
        }
        return arrayList;
    }

    private static String g(String str, int i) {
        if (i <= 0 || TextUtils.isEmpty(str)) {
            new Exception();
            cvlw.e("QueryHelper", "Error creating IN clause for number: [%d], column [%s]", Integer.valueOf(i), str);
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IN (");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append("?,");
        }
        sb.append("?)");
        return sb.toString();
    }
}
