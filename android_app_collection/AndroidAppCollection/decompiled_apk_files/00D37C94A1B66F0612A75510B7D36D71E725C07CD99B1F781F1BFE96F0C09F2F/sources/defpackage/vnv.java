package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vnv  reason: default package */
/* loaded from: classes4.dex */
public final class vnv {
    public final SQLiteDatabase a;
    public final Executor b;
    public final Executor c;
    public volatile boolean d = false;
    public final vod e;

    public vnv(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, vod vodVar) {
        this.a = sQLiteDatabase;
        this.b = executor;
        this.c = executor2;
        this.e = vodVar;
    }

    public final void a() {
        if (!this.d) {
            return;
        }
        throw new IllegalStateException("Already closed");
    }
}
