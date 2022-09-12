package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: avst  reason: default package */
/* loaded from: classes3.dex */
public final class avst {
    public static final Uri a = Uri.parse("https://www.google.com/maps/offline");

    public static boolean a(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        return afhf.a(data, "/maps/offline");
    }

    public static Intent b(Context context) {
        return afft.a(context).setAction("android.intent.action.VIEW").setData(a);
    }
}
