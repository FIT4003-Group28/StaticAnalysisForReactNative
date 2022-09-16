package defpackage;

import android.database.Cursor;
import android.os.Build;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bx  reason: default package */
/* loaded from: classes4.dex */
public final class bx {
    public static int a(Cursor cursor, String str) {
        String str2;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + "`");
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    String str3 = "." + str;
                    String str4 = "." + str + "`";
                    for (int i = 0; i < columnNames.length; i++) {
                        String str5 = columnNames[i];
                        if (str5.length() >= str.length() + 2 && (str5.endsWith(str3) || (str5.charAt(0) == '`' && str5.endsWith(str4)))) {
                            columnIndex = i;
                            break;
                        }
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception unused) {
            str2 = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
