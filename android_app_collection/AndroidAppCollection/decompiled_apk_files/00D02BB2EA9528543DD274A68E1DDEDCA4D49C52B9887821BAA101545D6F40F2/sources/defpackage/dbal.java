package defpackage;

import com.google.ar.core.ArCoreApk;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dbal  reason: default package */
/* loaded from: classes5.dex */
public final class dbal extends ArCoreApk.Availability {
    public dbal() {
        super("SUPPORTED_APK_TOO_OLD", 5, 202);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }
}
