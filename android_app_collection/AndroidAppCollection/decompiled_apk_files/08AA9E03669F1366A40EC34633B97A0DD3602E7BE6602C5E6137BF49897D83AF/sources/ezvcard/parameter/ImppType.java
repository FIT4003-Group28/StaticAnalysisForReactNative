package ezvcard.parameter;
/* loaded from: classes.dex */
public class ImppType extends VCardParameter {
    private static final c<ImppType> g = new c<>(ImppType.class);

    /* renamed from: a  reason: collision with root package name */
    public static final ImppType f5542a = new ImppType("personal");

    /* renamed from: b  reason: collision with root package name */
    public static final ImppType f5543b = new ImppType("business");

    /* renamed from: c  reason: collision with root package name */
    public static final ImppType f5544c = new ImppType("home");

    /* renamed from: d  reason: collision with root package name */
    public static final ImppType f5545d = new ImppType("work");
    public static final ImppType e = new ImppType("mobile");
    public static final ImppType f = new ImppType("pref");

    private ImppType(String str) {
        super(str);
    }

    public static ImppType a(String str) {
        return (ImppType) g.c(str);
    }
}
