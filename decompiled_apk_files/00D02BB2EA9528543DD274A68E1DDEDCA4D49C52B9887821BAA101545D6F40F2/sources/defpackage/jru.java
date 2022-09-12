package defpackage;

import android.app.Activity;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: jru  reason: default package */
/* loaded from: classes7.dex */
public final class jru {
    public static void a(Activity activity, dxio<afha> dxioVar, String str) {
        dxioVar.a().l(activity, Uri.parse(String.format("%s/search?%s&%s", "https://www.google.com/maps/reserve", str, "source=gmm")), 4);
    }
}
