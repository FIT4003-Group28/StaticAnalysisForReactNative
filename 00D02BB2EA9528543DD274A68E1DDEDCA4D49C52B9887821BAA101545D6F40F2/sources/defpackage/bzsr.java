package defpackage;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: bzsr  reason: default package */
/* loaded from: classes4.dex */
final class bzsr extends bvjw {
    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;

    static {
        String i = dbrz.e(", ").i("photo_uri", "latitude", "longitude", "valid_photo_taken_notification_photo", "was_shown_in_photo_taken_notification", "was_shown_in_delayed_photo_taken_notification", "was_uploaded", "is_face_detected", "timestamp");
        a = i;
        String i2 = dbrz.e(", ").i(i, "was_processed_for_client_triggered_photo_taken_notification", "was_processed_for_server_triggered_photo_taken_notification", "was_used_for_logging_for_bug_111569214");
        b = i2;
        String i3 = dbrz.e(", ").i("photo_uri", "latitude", "longitude", "valid_photo_taken_notification_photo", "was_shown_in_photo_taken_notification", "was_uploaded", "is_face_detected", "timestamp", "was_dismissed_in_todo_list");
        c = i3;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 71 + String.valueOf(i3).length());
        sb.append("INSERT INTO photos_top_feature (");
        sb.append(i3);
        sb.append(")  SELECT ");
        sb.append(i3);
        sb.append(" FROM ");
        sb.append("tmp_photos_top_feature");
        sb.append(";");
        d = sb.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 71 + String.valueOf(i2).length());
        sb2.append("INSERT INTO photos_top_feature (");
        sb2.append(i2);
        sb2.append(")  SELECT ");
        sb2.append(i2);
        sb2.append(" FROM ");
        sb2.append("tmp_photos_top_feature");
        sb2.append(";");
        e = sb2.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 71 + String.valueOf(i).length());
        sb3.append("INSERT INTO photos_top_feature (");
        sb3.append(i);
        sb3.append(")  SELECT ");
        sb3.append(i);
        sb3.append(" FROM ");
        sb3.append("tmp_photos_top_feature");
        sb3.append(";");
        f = sb3.toString();
    }

    public bzsr(Application application, afec afecVar) {
        super(application, afecVar, "ugc_photos_location_data.db", 11);
    }

    public static String c(boolean z) {
        return String.valueOf(z ? 1 : 0);
    }

    public static String e(long j) {
        int i = drsx.b;
        if (j == 0) {
            return "/m/0";
        }
        if (drsx.e(j) != 0) {
            throw new IllegalArgumentException("Invalid MID version");
        }
        StringBuilder sb = new StringBuilder();
        int d2 = drsx.d(j);
        sb.append(drsx.c(d2));
        sb.append(drsx.a(d2));
        long j2 = j & 576460752303423487L;
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < 13; i2++) {
            sb2.append(drsx.a((int) (31 & j2)));
            j2 >>>= 5;
            if (j2 == 0) {
                break;
            }
        }
        sb.append(sb2.reverse().toString());
        return sb.toString();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.getVersion();
            onUpgrade(sQLiteDatabase, sQLiteDatabase.getVersion(), 11);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        dbsk.h(i2 < i, "newVersion (%s) should be strictly smaller than oldVersion (%s)!", i2, i);
        sQLiteDatabase.beginTransaction();
        try {
            if (i2 < 7) {
                if (i >= 9) {
                    sQLiteDatabase.execSQL("DROP TABLE photos_image_labels;");
                }
                if (i >= 7) {
                    sQLiteDatabase.execSQL("DROP TABLE photos_top_feature;");
                }
                sQLiteDatabase.setVersion(i2);
            } else {
                while (i > i2) {
                    switch (i) {
                        case 8:
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature RENAME TO tmp_photos_top_feature;");
                            sQLiteDatabase.execSQL("CREATE TABLE photos_top_feature (photo_uri TEXT PRIMARY KEY, latitude REAL, longitude REAL, valid_photo_taken_notification_photo BOOLEAN NOT NULL, was_shown_in_photo_taken_notification BOOLEAN NOT NULL, was_shown_in_delayed_photo_taken_notification BOOLEAN NOT NULL, was_uploaded BOOLEAN NOT NULL, is_face_detected BOOLEAN NOT NULL, timestamp LONG NOT NULL);");
                            sQLiteDatabase.execSQL(f);
                            sQLiteDatabase.execSQL("DROP TABLE tmp_photos_top_feature;");
                            sQLiteDatabase.setVersion(7);
                            break;
                        case 9:
                            sQLiteDatabase.execSQL("DROP TABLE photos_image_labels;");
                            sQLiteDatabase.setVersion(8);
                            break;
                        case 10:
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature RENAME TO tmp_photos_top_feature;");
                            sQLiteDatabase.execSQL("CREATE TABLE photos_top_feature (photo_uri TEXT PRIMARY KEY, latitude REAL, longitude REAL, valid_photo_taken_notification_photo BOOLEAN NOT NULL, was_shown_in_photo_taken_notification BOOLEAN NOT NULL, was_shown_in_delayed_photo_taken_notification BOOLEAN NOT NULL, was_uploaded BOOLEAN NOT NULL, is_face_detected BOOLEAN NOT NULL, timestamp LONG NOT NULL, was_processed_for_client_triggered_photo_taken_notification BOOLEAN NOT NULL, was_processed_for_server_triggered_photo_taken_notification BOOLEAN NOT NULL, was_used_for_logging_for_bug_111569214 BOOLEAN NOT NULL);");
                            sQLiteDatabase.execSQL(e);
                            sQLiteDatabase.execSQL("DROP TABLE tmp_photos_top_feature;");
                            sQLiteDatabase.setVersion(9);
                            break;
                        case 11:
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature ADD COLUMN was_processed_for_client_triggered_photo_taken_notification BOOLEAN NOT NULL default 0;");
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature ADD COLUMN was_processed_for_server_triggered_photo_taken_notification BOOLEAN NOT NULL default 0;");
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature ADD COLUMN was_used_for_logging_for_bug_111569214 BOOLEAN NOT NULL default 0;");
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature ADD COLUMN was_shown_in_delayed_photo_taken_notification BOOLEAN NOT NULL default 0;");
                            sQLiteDatabase.setVersion(10);
                            break;
                        default:
                            bvoo.h("Unsupported downgrade of the database from version %d to %d!", Integer.valueOf(i), Integer.valueOf(i - 1));
                            break;
                    }
                    i--;
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        dbsk.h(i < i2, "oldVersion (%s) should be strictly smaller than newVersion (%s)!", i, i2);
        try {
            sQLiteDatabase.beginTransaction();
            if (i >= 7) {
                while (i < i2) {
                    switch (i) {
                        case 7:
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature ADD COLUMN was_processed_for_client_triggered_photo_taken_notification BOOLEAN NOT NULL default 0;");
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature ADD COLUMN was_processed_for_server_triggered_photo_taken_notification BOOLEAN NOT NULL default 0;");
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature ADD COLUMN was_used_for_logging_for_bug_111569214 BOOLEAN NOT NULL default 0;");
                            sQLiteDatabase.setVersion(8);
                            break;
                        case 8:
                            sQLiteDatabase.execSQL("CREATE TABLE photos_image_labels (photo_uri TEXT, image_label_mid INTEGER, image_label_confidence REAL NOT NULL, PRIMARY KEY (photo_uri,image_label_mid));");
                            sQLiteDatabase.setVersion(9);
                            break;
                        case 9:
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature ADD COLUMN was_dismissed_in_todo_list BOOLEAN NOT NULL default 0;");
                            sQLiteDatabase.setVersion(10);
                            break;
                        case 10:
                            sQLiteDatabase.execSQL("ALTER TABLE photos_top_feature RENAME TO tmp_photos_top_feature;");
                            sQLiteDatabase.execSQL("CREATE TABLE photos_top_feature (photo_uri TEXT PRIMARY KEY, latitude REAL, longitude REAL, valid_photo_taken_notification_photo BOOLEAN NOT NULL, was_shown_in_photo_taken_notification BOOLEAN NOT NULL, was_uploaded BOOLEAN NOT NULL, is_face_detected BOOLEAN NOT NULL, timestamp LONG NOT NULL, was_dismissed_in_todo_list BOOLEAN NOT NULL);");
                            sQLiteDatabase.execSQL(d);
                            sQLiteDatabase.execSQL("DROP TABLE tmp_photos_top_feature;");
                            sQLiteDatabase.setVersion(11);
                            break;
                        default:
                            bvoo.h("Unsupported upgrade of the database from version %d to %d!", Integer.valueOf(i), Integer.valueOf(i + 1));
                            break;
                    }
                    i++;
                }
            } else if (i2 < 7) {
                sQLiteDatabase.setVersion(i2);
            } else {
                sQLiteDatabase.execSQL("CREATE TABLE photos_top_feature (photo_uri TEXT PRIMARY KEY, latitude REAL, longitude REAL, valid_photo_taken_notification_photo BOOLEAN NOT NULL, was_shown_in_photo_taken_notification BOOLEAN NOT NULL, was_shown_in_delayed_photo_taken_notification BOOLEAN NOT NULL, was_uploaded BOOLEAN NOT NULL, is_face_detected BOOLEAN NOT NULL, timestamp LONG NOT NULL);");
                sQLiteDatabase.setVersion(7);
                if (i2 > 7) {
                    onUpgrade(sQLiteDatabase, 7, i2);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static long d(String str) {
        if (str.length() > 3) {
            if (str.charAt(0) == '/') {
                int i = 2;
                if (str.charAt(2) == '/') {
                    char charAt = str.charAt(1);
                    if (charAt == 'g') {
                        i = 1;
                    } else if (charAt == 'p') {
                        i = 5;
                    } else if (charAt != 't') {
                        if (charAt == 'x') {
                            i = 3;
                        } else if (charAt == 'm') {
                            i = 0;
                        } else if (charAt != 'n') {
                            StringBuilder sb = new StringBuilder(21);
                            sb.append("Invalid MID prefix: ");
                            sb.append(charAt);
                            throw new IllegalArgumentException(sb.toString());
                        } else {
                            i = 4;
                        }
                    }
                    String substring = str.substring(3);
                    int b2 = drsx.b(substring.charAt(0));
                    int i2 = b2 >>> 3;
                    if (i2 == 0) {
                        int i3 = b2 & 7;
                        String substring2 = substring.substring(1);
                        if (substring2.length() <= 13) {
                            long j = 0;
                            if (substring2.length() != 13 || drsx.b(substring2.charAt(0)) <= 15) {
                                for (int i4 = 0; i4 < substring2.length(); i4++) {
                                    int b3 = drsx.b(substring2.charAt(i4));
                                    if (b3 < 0) {
                                        throw new IllegalArgumentException("Invalid munch character");
                                    }
                                    j = (j << 5) + b3;
                                }
                                long g = drsx.g(i3, j);
                                if (drsx.d(g) == i) {
                                    return g;
                                }
                                int e2 = drsx.e(g);
                                if (e2 == 0) {
                                    String c2 = drsx.c(drsx.d(g));
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(c2).length());
                                    sb2.append("Inconsistent MID prefix: ");
                                    sb2.append(str);
                                    sb2.append(" (expected ");
                                    sb2.append(c2);
                                    sb2.append(")");
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                                StringBuilder sb3 = new StringBuilder(32);
                                sb3.append("Invalid MID version: ");
                                sb3.append(e2);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                        }
                        throw new IllegalArgumentException("65-bit value");
                    }
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid MID version: ");
                    sb4.append(i2);
                    throw new IllegalArgumentException(sb4.toString());
                }
            }
        }
        if (str.startsWith("/guid/")) {
            return drsx.f(str.substring(6));
        }
        if (str.startsWith("#")) {
            return drsx.f(str.substring(1));
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown ID format: ".concat(valueOf) : new String("Unknown ID format: "));
    }
}
