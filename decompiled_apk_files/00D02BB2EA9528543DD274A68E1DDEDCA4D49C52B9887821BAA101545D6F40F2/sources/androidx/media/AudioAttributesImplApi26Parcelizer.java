package androidx.media;

import android.media.AudioAttributes;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(bap bapVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) bapVar.y(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = bapVar.w(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, bap bapVar) {
        bapVar.u(audioAttributesImplApi26.a, 1);
        bapVar.s(audioAttributesImplApi26.b, 2);
    }
}
