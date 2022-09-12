package androidx.media;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(bap bapVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) bapVar.C(audioAttributesCompat.a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, bap bapVar) {
        bapVar.D(audioAttributesCompat.a);
    }
}
