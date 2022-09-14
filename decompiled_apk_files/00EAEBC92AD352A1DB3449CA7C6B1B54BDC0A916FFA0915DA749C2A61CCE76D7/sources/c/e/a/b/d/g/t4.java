package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class t4 {

    /* renamed from: a  reason: collision with root package name */
    private static final r4<?> f4423a = new q4();

    /* renamed from: b  reason: collision with root package name */
    private static final r4<?> f4424b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r4<?> a() {
        return f4423a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r4<?> b() {
        r4<?> r4Var = f4424b;
        if (r4Var != null) {
            return r4Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static r4<?> c() {
        try {
            return (r4) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
