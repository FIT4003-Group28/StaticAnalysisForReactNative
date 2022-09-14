package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class j6 {

    /* renamed from: a  reason: collision with root package name */
    private static final h6 f4235a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final h6 f4236b = new g6();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h6 a() {
        return f4235a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h6 b() {
        return f4236b;
    }

    private static h6 c() {
        try {
            return (h6) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
