package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aoot  reason: default package */
/* loaded from: classes.dex */
public final class aoot {
    public static final aoyt a = new aoyt();
    private static final aoyt b;

    static {
        aoyt aoytVar;
        try {
            aoytVar = (aoyt) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            aoytVar = null;
        }
        b = aoytVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoyt a() {
        aoyt aoytVar = b;
        if (aoytVar != null) {
            return aoytVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
