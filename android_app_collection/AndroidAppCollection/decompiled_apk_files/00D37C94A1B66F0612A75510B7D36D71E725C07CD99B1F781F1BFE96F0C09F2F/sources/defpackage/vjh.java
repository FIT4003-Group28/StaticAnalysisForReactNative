package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: vjh  reason: default package */
/* loaded from: classes4.dex */
public final class vjh {
    public String a = "";
    public long b;
    private String c;

    public vjh(Context context) {
        this.c = "";
        this.c = context.getPackageName();
    }

    public final Uri a() {
        Uri.Builder path = new Uri.Builder().scheme("blobstore").authority(this.c).path(this.a);
        if (vji.c(this.a) && !vji.b(this.a)) {
            path.appendQueryParameter("expiryDateSecs", String.valueOf(this.b));
        }
        Uri build = path.build();
        List<String> pathSegments = build.getPathSegments();
        if (pathSegments.size() == 1) {
            String str = pathSegments.get(0);
            if (vji.a.h(str).size() == 1 || (vji.c(str) && !TextUtils.equals(str, ".lease"))) {
                if (TextUtils.isEmpty(build.getQuery()) || (build.getQueryParameterNames().size() == 1 && build.getQueryParameter("expiryDateSecs") != null)) {
                    return build;
                }
                throw new vjt(String.format("The uri query is malformed, expected %s but found query %s", "expiryDateSecs=<expiryDateSecs>", build.getQuery()));
            }
        }
        throw new vjt(String.format("The uri is malformed, expected %s or %s but found %s", "<non_empty_checksum>", "<non_empty_checksum>.lease", build.getPath()));
    }
}
