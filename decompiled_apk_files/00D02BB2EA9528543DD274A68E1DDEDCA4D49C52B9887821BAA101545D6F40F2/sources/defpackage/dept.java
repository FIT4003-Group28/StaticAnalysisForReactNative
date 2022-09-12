package defpackage;

import android.net.Uri;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
/* compiled from: PG */
/* renamed from: dept  reason: default package */
/* loaded from: classes6.dex */
public final class dept {
    private final DynamicLinkData a;

    public dept(DynamicLinkData dynamicLinkData) {
        if (dynamicLinkData.d == 0) {
            dynamicLinkData.d = System.currentTimeMillis();
        }
        this.a = dynamicLinkData;
    }

    public final Uri a() {
        String str = this.a.b;
        if (str != null) {
            return Uri.parse(str);
        }
        return null;
    }
}
