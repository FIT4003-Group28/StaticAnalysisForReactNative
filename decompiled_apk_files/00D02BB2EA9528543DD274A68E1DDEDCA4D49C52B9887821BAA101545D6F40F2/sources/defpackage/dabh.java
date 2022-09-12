package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;
/* compiled from: PG */
/* renamed from: dabh  reason: default package */
/* loaded from: classes5.dex */
public final class dabh {
    public static final float a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
