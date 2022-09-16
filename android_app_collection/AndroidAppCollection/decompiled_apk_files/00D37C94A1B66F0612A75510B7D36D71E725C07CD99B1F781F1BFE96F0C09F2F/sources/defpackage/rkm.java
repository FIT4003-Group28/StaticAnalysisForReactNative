package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: rkm  reason: default package */
/* loaded from: classes4.dex */
public final class rkm extends riw {
    private final rkl b;
    private boolean c;

    public rkm(rlx rlxVar) {
        super(rlxVar);
        Context I = I();
        f();
        this.b = new rkl(this, I);
    }

    @Override // defpackage.riw
    protected final boolean d() {
        return false;
    }

    final SQLiteDatabase e() {
        if (this.c) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.c = true;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String f() {
        J();
        return "google_app_measurement_local.db";
    }

    public final void o() {
        int delete;
        n();
        try {
            SQLiteDatabase e = e();
            if (e == null || (delete = e.delete("messages", null, null)) <= 0) {
                return;
            }
            aG().k.b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e2) {
            aG().c.b("Error resetting local analytics data. error", e2);
        }
    }

    final boolean p() {
        return I().getDatabasePath(f()).exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkm.q(int, byte[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0242 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List r() {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkm.r():java.util.List");
    }

    public final void s() {
        n();
        if (!this.c && p()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase e = e();
                    if (e == null) {
                        this.c = true;
                        return;
                    }
                    e.beginTransaction();
                    e.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    e.setTransactionSuccessful();
                    e.endTransaction();
                    e.close();
                    return;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e2) {
                    aG().c.b("Error deleting app launch break from local database", e2);
                    this.c = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e3) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    aG().c.b("Error deleting app launch break from local database", e3);
                    this.c = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            aG().f.a("Error deleting app launch break from local database in reasonable time");
        }
    }
}
