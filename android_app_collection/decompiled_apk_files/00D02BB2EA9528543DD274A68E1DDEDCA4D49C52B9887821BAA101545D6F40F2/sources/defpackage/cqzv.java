package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cqzv  reason: default package */
/* loaded from: classes5.dex */
public final class cqzv implements cqzs {
    private final Context a;
    private final String b;

    public cqzv(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    private final dbsg<String> c(String str, String str2, long j, byte[] bArr) {
        File file = new File(this.a.getFilesDir(), deeb.a("geller", this.b, str));
        if (file.exists() || file.mkdirs()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21);
            sb.append(str2);
            sb.append("_");
            sb.append(j);
            File file2 = new File(file, sb.toString());
            file2.getAbsolutePath();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return dbsg.i(file2.toString());
            } catch (IOException unused) {
                return dbpy.a;
            }
        }
        return dbpy.a;
    }

    private static boolean d(String str) {
        File file = new File(str);
        try {
            if (!file.exists()) {
                return true;
            }
            file.delete();
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    private static long e(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            long delete = sQLiteDatabase.delete("geller_file_table", "file_path = ?", strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return delete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // defpackage.cqzs
    public final long a(dbsg<SQLiteDatabase> dbsgVar, String str) {
        dbsk.l(true);
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((dbsu) dbsgVar).a;
        long j = 0;
        for (String str2 : cqzu.a(sQLiteDatabase, "geller_file_table", "file_path", "data_type = ?", new String[]{str}, dbsg.i("timestamp_micro DESC"), dbpy.a)) {
            if (d(str2)) {
                j += e(sQLiteDatabase, new String[]{str2});
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.String] */
    @Override // defpackage.cqzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.dbsg<android.database.sqlite.SQLiteDatabase> r27, java.lang.String r28, java.lang.String[] r29, long r30, boolean r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqzv.b(dbsg, java.lang.String, java.lang.String[], long, boolean, byte[]):boolean");
    }
}
