package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aldl  reason: default package */
/* loaded from: classes.dex */
public final class aldl {
    public final ContentResolver a;
    public final Map b;

    public aldl(Context context) {
        this.a = context.getContentResolver();
        ArrayMap arrayMap = new ArrayMap(3);
        this.b = arrayMap;
        alde aldeVar = new alde();
        arrayMap.put("content", aldeVar);
        arrayMap.put("file", aldeVar);
        arrayMap.put("streaming", new aldt());
    }

    public final avuy a(Uri uri, String str, String str2) {
        String scheme = uri.getScheme();
        if (scheme == null || !b(scheme)) {
            throw new UnsupportedOperationException("Uri scheme not supported for resource extraction");
        }
        aldk aldkVar = (aldk) this.b.get(scheme);
        if (aldkVar == null) {
            throw new UnsupportedOperationException("Resource extraction not available for scheme");
        }
        return aldkVar.c(str, str2);
    }

    public final boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.b.containsKey(str);
    }

    public final boolean c(Uri uri) {
        return b(uri.getScheme());
    }
}
