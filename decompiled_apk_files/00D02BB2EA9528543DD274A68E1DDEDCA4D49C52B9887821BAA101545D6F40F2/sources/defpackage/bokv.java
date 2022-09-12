package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bokv  reason: default package */
/* loaded from: classes3.dex */
final class bokv implements Runnable {
    final /* synthetic */ bokz a;
    final /* synthetic */ bola b;

    public bokv(bola bolaVar, bokz bokzVar) {
        this.b = bolaVar;
        this.a = bokzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        Cursor cursor;
        try {
            bola bolaVar = this.b;
            bokp bokpVar = bolaVar.c;
            String str = bolaVar.a;
            bvrj.UI_THREAD.d();
            String e = dbsj.e(str);
            ArrayList arrayList = new ArrayList();
            try {
            } catch (bvjv unused) {
            }
            try {
                cursor = bokpVar.d().a().query("edits", bokp.a, "account_id = ? ", new String[]{e}, null, null, "created_at");
                while (cursor.moveToNext()) {
                    try {
                        bokp.f(cursor, arrayList);
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                this.b.b.b(new boky(this.a, arrayList), bvrj.UI_THREAD);
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } finally {
            this.b.c.a();
        }
    }
}
