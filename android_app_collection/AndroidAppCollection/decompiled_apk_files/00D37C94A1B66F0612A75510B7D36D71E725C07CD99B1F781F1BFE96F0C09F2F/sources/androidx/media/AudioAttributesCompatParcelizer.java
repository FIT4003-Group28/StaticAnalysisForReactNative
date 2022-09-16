package androidx.media;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(bpe bpeVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) bpeVar.t(audioAttributesCompat.a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, bpe bpeVar) {
        bpeVar.u(audioAttributesCompat.a);
    }
}
