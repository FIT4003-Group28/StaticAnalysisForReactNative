package defpackage;

import android.media.audiofx.LoudnessEnhancer;
/* compiled from: PG */
/* renamed from: crck  reason: default package */
/* loaded from: classes5.dex */
final class crck {
    @dzsi
    public LoudnessEnhancer a;

    public final void a(int i) {
        LoudnessEnhancer loudnessEnhancer = this.a;
        if (loudnessEnhancer != null) {
            loudnessEnhancer.setTargetGain(i * 100);
        }
    }
}
