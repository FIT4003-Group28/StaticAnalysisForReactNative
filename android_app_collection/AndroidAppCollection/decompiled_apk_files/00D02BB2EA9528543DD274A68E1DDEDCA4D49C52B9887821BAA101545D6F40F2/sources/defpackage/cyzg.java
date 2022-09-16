package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cyzg  reason: default package */
/* loaded from: classes5.dex */
final class cyzg implements deft<CancellationSignal, Cursor> {
    final ContentResolver a;
    final Executor b;
    final Uri c;
    final String[] d;

    public cyzg(ContentResolver contentResolver, Executor executor, Uri uri, String[] strArr) {
        this.a = contentResolver;
        this.b = executor;
        this.c = uri;
        this.d = strArr;
    }

    @Override // defpackage.deft
    public final /* bridge */ /* synthetic */ Cursor a(defu defuVar, CancellationSignal cancellationSignal) {
        Cursor query;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        if (Build.VERSION.SDK_INT >= 26) {
            Bundle bundle = new Bundle();
            bundle.putString("android:query-arg-sql-selection", null);
            bundle.putStringArray("android:query-arg-sql-selection-args", null);
            bundle.putString("android:query-arg-sql-sort-order", null);
            query = this.a.query(this.c, this.d, bundle, cancellationSignal2);
        } else {
            query = this.a.query(this.c, this.d, null, null, null, cancellationSignal2);
        }
        defuVar.a(query, this.b);
        return query;
    }
}
