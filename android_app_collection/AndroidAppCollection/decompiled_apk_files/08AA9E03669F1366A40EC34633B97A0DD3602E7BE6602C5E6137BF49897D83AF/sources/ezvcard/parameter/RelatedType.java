package ezvcard.parameter;
/* loaded from: classes.dex */
public class RelatedType extends VCardParameter {
    private static final c<RelatedType> v = new c<>(RelatedType.class);

    /* renamed from: a  reason: collision with root package name */
    public static final RelatedType f5556a = new RelatedType("acquaintance");

    /* renamed from: b  reason: collision with root package name */
    public static final RelatedType f5557b = new RelatedType("agent");

    /* renamed from: c  reason: collision with root package name */
    public static final RelatedType f5558c = new RelatedType("child");

    /* renamed from: d  reason: collision with root package name */
    public static final RelatedType f5559d = new RelatedType("co-resident");
    public static final RelatedType e = new RelatedType("co-worker");
    public static final RelatedType f = new RelatedType("colleague");
    public static final RelatedType g = new RelatedType("contact");
    public static final RelatedType h = new RelatedType("crush");
    public static final RelatedType i = new RelatedType("date");
    public static final RelatedType j = new RelatedType("emergency");
    public static final RelatedType k = new RelatedType("friend");
    public static final RelatedType l = new RelatedType("kin");
    public static final RelatedType m = new RelatedType("me");
    public static final RelatedType n = new RelatedType("met");
    public static final RelatedType o = new RelatedType("muse");
    public static final RelatedType p = new RelatedType("neighbor");
    public static final RelatedType q = new RelatedType("parent");
    public static final RelatedType r = new RelatedType("sibling");
    public static final RelatedType s = new RelatedType("spouse");
    public static final RelatedType t = new RelatedType("sweetheart");

    private RelatedType(String str) {
        super(str);
    }

    public static RelatedType a(String str) {
        return (RelatedType) v.c(str);
    }
}
