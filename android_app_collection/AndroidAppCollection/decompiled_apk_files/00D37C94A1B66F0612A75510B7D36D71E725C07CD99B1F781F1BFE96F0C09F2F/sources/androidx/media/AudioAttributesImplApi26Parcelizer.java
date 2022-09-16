package androidx.media;

import android.media.AudioAttributes;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(bpe bpeVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) bpeVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = bpeVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, bpe bpeVar) {
        bpeVar.i(audioAttributesImplApi26.a, 1);
        bpeVar.h(audioAttributesImplApi26.b, 2);
    }
}
