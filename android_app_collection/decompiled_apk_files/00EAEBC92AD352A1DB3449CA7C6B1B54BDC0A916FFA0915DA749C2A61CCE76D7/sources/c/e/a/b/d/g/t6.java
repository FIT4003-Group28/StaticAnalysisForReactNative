package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class t6 {

    /* renamed from: a  reason: collision with root package name */
    private static final s6 f4427a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final s6 f4428b = new u6();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s6 a() {
        return f4427a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s6 b() {
        return f4428b;
    }

    private static s6 c() {
        try {
            return (s6) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
