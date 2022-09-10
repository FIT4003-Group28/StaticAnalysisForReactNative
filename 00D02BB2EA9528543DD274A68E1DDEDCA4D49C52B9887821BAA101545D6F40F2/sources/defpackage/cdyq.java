package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cdyq  reason: default package */
/* loaded from: classes4.dex */
public final class cdyq {
    public static final jic a(Uri uri, Size size) {
        ckql ckqlVar;
        cdvn cdvnVar;
        dzvx.c(uri, "$this$createWebImageViewProperties");
        if (size != null) {
            ckqlVar = new ckql();
            ckqlVar.c = size.getWidth();
            ckqlVar.d = size.getHeight();
        } else {
            ckqlVar = null;
        }
        ckql ckqlVar2 = ckqlVar;
        if (!dzvx.d(uri.getScheme(), "fife") || !dzvx.d(uri.getAuthority(), "p")) {
            if (b(uri)) {
                String uri2 = uri.toString();
                dzvx.b(uri2, "toString()");
                cdvnVar = new cdvn(uri2, ckqc.FULLY_QUALIFIED);
            } else if (ckqj.e(uri.toString())) {
                String uri3 = uri.toString();
                dzvx.b(uri3, "toString()");
                cdvnVar = new cdvn(uri3, ckqc.FIFE_MERGE);
            } else {
                throw new IllegalStateException("Unsupported Image URL".toString());
            }
        } else {
            String format = String.format("https://lh5.googleusercontent.com/p/%s", Arrays.copyOf(new Object[]{uri.getLastPathSegment()}, 1));
            dzvx.b(format, "java.lang.String.format(this, *args)");
            cdvnVar = new cdvn(format, ckqc.FIFE_MERGE);
        }
        return new jic(cdvnVar.a, cdvnVar.b, cqrt.f(R.drawable.generic_image_placeholder), 0, false, null, ckqlVar2);
    }

    public static final boolean b(Uri uri) {
        dzvx.c(uri, "$this$isOnDeviceContent");
        return dzvx.d(uri.getScheme(), "content");
    }
}
