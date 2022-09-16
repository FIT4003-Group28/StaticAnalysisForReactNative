package androidx.media;

import android.media.AudioAttributes;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(bpe bpeVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) bpeVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = bpeVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, bpe bpeVar) {
        bpeVar.i(audioAttributesImplApi21.a, 1);
        bpeVar.h(audioAttributesImplApi21.b, 2);
    }
}
