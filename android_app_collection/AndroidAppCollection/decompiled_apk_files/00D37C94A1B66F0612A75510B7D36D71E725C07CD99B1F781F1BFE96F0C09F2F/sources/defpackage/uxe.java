package defpackage;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
/* compiled from: PG */
/* renamed from: uxe  reason: default package */
/* loaded from: classes4.dex */
public class uxe {
    public static boolean g() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static File h(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new vjt("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new vjt("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new vjt("Did not expect uri to have authority");
    }

    public static Uri i(Uri.Builder builder, amuf amufVar) {
        return builder.encodedFragment(vkc.b(amufVar.g())).build();
    }
}
