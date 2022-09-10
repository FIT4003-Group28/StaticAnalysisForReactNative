package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Date;
/* compiled from: PG */
/* renamed from: crwl  reason: default package */
/* loaded from: classes5.dex */
public final class crwl {
    public static final Object a = new Object();
    private final SQLiteOpenHelper b;

    public crwl(SQLiteOpenHelper sQLiteOpenHelper) {
        this.b = sQLiteOpenHelper;
    }

    public final crwo a(String str) {
        synchronized (a) {
            SQLiteDatabase f = f();
            if (f == null) {
                return null;
            }
            try {
                return (crwo) dcft.d(crwo.Q(f, "gpu_media_id = ?", new String[]{str}), null);
            } catch (dsrm e) {
                throw new RuntimeException("Error in parsing protos from blob.", e);
            } catch (Exception e2) {
                deki.b(e2);
                return null;
            }
        }
    }

    public final dcdc<crwo> b() {
        synchronized (a) {
            SQLiteDatabase e = e();
            if (e == null) {
                return dcdc.e();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("upload_status");
            sb.append(" in (");
            for (int i = 0; i < crwv.b.size() - 1; i++) {
                sb.append("?, ");
            }
            sb.append("?)");
            try {
                return crwo.Q(e, sb.toString(), (String[]) dchl.k(crwv.b, crwi.a).toArray(new String[0]));
            } catch (dsrm e2) {
                throw new RuntimeException("Error in parsing protos from blob", e2);
            } catch (Exception e3) {
                deki.b(e3);
                return dcdc.e();
            }
        }
    }

    public final long c() {
        synchronized (a) {
            SQLiteDatabase e = e();
            if (e == null) {
                return 0L;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("upload_status");
            sb.append(" in (");
            for (int i = 0; i < crwv.b.size() - 1; i++) {
                sb.append("?, ");
            }
            sb.append("?)");
            return DatabaseUtils.queryNumEntries(e, "upload_tasks", sb.toString(), (String[]) dchl.k(crwv.b, crwj.a).toArray(new String[0]));
        }
    }

    public final dcdc<crua> d(String str, String[] strArr) {
        synchronized (a) {
            SQLiteDatabase e = e();
            if (e != null) {
                try {
                    return dcdc.r(dchl.k(crwo.Q(e, str, strArr), crwk.a));
                } catch (dsrm e2) {
                    throw new RuntimeException("Error in parsing protos from blob.", e2);
                } catch (Exception e3) {
                    deki.b(e3);
                    return dcdc.e();
                }
            }
            return dcdc.e();
        }
    }

    public final SQLiteDatabase e() {
        try {
            return this.b.getReadableDatabase();
        } catch (SQLiteException unused) {
            return null;
        }
    }

    public final SQLiteDatabase f() {
        try {
            return this.b.getWritableDatabase();
        } catch (SQLiteException unused) {
            return null;
        }
    }

    public final void g() {
        synchronized (a) {
            SQLiteDatabase e = e();
            if (e == null) {
                return;
            }
            e.delete("upload_tasks", "clear_record_type = ? AND completion_time > 0 AND clear_record_ttl * 1000 + completion_time - ? < 0", new String[]{Integer.toString(1), Long.toString(new Date().getTime())});
        }
    }

    public final void h(String str) {
        synchronized (a) {
            SQLiteDatabase f = f();
            if (f == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.putNull("temp_copy_uri");
            contentValues.putNull("sha1_hash");
            f.update("upload_tasks", contentValues, "original_url = ? or temp_copy_uri = ?", new String[]{str, str});
        }
    }

    public final void i(String str, crtx crtxVar, cruc crucVar) {
        synchronized (a) {
            SQLiteDatabase f = f();
            if (f == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_status", Integer.valueOf(crtxVar.l));
            contentValues.put("failure_reason", Integer.valueOf(crucVar.q));
            if (crtxVar == crtx.FAILED) {
                contentValues.put("completion_time", Long.valueOf(new Date().getTime()));
            }
            f.update("upload_tasks", contentValues, "gpu_media_id = ?", new String[]{str});
        }
    }
}
