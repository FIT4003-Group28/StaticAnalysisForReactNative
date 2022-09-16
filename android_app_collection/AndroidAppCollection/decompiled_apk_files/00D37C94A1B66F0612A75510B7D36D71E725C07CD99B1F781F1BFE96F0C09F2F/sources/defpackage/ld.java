package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.view.View;
import com.google.android.youtube.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ld  reason: default package */
/* loaded from: classes3.dex */
public final class ld {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }

    public static final int d(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 480 && i2 > 640) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    public static final boolean e(Context context) {
        return context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public static Cursor f(bks bksVar, blt bltVar, boolean z) {
        Cursor k = bksVar.k(bltVar);
        if (z && (k instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) k;
            int count = abstractWindowedCursor.getCount();
            int numRows = abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count;
            if (Build.VERSION.SDK_INT < 23 || numRows < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i = 0; i < abstractWindowedCursor.getColumnCount(); i++) {
                            int type = abstractWindowedCursor.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(abstractWindowedCursor.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(abstractWindowedCursor.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = abstractWindowedCursor.getString(i);
                            } else if (type == 4) {
                                objArr[i] = abstractWindowedCursor.getBlob(i);
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    return matrixCursor;
                } finally {
                    abstractWindowedCursor.close();
                }
            }
        }
        return k;
    }

    public static int g(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + "`");
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        String str2 = "." + str;
        String str3 = "." + str + "`";
        for (int i = 0; i < columnNames.length; i++) {
            String str4 = columnNames[i];
            if (str4.length() >= str.length() + 2 && (str4.endsWith(str2) || (str4.charAt(0) == '`' && str4.endsWith(str3)))) {
                return i;
            }
        }
        return -1;
    }

    public static int h(Cursor cursor, String str) {
        String str2;
        int g = g(cursor, str);
        if (g >= 0) {
            return g;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception unused) {
            str2 = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
