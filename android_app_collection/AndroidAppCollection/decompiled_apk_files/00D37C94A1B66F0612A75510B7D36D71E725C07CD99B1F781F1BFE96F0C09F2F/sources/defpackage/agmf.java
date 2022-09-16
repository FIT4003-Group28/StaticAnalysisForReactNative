package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
/* compiled from: PG */
/* renamed from: agmf  reason: default package */
/* loaded from: classes.dex */
public final class agmf {
    public final agli a;

    public agmf(agli agliVar) {
        this.a = agliVar;
    }

    public static final void a(SQLiteDatabase sQLiteDatabase) {
        try {
            if (!sQLiteDatabase.inTransaction()) {
                return;
            }
            sQLiteDatabase.endTransaction();
        } catch (SQLiteException e) {
            zep.n("Error while terminating OfflineSubscriptions db transaction", e);
        }
    }
}
