package androidx.media;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(bpe bpeVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bpeVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = bpeVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = bpeVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = bpeVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, bpe bpeVar) {
        bpeVar.h(audioAttributesImplBase.a, 1);
        bpeVar.h(audioAttributesImplBase.b, 2);
        bpeVar.h(audioAttributesImplBase.c, 3);
        bpeVar.h(audioAttributesImplBase.d, 4);
    }
}
