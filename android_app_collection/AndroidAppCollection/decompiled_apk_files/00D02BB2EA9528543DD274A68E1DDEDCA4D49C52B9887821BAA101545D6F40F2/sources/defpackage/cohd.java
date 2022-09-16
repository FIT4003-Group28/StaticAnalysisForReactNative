package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Random;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cohd  reason: default package */
/* loaded from: classes5.dex */
public final class cohd {
    public static final /* synthetic */ int e = 0;
    private static final dcdc<String> f = dcdc.f("CREATE TABLE collections(id INTEGER PRIMARY KEY, collection_name STRING NOT NULL,time INTEGER NOT NULL,selection_key INTEGER NOT NULL,value BLOB NOT NULL)");
    public final cohe a;
    public final cqat b;
    public final Random c;
    public final ExecutorService d;

    public cohd(Context context, cqat cqatVar, Random random, ExecutorService executorService) {
        this.a = new cohe(context, f);
        this.b = cqatVar;
        this.c = random;
        this.d = executorService;
    }

    public final <T> dehn<T> a(final dbrn<cohc, T> dbrnVar) {
        return deha.f(new deff(this, dbrnVar) { // from class: cogz
            private final cohd a;
            private final dbrn b;

            {
                this.a = this;
                this.b = dbrnVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cohd cohdVar = this.a;
                dbrn dbrnVar2 = this.b;
                SQLiteDatabase writableDatabase = cohdVar.a.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    Object a = dbrnVar2.a(new cohc(writableDatabase, cohdVar.b, cohdVar.c));
                    writableDatabase.setTransactionSuccessful();
                    dehn a2 = deha.a(a);
                    writableDatabase.endTransaction();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    return a2;
                } catch (Throwable th) {
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
        }, this.d);
    }
}
