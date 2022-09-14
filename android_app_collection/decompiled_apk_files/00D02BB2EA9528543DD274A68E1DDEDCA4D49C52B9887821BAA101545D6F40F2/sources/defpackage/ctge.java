package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ctge  reason: default package */
/* loaded from: classes5.dex */
public final class ctge {
    final long a;
    private final Context b;
    private final ctir c;

    public ctge(Context context, ctir ctirVar, long j) {
        this.b = context.getApplicationContext();
        this.c = ctirVar;
        this.a = j;
    }

    private final Uri d() {
        return ctiw.f(String.valueOf(this.b.getPackageName()).concat(".lighter.data"), "MESSAGING", "kvstore", Long.toString(this.a));
    }

    public final dbsg<byte[]> a(String str) {
        Cursor a = this.c.a(d(), ctlx.a, "key = ?", new String[]{str}, null, "1");
        return !a.moveToFirst() ? dbpy.a : dbsg.i(a.getBlob(1));
    }

    public final void b() {
        this.c.d(d(), "key = ?", new String[]{"CURRENT_BOOTSTRAP_LATEST_MESSAGE_TIMESTAMP"});
    }

    public final void c(String str, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str);
        contentValues.put("value", bArr);
        this.c.b(d(), contentValues, 5);
    }
}
