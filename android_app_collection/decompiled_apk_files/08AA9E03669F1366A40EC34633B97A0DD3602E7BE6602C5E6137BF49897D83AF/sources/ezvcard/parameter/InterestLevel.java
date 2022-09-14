package ezvcard.parameter;
/* loaded from: classes.dex */
public class InterestLevel extends VCardParameter {

    /* renamed from: d  reason: collision with root package name */
    private static final c<InterestLevel> f5549d = new c<>(InterestLevel.class);

    /* renamed from: a  reason: collision with root package name */
    public static final InterestLevel f5546a = new InterestLevel("low");

    /* renamed from: b  reason: collision with root package name */
    public static final InterestLevel f5547b = new InterestLevel("medium");

    /* renamed from: c  reason: collision with root package name */
    public static final InterestLevel f5548c = new InterestLevel("high");

    private InterestLevel(String str) {
        super(str);
    }

    public static InterestLevel a(String str) {
        return (InterestLevel) f5549d.c(str);
    }
}
