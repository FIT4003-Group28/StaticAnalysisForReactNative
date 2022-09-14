package ezvcard.parameter;
/* loaded from: classes.dex */
public class SoundType extends MediaTypeParameter {
    private static final b<SoundType> i = new b<>(SoundType.class);

    /* renamed from: a  reason: collision with root package name */
    public static final SoundType f5560a = new SoundType("AAC", "audio/aac", "aac");

    /* renamed from: b  reason: collision with root package name */
    public static final SoundType f5561b = new SoundType("MIDI", "audio/midi", "mid");

    /* renamed from: c  reason: collision with root package name */
    public static final SoundType f5562c = new SoundType("MP3", "audio/mp3", "mp3");
    public static final SoundType f = new SoundType("MPEG", "audio/mpeg", "mpeg");
    public static final SoundType g = new SoundType("OGG", "audio/ogg", "ogg");
    public static final SoundType h = new SoundType("WAV", "audio/wav", "wav");

    private SoundType(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static SoundType a(String str, String str2, String str3) {
        return (SoundType) i.b(new String[]{str, str2, str3});
    }

    public static SoundType b(String str, String str2, String str3) {
        return (SoundType) i.c(new String[]{str, str2, str3});
    }
}
