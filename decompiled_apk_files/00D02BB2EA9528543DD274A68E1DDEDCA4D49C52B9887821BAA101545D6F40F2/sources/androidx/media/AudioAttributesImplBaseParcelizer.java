package androidx.media;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(bap bapVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = bapVar.w(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = bapVar.w(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = bapVar.w(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = bapVar.w(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, bap bapVar) {
        bapVar.s(audioAttributesImplBase.a, 1);
        bapVar.s(audioAttributesImplBase.b, 2);
        bapVar.s(audioAttributesImplBase.c, 3);
        bapVar.s(audioAttributesImplBase.d, 4);
    }
}
