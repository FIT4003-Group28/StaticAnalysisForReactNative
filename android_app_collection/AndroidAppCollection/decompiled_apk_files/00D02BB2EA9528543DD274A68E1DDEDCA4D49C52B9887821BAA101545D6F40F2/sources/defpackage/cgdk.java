package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgdk  reason: default package */
/* loaded from: classes4.dex */
final class cgdk implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ cgdv b;

    public cgdk(cgdv cgdvVar, String str) {
        this.b = cgdvVar;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        List arrayList;
        cgez cgezVar = this.b.ay;
        String str = this.a;
        if (dbsj.d(str)) {
            arrayList = new ArrayList();
        } else {
            try {
                SQLiteDatabase a = cgezVar.c.a();
                StringBuilder sb = new StringBuilder(11);
                sb.append(200);
                Cursor query = a.query("task_status", new String[]{"task_status_at_place"}, "account_id = ? ", new String[]{str}, null, null, "created_at DESC", sb.toString());
                List a2 = cgez.a(query);
                query.close();
                arrayList = a2;
            } catch (bvjv e) {
                bvoo.h("Couldn't open local database %s", e);
                arrayList = new ArrayList();
            }
        }
        cgdv cgdvVar = this.b;
        cgdvVar.av.b(new cgdl(cgdvVar, arrayList), bvrj.UI_THREAD);
    }
}
