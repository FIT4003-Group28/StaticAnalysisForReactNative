package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: uid  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uid {
    public static void a(Context context) {
        try {
            synchronized (vbk.a) {
                if (vbk.b != null) {
                    return;
                }
                vbk.b = context.getApplicationContext();
            }
        } catch (IllegalStateException e) {
            Object[] objArr = {e};
            if (!urq.e(3)) {
                return;
            }
            urq.c("GnpPhenotypeManager", "PhenotypeContext.setContext was called more than once", objArr);
        }
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean d(Context context) {
        return akg.c() && context.getApplicationInfo().targetSdkVersion >= 26;
    }

    public static boolean e(Context context) {
        return akg.e() && context.getApplicationInfo().targetSdkVersion > 30;
    }

    public static int f(Cursor cursor, String str) {
        try {
            return cursor.getColumnIndexOrThrow(str);
        } catch (IllegalArgumentException e) {
            throw new udf(str, e);
        }
    }

    public static amuk g(vfl vflVar, String str, String[] strArr) {
        int length = strArr.length;
        if (length <= 900) {
            vfm b = vfm.b();
            if (!j(vflVar)) {
                b.d(vflVar.a, vflVar.a());
                b.c(" AND ");
            }
            b.d(m(str, length), strArr);
            return amuk.r(b.a());
        }
        amuf f = amuk.f();
        int i = 0;
        while (true) {
            int length2 = strArr.length;
            if (i < length2) {
                int i2 = i + 900;
                String[] strArr2 = (String[]) Arrays.copyOfRange(strArr, i, Math.min(i2, length2));
                vfm b2 = vfm.b();
                if (!j(vflVar)) {
                    b2.d(vflVar.a, vflVar.a());
                    b2.c(" AND ");
                }
                b2.d(m(str, strArr2.length), strArr2);
                f.h(b2.a());
                i = i2;
            } else {
                return f.g();
            }
        }
    }

    public static void h(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        vfm b = vfm.b();
        b.c("ALTER TABLE ");
        b.c(str);
        b.c(" ADD COLUMN ");
        b.c(str2);
        b.c(" ");
        b.c(str3);
        vfl a = b.a();
        sQLiteDatabase.execSQL(a.a, a.a());
    }

    public static boolean i(SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
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

    public static boolean j(vfl vflVar) {
        return vflVar == null || vflVar.a.isEmpty();
    }

    public static aoqu k(Cursor cursor, aoqu aoquVar, String str) {
        try {
            byte[] blob = cursor.getBlob(f(cursor, str));
            if (blob == null) {
                return null;
            }
            return aoquVar.mo52toBuilder().mo35mergeFrom(blob).mo39build();
        } catch (aopx e) {
            uev.c("ChimeThreadStorageHelper", e, "Error parsing column %s for notification %s", str, cursor.getString(f(cursor, "thread_id")));
            return null;
        }
    }

    public static List l(Cursor cursor, aoqu aoquVar, String str) {
        uio uioVar;
        ArrayList arrayList = new ArrayList();
        try {
            byte[] blob = cursor.getBlob(f(cursor, str));
            if (blob != null && (uioVar = (uio) ((aopa) uio.a.createBuilder().mo35mergeFrom(blob)).mo39build()) != null) {
                for (aono aonoVar : uioVar.b) {
                    arrayList.add(aoquVar.mo52toBuilder().mo28mergeFrom(aonoVar.c).mo39build());
                }
            }
        } catch (aopx e) {
            uev.c("ChimeThreadStorageHelper", e, "Error parsing column %s for notification %s", str, cursor.getString(f(cursor, "thread_id")));
        }
        return arrayList;
    }

    private static String m(String str, int i) {
        if (i <= 0 || TextUtils.isEmpty(str)) {
            uev.c("QueryHelper", new Exception(), "Error creating IN clause for number: [%d], column [%s]", Integer.valueOf(i), str);
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
