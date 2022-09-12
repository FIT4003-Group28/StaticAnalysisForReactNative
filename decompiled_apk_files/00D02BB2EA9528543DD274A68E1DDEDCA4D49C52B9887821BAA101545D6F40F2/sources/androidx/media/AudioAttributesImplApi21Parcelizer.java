package androidx.media;

import android.media.AudioAttributes;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(bap bapVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) bapVar.y(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = bapVar.w(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, bap bapVar) {
        bapVar.u(audioAttributesImplApi21.a, 1);
        bapVar.s(audioAttributesImplApi21.b, 2);
    }
}
