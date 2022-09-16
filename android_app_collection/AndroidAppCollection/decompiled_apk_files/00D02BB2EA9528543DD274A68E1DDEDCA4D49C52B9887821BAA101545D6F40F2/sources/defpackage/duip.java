package defpackage;
/* compiled from: PG */
/* renamed from: duip  reason: default package */
/* loaded from: classes6.dex */
public enum duip {
    BAD_URL(false),
    CANCELED(false),
    REQUEST_BODY_READ_ERROR(false),
    CONNECTION_ERROR(true),
    SERVER_ERROR(true),
    UNKNOWN(false);
    
    public final boolean g;

    duip(boolean z) {
        this.g = z;
    }
}
