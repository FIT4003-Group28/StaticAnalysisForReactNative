package defpackage;
/* compiled from: PG */
/* renamed from: cvpl  reason: default package */
/* loaded from: classes5.dex */
public final class cvpl extends Exception {
    public cvpl() {
        super("Failed to get ContentProviderClient for accounts from GmsCore");
    }

    public cvpl(Throwable th) {
        super("Error getting accounts via GmsCore", th);
    }
}
