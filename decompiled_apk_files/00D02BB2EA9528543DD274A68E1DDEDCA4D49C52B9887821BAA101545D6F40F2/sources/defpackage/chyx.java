package defpackage;

import android.provider.Settings;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: chyx  reason: default package */
/* loaded from: classes4.dex */
public final class chyx {
    public static final Interpolator a = pq.a(0.25f, 0.0f, 0.0f, 1.0f);

    public static float a() {
        return Settings.Global.getFloat(((iqz) btsr.a(iqz.class)).b().getContentResolver(), "animator_duration_scale", 1.0f);
    }
}
