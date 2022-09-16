package defpackage;

import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDatatypeMismatchException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteMisuseException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.database.sqlite.SQLiteTableLockedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: cyos  reason: default package */
/* loaded from: classes5.dex */
public final class cyos {
    public static int a(Throwable th) {
        int i = 5;
        if (th instanceof TimeoutException) {
            return 5;
        }
        if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
            return 4;
        }
        if (th instanceof dsrm) {
            return 10;
        }
        if (th instanceof cylw) {
            int i2 = ((cylw) th).a;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                return 5;
            }
            if (i3 == 1 || i3 == 2) {
                return 4;
            }
            return i3 != 5 ? 9 : 3;
        } else if (th instanceof SQLiteException) {
            SQLiteException sQLiteException = (SQLiteException) th;
            if (!(sQLiteException instanceof SQLiteAbortException)) {
                if (sQLiteException instanceof SQLiteAccessPermException) {
                    i = 4;
                } else if (sQLiteException instanceof SQLiteBindOrColumnIndexOutOfRangeException) {
                    i = 26;
                } else if (sQLiteException instanceof SQLiteBlobTooBigException) {
                    i = 19;
                } else if (sQLiteException instanceof SQLiteCantOpenDatabaseException) {
                    i = 15;
                } else if (sQLiteException instanceof SQLiteConstraintException) {
                    i = 20;
                } else if (sQLiteException instanceof SQLiteDatabaseCorruptException) {
                    i = 12;
                } else {
                    if (!(sQLiteException instanceof SQLiteDatabaseLockedException)) {
                        if (sQLiteException instanceof SQLiteDatatypeMismatchException) {
                            i = 21;
                        } else if (sQLiteException instanceof SQLiteDiskIOException) {
                            i = 11;
                        } else if (sQLiteException instanceof SQLiteDoneException) {
                            i = 102;
                        } else if (sQLiteException instanceof SQLiteFullException) {
                            i = 14;
                        } else if (sQLiteException instanceof SQLiteMisuseException) {
                            i = 22;
                        } else if (sQLiteException instanceof SQLiteOutOfMemoryException) {
                            i = 8;
                        } else if (sQLiteException instanceof SQLiteReadOnlyDatabaseException) {
                            i = 27;
                        } else if (!(sQLiteException instanceof SQLiteTableLockedException)) {
                            i = 2;
                        }
                    }
                    i = 7;
                }
            }
            int i4 = i - 1;
            if (i4 != 3) {
                if (i4 == 4 || i4 == 9) {
                    return 4;
                }
                if (i4 == 12) {
                    return 6;
                }
                if (i4 != 23) {
                    return i4 != 26 ? 9 : 10;
                }
            }
            return 3;
        } else if (th.getCause() == null) {
            return 2;
        } else {
            return a(th.getCause());
        }
    }
}
