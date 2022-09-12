package defpackage;

import android.media.audiofx.AudioEffect;
/* compiled from: PG */
/* renamed from: ehm  reason: default package */
/* loaded from: classes6.dex */
public final class ehm {
    public static boolean a() {
        try {
            AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
            if (queryEffects != null) {
                for (AudioEffect.Descriptor descriptor : queryEffects) {
                    if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER)) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            bvoo.f(new RuntimeException(th));
        }
        return false;
    }
}
