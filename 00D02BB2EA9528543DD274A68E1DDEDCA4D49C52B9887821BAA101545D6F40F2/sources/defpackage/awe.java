package defpackage;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awe  reason: default package */
/* loaded from: classes3.dex */
public final class awe implements DatabaseErrorHandler {
    final /* synthetic */ awd[] a;

    public awe(awd[] awdVarArr) {
        this.a = awdVarArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        String j;
        awd c = awf.c(this.a, sQLiteDatabase);
        String str = "Corruption reported by sqlite on database: " + c.j();
        if (c.i()) {
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = c.b.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    c.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    for (Pair<String, String> pair : list) {
                        avv.c((String) pair.second);
                    }
                    return;
                }
                j = c.j();
            } catch (Throwable th) {
                if (list != null) {
                    for (Pair<String, String> pair2 : list) {
                        avv.c((String) pair2.second);
                    }
                } else {
                    avv.c(c.j());
                }
                throw th;
            }
        } else {
            j = c.j();
        }
        avv.c(j);
    }
}
