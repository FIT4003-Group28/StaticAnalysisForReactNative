package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
/* compiled from: PG */
/* renamed from: czim  reason: default package */
/* loaded from: classes5.dex */
public final class czim {
    public static final File a(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new cziw("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new cziw("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new cziw("Did not expect uri to have authority");
    }
}
