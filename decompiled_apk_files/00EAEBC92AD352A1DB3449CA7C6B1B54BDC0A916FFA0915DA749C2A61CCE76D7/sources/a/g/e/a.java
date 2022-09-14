package a.g.e;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
/* loaded from: classes.dex */
public final class a {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, a.g.j.b bVar) {
        Object b2;
        if (Build.VERSION.SDK_INT < 16) {
            if (bVar != null) {
                bVar.d();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
        if (bVar != null) {
            try {
                b2 = bVar.b();
            } catch (Exception e2) {
                if (!(e2 instanceof OperationCanceledException)) {
                    throw e2;
                }
                throw new a.g.j.c();
            }
        } else {
            b2 = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) b2);
    }
}
