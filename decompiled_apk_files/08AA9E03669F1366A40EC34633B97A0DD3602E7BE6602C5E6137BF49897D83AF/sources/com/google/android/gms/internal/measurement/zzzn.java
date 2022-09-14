package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class zzzn {
    private static final zzzl<?> zzbsa = new zzzm();
    private static final zzzl<?> zzbsb = zzto();

    private static zzzl<?> zzto() {
        try {
            return (zzzl) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzl<?> zztp() {
        return zzbsa;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzzl<?> zztq() {
        if (zzbsb == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return zzbsb;
    }
}
