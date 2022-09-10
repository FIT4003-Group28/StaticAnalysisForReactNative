package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cyzh  reason: default package */
/* loaded from: classes5.dex */
public final class cyzh {
    public static defw<Cursor> a(ContentResolver contentResolver, Executor executor, Uri uri, String[] strArr) {
        return defw.a(new cyzf(), dege.a).d(new cyzg(contentResolver, executor, uri, strArr), executor);
    }
}
