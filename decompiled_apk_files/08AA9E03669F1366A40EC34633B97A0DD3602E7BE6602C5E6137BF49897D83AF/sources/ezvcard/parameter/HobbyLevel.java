package ezvcard.parameter;
/* loaded from: classes.dex */
public class HobbyLevel extends VCardParameter {

    /* renamed from: d  reason: collision with root package name */
    private static final c<HobbyLevel> f5538d = new c<>(HobbyLevel.class);

    /* renamed from: a  reason: collision with root package name */
    public static final HobbyLevel f5535a = new HobbyLevel("low");

    /* renamed from: b  reason: collision with root package name */
    public static final HobbyLevel f5536b = new HobbyLevel("medium");

    /* renamed from: c  reason: collision with root package name */
    public static final HobbyLevel f5537c = new HobbyLevel("high");

    private HobbyLevel(String str) {
        super(str);
    }

    public static HobbyLevel a(String str) {
        return (HobbyLevel) f5538d.c(str);
    }
}
