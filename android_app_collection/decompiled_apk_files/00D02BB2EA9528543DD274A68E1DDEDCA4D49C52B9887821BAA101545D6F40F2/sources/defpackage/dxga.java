package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dxga  reason: default package */
/* loaded from: classes6.dex */
public final class dxga {
    private static final String[] a = {"com.spotify.music.debug", "com.spotify.music.canary", "com.spotify.music.partners", "com.spotify.music"};

    public final String a(Context context) {
        String[] strArr = a;
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (context.getPackageManager().getLaunchIntentForPackage(str) != null) {
                return str;
            }
        }
        return null;
    }

    public final boolean b(Context context) {
        return a(context) != null;
    }
}
