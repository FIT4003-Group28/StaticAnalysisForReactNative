package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsqd  reason: default package */
/* loaded from: classes.dex */
public final class dsqd {
    public static final dsqb<?> a = new dsqc();
    private static final dsqb<?> b;

    static {
        dsqb<?> dsqbVar;
        try {
            dsqbVar = (dsqb) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            dsqbVar = null;
        }
        b = dsqbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsqb<?> a() {
        dsqb<?> dsqbVar = b;
        if (dsqbVar != null) {
            return dsqbVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
