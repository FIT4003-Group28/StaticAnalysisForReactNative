package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: afft  reason: default package */
/* loaded from: classes2.dex */
public final class afft {
    public static Intent a(Context context) {
        return new Intent().setComponent(new ComponentName(context, "com.google.android.maps.MapsActivity"));
    }
}
