package c.d.i;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3144a = new c("JPEG", "jpeg");

    /* renamed from: b  reason: collision with root package name */
    public static final c f3145b = new c("PNG", "png");

    /* renamed from: c  reason: collision with root package name */
    public static final c f3146c = new c("GIF", "gif");

    /* renamed from: d  reason: collision with root package name */
    public static final c f3147d = new c("BMP", "bmp");

    /* renamed from: e  reason: collision with root package name */
    public static final c f3148e = new c("ICO", "ico");

    /* renamed from: f  reason: collision with root package name */
    public static final c f3149f = new c("WEBP_SIMPLE", "webp");

    /* renamed from: g  reason: collision with root package name */
    public static final c f3150g = new c("WEBP_LOSSLESS", "webp");

    /* renamed from: h  reason: collision with root package name */
    public static final c f3151h = new c("WEBP_EXTENDED", "webp");
    public static final c i = new c("WEBP_EXTENDED_WITH_ALPHA", "webp");
    public static final c j = new c("WEBP_ANIMATED", "webp");
    public static final c k = new c("HEIF", "heif");

    public static boolean a(c cVar) {
        return cVar == f3149f || cVar == f3150g || cVar == f3151h || cVar == i;
    }

    public static boolean b(c cVar) {
        return a(cVar) || cVar == j;
    }
}
