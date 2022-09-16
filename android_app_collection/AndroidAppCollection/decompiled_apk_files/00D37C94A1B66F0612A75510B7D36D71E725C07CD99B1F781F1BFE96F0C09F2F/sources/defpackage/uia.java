package defpackage;
/* compiled from: PG */
/* renamed from: uia  reason: default package */
/* loaded from: classes4.dex */
public final class uia extends Exception {
    public uia() {
        super("Failed to get ContentProviderClient for accounts from GmsCore");
    }

    public uia(Throwable th) {
        super("Error getting accounts via GmsCore", th);
    }
}
