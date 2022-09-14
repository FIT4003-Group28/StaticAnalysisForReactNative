package ezvcard.parameter;
/* loaded from: classes.dex */
public class ExpertiseLevel extends VCardParameter {

    /* renamed from: d  reason: collision with root package name */
    private static final c<ExpertiseLevel> f5534d = new c<>(ExpertiseLevel.class);

    /* renamed from: a  reason: collision with root package name */
    public static final ExpertiseLevel f5531a = new ExpertiseLevel("beginner");

    /* renamed from: b  reason: collision with root package name */
    public static final ExpertiseLevel f5532b = new ExpertiseLevel("average");

    /* renamed from: c  reason: collision with root package name */
    public static final ExpertiseLevel f5533c = new ExpertiseLevel("expert");

    private ExpertiseLevel(String str) {
        super(str);
    }

    public static ExpertiseLevel a(String str) {
        return (ExpertiseLevel) f5534d.c(str);
    }
}
