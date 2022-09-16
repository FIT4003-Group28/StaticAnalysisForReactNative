package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blw  reason: default package */
/* loaded from: classes2.dex */
public final class blw implements DatabaseErrorHandler {
    final /* synthetic */ blv[] a;

    public blw(blv[] blvVarArr) {
        this.a = blvVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        String c;
        blv b = blx.b(this.a, sQLiteDatabase);
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + b.c());
        if (b.j()) {
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = b.a.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    b.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    for (Pair<String, String> pair : list) {
                        bln.a((String) pair.second);
                    }
                    return;
                }
                c = b.c();
            } catch (Throwable th) {
                if (list != null) {
                    for (Pair<String, String> pair2 : list) {
                        bln.a((String) pair2.second);
                    }
                } else {
                    bln.a(b.c());
                }
                throw th;
            }
        } else {
            c = b.c();
        }
        bln.a(c);
    }
}
